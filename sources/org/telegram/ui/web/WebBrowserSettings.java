package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda28;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.WallpaperCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda51;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;

public final class WebBrowserSettings extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass1 addIcon;
    public long cacheSize;
    public long cookiesSize;
    public long historySize;
    public final ArticleViewer$$ExternalSyntheticLambda28 whenHistoryClicked;

    public final class AnonymousClass1 extends CombinedDrawable {
        public final int $r8$classId;

        public AnonymousClass1(Drawable drawable, Drawable drawable2, int i) {
            super(drawable, drawable2);
            this.$r8$classId = i;
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        public AnonymousClass1(Drawable drawable, Drawable drawable2) {
            super(drawable, drawable2);
            this.$r8$classId = 0;
            this.translateX = AndroidUtilities.dp(2.0f);
        }

        private final void setColorFilter$org$telegram$ui$Stories$PeerStoriesView$12(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Stories$PeerStoriesView$13(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Stories$PeerStoriesView$8$3(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$web$WebBrowserSettings$1(ColorFilter colorFilter) {
        }
    }

    public final class WebsiteView extends FrameLayout {
        public AnimatedEmojiDrawable animatedEmojiDrawable;
        public String domain;
        public final ImageView imageView;
        public boolean needDivider;
        public final AnonymousClass1 subtitleView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                WebsiteView websiteView = (WebsiteView) view;
                CharSequence charSequence = uItem.textValue;
                String str = (String) uItem.text;
                long j = uItem.longValue;
                websiteView.titleView.setText(charSequence);
                AnonymousClass1 anonymousClass1 = websiteView.subtitleView;
                anonymousClass1.setText(str);
                if (TextUtils.isEmpty(charSequence)) {
                    anonymousClass1.setTranslationY(-AndroidUtilities.dp(14.0f));
                    anonymousClass1.setScaleX(1.3f);
                    anonymousClass1.setScaleY(1.3f);
                } else {
                    anonymousClass1.setTranslationY(0.0f);
                    anonymousClass1.setScaleX(1.0f);
                    anonymousClass1.setScaleY(1.0f);
                }
                websiteView.domain = str;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = (str.isEmpty() || TextUtils.isEmpty(str)) ? "" : str;
                }
                String string = charSequence.toString();
                AnimatedEmojiDrawable animatedEmojiDrawable = websiteView.animatedEmojiDrawable;
                ImageView imageView = websiteView.imageView;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(imageView);
                    websiteView.animatedEmojiDrawable = null;
                }
                if (j != 0) {
                    AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 1, j);
                    websiteView.animatedEmojiDrawable = animatedEmojiDrawableMake;
                    animatedEmojiDrawableMake.addView(imageView);
                    imageView.setImageDrawable(websiteView.animatedEmojiDrawable);
                } else {
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.1f, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false))), new TextCell.AnonymousClass2(string));
                    combinedDrawable.setCustomSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
                    imageView.setImageDrawable(combinedDrawable);
                }
                websiteView.needDivider = z;
                websiteView.invalidate();
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new WebsiteView(context);
            }
        }

        public WebsiteView(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
            ?? r0 = new TextView(context) {
                @Override
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    setPivotY(getMeasuredHeight() / 2.0f);
                }
            };
            this.subtitleView = r0;
            r0.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            r0.setTextSize(1, 13.0f);
            r0.setMaxLines(1);
            r0.setEllipsize(truncateAt);
            r0.setPivotX(0.0f);
            addView((View) r0, LayoutHelper.createFrame(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(R.drawable.ic_ab_other);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText3, false), PorterDuff.Mode.SRC_IN));
            addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }
    }

    public WebBrowserSettings(ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28) {
        this.whenHistoryClicked = articleViewer$$ExternalSyntheticLambda28;
    }

    public static boolean deleteDirectory(File file, Boolean bool) {
        boolean z;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                z = true;
                for (File file2 : fileArrListFiles) {
                    if ((bool == null || bool.booleanValue() == file2.getName().startsWith("Cookies")) && !deleteDirectory(file2, bool)) {
                        z = false;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                file.delete();
            }
        } else {
            if (bool != null && bool.booleanValue() != file.getName().startsWith("Cookies")) {
                return false;
            }
            file.delete();
        }
        return true;
    }

    public static long getDirectorySize(File file, Boolean bool) {
        long directorySize = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    directorySize += getDirectorySize(file2, bool);
                }
                return directorySize;
            }
        } else if (bool == null || bool.booleanValue() == file.getName().startsWith("Cookies")) {
            return file.length();
        }
        return 0L;
    }

    @Override
    public final View createView(Context context) {
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.poll_add_circle).mutate();
        Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.poll_add_plus).mutate();
        int themedColor = getThemedColor(Theme.key_switchTrackChecked);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_checkboxCheck), mode));
        this.addIcon = new AnonymousClass1(drawableMutate, drawableMutate2);
        this.fragmentView = super.createView(context);
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        if (i != NotificationCenter.webBrowserSettingsUpdate || (universalRecyclerView = this.listView) == null) {
            return;
        }
        universalRecyclerView.adapter.update(true);
    }

    @Override
    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        arrayList.add(UItem.asRippleCheck(1, LocaleController.getString(R.string.BrowserSettingsEnable)).setChecked(zIsWebBrowserInAppEnabled));
        zzkf.m(R.string.BrowserSettingsEnableInfo, arrayList);
        if (!zIsWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            arrayList.add(UItem.asCheck(17, LocaleController.getString(R.string.WebBrowserShowCloseButton)).setChecked(getMessagesController().isWebBrowserUseCustomTabs()));
            zzkf.m(R.string.WebBrowserShowCloseButtonInfo, arrayList);
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2)));
            arrayList.size();
            arrayList.add(UItem.asButton(16, this.addIcon, LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd)).accent());
            List<TL_account.WebDomainException> webBrowserExceptionsList = getMessagesController().getWebBrowserExceptionsList(false);
            for (TL_account.WebDomainException webDomainException : webBrowserExceptionsList) {
                String str = webDomainException.domain;
                String str2 = webDomainException.title;
                long j = webDomainException.favicon;
                int i = WebsiteView.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(WebsiteView.Factory.class);
                uItemOfFactory.text = str;
                uItemOfFactory.textValue = str2;
                uItemOfFactory.longValue = j;
                arrayList.add(uItemOfFactory);
            }
            arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2)));
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            arrayList.add(UItem.asButton(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2)).red());
            arrayList.add(UItem.asShadow(null));
            return;
        }
        arrayList.size();
        int i2 = R.drawable.menu_clear_cookies;
        String string = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j2 = this.cookiesSize;
        arrayList.add(UItem.asButton(3, i2, string, j2 > 0 ? AndroidUtilities.formatFileSize(j2) : ""));
        arrayList.size();
        int i3 = R.drawable.menu_clear_cache;
        String string2 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j3 = this.cacheSize;
        arrayList.add(UItem.asButton(2, i3, string2, j3 > 0 ? AndroidUtilities.formatFileSize(j3) : ""));
        zzkf.m(R.string.BrowserSettingsCookiesInfo, arrayList);
        if (this.historySize > 0) {
            arrayList.size();
            arrayList.add(UItem.asButton(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(UItem.asButton(7, i3, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.historySize, ',')));
            arrayList.add(UItem.asShadow(null));
        }
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2)));
        arrayList.size();
        arrayList.add(UItem.asButton(15, this.addIcon, LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd)).accent());
        List<TL_account.WebDomainException> webBrowserExceptionsList2 = getMessagesController().getWebBrowserExceptionsList(true);
        for (TL_account.WebDomainException webDomainException2 : webBrowserExceptionsList2) {
            String str3 = webDomainException2.domain;
            String str4 = webDomainException2.title;
            long j4 = webDomainException2.favicon;
            int i4 = WebsiteView.Factory.$r8$clinit;
            UItem uItemOfFactory2 = UItem.ofFactory(WebsiteView.Factory.class);
            uItemOfFactory2.text = str3;
            uItemOfFactory2.textValue = str4;
            uItemOfFactory2.longValue = j4;
            arrayList.add(uItemOfFactory2);
        }
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2)));
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            arrayList.add(UItem.asButton(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2)).red());
            arrayList.add(UItem.asShadow(null));
        }
        arrayList.size();
        arrayList.add(UItem.asButton(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), SearchEngine.getCurrent().name));
        zzkf.m(R.string.BrowserSettingsSearchEngineInfo, arrayList);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(UItem.asCheck(12, "adaptable colors").setChecked(SharedConfig.adaptableColorInBrowser));
            arrayList.add(UItem.asCheck(13, "only local IV").setChecked(SharedConfig.onlyLocalInstantView));
        }
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BrowserSettingsTitle);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void loadSizes() {
        ArrayList history = BrowserHistory.getHistory(new RichEditor$$ExternalSyntheticLambda53(this, 16));
        if (history != null) {
            this.historySize = history.size();
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null && universalRecyclerView.adapter != null && universalRecyclerView.isAttachedToWindow()) {
                this.listView.adapter.update(true);
            }
        }
        Utilities.globalQueue.postRunnable(new AddressBarList$$ExternalSyntheticLambda4(this, 8));
    }

    @Override
    public final void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = 6;
        final int i3 = 3;
        final int i4 = 2;
        int i5 = 5;
        final int i6 = 0;
        final int i7 = 1;
        int i8 = uItem.id;
        if (i8 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((TextCheckCell) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i8 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((TextCheckCell) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        if (i8 == 17) {
            boolean z = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z);
            ((TextCheckCell) view).setChecked(z);
            this.listView.adapter.update(true);
            return;
        }
        if (i8 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            TextCheckCell textCheckCell = (TextCheckCell) view;
            textCheckCell.setChecked(zIsWebBrowserInAppEnabled);
            textCheckCell.setBackgroundColorAnimated(zIsWebBrowserInAppEnabled, Theme.getColor(null, zIsWebBrowserInAppEnabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
            this.listView.adapter.update(true);
            return;
        }
        if (i8 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.listView.adapter.update(true);
            return;
        }
        if (i8 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.listView.adapter.update(true);
            return;
        }
        String str = "";
        if (i8 == 2) {
            AlertDialog.Builder title = new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.BrowserSettingsCacheClear));
            int i9 = R.string.BrowserSettingsCacheClearText;
            if (this.cacheSize != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.cacheSize) + ")";
            }
            title.setMessage(LocaleController.formatString(i9, str)).setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i10) {
                    switch (i6) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getContext());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    WebBrowserSettings.deleteDirectory(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    WebBrowserSettings.deleteDirectory(file2, null);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            if (WebMetadataCache.instance == null) {
                                WebMetadataCache.instance = new WebMetadataCache();
                            }
                            WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                            HashMap map = webMetadataCache.cache;
                            if (map == null) {
                                webMetadataCache.loading = false;
                                webMetadataCache.loaded = true;
                                webMetadataCache.cache = new HashMap();
                            } else {
                                map.clear();
                            }
                            webMetadataCache.scheduleSave();
                            webBrowserSettings.loadSizes();
                            break;
                        case 1:
                            WebBrowserSettings webBrowserSettings2 = this.f$0;
                            webBrowserSettings2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    WebBrowserSettings.deleteDirectory(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            webBrowserSettings2.loadSizes();
                            break;
                        case 2:
                            WebBrowserSettings webBrowserSettings3 = this.f$0;
                            webBrowserSettings3.getClass();
                            try {
                                BrowserHistory.history.clear();
                                BrowserHistory.historyById.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                            webBrowserSettings3.historySize = 0L;
                            webBrowserSettings3.listView.adapter.update(true);
                            break;
                        default:
                            WebBrowserSettings webBrowserSettings4 = this.f$0;
                            webBrowserSettings4.getMessagesController().clearAllWebBrowserExceptions();
                            webBrowserSettings4.listView.adapter.update(true);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (i8 == 3) {
            AlertDialog.Builder title2 = new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.BrowserSettingsCookiesClear));
            int i10 = R.string.BrowserSettingsCookiesClearText;
            if (this.cookiesSize != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.cookiesSize) + ")";
            }
            title2.setMessage(LocaleController.formatString(i10, str)).setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i11) {
                    switch (i7) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getContext());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    WebBrowserSettings.deleteDirectory(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    WebBrowserSettings.deleteDirectory(file2, null);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            if (WebMetadataCache.instance == null) {
                                WebMetadataCache.instance = new WebMetadataCache();
                            }
                            WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                            HashMap map = webMetadataCache.cache;
                            if (map == null) {
                                webMetadataCache.loading = false;
                                webMetadataCache.loaded = true;
                                webMetadataCache.cache = new HashMap();
                            } else {
                                map.clear();
                            }
                            webMetadataCache.scheduleSave();
                            webBrowserSettings.loadSizes();
                            break;
                        case 1:
                            WebBrowserSettings webBrowserSettings2 = this.f$0;
                            webBrowserSettings2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    WebBrowserSettings.deleteDirectory(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            webBrowserSettings2.loadSizes();
                            break;
                        case 2:
                            WebBrowserSettings webBrowserSettings3 = this.f$0;
                            webBrowserSettings3.getClass();
                            try {
                                BrowserHistory.history.clear();
                                BrowserHistory.historyById.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                            webBrowserSettings3.historySize = 0L;
                            webBrowserSettings3.listView.adapter.update(true);
                            break;
                        default:
                            WebBrowserSettings webBrowserSettings4 = this.f$0;
                            webBrowserSettings4.getMessagesController().clearAllWebBrowserExceptions();
                            webBrowserSettings4.listView.adapter.update(true);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (i8 == 7) {
            ArrayList history = BrowserHistory.getHistory(null);
            int size = history.size();
            long jMin = Long.MAX_VALUE;
            int i11 = 0;
            while (i11 < size) {
                Object obj = history.get(i11);
                i11++;
                jMin = Math.min(jMin, ((BrowserHistory.Entry) obj).time);
            }
            new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.BrowserSettingsHistoryClear)).setMessage(LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(jMin / 1000))).setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i12) {
                    switch (i4) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getContext());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    WebBrowserSettings.deleteDirectory(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    WebBrowserSettings.deleteDirectory(file2, null);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            if (WebMetadataCache.instance == null) {
                                WebMetadataCache.instance = new WebMetadataCache();
                            }
                            WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                            HashMap map = webMetadataCache.cache;
                            if (map == null) {
                                webMetadataCache.loading = false;
                                webMetadataCache.loaded = true;
                                webMetadataCache.cache = new HashMap();
                            } else {
                                map.clear();
                            }
                            webMetadataCache.scheduleSave();
                            webBrowserSettings.loadSizes();
                            break;
                        case 1:
                            WebBrowserSettings webBrowserSettings2 = this.f$0;
                            webBrowserSettings2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    WebBrowserSettings.deleteDirectory(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            webBrowserSettings2.loadSizes();
                            break;
                        case 2:
                            WebBrowserSettings webBrowserSettings3 = this.f$0;
                            webBrowserSettings3.getClass();
                            try {
                                BrowserHistory.history.clear();
                                BrowserHistory.historyById.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                            webBrowserSettings3.historySize = 0L;
                            webBrowserSettings3.listView.adapter.update(true);
                            break;
                        default:
                            WebBrowserSettings webBrowserSettings4 = this.f$0;
                            webBrowserSettings4.getMessagesController().clearAllWebBrowserExceptions();
                            webBrowserSettings4.listView.adapter.update(true);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (i8 == 9) {
            HistoryFragment[] historyFragmentArr = {null};
            HistoryFragment historyFragment = new HistoryFragment(new RichEditor$$ExternalSyntheticLambda51(i2, this, historyFragmentArr), null);
            historyFragmentArr[0] = historyFragment;
            presentFragment(historyFragment);
            return;
        }
        if (i8 == 5) {
            new AlertDialog.Builder(getContext(), 0, getResourceProvider()).setTitle(LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle)).setMessage(LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i12) {
                    switch (i3) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getContext());
                                webView.clearCache(true);
                                webView.clearHistory();
                                webView.destroy();
                                break;
                            } catch (Exception unused) {
                            }
                            try {
                                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file.exists()) {
                                    WebBrowserSettings.deleteDirectory(file, Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            try {
                                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                                if (file2.exists()) {
                                    WebBrowserSettings.deleteDirectory(file2, null);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            if (WebMetadataCache.instance == null) {
                                WebMetadataCache.instance = new WebMetadataCache();
                            }
                            WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                            HashMap map = webMetadataCache.cache;
                            if (map == null) {
                                webMetadataCache.loading = false;
                                webMetadataCache.loaded = true;
                                webMetadataCache.cache = new HashMap();
                            } else {
                                map.clear();
                            }
                            webMetadataCache.scheduleSave();
                            webBrowserSettings.loadSizes();
                            break;
                        case 1:
                            WebBrowserSettings webBrowserSettings2 = this.f$0;
                            webBrowserSettings2.getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.removeAllCookies(null);
                            cookieManager.flush();
                            try {
                                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                                if (file3.exists()) {
                                    WebBrowserSettings.deleteDirectory(file3, Boolean.TRUE);
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            webBrowserSettings2.loadSizes();
                            break;
                        case 2:
                            WebBrowserSettings webBrowserSettings3 = this.f$0;
                            webBrowserSettings3.getClass();
                            try {
                                BrowserHistory.history.clear();
                                BrowserHistory.historyById.clear();
                                File file4 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                                if (file4.exists()) {
                                    file4.delete();
                                }
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                            webBrowserSettings3.historySize = 0L;
                            webBrowserSettings3.listView.adapter.update(true);
                            break;
                        default:
                            WebBrowserSettings webBrowserSettings4 = this.f$0;
                            webBrowserSettings4.getMessagesController().clearAllWebBrowserExceptions();
                            webBrowserSettings4.listView.adapter.update(true);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
            return;
        }
        if (uItem.instanceOf(WebsiteView.Factory.class)) {
            WebsiteView websiteView = (WebsiteView) view;
            ItemOptions.makeOptions((ViewGroup) this.fragmentView, websiteView).setDimAlpha(40).add(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new WebActionBar$$ExternalSyntheticLambda0(i5, this, websiteView.domain)).show();
            return;
        }
        int i12 = uItem.id;
        if (i12 != 6) {
            if (i12 == 15 || i12 == 16) {
                boolean zIsWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
                if (getMessagesController().isWebBrowserExceptionsLimitReached(zIsWebBrowserInAppEnabled2)) {
                    AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage));
                    return;
                } else {
                    AlertsCreator.showAddBrowserException(getContext(), getResourceProvider(), zIsWebBrowserInAppEnabled2, new AddressBarList$$ExternalSyntheticLambda1(this, zIsWebBrowserInAppEnabled2, i5));
                    return;
                }
            }
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        AtomicReference atomicReference = new AtomicReference();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ArrayList searchEngines = SearchEngine.getSearchEngines();
        int size2 = searchEngines.size();
        CharSequence[] charSequenceArr = new CharSequence[size2];
        int i13 = 0;
        while (i13 < size2) {
            charSequenceArr[i13] = ((SearchEngine) searchEngines.get(i13)).name;
            RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
            radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
            radioColorCell.setTextAndValue(charSequenceArr[i13], i13 == SharedConfig.searchEngineType);
            radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            linearLayout.addView(radioColorCell);
            radioColorCell.setOnClickListener(new WallpaperCell$$ExternalSyntheticLambda0(i13, atomicReference, view));
            i13++;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.SearchEngine)).setView(linearLayout).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        atomicReference.set(alertDialogCreate);
        showDialog(alertDialogCreate);
    }

    @Override
    public final boolean onFragmentCreate() {
        loadSizes();
        getNotificationCenter().addObserver(this, NotificationCenter.webBrowserSettingsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.webBrowserSettingsUpdate);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        UniversalRecyclerView universalRecyclerView = this.listView;
        universalRecyclerView.setPadding(0, universalRecyclerView.getPaddingTop(), 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }
}
