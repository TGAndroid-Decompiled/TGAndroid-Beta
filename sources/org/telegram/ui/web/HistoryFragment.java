package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
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
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda9;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.LocationActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.OpeningHoursDayActivity;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialog;
import org.telegram.ui.Components.voip.PrivateVideoPreviewDialogNew;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.bots.BotBiometrySettings;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.SuggestedAffiliateProgramsFragment;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;

public final class HistoryFragment extends UniversalFragment {
    public StickerEmptyView emptyView;
    public String query;
    public ActionBarMenuItem searchItem;
    public boolean searchLoading;
    public NumberTextView selectedCount;
    public final Utilities.Callback whenClicked;
    public ArrayList history = BrowserHistory.getHistory(new RichEditor$$ExternalSyntheticLambda53(this, 15));
    public final ArrayList searchResults = new ArrayList();
    public final HashSet selected = new HashSet();

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onItemClick(int i) {
            switch (this.$r8$classId) {
                case 0:
                    if (i == -1) {
                        HistoryFragment historyFragment = (HistoryFragment) this.this$0;
                        if (!((BaseFragment) historyFragment).actionBar.isActionModeShowed()) {
                            historyFragment.finishFragment();
                        } else {
                            ((BaseFragment) historyFragment).actionBar.hideActionMode();
                            historyFragment.selected.clear();
                            AndroidUtilities.forEachViews((RecyclerView) historyFragment.listView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(0));
                        }
                    }
                    break;
                case 1:
                    AwayMessagesActivity awayMessagesActivity = (AwayMessagesActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            awayMessagesActivity.processDone();
                        }
                    } else if (awayMessagesActivity.onBackPressed(true)) {
                        awayMessagesActivity.finishFragment();
                    }
                    break;
                case 2:
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            businessIntroActivity.processDone$1();
                        }
                    } else if (businessIntroActivity.onBackPressed(true)) {
                        businessIntroActivity.finishFragment();
                    }
                    break;
                case 3:
                    ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            chatbotsActivity.processDone$8();
                        }
                    } else if (chatbotsActivity.onBackPressed(true)) {
                        chatbotsActivity.finishFragment();
                    }
                    break;
                case 4:
                    GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            greetMessagesActivity.processDone$2();
                        }
                    } else if (greetMessagesActivity.onBackPressed(true)) {
                        greetMessagesActivity.finishFragment();
                    }
                    break;
                case 5:
                    LocationActivity locationActivity = (LocationActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            locationActivity.processDone$3();
                        }
                    } else if (locationActivity.onBackPressed(true)) {
                        locationActivity.finishFragment();
                    }
                    break;
                case 6:
                    OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            openingHoursActivity.processDone$4();
                        }
                    } else if (openingHoursActivity.onBackPressed(true)) {
                        openingHoursActivity.finishFragment();
                    }
                    break;
                case 7:
                    if (i == -1) {
                        ((OpeningHoursDayActivity) this.this$0).finishFragment();
                    }
                    break;
                case 8:
                    if (i == -1) {
                        ((TimezoneSelector) this.this$0).finishFragment();
                    }
                    break;
                case 9:
                    if (i == -1) {
                        ((PremiumFeatureBottomSheet) this.this$0).lambda$showGiftOfferSheet$15();
                    }
                    break;
                case 10:
                    if (i == -1) {
                        ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = (ChatCustomReactionsEditActivity) this.this$0;
                        if (!chatCustomReactionsEditActivity.checkChangesBeforeExit(true)) {
                            chatCustomReactionsEditActivity.finishFragment();
                        }
                    }
                    break;
                case 11:
                    if (i == -1) {
                        ((PrivateVideoPreviewDialog) this.this$0).dismiss(false, false);
                    }
                    break;
                case 12:
                    if (i == -1) {
                        ((PrivateVideoPreviewDialogNew) this.this$0).dismiss(false, false);
                    }
                    break;
                case 13:
                    if (i == -1) {
                        ((ResaleGiftsFragment) this.this$0).finishFragment();
                    }
                    break;
                case 14:
                    if (i == -1) {
                        ((BotStarsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 15:
                    if (i == -1) {
                        ((BotBiometrySettings) this.this$0).finishFragment();
                    }
                    break;
                case 16:
                    if (i == -1) {
                        ((BotWebViewSheet) this.this$0).onCheckDismissByUser();
                    }
                    break;
                case 17:
                    if (i == -1) {
                        ((SuggestedAffiliateProgramsFragment) this.this$0).finishFragment();
                    }
                    break;
                case 18:
                    if (i == -1) {
                        ((CommunityCreateActivity) this.this$0).finishFragment();
                    }
                    break;
                case 19:
                    if (i == -1) {
                        ((CommunityEditActivity) this.this$0).finishFragment();
                    }
                    break;
                case 20:
                    if (i == -1) {
                        ((CommunityPendingRequestsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 21:
                    CommunitySheet.ChatsToAddListPage chatsToAddListPage = (CommunitySheet.ChatsToAddListPage) this.this$0;
                    if (i == -1) {
                        CommunitySheet communitySheet = CommunitySheet.this;
                        if (!communitySheet.onlyChatsMode) {
                            communitySheet.communityPage.listView.adapter.update(false);
                            CommunitySheet.this.viewPager.scrollToPosition(0);
                        } else {
                            communitySheet.lambda$showGiftOfferSheet$15();
                        }
                    } else if (i == 3) {
                        CommunitySheet.this.animatorSearchChatsVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet communitySheet2 = CommunitySheet.this;
                        communitySheet2.lastSearchChatsString = null;
                        communitySheet2.foundChatsView.adapter.update(true);
                        CommunitySheet.this.chatsSearchView.editText.getText().clear();
                        CommunitySheet.this.chatsSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.chatsSearchView.editText);
                    }
                    break;
                case 22:
                    CommunitySheet.CommunityPage communityPage = (CommunitySheet.CommunityPage) this.this$0;
                    if (i == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("community_id", CommunitySheet.this.communityId);
                        CommunitySheet.this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                        CommunitySheet.this.lambda$showGiftOfferSheet$15();
                    } else if (i == 3) {
                        CommunitySheet.this.animatorSearchMessagesVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet communitySheet3 = CommunitySheet.this;
                        TextUtils.isEmpty(communitySheet3.lastSearchString);
                        communitySheet3.lastSearchString = null;
                        communitySheet3.filteredSearchView.search(0L, communitySheet3.communityId, 0L, 0L, null, false, null, true);
                        CommunitySheet.this.messagesSearchView.editText.getText().clear();
                        CommunitySheet.this.messagesSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.messagesSearchView.editText);
                    }
                    break;
                default:
                    if (i == -1) {
                        CommunitySheet.PendingRequestsPage pendingRequestsPage = (CommunitySheet.PendingRequestsPage) this.this$0;
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition(0);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass2 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        public final AddressBarList$$ExternalSyntheticLambda4 applySearch = new AddressBarList$$ExternalSyntheticLambda4(this, 5);

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
            UniversalRecyclerView universalRecyclerView = historyFragment.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                historyFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
            }
            historyFragment.emptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(historyFragment.query) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }

        @Override
        public final void onSearchExpand() {
        }

        @Override
        public final void onTextChanged(EditText editText) {
            HistoryFragment historyFragment = HistoryFragment.this;
            boolean z = !TextUtils.isEmpty(historyFragment.query);
            String string = editText.getText().toString();
            if (!TextUtils.equals(historyFragment.query, string)) {
                historyFragment.query = string;
                historyFragment.searchLoading = true;
                AddressBarList$$ExternalSyntheticLambda4 addressBarList$$ExternalSyntheticLambda4 = this.applySearch;
                AndroidUtilities.cancelRunOnUIThread(addressBarList$$ExternalSyntheticLambda4);
                AndroidUtilities.runOnUIThread(addressBarList$$ExternalSyntheticLambda4, 500L);
                historyFragment.emptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(string) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
            }
            UniversalRecyclerView universalRecyclerView = historyFragment.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                if (z != (!TextUtils.isEmpty(string))) {
                    historyFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        }
    }

    public HistoryFragment(Utilities.Callback callback, ArticleViewer$$ExternalSyntheticLambda9 articleViewer$$ExternalSyntheticLambda9) {
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
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this, 0));
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedCount = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCount.setTypeface(AndroidUtilities.bold());
        this.selectedCount.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        this.selectedCount.setOnTouchListener(new BottomSheet$$ExternalSyntheticLambda6(1));
        actionBarMenuCreateActionMode.addView(this.selectedCount, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass2());
        this.searchItem = actionBarMenuItemSearchListener;
        int i3 = R.string.Search;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i3));
        this.searchItem.setContentDescription(LocaleController.getString(i3));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(getThemedColor(i2));
        searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
        searchField.setCursorColor(getThemedColor(i2));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, null, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(TextUtils.isEmpty(this.query) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        this.emptyView.subtitle.setVisibility(8);
        this.emptyView.showProgress(false, false);
        this.emptyView.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setEmptyView(this.emptyView);
        this.listView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 23));
        return this.fragmentView;
    }

    @Override
    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getDefault());
        int i = 5;
        int i2 = 2;
        if (TextUtils.isEmpty(this.query)) {
            ArrayList arrayList2 = this.history;
            if (arrayList2 != null) {
                int i3 = 0;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    BrowserHistory.Entry entry = (BrowserHistory.Entry) this.history.get(size);
                    calendar.setTimeInMillis(entry.time);
                    int i4 = calendar.get(5) + (calendar.get(2) * 100) + (calendar.get(1) * 10000);
                    if (i3 != i4) {
                        arrayList.add(UItem.asGraySection(LocaleController.formatDateChat(entry.time / 1000)));
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
                }
            }
        } else {
            ArrayList arrayList3 = this.searchResults;
            int size2 = arrayList3.size() - 1;
            int i6 = 0;
            while (size2 >= 0) {
                BrowserHistory.Entry entry2 = (BrowserHistory.Entry) arrayList3.get(size2);
                calendar.setTimeInMillis(entry2.time);
                int i7 = calendar.get(i) + (calendar.get(i2) * 100) + (calendar.get(1) * 10000);
                if (i6 != i7) {
                    arrayList.add(UItem.asGraySection(LocaleController.formatDateChat(entry2.time / 1000)));
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
                size2--;
                i = 5;
                i2 = 2;
            }
            if (this.searchLoading) {
                arrayList.add(UItem.asFlicker(32));
                arrayList.add(UItem.asFlicker(32));
                arrayList.add(UItem.asFlicker(32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asShadow(null));
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
    public final void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (!uItem.instanceOf(AddressBarList.BookmarkView.Factory.class) || this.actionBar.isActionModeShowed()) {
            return;
        }
        finishFragment();
        this.whenClicked.run((BrowserHistory.Entry) uItem.object2);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }
}
