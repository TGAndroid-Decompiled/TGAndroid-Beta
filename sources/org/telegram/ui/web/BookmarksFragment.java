package org.telegram.ui.web;

import android.content.Context;
import android.content.DialogInterface;
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
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$WebPage;
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
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.WebMetadataCache;
public class BookmarksFragment extends UniversalFragment {
    private final Runnable closeToTabs;
    private ActionBarMenuItem gotoItem;
    private String query;
    private ActionBarMenuItem searchItem;
    public AddressBarList.BookmarksList searchList;
    private NumberTextView selectedCount;
    private final Utilities.Callback<String> whenClicked;
    public AddressBarList.BookmarksList list = new AddressBarList.BookmarksList(this.currentAccount, new Runnable() {
        @Override
        public final void run() {
            BookmarksFragment.this.updateWithOffset();
        }
    });
    public HashSet<Integer> selected = new HashSet<>();
    private final HashSet<String> addedUrls = new HashSet<>();

    public static boolean lambda$createView$2(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void access$400(BookmarksFragment bookmarksFragment) {
        bookmarksFragment.updateWithOffset();
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
        Iterator<Integer> it = this.selected.iterator();
        while (true) {
            MessageObject messageObject = null;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            Iterator<MessageObject> it2 = this.list.links.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                MessageObject next = it2.next();
                if (next != null && next.getId() == intValue) {
                    messageObject = next;
                    break;
                }
            }
            AddressBarList.BookmarksList bookmarksList = this.searchList;
            if (bookmarksList != null && messageObject == null) {
                Iterator<MessageObject> it3 = bookmarksList.links.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    MessageObject next2 = it3.next();
                    if (next2 != null && next2.getId() == intValue) {
                        messageObject = next2;
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
        new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.formatPluralString("DeleteOptionsTitle", hashSet2.size(), new Object[0])).setMessage(LocaleController.getString(hashSet2.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages")).setPositiveButton(LocaleController.getString(R.string.Delete), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                BookmarksFragment.this.lambda$deleteSelectedMessages$0(hashSet2, dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$deleteSelectedMessages$0(HashSet hashSet, DialogInterface dialogInterface, int i) {
        MessagesController.getInstance(this.currentAccount).deleteMessages(new ArrayList<>(hashSet), null, null, UserConfig.getInstance(this.currentAccount).getClientUserId(), 0, true, 0);
        this.list.delete(new ArrayList<>(hashSet));
        AddressBarList.BookmarksList bookmarksList = this.searchList;
        if (bookmarksList != null) {
            bookmarksList.delete(new ArrayList<>(hashSet));
        }
        this.selected.clear();
        this.actionBar.hideActionMode();
        this.listView.adapter.update(true);
    }

    public void gotoMessage() {
        if (this.selected.size() != 1) {
            return;
        }
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final int intValue = this.selected.iterator().next().intValue();
        finishFragment();
        Runnable runnable = this.closeToTabs;
        if (runnable != null) {
            runnable.run();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BookmarksFragment.lambda$gotoMessage$1(clientUserId, intValue);
            }
        }, 80L);
    }

    public static void lambda$gotoMessage$1(long j, int i) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j, i));
        }
    }

    public BookmarksFragment(Runnable runnable, Utilities.Callback<String> callback) {
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
        ActionBarMenu createActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedCount = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedCount.setTypeface(AndroidUtilities.bold());
        this.selectedCount.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        this.selectedCount.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$2;
                lambda$createView$2 = BookmarksFragment.lambda$createView$2(view, motionEvent);
                return lambda$createView$2;
            }
        });
        createActionMode.addView(this.selectedCount, LayoutHelper.createLinear(0, -1, 1.0f, 65, 0, 0, 0));
        this.gotoItem = createActionMode.addItemWithWidth(R.id.menu_link, R.drawable.msg_message, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.AccDescrGoToMessage));
        createActionMode.addItemWithWidth(R.id.menu_delete, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass2());
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
                if (BookmarksFragment.this.listView.canScrollVertically(1)) {
                    return;
                }
                if (TextUtils.isEmpty(BookmarksFragment.this.query)) {
                    BookmarksFragment.this.list.load();
                    return;
                }
                AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
                if (bookmarksList != null) {
                    bookmarksList.load();
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
                    AndroidUtilities.forEachViews((RecyclerView) BookmarksFragment.this.listView, (Consumer<View>) new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BookmarksFragment.AnonymousClass1.lambda$onItemClick$0((View) obj);
                        }
                    });
                    return;
                }
                BookmarksFragment.this.finishFragment();
            } else if (i == R.id.menu_delete) {
                BookmarksFragment.this.deleteSelectedMessages();
            } else if (i == R.id.menu_link) {
                BookmarksFragment.this.gotoMessage();
            }
        }

        public static void lambda$onItemClick$0(View view) {
            if (view instanceof AddressBarList.BookmarkView) {
                ((AddressBarList.BookmarkView) view).setChecked(false);
            }
        }
    }

    public class AnonymousClass2 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        private Runnable applySearch = new Runnable() {
            @Override
            public final void run() {
                BookmarksFragment.AnonymousClass2.this.lambda$$1();
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
            String obj = editText.getText().toString();
            if (!TextUtils.equals(BookmarksFragment.this.query, obj)) {
                BookmarksFragment.this.query = obj;
                AddressBarList.BookmarksList bookmarksList = BookmarksFragment.this.searchList;
                if (bookmarksList != null) {
                    bookmarksList.detach();
                }
                BookmarksFragment bookmarksFragment = BookmarksFragment.this;
                int i = ((BaseFragment) bookmarksFragment).currentAccount;
                final BookmarksFragment bookmarksFragment2 = BookmarksFragment.this;
                bookmarksFragment.searchList = new AddressBarList.BookmarksList(i, obj, new Runnable() {
                    @Override
                    public final void run() {
                        BookmarksFragment.access$400(BookmarksFragment.this);
                    }
                });
                BookmarksFragment.this.searchList.attach();
                scheduleSearch();
            }
            UniversalRecyclerView universalRecyclerView = BookmarksFragment.this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                if (z != (!TextUtils.isEmpty(obj))) {
                    BookmarksFragment.this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
        }

        private void scheduleSearch() {
            AndroidUtilities.cancelRunOnUIThread(this.applySearch);
            AndroidUtilities.runOnUIThread(this.applySearch, 500L);
        }

        public void lambda$$1() {
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
    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        this.addedUrls.clear();
        if (TextUtils.isEmpty(this.query)) {
            Iterator<MessageObject> it = this.list.links.iterator();
            while (it.hasNext()) {
                MessageObject next = it.next();
                String link = AddressBarList.getLink(next);
                if (!TextUtils.isEmpty(link) && !link.startsWith("#") && !link.startsWith("$") && !link.startsWith("@")) {
                    this.addedUrls.add(link);
                    arrayList.add(AddressBarList.BookmarkView.Factory.as(next, false).setChecked(isSelected(next)));
                }
            }
            if (!this.list.endReached) {
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
                arrayList.add(UItem.asFlicker(arrayList.size(), 32));
            }
        } else {
            Iterator<MessageObject> it2 = this.list.links.iterator();
            while (it2.hasNext()) {
                MessageObject next2 = it2.next();
                String link2 = AddressBarList.getLink(next2);
                if (!TextUtils.isEmpty(link2) && !link2.startsWith("#") && !link2.startsWith("$") && !link2.startsWith("@")) {
                    this.addedUrls.add(link2);
                    String hostAuthority = AndroidUtilities.getHostAuthority(link2, true);
                    WebMetadataCache.WebMetadata webMetadata = WebMetadataCache.getInstance().get(hostAuthority);
                    TLRPC$WebPage tLRPC$WebPage = (next2 == null || (tLRPC$Message = next2.messageOwner) == null || (tLRPC$MessageMedia = tLRPC$Message.media) == null) ? null : tLRPC$MessageMedia.webpage;
                    String str = (tLRPC$WebPage == null || TextUtils.isEmpty(tLRPC$WebPage.site_name)) ? (webMetadata == null || TextUtils.isEmpty(webMetadata.sitename)) ? null : webMetadata.sitename : tLRPC$WebPage.site_name;
                    String str2 = (tLRPC$WebPage == null || TextUtils.isEmpty(tLRPC$WebPage.title)) ? null : tLRPC$WebPage.title;
                    if (matches(hostAuthority, this.query) || matches(str, this.query) || matches(str2, this.query)) {
                        arrayList.add(AddressBarList.BookmarkView.Factory.as(next2, false, this.query).setChecked(isSelected(next2)));
                    }
                }
            }
            Iterator<MessageObject> it3 = this.searchList.links.iterator();
            while (it3.hasNext()) {
                MessageObject next3 = it3.next();
                String link3 = AddressBarList.getLink(next3);
                if (!TextUtils.isEmpty(link3) && !link3.startsWith("#") && !link3.startsWith("$") && !link3.startsWith("@")) {
                    this.addedUrls.add(link3);
                    arrayList.add(AddressBarList.BookmarkView.Factory.as(next3, false, this.query).setChecked(isSelected(next3)));
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
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!translitSafe.startsWith(translitSafe2)) {
                        if (!translitSafe.contains(" " + translitSafe2)) {
                            if (!translitSafe.contains("." + translitSafe2)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            if (this.actionBar.isActionModeShowed()) {
                clickSelect(uItem, view);
                return;
            }
            finishFragment();
            this.whenClicked.run(AddressBarList.getLink((MessageObject) uItem.object2));
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
    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.instanceOf(AddressBarList.BookmarkView.Factory.class)) {
            clickSelect(uItem, view);
            return true;
        }
        return false;
    }

    @Override
    public boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.721f;
    }

    public void updateWithOffset() {
        int i;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= this.listView.getChildCount()) {
                i = 0;
                break;
            }
            View childAt = this.listView.getChildAt(i3);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                i = childAt.getTop();
                i2 = childAdapterPosition;
                break;
            }
            i3++;
            i2 = childAdapterPosition;
        }
        this.listView.adapter.update(true);
        if (i2 >= 0) {
            this.listView.layoutManager.scrollToPositionWithOffset(i2, i);
        } else {
            this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
        }
    }
}
