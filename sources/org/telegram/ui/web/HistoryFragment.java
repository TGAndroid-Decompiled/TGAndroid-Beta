package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class HistoryFragment extends UniversalFragment {
    public StickerEmptyView emptyView;
    public String query;
    public ActionBarMenuItem searchItem;
    public boolean searchLoading;
    public NumberTextView selectedCount;
    public final Utilities.Callback whenClicked;
    public ArrayList history = BrowserHistory.getHistory(new HistoryFragment$$ExternalSyntheticLambda0(this, 0));
    public final ArrayList searchResults = new ArrayList();
    public final HashSet selected = new HashSet();

    public final class AnonymousClass2 extends OKLCH {
        public final VoIPFragment$8$$ExternalSyntheticLambda1 applySearch = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 23);

        public AnonymousClass2() {
        }

        public static boolean matches(String str, String str2) {
            if (str == null || str2 == null) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase2, lowerCase) && !SavedMessagesController$$ExternalSyntheticOutline0.m(".", lowerCase2, lowerCase)) {
                String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (!strTranslitSafe.startsWith(strTranslitSafe2) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe2, strTranslitSafe) && !SavedMessagesController$$ExternalSyntheticOutline0.m(".", strTranslitSafe2, strTranslitSafe)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public final void onSearchCollapse() {
            HistoryFragment historyFragment = HistoryFragment.this;
            historyFragment.query = null;
            historyFragment.searchLoading = false;
            AndroidUtilities.cancelRunOnUIThread(this.applySearch);
            UniversalFragment.AnonymousClass3 anonymousClass3 = historyFragment.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                historyFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
            }
            historyFragment.emptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(historyFragment.query) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }

        @Override
        public final void onSearchExpand() {
        }

        @Override
        public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            HistoryFragment historyFragment = HistoryFragment.this;
            boolean z = !TextUtils.isEmpty(historyFragment.query);
            String string = editTextBoldCursor.getText().toString();
            if (!TextUtils.equals(historyFragment.query, string)) {
                historyFragment.query = string;
                historyFragment.searchLoading = true;
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.applySearch;
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1, 500L);
                historyFragment.emptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(string) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
            }
            UniversalFragment.AnonymousClass3 anonymousClass3 = historyFragment.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                if (z != (!TextUtils.isEmpty(string))) {
                    historyFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        }
    }

    public HistoryFragment(Utilities.Callback callback, ArticleViewer$$ExternalSyntheticLambda0 articleViewer$$ExternalSyntheticLambda0) {
        this.whenClicked = callback;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhite;
        actionBar.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(Theme.getColor(null, i, false));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setTitleColor(getThemedColor(i2));
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsColor(getThemedColor(i2), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 13));
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedCount = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCount.setTypeface(AndroidUtilities.bold());
        this.selectedCount.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        this.selectedCount.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addView(this.selectedCount, LayoutHelper.createLinear(1.0f, 0, -1, 65, 0, 0));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider());
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new AnonymousClass2();
        this.searchItem = actionBarMenuItemAddItem;
        int i3 = R.string.Search;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i3));
        this.searchItem.setContentDescription(LocaleController.getString(i3));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(getThemedColor(i2));
        searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
        searchField.setCursorColor(getThemedColor(i2));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, null);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(this.query) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.emptyView.subtitle.setVisibility(8);
        this.emptyView.showProgress(false, false);
        this.emptyView.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setEmptyView(this.emptyView);
        this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 27));
        return this.fragmentView;
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i = 5;
        int i2 = 2;
        if (TextUtils.isEmpty(this.query)) {
            ArrayList arrayList2 = this.history;
            if (arrayList2 != null) {
                int size = arrayList2.size() - 1;
                int i3 = 0;
                while (size >= 0) {
                    BrowserHistory.Entry entry = (BrowserHistory.Entry) this.history.get(size);
                    calendar.setTimeInMillis(entry.time);
                    int i4 = calendar.get(i) + (calendar.get(i2) * 100) + (calendar.get(1) * 10000);
                    if (i3 != i4) {
                        String dateChat = LocaleController.formatDateChat(entry.time / 1000);
                        UItem uItem = new UItem(31);
                        uItem.text = dateChat;
                        arrayList.add(uItem);
                        i3 = i4;
                    }
                    String str = this.query;
                    int i5 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                    uItemOfFactory.intValue = 3;
                    uItemOfFactory.accent = false;
                    uItemOfFactory.object2 = entry;
                    uItemOfFactory.subtext = str;
                    arrayList.add(uItemOfFactory);
                    size--;
                    i = 5;
                    i2 = 2;
                }
            }
        } else {
            ArrayList arrayList3 = this.searchResults;
            int i6 = 0;
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                BrowserHistory.Entry entry2 = (BrowserHistory.Entry) arrayList3.get(size2);
                calendar.setTimeInMillis(entry2.time);
                int i7 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                if (i6 != i7) {
                    String dateChat2 = LocaleController.formatDateChat(entry2.time / 1000);
                    UItem uItem2 = new UItem(31);
                    uItem2.text = dateChat2;
                    arrayList.add(uItem2);
                    i6 = i7;
                }
                String str2 = this.query;
                int i8 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                uItemOfFactory2.intValue = 3;
                uItemOfFactory2.accent = false;
                uItemOfFactory2.object2 = entry2;
                uItemOfFactory2.subtext = str2;
                arrayList.add(uItemOfFactory2);
            }
            if (this.searchLoading) {
                UItem uItem3 = new UItem(34);
                uItem3.intValue = 32;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem3, 34);
                uItemM.intValue = 32;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                uItemM2.intValue = 32;
                arrayList.add(uItemM2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        UItem uItem4 = new UItem(7);
        uItem4.text = null;
        arrayList.add(uItem4);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.WebHistory);
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.721f;
    }

    @Override
    public final void onClick$1(UItem uItem, View view) {
        if (!uItem.instanceOf(AddressBarList.BookmarkView.Factory.class) || this.actionBar.isActionModeShowed()) {
            return;
        }
        finishFragment();
        this.whenClicked.run((BrowserHistory.Entry) uItem.object2);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view) {
        return false;
    }
}
