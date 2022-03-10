package seedu.address.model.driver;

import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;
import seedu.address.model.person.NameContainsKeywordsPredicate;

public class StatusContainsKeywordsPredicate implements Predicate<Driver>  {
    private final List<String> keywords;

    public StatusContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Driver driver) {
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(driver.getStatus(), keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof StatusContainsKeywordsPredicate // instanceof handles nulls
                && keywords.equals(((StatusContainsKeywordsPredicate) other).keywords)); // state check
    }
}
