package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda19;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class BookmarksFragment extends UniversalFragment {
    public final ArticleViewer$$ExternalSyntheticLambda0 closeToTabs;
    public ActionBarMenuItem gotoItem;
    public String query;
    public ActionBarMenuItem searchItem;
    public AddressBarList.BookmarksList searchList;
    public NumberTextView selectedCount;
    public final ArticleViewer$$ExternalSyntheticLambda10 whenClicked;
    public final AddressBarList.BookmarksList list = new AddressBarList.BookmarksList(null, this.currentAccount, new BookmarksFragment$$ExternalSyntheticLambda0(this, 0));
    public final HashSet selected = new HashSet();
    public final HashSet addedUrls = new HashSet();

    public final class AnonymousClass2 extends OKLCH {
        public final VoIPFragment$8$$ExternalSyntheticLambda1 applySearch = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 20);

        public AnonymousClass2() {
        }

        @Override
        public final void onSearchCollapse() {
            BookmarksFragment bookmarksFragment = BookmarksFragment.this;
            bookmarksFragment.query = null;
            AndroidUtilities.cancelRunOnUIThread(this.applySearch);
            AddressBarList.BookmarksList bookmarksList = bookmarksFragment.searchList;
            if (bookmarksList != null) {
                bookmarksList.detach();
                bookmarksFragment.searchList = null;
            }
            UniversalFragment.AnonymousClass3 anonymousClass3 = bookmarksFragment.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                bookmarksFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }

        @Override
        public final void onSearchExpand() {
        }

        @Override
        public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            BookmarksFragment bookmarksFragment = BookmarksFragment.this;
            boolean z = !TextUtils.isEmpty(bookmarksFragment.query);
            String string = editTextBoldCursor.getText().toString();
            if (!TextUtils.equals(bookmarksFragment.query, string)) {
                bookmarksFragment.query = string;
                AddressBarList.BookmarksList bookmarksList = bookmarksFragment.searchList;
                if (bookmarksList != null) {
                    bookmarksList.detach();
                }
                AddressBarList.BookmarksList bookmarksList2 = new AddressBarList.BookmarksList(string, ((BaseFragment) bookmarksFragment).currentAccount, new BookmarksFragment$$ExternalSyntheticLambda0(bookmarksFragment, 1));
                bookmarksFragment.searchList = bookmarksList2;
                bookmarksList2.attach();
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.applySearch;
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1, 500L);
            }
            UniversalFragment.AnonymousClass3 anonymousClass3 = bookmarksFragment.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                if (z != (!TextUtils.isEmpty(string))) {
                    bookmarksFragment.listView.layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        }
    }

    public BookmarksFragment(ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10, ArticleViewer$$ExternalSyntheticLambda0 articleViewer$$ExternalSyntheticLambda0) {
        this.closeToTabs = articleViewer$$ExternalSyntheticLambda0;
        this.whenClicked = articleViewer$$ExternalSyntheticLambda10;
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

    public final void clickSelect(UItem uItem, View view) {
        AddressBarList.BookmarkView bookmarkView = (AddressBarList.BookmarkView) view;
        MessageObject messageObject = (MessageObject) uItem.object2;
        HashSet hashSet = this.selected;
        if (messageObject == null || !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
            if (messageObject != null) {
                hashSet.add(Integer.valueOf(messageObject.getId()));
            }
            bookmarkView.setChecked(true);
        } else {
            hashSet.remove(Integer.valueOf(messageObject.getId()));
            bookmarkView.setChecked(false);
        }
        this.selectedCount.setNumber(hashSet.size(), true);
        if (hashSet.isEmpty()) {
            this.actionBar.hideActionMode$1();
        } else {
            this.actionBar.showActionMode(null, null);
        }
        AndroidUtilities.updateViewShow(this.gotoItem, hashSet.size() == 1, true, true);
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
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i3) {
                BookmarksFragment bookmarksFragment = BookmarksFragment.this;
                HashSet hashSet = bookmarksFragment.selected;
                if (i3 == -1) {
                    if (!((BaseFragment) bookmarksFragment).actionBar.isActionModeShowed()) {
                        bookmarksFragment.finishFragment();
                        return;
                    }
                    ((BaseFragment) bookmarksFragment).actionBar.hideActionMode$1();
                    hashSet.clear();
                    AndroidUtilities.forEachViews((RecyclerView) bookmarksFragment.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(16));
                    return;
                }
                if (i3 != R.id.menu_delete) {
                    if (i3 == R.id.menu_link) {
                        bookmarksFragment.gotoMessage();
                        return;
                    }
                    return;
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList = new ArrayList();
                HashSet hashSet3 = new HashSet();
                Iterator it = hashSet.iterator();
                while (true) {
                    MessageObject messageObject = null;
                    int i4 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    int iIntValue = ((Integer) it.next()).intValue();
                    ArrayList arrayList2 = bookmarksFragment.list.links;
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        MessageObject messageObject2 = (MessageObject) obj;
                        if (messageObject2 != null && messageObject2.getId() == iIntValue) {
                            messageObject = messageObject2;
                            break;
                        }
                    }
                    AddressBarList.BookmarksList bookmarksList = bookmarksFragment.searchList;
                    if (bookmarksList != null && messageObject == null) {
                        ArrayList arrayList3 = bookmarksList.links;
                        int size2 = arrayList3.size();
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            MessageObject messageObject3 = (MessageObject) obj2;
                            if (messageObject3 != null && messageObject3.getId() == iIntValue) {
                                messageObject = messageObject3;
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        arrayList.add(messageObject);
                        hashSet3.add(Integer.valueOf(messageObject.getId()));
                        hashSet2.add(AddressBarList.getLink(messageObject));
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(bookmarksFragment.getParentActivity(), 0, bookmarksFragment.getResourceProvider());
                String pluralString = LocaleController.formatPluralString("DeleteOptionsTitle", hashSet3.size(), new Object[0]);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = pluralString;
                alertDialog.message = LocaleController.getString(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new TodoItemMenu$$ExternalSyntheticLambda19(13, bookmarksFragment, hashSet3));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.makeRed(-1);
                builder.show();
            }
        });
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedCount = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCount.setTypeface(AndroidUtilities.bold());
        this.selectedCount.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        this.selectedCount.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addView(this.selectedCount, LayoutHelper.createLinear(1.0f, 0, -1, 65, 0, 0));
        this.gotoItem = anonymousClass1CreateActionMode.addItemWithWidth(R.id.menu_link, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
        anonymousClass1CreateActionMode.addItemWithWidth(R.id.menu_delete, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
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
        this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 26));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, null);
        stickerEmptyView.title.setText(LocaleController.getString(R.string.WebNoBookmarks));
        stickerEmptyView.subtitle.setVisibility(8);
        stickerEmptyView.showProgress(false, false);
        stickerEmptyView.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(stickerEmptyView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setEmptyView(stickerEmptyView);
        return this.fragmentView;
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        HashSet hashSet;
        String str;
        TLRPC.MessageMedia messageMedia;
        int i = 1;
        HashSet hashSet2 = this.addedUrls;
        hashSet2.clear();
        boolean zIsEmpty = TextUtils.isEmpty(this.query);
        HashSet hashSet3 = this.selected;
        Class<AddressBarList.BookmarkView.Factory> cls = AddressBarList.BookmarkView.Factory.class;
        AddressBarList.BookmarksList bookmarksList = this.list;
        if (zIsEmpty) {
            ArrayList arrayList2 = bookmarksList.links;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2 += i;
                MessageObject messageObject = (MessageObject) obj;
                String link = AddressBarList.getLink(messageObject);
                if (!TextUtils.isEmpty(link) && !link.startsWith("#") && !link.startsWith("$") && !link.startsWith("@")) {
                    hashSet2.add(link);
                    int i3 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(cls);
                    uItemOfFactory.intValue = 3;
                    uItemOfFactory.accent = false;
                    uItemOfFactory.object2 = messageObject;
                    uItemOfFactory.setChecked(hashSet3.contains(Integer.valueOf(messageObject.getId())));
                    arrayList.add(uItemOfFactory);
                }
                i = 1;
            }
            if (!bookmarksList.endReached) {
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
            }
        } else {
            ArrayList arrayList3 = bookmarksList.links;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String link2 = AddressBarList.getLink(messageObject2);
                if (TextUtils.isEmpty(link2) || link2.startsWith("#") || link2.startsWith("$") || link2.startsWith("@")) {
                    arrayList3 = arrayList3;
                    hashSet2 = hashSet2;
                    cls = cls;
                } else {
                    hashSet2.add(link2);
                    String hostAuthority = AndroidUtilities.getHostAuthority(link2, true);
                    if (WebMetadataCache.instance == null) {
                        WebMetadataCache.instance = new WebMetadataCache();
                    }
                    WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                    webMetadataCache.load();
                    WebMetadataCache.WebMetadata webMetadata = (WebMetadataCache.WebMetadata) webMetadataCache.cache.get(hostAuthority);
                    if (webMetadata == null) {
                        webMetadata = null;
                    } else {
                        webMetadata.time = Math.max(webMetadata.time, System.currentTimeMillis());
                        webMetadataCache.scheduleSave();
                    }
                    TLRPC.Message message = messageObject2.messageOwner;
                    TLRPC.WebPage webPage = (message == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    if (webPage == null || TextUtils.isEmpty(webPage.site_name)) {
                        str = (webMetadata == null || TextUtils.isEmpty(webMetadata.sitename)) ? null : webMetadata.sitename;
                    } else {
                        str = webPage.site_name;
                    }
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (matches(hostAuthority, this.query) || matches(str, this.query) || matches(str2, this.query)) {
                        String str3 = this.query;
                        int i5 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                        UItem uItemOfFactory2 = UItem.ofFactory(cls);
                        uItemOfFactory2.intValue = 3;
                        uItemOfFactory2.accent = false;
                        uItemOfFactory2.object2 = messageObject2;
                        uItemOfFactory2.subtext = str3;
                        uItemOfFactory2.setChecked(hashSet3.contains(Integer.valueOf(messageObject2.getId())));
                        arrayList.add(uItemOfFactory2);
                    }
                }
                cls = cls;
                hashSet2 = hashSet2;
                arrayList3 = arrayList3;
            }
            HashSet hashSet4 = hashSet2;
            Class<AddressBarList.BookmarkView.Factory> cls2 = cls;
            ArrayList arrayList4 = this.searchList.links;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList4.get(i6);
                i6++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String link3 = AddressBarList.getLink(messageObject3);
                if (TextUtils.isEmpty(link3) || link3.startsWith("#") || link3.startsWith("$") || link3.startsWith("@")) {
                    hashSet = hashSet4;
                } else {
                    hashSet = hashSet4;
                    hashSet.add(link3);
                    String str4 = this.query;
                    int i7 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                    UItem uItemOfFactory3 = UItem.ofFactory(cls2);
                    uItemOfFactory3.intValue = 3;
                    uItemOfFactory3.accent = false;
                    uItemOfFactory3.object2 = messageObject3;
                    uItemOfFactory3.subtext = str4;
                    uItemOfFactory3.setChecked(hashSet3.contains(Integer.valueOf(messageObject3.getId())));
                    arrayList.add(uItemOfFactory3);
                }
                hashSet4 = hashSet;
            }
            if (!this.searchList.endReached) {
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        UItem uItem = new UItem(7);
        uItem.text = null;
        arrayList.add(uItem);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    public final void gotoMessage() {
        HashSet hashSet = this.selected;
        if (hashSet.size() != 1) {
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        int iIntValue = ((Integer) hashSet.iterator().next()).intValue();
        finishFragment();
        ArticleViewer$$ExternalSyntheticLambda0 articleViewer$$ExternalSyntheticLambda0 = this.closeToTabs;
        if (articleViewer$$ExternalSyntheticLambda0 != null) {
            articleViewer$$ExternalSyntheticLambda0.run();
        }
        AndroidUtilities.runOnUIThread(new BookmarksFragment$$ExternalSyntheticLambda1(clientUserId, iIntValue, 0), 80L);
    }

    @Override
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.721f;
    }

    public final void lambda$deleteSelectedMessages$0(HashSet hashSet) {
        MessagesController.getInstance(this.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(this.currentAccount).getClientUserId(), 0, true, 0);
        ArrayList arrayList = new ArrayList(hashSet);
        int i = 0;
        int i2 = 0;
        while (true) {
            AddressBarList.BookmarksList bookmarksList = this.list;
            if (i2 >= bookmarksList.links.size()) {
                break;
            }
            ArrayList arrayList2 = bookmarksList.links;
            if (arrayList.contains(Integer.valueOf(((MessageObject) arrayList2.get(i2)).getId()))) {
                arrayList2.remove(i2);
                i2--;
            }
            i2++;
        }
        AddressBarList.BookmarksList bookmarksList2 = this.searchList;
        if (bookmarksList2 != null) {
            ArrayList arrayList3 = new ArrayList(hashSet);
            while (true) {
                ArrayList arrayList4 = bookmarksList2.links;
                if (i >= arrayList4.size()) {
                    break;
                }
                if (arrayList3.contains(Integer.valueOf(((MessageObject) arrayList4.get(i)).getId()))) {
                    arrayList4.remove(i);
                    i--;
                }
                i++;
            }
        }
        this.selected.clear();
        this.actionBar.hideActionMode$1();
        this.listView.adapter.update(true);
    }

    @Override
    public final void onClick$1(UItem uItem, View view) {
        if (uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            if (this.actionBar.isActionModeShowed()) {
                clickSelect(uItem, view);
                return;
            }
            finishFragment();
            this.whenClicked.run(AddressBarList.getLink((MessageObject) uItem.object2));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.list.attach();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.list.detach();
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view) {
        if (!uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            return false;
        }
        clickSelect(uItem, view);
        return true;
    }

    public final void updateWithOffset() {
        int top;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= this.listView.getChildCount()) {
                top = 0;
                break;
            }
            View childAt = this.listView.getChildAt(i2);
            this.listView.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                top = childAt.getTop();
                i = childAdapterPosition;
                break;
            } else {
                i2++;
                i = childAdapterPosition;
            }
        }
        this.listView.adapter.update(true);
        if (i >= 0) {
            this.listView.layoutManager.scrollToPositionWithOffset(i, top);
        } else {
            this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
        }
    }
}
