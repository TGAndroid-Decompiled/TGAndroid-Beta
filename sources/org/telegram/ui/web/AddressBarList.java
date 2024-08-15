package org.telegram.ui.web;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.net.URLDecoder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.WrappedResourceProvider;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.WebMetadataCache;
public class AddressBarList extends FrameLayout {
    private int backgroundColor;
    private final BookmarksList bookmarksList;
    public final int currentAccount;
    public final FrameLayout currentContainer;
    public final Drawable currentCopyBackground;
    public final ImageView currentCopyView;
    public final ImageView currentIconView;
    public final TextView currentLinkView;
    public final LinearLayout currentTextContainer;
    public final TextView currentTitleView;
    public final FrameLayout currentView;
    private final Drawable currentViewBackground;
    private int grayBackgroundColor;
    public boolean hideCurrent;
    private float[] hsv;
    private AsyncTask<String, Void, String> lastTask;
    private int listBackgroundColor;
    public UniversalRecyclerView listView;
    private Runnable onCurrentClick;
    private Utilities.Callback<String> onQueryClick;
    private Utilities.Callback<String> onQueryInsertClick;
    private Utilities.Callback<String> onURLClick;
    private float openProgress;
    public boolean opened;
    public final WrappedResourceProvider resourceProvider;
    private int rippleColor;
    public final View space;
    public final ArrayList<String> suggestions;
    private int textColor;

    public AddressBarList(Context context) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.suggestions = new ArrayList<>();
        this.openProgress = 0.0f;
        this.hsv = new float[3];
        setWillNotDraw(false);
        int i2 = UserConfig.selectedAccount;
        Utilities.Callback2 callback2 = new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AddressBarList.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        };
        Utilities.Callback5 callback5 = new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                AddressBarList.this.itemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        };
        WrappedResourceProvider wrappedResourceProvider = new WrappedResourceProvider(null);
        this.resourceProvider = wrappedResourceProvider;
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i2, 0, callback2, callback5, null, wrappedResourceProvider) {
            @Override
            public void onScrolled(int i3, int i4) {
                super.onScrolled(i3, i4);
                if (canScrollVertically(1) || AddressBarList.this.bookmarksList == null || !AddressBarList.this.bookmarksList.attached) {
                    return;
                }
                AddressBarList.this.bookmarksList.load();
            }
        };
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.setApplyBackground(false);
        this.listView.setOverScrollMode(2);
        this.listView.setPadding(0, 0, 0, 0);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.currentContainer = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.currentView = frameLayout2;
        Drawable createRadSelectorDrawable = Theme.createRadSelectorDrawable(this.grayBackgroundColor, this.rippleColor, 15, 15);
        this.currentViewBackground = createRadSelectorDrawable;
        frameLayout2.setBackground(createRadSelectorDrawable);
        ScaleStateListAnimator.apply(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(context);
        this.currentIconView = imageView;
        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(context);
        this.currentCopyView = imageView2;
        ScaleStateListAnimator.apply(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        Drawable createRadSelectorDrawable2 = Theme.createRadSelectorDrawable(0, 0, 6, 6);
        this.currentCopyBackground = createRadSelectorDrawable2;
        imageView2.setBackground(createRadSelectorDrawable2);
        frameLayout2.addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.currentTextContainer = linearLayout;
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(context);
        this.currentTitleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(context);
        this.currentLinkView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        this.bookmarksList = new BookmarksList(i, new Runnable() {
            @Override
            public final void run() {
                AddressBarList.this.lambda$new$0();
            }
        });
        this.space = new View(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(6.0f), 1073741824));
            }
        };
        int i3 = Theme.key_iv_background;
        setColors(Theme.getColor(i3), AndroidUtilities.computePerceivedBrightness(Theme.getColor(i3)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
    }

    public void lambda$new$0() {
        this.listView.adapter.update(true);
    }

    public void clearRecentSearches(View view) {
        new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.WebRecentClearTitle)).setMessage(LocaleController.getString(R.string.WebRecentClearText)).setPositiveButton(LocaleController.getString(R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                AddressBarList.this.lambda$clearRecentSearches$1(dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    public void lambda$clearRecentSearches$1(DialogInterface dialogInterface, int i) {
        clearRecentSearches(getContext());
        this.listView.adapter.update(true);
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        if (!this.hideCurrent && this.suggestions.isEmpty()) {
            arrayList.add(UItem.asCustom(this.currentContainer));
        }
        ArrayList<String> recentSearches = getRecentSearches(getContext());
        this.suggestions.size();
        recentSearches.size();
        if (!this.suggestions.isEmpty()) {
            arrayList.add(UItem.asCustom(this.space));
        }
        int i = 0;
        while (i < this.suggestions.size()) {
            final String str = this.suggestions.get(i);
            arrayList.add(Address2View.Factory.as(1, str, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AddressBarList.this.lambda$fillItems$2(str, view);
                }
            }, i == 0, i == this.suggestions.size() - 1, this));
            i++;
        }
        if (!recentSearches.isEmpty()) {
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AddressBarList.this.clearRecentSearches(view);
                }
            }));
            int i2 = 0;
            while (i2 < recentSearches.size()) {
                final String str2 = recentSearches.get(i2);
                arrayList.add(Address2View.Factory.as(0, str2, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        AddressBarList.this.lambda$fillItems$3(str2, view);
                    }
                }, i2 == 0, i2 == recentSearches.size() - 1, this));
                i2++;
            }
        }
        BookmarksList bookmarksList = this.bookmarksList;
        if (bookmarksList == null || bookmarksList.links.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.WebSectionBookmarks)));
        for (int i3 = 0; i3 < this.bookmarksList.links.size(); i3++) {
            MessageObject messageObject = this.bookmarksList.links.get(i3);
            if (!TextUtils.isEmpty(getLink(messageObject))) {
                arrayList.add(BookmarkView.Factory.as(messageObject, true));
            }
        }
        if (this.bookmarksList.endReached) {
            return;
        }
        arrayList.add(UItem.asFlicker(arrayList.size(), 32));
        arrayList.add(UItem.asFlicker(arrayList.size(), 32));
        arrayList.add(UItem.asFlicker(arrayList.size(), 32));
    }

    public void lambda$fillItems$2(String str, View view) {
        Utilities.Callback<String> callback = this.onQueryInsertClick;
        if (callback != null) {
            callback.run(str);
        }
    }

    public void lambda$fillItems$3(String str, View view) {
        Utilities.Callback<String> callback = this.onQueryInsertClick;
        if (callback != null) {
            callback.run(str);
        }
    }

    public static String getLink(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        if (tLRPC$Message != null) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) {
                return tLRPC$MessageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
        }
        return null;
    }

    public void itemClick(UItem uItem, View view, int i, float f, float f2) {
        Utilities.Callback<String> callback;
        if (uItem.instanceOf(Address2View.Factory.class)) {
            String charSequence = uItem.text.toString();
            Utilities.Callback<String> callback2 = this.onQueryClick;
            if (callback2 != null) {
                callback2.run(charSequence);
            }
        } else if (!uItem.instanceOf(BookmarkView.Factory.class) || (callback = this.onURLClick) == null) {
        } else {
            try {
                callback.run(getLink((MessageObject) uItem.object2));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.openProgress);
        canvas.drawColor(this.listBackgroundColor);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void setOpenProgress(float f) {
        if (Math.abs(this.openProgress - f) > 1.0E-4f) {
            this.openProgress = f;
            invalidate();
        }
    }

    public void setOpened(boolean z) {
        boolean z2 = z && this.bookmarksList != null;
        this.opened = z2;
        if (z2) {
            this.bookmarksList.attach();
        }
    }

    public void setColors(int i, int i2) {
        if (this.backgroundColor != i) {
            this.backgroundColor = i;
            invalidate();
        }
        this.textColor = i2;
        float f = AndroidUtilities.computePerceivedBrightness(i) >= 0.721f ? 0.0f : 1.0f;
        this.grayBackgroundColor = ColorUtils.blendARGB(i, i2, AndroidUtilities.lerp(0.05f, 0.12f, f));
        this.listBackgroundColor = i;
        this.rippleColor = ColorUtils.blendARGB(i, i2, AndroidUtilities.lerp(0.12f, 0.22f, f));
        Theme.setSelectorDrawableColor(this.currentViewBackground, this.grayBackgroundColor, false);
        Theme.setSelectorDrawableColor(this.currentViewBackground, this.rippleColor, true);
        this.currentView.invalidate();
        this.currentTitleView.setTextColor(i2);
        this.currentLinkView.setTextColor(Theme.multAlpha(i2, 0.6f));
        if (this.currentIconView.getColorFilter() != null) {
            this.currentIconView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.currentCopyView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        Theme.setSelectorDrawableColor(this.currentCopyBackground, Theme.multAlpha(this.rippleColor, 1.5f), true);
        int blendOver = Theme.blendOver(i, Theme.multAlpha(i2, 0.05f));
        int blendOver2 = Theme.blendOver(i, Theme.multAlpha(i2, 0.55f));
        this.resourceProvider.sparseIntArray.put(Theme.key_windowBackgroundWhite, this.listBackgroundColor);
        this.resourceProvider.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlackText, i2);
        this.resourceProvider.sparseIntArray.put(Theme.key_graySection, blendOver);
        this.resourceProvider.sparseIntArray.put(Theme.key_graySectionText, blendOver2);
        this.resourceProvider.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuBackground, Theme.multAlpha(i2, 0.2f));
        this.resourceProvider.sparseIntArray.put(Theme.key_listSelector, Theme.multAlpha(i2, AndroidUtilities.lerp(0.05f, 0.12f, f)));
        this.listView.invalidateViews();
    }

    public void setCurrent(Bitmap bitmap, String str, String str2, final Runnable runnable, Utilities.Callback<String> callback, Utilities.Callback<String> callback2, Utilities.Callback<String> callback3, View.OnClickListener onClickListener) {
        String str3;
        if (bitmap == null) {
            this.currentIconView.setImageResource(R.drawable.msg_language);
            this.currentIconView.setColorFilter(new PorterDuffColorFilter(this.textColor, PorterDuff.Mode.SRC_IN));
        } else {
            this.currentIconView.setImageDrawable(new BitmapDrawable(getContext().getResources(), bitmap));
            this.currentIconView.setColorFilter((ColorFilter) null);
        }
        TextView textView = this.currentTitleView;
        textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        try {
            try {
                Uri parse = Uri.parse(str2);
                str2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
            str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e2) {
            FileLog.e(e2);
            str3 = str2;
        }
        TextView textView2 = this.currentLinkView;
        textView2.setText(Emoji.replaceEmoji(str3, textView2.getPaint().getFontMetricsInt(), false));
        this.onCurrentClick = runnable;
        this.onQueryClick = callback;
        this.onQueryInsertClick = callback2;
        this.onURLClick = callback3;
        this.currentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AddressBarList.this.lambda$setCurrent$4(runnable, view);
            }
        });
        this.currentCopyView.setOnClickListener(onClickListener);
        this.hideCurrent = false;
        setInput(null);
        this.listView.adapter.update(true);
        this.listView.scrollToPosition(0);
    }

    public void lambda$setCurrent$4(Runnable runnable, View view) {
        this.hideCurrent = true;
        if (runnable != null) {
            runnable.run();
        }
        this.listView.adapter.update(true);
    }

    public void setInput(String str) {
        AsyncTask<String, Void, String> asyncTask = this.lastTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.lastTask = null;
        }
        final boolean z = !this.suggestions.isEmpty();
        if (!TextUtils.isEmpty(str)) {
            this.lastTask = new HttpGetTask(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    AddressBarList.this.lambda$setInput$6(z, (String) obj);
                }
            }).execute(SearchEngine.getCurrent().getAutocompleteURL(str));
            return;
        }
        this.suggestions.clear();
        this.listView.adapter.update(true);
        if (z != (!this.suggestions.isEmpty())) {
            this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
        }
    }

    public void lambda$setInput$6(final boolean z, final String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AddressBarList.this.lambda$setInput$5(str, z);
            }
        });
    }

    public void lambda$setInput$5(String str, boolean z) {
        this.suggestions.clear();
        this.suggestions.addAll(SearchEngine.getCurrent().extractSuggestions(str));
        this.listView.adapter.update(true);
        if (z != (!this.suggestions.isEmpty())) {
            this.listView.layoutManager.scrollToPositionWithOffset(0, 0);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.openProgress < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static class Address2View extends FrameLayout {
        private final Paint dividerPaint;
        public final ImageView iconView;
        public final ImageView insertView;
        private boolean needDivider;
        public final TextView textView;

        public void setTopBottom(int i, int i2, boolean z, boolean z2) {
        }

        public Address2View(Context context) {
            super(context);
            this.dividerPaint = new Paint(1);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.menu_clear_recent);
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
            ImageView imageView2 = new ImageView(context);
            this.insertView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.menu_browser_arrowup);
            addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
        }

        public void setColors(int i, int i2) {
            this.textView.setTextColor(i2);
            this.iconView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(i2, 0.6f), PorterDuff.Mode.SRC_IN));
            this.insertView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(i2, 0.6f), PorterDuff.Mode.SRC_IN));
            this.insertView.setBackground(Theme.createRadSelectorDrawable(0, Theme.multAlpha(i2, 0.15f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        }

        public void set(int i, String str, View.OnClickListener onClickListener, boolean z, boolean z2, AddressBarList addressBarList, boolean z3) {
            this.iconView.setVisibility(0);
            setColors(addressBarList.listBackgroundColor, addressBarList.textColor);
            this.iconView.setImageResource(i == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
            this.textView.setText(str);
            this.insertView.setOnClickListener(onClickListener);
            setTopBottom(addressBarList.grayBackgroundColor, addressBarList.rippleColor, z, z2);
            this.dividerPaint.setColor(Theme.multAlpha(addressBarList.textColor, 0.1f));
            this.needDivider = z3;
            setWillNotDraw(!z3);
        }

        public void setAsShowMore(AddressBarList addressBarList) {
            this.iconView.setImageResource(R.drawable.arrow_more);
            this.iconView.setColorFilter(new PorterDuffColorFilter(addressBarList.textColor, PorterDuff.Mode.SRC_IN));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory<Address2View> {
            @Override
            public Address2View createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Address2View(context);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                Address2View address2View = (Address2View) view;
                if (uItem.object == null) {
                    address2View.setAsShowMore((AddressBarList) uItem.object2);
                } else {
                    address2View.set(uItem.intValue, uItem.text.toString(), uItem.clickCallback, uItem.accent, uItem.red, (AddressBarList) uItem.object2, z);
                }
            }

            public static UItem as(int i, String str, View.OnClickListener onClickListener, boolean z, boolean z2, AddressBarList addressBarList) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.intValue = i;
                ofFactory.text = str;
                ofFactory.clickCallback = onClickListener;
                ofFactory.accent = z;
                ofFactory.red = z2;
                ofFactory.object = Boolean.TRUE;
                ofFactory.object2 = addressBarList;
                return ofFactory;
            }
        }
    }

    public static class BookmarkView extends FrameLayout implements Theme.Colorable {
        public final CheckBox2 checkBox;
        private final Paint dividerPaint;
        public final BackupImageView iconView;
        public final ImageView insertView;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtextView;
        private int textColor;
        public final LinearLayout textLayout;
        public final FrameLayout.LayoutParams textLayoutParams;
        public final TextView textView;
        public final TextView timeView;

        public BookmarkView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.dividerPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.03f, 1.25f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.iconView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(backupImageView, LayoutHelper.createFrame(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 51));
            TextView textView2 = new TextView(context);
            this.subtextView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 51, 0, 3, 0, 0));
            FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
            this.textLayoutParams = createFrame;
            addView(linearLayout, createFrame);
            TextView textView3 = new TextView(context);
            this.timeView = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setMaxLines(1);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setGravity(5);
            textView3.setTextAlignment(6);
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.insertView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.attach_arrow_right);
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 21, resourcesProvider) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    BookmarkView.this.invalidate();
                }
            };
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
        }

        @Override
        public void updateColors() {
            int color = Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider);
            int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
            setColors(color, color2);
            this.dividerPaint.setColor(Theme.multAlpha(color2, 0.1f));
            this.iconView.invalidate();
        }

        public void setColors(int i, int i2) {
            this.textColor = i2;
            this.textView.setTextColor(i2);
            this.subtextView.setTextColor(Theme.blendOver(i, Theme.multAlpha(i2, 0.55f)));
            this.timeView.setTextColor(Theme.multAlpha(i2, 0.55f));
            this.insertView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(i2, 0.6f), PorterDuff.Mode.SRC_IN));
        }

        public void set(MessageObject messageObject, boolean z, String str, boolean z2, boolean z3) {
            String[] split;
            String str2;
            TLRPC$Photo tLRPC$Photo;
            String str3;
            Bitmap bitmap;
            String str4;
            updateColors();
            TLRPC$WebPage tLRPC$WebPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
            String link = tLRPC$WebPage != null ? tLRPC$WebPage.url : AddressBarList.getLink(messageObject);
            WebMetadataCache.WebMetadata webMetadata = WebMetadataCache.getInstance().get(AndroidUtilities.getHostAuthority(link, true));
            if (tLRPC$WebPage != null && (str4 = tLRPC$WebPage.title) != null) {
                this.textView.setText(str4);
            } else if (tLRPC$WebPage != null && (str2 = tLRPC$WebPage.site_name) != null) {
                this.textView.setText(str2);
            } else if (webMetadata != null && !TextUtils.isEmpty(webMetadata.title)) {
                this.textView.setText(webMetadata.title);
            } else if (webMetadata != null && !TextUtils.isEmpty(webMetadata.sitename)) {
                this.textView.setText(webMetadata.sitename);
            } else {
                try {
                    String str5 = Uri.parse(link).getHost().split("\\.")[split.length - 2];
                    this.textView.setText(str5.substring(0, 1).toUpperCase() + str5.substring(1));
                } catch (Exception unused) {
                    this.textView.setText("");
                }
            }
            this.iconView.clearImage();
            if (webMetadata != null && (bitmap = webMetadata.favicon) != null) {
                this.iconView.setImageBitmap(bitmap);
            } else if (tLRPC$WebPage != null && (tLRPC$Photo = tLRPC$WebPage.photo) != null) {
                this.iconView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), tLRPC$WebPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$WebPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), tLRPC$WebPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
            } else {
                String charSequence = this.textView.getText() == null ? "" : this.textView.getText().toString();
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(charSequence);
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(this.textColor, 0.1f)), new Drawable(charSequence.isEmpty() ? "" : charSequence.substring(characterInstance.first(), characterInstance.next())) {
                    private final Text text;
                    final String val$firstLetter;

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setAlpha(int i) {
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    {
                        this.val$firstLetter = r4;
                        this.text = new Text(r4, 14.0f, AndroidUtilities.bold());
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        this.text.draw(canvas, getBounds().centerX() - (this.text.getCurrentWidth() / 2.0f), getBounds().centerY(), BookmarkView.this.textColor, 1.0f);
                    }
                });
                combinedDrawable.setCustomSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
                this.iconView.setImageDrawable(combinedDrawable);
            }
            this.timeView.setVisibility(8);
            this.insertView.setVisibility(z ? 0 : 8);
            String link2 = tLRPC$WebPage != null ? tLRPC$WebPage.url : AddressBarList.getLink(messageObject);
            try {
                try {
                    Uri parse = Uri.parse(link2);
                    link2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                link2 = URLDecoder.decode(link2.replaceAll("\\+", "%2b"), "UTF-8");
                str3 = BottomSheetTabs.urlWithoutFragment(link2);
            } catch (Exception e2) {
                FileLog.e(e2);
                str3 = link2;
            }
            this.subtextView.setText(str3);
            if (!TextUtils.isEmpty(str)) {
                TextView textView = this.textView;
                textView.setText(AndroidUtilities.highlightText(textView.getText(), str, this.resourcesProvider));
                TextView textView2 = this.subtextView;
                textView2.setText(AndroidUtilities.highlightText(textView2.getText(), str, this.resourcesProvider));
            }
            TextView textView3 = this.textView;
            textView3.setText(Emoji.replaceEmoji(textView3.getText(), this.textView.getPaint().getFontMetricsInt(), false));
            TextView textView4 = this.subtextView;
            textView4.setText(Emoji.replaceEmoji(textView4.getText(), this.subtextView.getPaint().getFontMetricsInt(), false));
            this.checkBox.setChecked(z2, false);
            this.textLayoutParams.rightMargin = AndroidUtilities.dp(52.0f);
            this.textLayout.setLayoutParams(this.textLayoutParams);
            this.needDivider = z3;
            setWillNotDraw(!z3);
        }

        public void set(BrowserHistory.Entry entry, String str, boolean z) {
            Bitmap bitmap;
            updateColors();
            if (entry == null) {
                return;
            }
            String str2 = entry.url;
            WebMetadataCache.WebMetadata webMetadata = entry.meta;
            if (webMetadata != null && !TextUtils.isEmpty(webMetadata.title)) {
                this.textView.setText(webMetadata.title);
            } else if (webMetadata != null && !TextUtils.isEmpty(webMetadata.sitename)) {
                this.textView.setText(webMetadata.sitename);
            } else {
                try {
                    String[] split = Uri.parse(str2).getHost().split("\\.");
                    String str3 = split[split.length - 2];
                    TextView textView = this.textView;
                    textView.setText(str3.substring(0, 1).toUpperCase() + str3.substring(1));
                } catch (Exception unused) {
                    this.textView.setText("");
                }
            }
            if (webMetadata != null && (bitmap = webMetadata.favicon) != null) {
                this.iconView.setImageBitmap(bitmap);
            } else {
                String charSequence = this.textView.getText() == null ? "" : this.textView.getText().toString();
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(charSequence);
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(this.textColor, 0.1f)), new Drawable(charSequence.isEmpty() ? "" : charSequence.substring(characterInstance.first(), characterInstance.next())) {
                    private final Text text;
                    final String val$firstLetter;

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setAlpha(int i) {
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }

                    {
                        this.val$firstLetter = r4;
                        this.text = new Text(r4, 14.0f, AndroidUtilities.bold());
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        this.text.draw(canvas, getBounds().centerX() - (this.text.getCurrentWidth() / 2.0f), getBounds().centerY(), BookmarkView.this.textColor, 1.0f);
                    }
                });
                combinedDrawable.setCustomSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
                this.iconView.setImageDrawable(combinedDrawable);
            }
            this.insertView.setVisibility(8);
            try {
                try {
                    Uri parse = Uri.parse(str2);
                    str2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                str2 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            this.subtextView.setText(str2);
            if (!TextUtils.isEmpty(str)) {
                TextView textView2 = this.textView;
                textView2.setText(AndroidUtilities.highlightText(textView2.getText(), str, this.resourcesProvider));
                TextView textView3 = this.subtextView;
                textView3.setText(AndroidUtilities.highlightText(textView3.getText(), str, this.resourcesProvider));
            }
            TextView textView4 = this.textView;
            textView4.setText(Emoji.replaceEmoji(textView4.getText(), this.textView.getPaint().getFontMetricsInt(), false));
            TextView textView5 = this.subtextView;
            textView5.setText(Emoji.replaceEmoji(textView5.getText(), this.subtextView.getPaint().getFontMetricsInt(), false));
            this.timeView.setText(LocaleController.getInstance().getFormatterDay().format(entry.time));
            this.checkBox.setChecked(false, false);
            this.textLayoutParams.rightMargin = AndroidUtilities.dp(70.0f);
            this.textLayout.setLayoutParams(this.textLayoutParams);
            this.needDivider = z;
            setWillNotDraw(!z);
        }

        public void setChecked(boolean z) {
            this.checkBox.setChecked(z, true);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory<BookmarkView> {
            @Override
            public BookmarkView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BookmarkView(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                BookmarkView bookmarkView = (BookmarkView) view;
                Object obj = uItem.object2;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    boolean z2 = uItem.accent;
                    CharSequence charSequence = uItem.subtext;
                    bookmarkView.set(messageObject, z2, charSequence != null ? charSequence.toString() : null, uItem.checked, z);
                } else if (obj instanceof BrowserHistory.Entry) {
                    BrowserHistory.Entry entry = (BrowserHistory.Entry) obj;
                    CharSequence charSequence2 = uItem.subtext;
                    bookmarkView.set(entry, charSequence2 != null ? charSequence2.toString() : null, z);
                }
            }

            public static UItem as(MessageObject messageObject, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.intValue = 3;
                ofFactory.accent = z;
                ofFactory.object2 = messageObject;
                return ofFactory;
            }

            public static UItem as(MessageObject messageObject, boolean z, String str) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.intValue = 3;
                ofFactory.accent = z;
                ofFactory.object2 = messageObject;
                ofFactory.subtext = str;
                return ofFactory;
            }

            public static UItem as(BrowserHistory.Entry entry, String str) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.intValue = 3;
                ofFactory.accent = false;
                ofFactory.object2 = entry;
                ofFactory.subtext = str;
                return ofFactory;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object2 == uItem2.object2 && TextUtils.isEmpty(uItem.subtext) == TextUtils.isEmpty(uItem2.subtext);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.object2 == uItem2.object2 && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }
        }
    }

    public static class QueryEntry {
        public long lastUsage;
        public final String query;
        public double rank;

        public QueryEntry(String str, long j) {
            this.query = str;
            this.lastUsage = j;
        }
    }

    public static ArrayList<String> getRecentSearches(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        ArrayList<String> arrayList = new ArrayList<>();
        String string = sharedPreferences.getString("queries_json", null);
        if (string != null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    QueryEntry queryEntry = new QueryEntry(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    queryEntry.rank = jSONObject.optDouble("rank", 0.0d);
                    arrayList2.add(queryEntry);
                }
                Collections.sort(arrayList2, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$getRecentSearches$7;
                        lambda$getRecentSearches$7 = AddressBarList.lambda$getRecentSearches$7((AddressBarList.QueryEntry) obj, (AddressBarList.QueryEntry) obj2);
                        return lambda$getRecentSearches$7;
                    }
                });
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    QueryEntry queryEntry2 = (QueryEntry) it.next();
                    if (arrayList.size() >= 20) {
                        break;
                    }
                    arrayList.add(queryEntry2.query);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static int lambda$getRecentSearches$7(QueryEntry queryEntry, QueryEntry queryEntry2) {
        return (int) (queryEntry2.rank - queryEntry.rank);
    }

    public static void pushRecentSearch(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        QueryEntry queryEntry = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    QueryEntry queryEntry2 = new QueryEntry(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    queryEntry2.rank = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(queryEntry2);
                }
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        int lambda$pushRecentSearch$8;
                        lambda$pushRecentSearch$8 = AddressBarList.lambda$pushRecentSearch$8((AddressBarList.QueryEntry) obj, (AddressBarList.QueryEntry) obj2);
                        return lambda$pushRecentSearch$8;
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int i2 = 0;
        while (true) {
            try {
                if (i2 >= arrayList.size()) {
                    break;
                }
                QueryEntry queryEntry3 = (QueryEntry) arrayList.get(i2);
                if (TextUtils.equals(queryEntry3.query, str)) {
                    queryEntry = queryEntry3;
                    break;
                }
                i2++;
            } catch (Exception e2) {
                FileLog.e(e2);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (queryEntry != null) {
            double d = queryEntry.rank;
            double d2 = currentTimeMillis - queryEntry.lastUsage;
            Double.isNaN(d2);
            queryEntry.rank = d + Math.exp(d2 / 2419200.0d);
        } else {
            queryEntry = new QueryEntry(str, currentTimeMillis);
            arrayList.add(queryEntry);
        }
        queryEntry.lastUsage = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < Math.min(arrayList.size(), 20); i3++) {
            QueryEntry queryEntry4 = (QueryEntry) arrayList.get(i3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", queryEntry4.query);
            jSONObject2.put("rank", queryEntry4.rank);
            jSONObject2.put("usage", queryEntry4.lastUsage);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public static int lambda$pushRecentSearch$8(QueryEntry queryEntry, QueryEntry queryEntry2) {
        return (int) (queryEntry2.rank - queryEntry.rank);
    }

    public static void clearRecentSearches(Context context) {
        context.getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
    }

    public static class BookmarksList implements NotificationCenter.NotificationCenterDelegate {
        private boolean attached;
        private final int currentAccount;
        public boolean endReached;
        private int guid;
        public final ArrayList<MessageObject> links;
        private boolean loading;
        private final String query;
        private final Runnable whenUpdated;

        public BookmarksList(int i, Runnable runnable) {
            this(i, null, runnable);
        }

        public BookmarksList(int i, String str, Runnable runnable) {
            this.links = new ArrayList<>();
            this.guid = ConnectionsManager.generateClassGuid();
            this.currentAccount = i;
            this.query = str;
            this.whenUpdated = runnable;
        }

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.bookmarkAdded);
            if (TextUtils.isEmpty(this.query)) {
                load();
            }
        }

        public void detach() {
            if (this.attached) {
                this.attached = false;
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mediaDidLoad);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.bookmarkAdded);
                ConnectionsManager.getInstance(this.currentAccount).cancelRequestsForGuid(this.guid);
                this.loading = false;
            }
        }

        public void delete(ArrayList<Integer> arrayList) {
            int i = 0;
            while (i < this.links.size()) {
                if (arrayList.contains(Integer.valueOf(this.links.get(i).getId()))) {
                    this.links.remove(i);
                    i--;
                }
                i++;
            }
        }

        public void load() {
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < this.links.size(); i2++) {
                i = Math.min(i, this.links.get(i2).getId());
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            int i3 = this.links.isEmpty() ? 30 : 50;
            if (i == Integer.MAX_VALUE) {
                i = 0;
            }
            mediaDataController.loadMedia(clientUserId, i3, i, 0, 3, 0L, 1, this.guid, 0, null, this.query);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.mediaDidLoad) {
                if (((Integer) objArr[3]).intValue() == this.guid) {
                    this.loading = false;
                    this.endReached = ((Boolean) objArr[5]).booleanValue();
                    this.links.addAll((ArrayList) objArr[2]);
                    this.whenUpdated.run();
                }
            } else if (i == NotificationCenter.bookmarkAdded) {
                this.links.add(0, (MessageObject) objArr[0]);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BookmarksList bookmarksList = this.bookmarksList;
        if (bookmarksList == null || !this.opened) {
            return;
        }
        bookmarksList.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BookmarksList bookmarksList = this.bookmarksList;
        if (bookmarksList != null) {
            bookmarksList.detach();
        }
    }
}
