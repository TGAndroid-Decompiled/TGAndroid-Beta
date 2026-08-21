package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LaunchActivity;

public class BookmarksFragment extends UniversalFragment {
    private final Runnable closeToTabs;
    private ActionBarMenuItem gotoItem;
    private String query;
    private ActionBarMenuItem searchItem;
    public AddressBarList.BookmarksList searchList;
    private NumberTextView selectedCount;
    private final Utilities.Callback whenClicked;
    public AddressBarList.BookmarksList list = new AddressBarList.BookmarksList(this.currentAccount, new Runnable() {
        @Override
        public final void run() {
            this.f$0.updateWithOffset();
        }
    });
    public HashSet selected = new HashSet();
    private final HashSet addedUrls = new HashSet();

    public static boolean m5034$r8$lambda$0Ef0Z7zGzug8jwvT6D_zo0aJ0(View view, MotionEvent motionEvent) {
        return true;
    }

    public boolean isSelected(MessageObject messageObject) {
        return messageObject != null && this.selected.contains(Integer.valueOf(messageObject.getId()));
    }

    public void setSelected(MessageObject messageObject, boolean z) {
        if (messageObject == null) {
            return;
        }
        if (z) {
            this.selected.add(Integer.valueOf(messageObject.getId()));
        } else {
            this.selected.remove(Integer.valueOf(messageObject.getId()));
        }
    }

    public void deleteSelectedMessages() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        final HashSet hashSet2 = new HashSet();
        Iterator it = this.selected.iterator();
        while (true) {
            MessageObject messageObject = null;
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Integer) it.next()).intValue();
            ArrayList arrayList2 = this.list.links;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                MessageObject messageObject2 = (MessageObject) obj;
                if (messageObject2 != null && messageObject2.getId() == iIntValue) {
                    messageObject = messageObject2;
                    break;
                }
            }
            AddressBarList.BookmarksList bookmarksList = this.searchList;
            if (bookmarksList != null && messageObject == null) {
                ArrayList arrayList3 = bookmarksList.links;
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    MessageObject messageObject3 = (MessageObject) obj2;
                    if (messageObject3 != null && messageObject3.getId() == iIntValue) {
                        messageObject = messageObject3;
                        break;
                    }
                }
            }
            if (messageObject != null) {
                arrayList.add(messageObject);
                hashSet2.add(Integer.valueOf(messageObject.getId()));
                hashSet.add(AddressBarList.getLink(messageObject));
            }
        }
        new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.formatPluralString("DeleteOptionsTitle", hashSet2.size(), new Object[0])).setMessage(LocaleController.getString(hashSet2.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages")).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                BookmarksFragment.$r8$lambda$r3rVwHkXykLYszWA4pqNRo0nuBw(this.f$0, hashSet2, alertDialog, i3);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public static void $r8$lambda$r3rVwHkXykLYszWA4pqNRo0nuBw(BookmarksFragment bookmarksFragment, HashSet hashSet, AlertDialog alertDialog, int i) {
        MessagesController.getInstance(bookmarksFragment.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(bookmarksFragment.currentAccount).getClientUserId(), 0, true, 0);
        bookmarksFragment.list.delete(new ArrayList(hashSet));
        AddressBarList.BookmarksList bookmarksList = bookmarksFragment.searchList;
        if (bookmarksList != null) {
            bookmarksList.delete(new ArrayList(hashSet));
        }
        bookmarksFragment.selected.clear();
        bookmarksFragment.actionBar.hideActionMode();
        bookmarksFragment.listView.adapter.update(true);
    }

    public void gotoMessage() {
        if (this.selected.size() != 1) {
            return;
        }
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final int iIntValue = ((Integer) this.selected.iterator().next()).intValue();
        finishFragment();
        Runnable runnable = this.closeToTabs;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BookmarksFragment.$r8$lambda$9pLNWt4i1abWYTli34IBZry2f6c(clientUserId, iIntValue);
            }
        }, 80L);
    }

    public static void $r8$lambda$9pLNWt4i1abWYTli34IBZry2f6c(long j, int i) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j, i));
        }
    }

    public BookmarksFragment(Runnable runnable, Utilities.Callback callback) {
        this.closeToTabs = runnable;
        this.whenClicked = callback;
    }

    @Override
    public View createView(Context context) {
        this.fragmentView = super.createView(context);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhite;
        actionBar.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(Theme.getColor(i));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setTitleColor(getThemedColor(i2));
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsColor(getThemedColor(i2), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedCount = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCount.setTypeface(AndroidUtilities.bold());
        this.selectedCount.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        this.selectedCount.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BookmarksFragment.m5034$r8$lambda$0Ef0Z7zGzug8jwvT6D_zo0aJ0(view, motionEvent);
            }
        });
        actionBarMenuCreateActionMode.addView(this.selectedCount, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
        this.gotoItem = actionBarMenuCreateActionMode.addItemWithWidth(R.id.menu_link, R.drawable.msg_message, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.AccDescrGoToMessage));
        actionBarMenuCreateActionMode.addItemWithWidth(R.id.menu_delete, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass2());
        this.searchItem = actionBarMenuItemSearchListener;
        int i3 = R.string.Search;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i3));
        this.searchItem.setContentDescription(LocaleController.getString(i3));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(getThemedColor(i2));
        searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
        searchField.setCursorColor(getThemedColor(i2));
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                if (!BookmarksFragment.this.listView.canScrollVertically(1)) {
                    if (TextUtils.isEmpty(BookmarksFragment.this.query)) {
                        BookmarksFragment.this.list.load();
                    } else {
                        AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
                        if (bookmarksList != null) {
                            bookmarksList.load();
                        }
                    }
                }
                BookmarksFragment bookmarksFragment = BookmarksFragment.this;
                if (bookmarksFragment.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(bookmarksFragment.fragmentView);
                }
            }
        });
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, null, 1);
        stickerEmptyView.title.setText(LocaleController.getString(R.string.WebNoBookmarks));
        stickerEmptyView.subtitle.setVisibility(8);
        stickerEmptyView.showProgress(false, false);
        stickerEmptyView.setAnimateLayoutChange(true);
        ((FrameLayout) this.fragmentView).addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setEmptyView(stickerEmptyView);
        return this.fragmentView;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) BookmarksFragment.this).actionBar.isActionModeShowed()) {
                    ((BaseFragment) BookmarksFragment.this).actionBar.hideActionMode();
                    BookmarksFragment.this.selected.clear();
                    AndroidUtilities.forEachViews((RecyclerView) BookmarksFragment.this.listView, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BookmarksFragment.AnonymousClass1.$r8$lambda$zxfcA_nqyu0i6_159jgYkj8d1bM((View) obj);
                        }
                    });
                    return;
                }
                BookmarksFragment.this.finishFragment();
                return;
            }
            if (i == R.id.menu_delete) {
                BookmarksFragment.this.deleteSelectedMessages();
            } else if (i == R.id.menu_link) {
                BookmarksFragment.this.gotoMessage();
            }
        }

        public static void $r8$lambda$zxfcA_nqyu0i6_159jgYkj8d1bM(View view) {
            if (view instanceof AddressBarList.BookmarkView) {
                ((AddressBarList.BookmarkView) view).setChecked(false);
            }
        }
    }

    class AnonymousClass2 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        private Runnable applySearch = new Runnable() {
            @Override
            public final void run() {
                BookmarksFragment.AnonymousClass2.m5036$r8$lambda$22sKrybv2fQ38iu4YIXC2RA8Xw(this.f$0);
            }
        };

        @Override
        public void onSearchExpand() {
        }

        AnonymousClass2() {
        }

        @Override
        public void onSearchCollapse() {
            BookmarksFragment.this.query = null;
            AndroidUtilities.cancelRunOnUIThread(this.applySearch);
            AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
            if (bookmarksList != null) {
                bookmarksList.detach();
                BookmarksFragment.this.searchList = null;
            }
            UniversalRecyclerView universalRecyclerView = BookmarksFragment.this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                BookmarksFragment.this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }

        @Override
        public void onTextChanged(EditText editText) {
            boolean z = !TextUtils.isEmpty(BookmarksFragment.this.query);
            String string = editText.getText().toString();
            if (!TextUtils.equals(BookmarksFragment.this.query, string)) {
                BookmarksFragment.this.query = string;
                AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
                if (bookmarksList != null) {
                    bookmarksList.detach();
                }
                BookmarksFragment bookmarksFragment = BookmarksFragment.this;
                int i = ((BaseFragment) bookmarksFragment).currentAccount;
                final BookmarksFragment bookmarksFragment2 = BookmarksFragment.this;
                bookmarksFragment.searchList = new AddressBarList.BookmarksList(i, string, new Runnable() {
                    @Override
                    public final void run() {
                        bookmarksFragment2.updateWithOffset();
                    }
                });
                BookmarksFragment.this.searchList.attach();
                scheduleSearch();
            }
            UniversalRecyclerView universalRecyclerView = BookmarksFragment.this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                if (z != (!TextUtils.isEmpty(string))) {
                    BookmarksFragment.this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        }

        private void scheduleSearch() {
            AndroidUtilities.cancelRunOnUIThread(this.applySearch);
            AndroidUtilities.runOnUIThread(this.applySearch, 500L);
        }

        public static void m5036$r8$lambda$22sKrybv2fQ38iu4YIXC2RA8Xw(AnonymousClass2 anonymousClass2) {
            AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
            if (bookmarksList != null) {
                bookmarksList.load();
            }
        }
    }

    @Override
    public boolean onFragmentCreate() {
        this.list.attach();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.list.detach();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.WebBookmarks);
    }

    @Override
    protected void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String str;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.addedUrls.clear();
        if (TextUtils.isEmpty(this.query)) {
            ArrayList arrayList2 = this.list.links;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                MessageObject messageObject = (MessageObject) obj;
                String link = AddressBarList.getLink(messageObject);
                if (!TextUtils.isEmpty(link) && !link.startsWith("#") && !link.startsWith("$") && !link.startsWith("@")) {
                    this.addedUrls.add(link);
                    arrayList.add(AddressBarList.BookmarkView.Factory.as(messageObject, false).setChecked(isSelected(messageObject)));
                }
            }
            if (!this.list.endReached) {
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
            }
        } else {
            ArrayList arrayList3 = this.list.links;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                MessageObject messageObject2 = (MessageObject) obj2;
                String link2 = AddressBarList.getLink(messageObject2);
                if (!TextUtils.isEmpty(link2) && !link2.startsWith("#") && !link2.startsWith("$") && !link2.startsWith("@")) {
                    this.addedUrls.add(link2);
                    String hostAuthority = AndroidUtilities.getHostAuthority(link2, true);
                    WebMetadataCache.WebMetadata webMetadata = WebMetadataCache.getInstance().get(hostAuthority);
                    TLRPC.WebPage webPage = (messageObject2 == null || (message = messageObject2.messageOwner) == null || (messageMedia = message.media) == null) ? null : messageMedia.webpage;
                    if (webPage == null || TextUtils.isEmpty(webPage.site_name)) {
                        str = (webMetadata == null || TextUtils.isEmpty(webMetadata.sitename)) ? null : webMetadata.sitename;
                    } else {
                        str = webPage.site_name;
                    }
                    String str2 = (webPage == null || TextUtils.isEmpty(webPage.title)) ? null : webPage.title;
                    if (matches(hostAuthority, this.query) || matches(str, this.query) || matches(str2, this.query)) {
                        arrayList.add(AddressBarList.BookmarkView.Factory.as(messageObject2, false, this.query).setChecked(isSelected(messageObject2)));
                    }
                }
            }
            ArrayList arrayList4 = this.searchList.links;
            int size3 = arrayList4.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList4.get(i3);
                i3++;
                MessageObject messageObject3 = (MessageObject) obj3;
                String link3 = AddressBarList.getLink(messageObject3);
                if (!TextUtils.isEmpty(link3) && !link3.startsWith("#") && !link3.startsWith("$") && !link3.startsWith("@")) {
                    this.addedUrls.add(link3);
                    arrayList.add(AddressBarList.BookmarkView.Factory.as(messageObject3, false, this.query).setChecked(isSelected(messageObject3)));
                }
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
        arrayList.add(UItem.asShadow(null));
    }

    public static boolean matches(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (!lowerCase.startsWith(lowerCase2)) {
            if (!lowerCase.contains(" " + lowerCase2)) {
                if (!lowerCase.contains("." + lowerCase2)) {
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!strTranslitSafe.startsWith(strTranslitSafe2)) {
                        if (!strTranslitSafe.contains(" " + strTranslitSafe2)) {
                            if (!strTranslitSafe.contains("." + strTranslitSafe2)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    protected void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            if (this.actionBar.isActionModeShowed()) {
                clickSelect(uItem, view);
            } else {
                finishFragment();
                this.whenClicked.run(AddressBarList.getLink((MessageObject) uItem.object2));
            }
        }
    }

    public void clickSelect(UItem uItem, View view) {
        AddressBarList.BookmarkView bookmarkView = (AddressBarList.BookmarkView) view;
        MessageObject messageObject = (MessageObject) uItem.object2;
        if (isSelected(messageObject)) {
            setSelected(messageObject, false);
            bookmarkView.setChecked(false);
        } else {
            setSelected(messageObject, true);
            bookmarkView.setChecked(true);
        }
        this.selectedCount.setNumber(this.selected.size(), true);
        if (this.selected.isEmpty()) {
            this.actionBar.hideActionMode();
        } else {
            this.actionBar.showActionMode();
        }
        AndroidUtilities.updateViewShow(this.gotoItem, this.selected.size() == 1, true, true);
    }

    @Override
    protected boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (!uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            return false;
        }
        clickSelect(uItem, view);
        return true;
    }

    @Override
    public boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.721f;
    }

    public void updateWithOffset() {
        int top;
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= this.listView.getChildCount()) {
                top = 0;
                break;
            }
            View childAt = this.listView.getChildAt(i2);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
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
