package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda131;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda55;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.GroupCallActivity$6$$ExternalSyntheticLambda6;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$6$$ExternalSyntheticLambda7;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class WebBrowserSettings extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public ProfileActivity.AnonymousClass53 addIcon;
    public long cacheSize;
    public long cookiesSize;
    public long historySize;
    public final ArticleViewer$$ExternalSyntheticLambda10 whenHistoryClicked;

    public final class WebsiteView extends FrameLayout {
        public AnimatedEmojiDrawable animatedEmojiDrawable;
        public String domain;
        public final ImageView imageView;
        public boolean needDivider;
        public final VoIPFragment.AnonymousClass5 subtitleView;
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
                VoIPFragment.AnonymousClass5 anonymousClass5 = websiteView.subtitleView;
                anonymousClass5.setText(str);
                if (TextUtils.isEmpty(charSequence)) {
                    anonymousClass5.setTranslationY(-AndroidUtilities.dp(14.0f));
                    anonymousClass5.setScaleX(1.3f);
                    anonymousClass5.setScaleY(1.3f);
                } else {
                    anonymousClass5.setTranslationY(0.0f);
                    anonymousClass5.setScaleX(1.0f);
                    anonymousClass5.setScaleY(1.0f);
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
                    AnimatedEmojiDrawable animatedEmojiDrawableMake = AnimatedEmojiDrawable.make(UserConfig.selectedAccount, j, null, 1);
                    websiteView.animatedEmojiDrawable = animatedEmojiDrawableMake;
                    animatedEmojiDrawableMake.addView(imageView);
                    imageView.setImageDrawable(websiteView.animatedEmojiDrawable);
                } else {
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.1f, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false))), new TextCell.AnonymousClass2(string));
                    int iDp = AndroidUtilities.dp(28.0f);
                    int iDp2 = AndroidUtilities.dp(28.0f);
                    combinedDrawable.backWidth = iDp;
                    combinedDrawable.backHeight = iDp2;
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
            VoIPFragment.AnonymousClass5 anonymousClass5 = new VoIPFragment.AnonymousClass5(this, context, 5);
            this.subtitleView = anonymousClass5;
            anonymousClass5.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            anonymousClass5.setTextSize(1, 13.0f);
            anonymousClass5.setMaxLines(1);
            anonymousClass5.setEllipsize(truncateAt);
            anonymousClass5.setPivotX(0.0f);
            addView(anonymousClass5, LayoutHelper.createFrame(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
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

    public WebBrowserSettings(ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10) {
        this.whenHistoryClicked = articleViewer$$ExternalSyntheticLambda10;
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
        ProfileActivity.AnonymousClass53 anonymousClass53 = new ProfileActivity.AnonymousClass53(drawableMutate, drawableMutate2, 4);
        anonymousClass53.translateX = AndroidUtilities.dp(2.0f);
        this.addIcon = anonymousClass53;
        this.fragmentView = super.createView(context);
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalFragment.AnonymousClass3 anonymousClass3;
        if (i != NotificationCenter.webBrowserSettingsUpdate || (anonymousClass3 = this.listView) == null) {
            return;
        }
        anonymousClass3.adapter.update(true);
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
        arrayList.size();
        String string = LocaleController.getString(R.string.BrowserSettingsEnable);
        UItem uItem = new UItem(9);
        uItem.id = 1;
        uItem.text = string;
        uItem.setChecked(zIsWebBrowserInAppEnabled);
        arrayList.add(uItem);
        String string2 = LocaleController.getString(R.string.BrowserSettingsEnableInfo);
        UItem uItem2 = new UItem(7);
        uItem2.text = string2;
        arrayList.add(uItem2);
        if (!zIsWebBrowserInAppEnabled) {
            getMessagesController().isWebBrowserUseCustomTabs();
            UItem uItemAsCheck = UItem.asCheck(17, LocaleController.getString(R.string.WebBrowserShowCloseButton));
            uItemAsCheck.setChecked(getMessagesController().isWebBrowserUseCustomTabs());
            arrayList.add(uItemAsCheck);
            String string3 = LocaleController.getString(R.string.WebBrowserShowCloseButtonInfo);
            UItem uItem3 = new UItem(7);
            uItem3.text = string3;
            arrayList.add(uItem3);
            String string4 = LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInTitle2);
            UItem uItem4 = new UItem(0);
            uItem4.text = string4;
            arrayList.add(uItem4);
            arrayList.size();
            ProfileActivity.AnonymousClass53 anonymousClass53 = this.addIcon;
            String string5 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
            UItem uItem5 = new UItem(3);
            uItem5.id = 16;
            uItem5.object = anonymousClass53;
            uItem5.text = string5;
            uItem5.accent = true;
            arrayList.add(uItem5);
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
            String string6 = LocaleController.getString(R.string.BrowserSettingsAlwaysOpenInInfo2);
            UItem uItem6 = new UItem(7);
            uItem6.text = string6;
            arrayList.add(uItem6);
            if (webBrowserExceptionsList.isEmpty()) {
                return;
            }
            arrayList.size();
            UItem uItemAsButton = UItem.asButton(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            uItemAsButton.red = true;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItemAsButton, 7);
            uItemM.text = null;
            arrayList.add(uItemM);
            return;
        }
        arrayList.size();
        int i2 = R.drawable.menu_clear_cookies;
        String string7 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
        long j2 = this.cookiesSize;
        arrayList.add(UItem.asButton(3, i2, string7, j2 > 0 ? AndroidUtilities.formatFileSize(j2) : ""));
        arrayList.size();
        int i3 = R.drawable.menu_clear_cache;
        String string8 = LocaleController.getString(R.string.BrowserSettingsCacheClear);
        long j3 = this.cacheSize;
        arrayList.add(UItem.asButton(2, i3, string8, j3 > 0 ? AndroidUtilities.formatFileSize(j3) : ""));
        String string9 = LocaleController.getString(R.string.BrowserSettingsCookiesInfo);
        UItem uItem7 = new UItem(7);
        uItem7.text = string9;
        arrayList.add(uItem7);
        if (this.historySize > 0) {
            arrayList.size();
            arrayList.add(UItem.asButton(9, R.drawable.menu_clear_recent, LocaleController.getString(R.string.BrowserSettingsHistoryShow)));
            arrayList.size();
            arrayList.add(UItem.asButton(7, i3, LocaleController.getString(R.string.BrowserSettingsHistoryClear), LocaleController.formatPluralStringComma("BrowserSettingsHistoryPages", (int) this.historySize, ',')));
            UItem uItem8 = new UItem(7);
            uItem8.text = null;
            arrayList.add(uItem8);
        }
        String string10 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInTitle2);
        UItem uItem9 = new UItem(0);
        uItem9.text = string10;
        arrayList.add(uItem9);
        arrayList.size();
        ProfileActivity.AnonymousClass53 anonymousClass54 = this.addIcon;
        String string11 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInAdd);
        UItem uItem10 = new UItem(3);
        uItem10.id = 15;
        uItem10.object = anonymousClass54;
        uItem10.text = string11;
        uItem10.accent = true;
        arrayList.add(uItem10);
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
        String string12 = LocaleController.getString(R.string.BrowserSettingsNeverOpenInInfo2);
        UItem uItem11 = new UItem(7);
        uItem11.text = string12;
        arrayList.add(uItem11);
        if (!webBrowserExceptionsList2.isEmpty()) {
            arrayList.size();
            UItem uItemAsButton2 = UItem.asButton(5, LocaleController.getString(R.string.BrowserSettingsNeverOpenInClearList2));
            uItemAsButton2.red = true;
            UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemAsButton2, 7);
            uItemM2.text = null;
            arrayList.add(uItemM2);
        }
        arrayList.size();
        arrayList.add(UItem.asButton(6, R.drawable.msg_search, LocaleController.getString(R.string.SearchEngine), SearchEngine.getCurrent().name));
        String string13 = LocaleController.getString(R.string.BrowserSettingsSearchEngineInfo);
        UItem uItem12 = new UItem(7);
        uItem12.text = string13;
        arrayList.add(uItem12);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            UItem uItemAsCheck2 = UItem.asCheck(12, "adaptable colors");
            uItemAsCheck2.setChecked(SharedConfig.adaptableColorInBrowser);
            arrayList.add(uItemAsCheck2);
            UItem uItemAsCheck3 = UItem.asCheck(13, "only local IV");
            uItemAsCheck3.setChecked(SharedConfig.onlyLocalInstantView);
            arrayList.add(uItemAsCheck3);
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
        UniversalAdapter universalAdapter;
        ArrayList history = BrowserHistory.getHistory(new HistoryFragment$$ExternalSyntheticLambda0(this, 2));
        if (history != null) {
            this.historySize = history.size();
            UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
            if (anonymousClass3 != null && (universalAdapter = anonymousClass3.adapter) != null && anonymousClass3.mIsAttached) {
                universalAdapter.update(true);
            }
        }
        Utilities.globalQueue.postRunnable(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 26));
    }

    @Override
    public final void onClick$1(UItem uItem, View view) {
        int i = 5;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        int i6 = uItem.id;
        if (i6 == 12) {
            SharedConfig.toggleBrowserAdaptableColors();
            ((TextCheckCell) view).setChecked(SharedConfig.adaptableColorInBrowser);
            return;
        }
        if (i6 == 13) {
            SharedConfig.toggleLocalInstantView();
            ((TextCheckCell) view).setChecked(SharedConfig.onlyLocalInstantView);
            return;
        }
        if (i6 == 17) {
            boolean z = !getMessagesController().isWebBrowserUseCustomTabs();
            getMessagesController().toggleWebBrowserUseCustomTabs(z);
            ((TextCheckCell) view).setChecked(z);
            this.listView.adapter.update(true);
            return;
        }
        if (i6 == 1) {
            getMessagesController().toggleWebBrowserInAppEnabled();
            boolean zIsWebBrowserInAppEnabled = getMessagesController().isWebBrowserInAppEnabled();
            TextCheckCell textCheckCell = (TextCheckCell) view;
            textCheckCell.setChecked(zIsWebBrowserInAppEnabled);
            textCheckCell.setBackgroundColorAnimated(Theme.getColor(null, zIsWebBrowserInAppEnabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false), zIsWebBrowserInAppEnabled);
            this.listView.adapter.update(true);
            return;
        }
        if (i6 == 10) {
            getMessagesController().toggleWebBrowserUseCustomTabs(true);
            this.listView.adapter.update(true);
            return;
        }
        if (i6 == 11) {
            getMessagesController().toggleWebBrowserUseCustomTabs(false);
            this.listView.adapter.update(true);
            return;
        }
        String str = "";
        if (i6 == 2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BrowserSettingsCacheClear);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            int i7 = R.string.BrowserSettingsCacheClearText;
            if (this.cacheSize != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.cacheSize) + ")";
            }
            alertDialog.message = LocaleController.formatString(i7, str);
            builder.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i8) {
                    switch (i4) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getParentActivity());
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
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.makeRed(-1);
            builder.show();
            return;
        }
        if (i6 == 3) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BrowserSettingsCookiesClear);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string2;
            int i8 = R.string.BrowserSettingsCookiesClearText;
            if (this.cookiesSize != 0) {
                str = " (" + AndroidUtilities.formatFileSize(this.cookiesSize) + ")";
            }
            alertDialog2.message = LocaleController.formatString(i8, str);
            builder2.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog3, int i9) {
                    switch (i5) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getParentActivity());
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
            });
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder2.makeRed(-1);
            builder2.show();
            return;
        }
        if (i6 == 7) {
            ArrayList history = BrowserHistory.getHistory(null);
            int size = history.size();
            long jMin = Long.MAX_VALUE;
            int i9 = 0;
            while (i9 < size) {
                Object obj = history.get(i9);
                i9++;
                jMin = Math.min(jMin, ((BrowserHistory.Entry) obj).time);
            }
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
            String string3 = LocaleController.getString(R.string.BrowserSettingsHistoryClear);
            AlertDialog alertDialog3 = builder3.alertDialog;
            alertDialog3.title = string3;
            alertDialog3.message = LocaleController.formatString(R.string.BrowserSettingsHistoryClearText, LocaleController.formatDateChat(jMin / 1000));
            builder3.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog4, int i10) {
                    switch (i3) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getParentActivity());
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
            });
            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder3.makeRed(-1);
            builder3.show();
            return;
        }
        if (i6 == 9) {
            HistoryFragment[] historyFragmentArr = {null};
            BaseFragment historyFragment = new HistoryFragment(new ThemeActivity$$ExternalSyntheticLambda19(22, this, historyFragmentArr), null);
            historyFragmentArr[0] = historyFragment;
            presentFragment(historyFragment);
            return;
        }
        if (i6 == 5) {
            AlertDialog.Builder builder4 = new AlertDialog.Builder(getParentActivity(), 0, getResourceProvider());
            String string4 = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsTitle);
            AlertDialog alertDialog4 = builder4.alertDialog;
            alertDialog4.title = string4;
            alertDialog4.message = LocaleController.getString(R.string.WebBrowserDeleteAllExceptionsMessage);
            builder4.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener(this) {
                public final WebBrowserSettings f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog5, int i10) {
                    switch (i2) {
                        case 0:
                            WebBrowserSettings webBrowserSettings = this.f$0;
                            webBrowserSettings.getClass();
                            ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                            ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                            WebStorage.getInstance().deleteAllData();
                            try {
                                WebView webView = new WebView(webBrowserSettings.getParentActivity());
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
            });
            builder4.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder4.makeRed(-1);
            builder4.show();
            return;
        }
        if (uItem.instanceOf(WebsiteView.Factory.class)) {
            WebsiteView websiteView = (WebsiteView) view;
            String str2 = websiteView.domain;
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) this.fragmentView, null, websiteView);
            itemOptionsMakeOptions.dimAlpha = 40;
            itemOptionsMakeOptions.add(R.drawable.menu_delete_old, LocaleController.getString(R.string.Remove), new RichTableCell$$ExternalSyntheticLambda3(23, this, str2), false);
            itemOptionsMakeOptions.show();
            return;
        }
        int i10 = uItem.id;
        if (i10 == 6) {
            if (getParentActivity() == null) {
                return;
            }
            AtomicReference atomicReference = new AtomicReference();
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            ArrayList searchEngines = SearchEngine.getSearchEngines();
            int size2 = searchEngines.size();
            CharSequence[] charSequenceArr = new CharSequence[size2];
            int i11 = 0;
            while (i11 < size2) {
                charSequenceArr[i11] = ((SearchEngine) searchEngines.get(i11)).name;
                RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell.setTextAndValue(charSequenceArr[i11], i11 == SharedConfig.searchEngineType);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                linearLayout.addView(radioColorCell);
                radioColorCell.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(i11, view, atomicReference));
                i11++;
            }
            AlertDialog.Builder builder5 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string5 = LocaleController.getString(R.string.SearchEngine);
            AlertDialog alertDialog5 = builder5.alertDialog;
            alertDialog5.title = string5;
            builder5.setView(linearLayout);
            builder5.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            atomicReference.set(alertDialog5);
            showDialog(alertDialog5);
            return;
        }
        if (i10 == 15 || i10 == 16) {
            boolean zIsWebBrowserInAppEnabled2 = getMessagesController().isWebBrowserInAppEnabled();
            if (getMessagesController().isWebBrowserExceptionsLimitReached(zIsWebBrowserInAppEnabled2)) {
                AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.WebBrowserExceptionsLimitTitle), LocaleController.getString(R.string.WebBrowserExceptionsLimitMessage), null);
                return;
            }
            Activity parentActivity = getParentActivity();
            Theme.ResourcesProvider resourceProvider = getResourceProvider();
            ProfileActivity$6$$ExternalSyntheticLambda7 profileActivity$6$$ExternalSyntheticLambda7 = new ProfileActivity$6$$ExternalSyntheticLambda7(6, this, zIsWebBrowserInAppEnabled2);
            Pattern pattern = AlertsCreator.URL_PATTERN;
            Activity activityFindActivity = AndroidUtilities.findActivity(parentActivity);
            View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
            AlertDialog[] alertDialogArr = new AlertDialog[1];
            AlertDialog.Builder builder6 = new AlertDialog.Builder(parentActivity, 0, resourceProvider);
            String string6 = LocaleController.getString(zIsWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddTitle : R.string.BrowserSettingsAddTitleExternal);
            AlertDialog alertDialog6 = builder6.alertDialog;
            alertDialog6.title = string6;
            alertDialog6.message = LocaleController.getString(zIsWebBrowserInAppEnabled2 ? R.string.BrowserSettingsAddText : R.string.BrowserSettingsAddTextExternal);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(parentActivity);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i12 = Theme.key_dialogTextBlack;
            editTextBoldCursor.setTextColor(Theme.getColor(i12, resourceProvider));
            editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_groupcreate_hintText, resourceProvider));
            editTextBoldCursor.setHint(LocaleController.getString(R.string.BrowserSettingsAddHint));
            editTextBoldCursor.setInputType(17);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourceProvider));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AndroidUtilities.dp(22.0f));
            gradientDrawable.setColor(Theme.multAlpha(0.06f, Theme.getColor(i12, resourceProvider)));
            editTextBoldCursor.setBackground(gradientDrawable);
            ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13 = new ChatUsersActivity$$ExternalSyntheticLambda13(editTextBoldCursor, profileActivity$6$$ExternalSyntheticLambda7, alertDialogArr, currentFocus, 4);
            editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(chatUsersActivity$$ExternalSyntheticLambda13, i));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(editTextBoldCursor, LayoutHelper.createLinear(24.0f, 4.0f, 24.0f, 9.0f, -1, -2));
            builder6.makeCustomMaxHeight();
            builder6.setView(linearLayout2);
            alertDialog6.customWidth = Math.min(AndroidUtilities.dp(320.0f), (AndroidUtilities.displaySize.x * 85) / 100);
            builder6.setPositiveButton(LocaleController.getString(R.string.Done), new ChatActivity$$ExternalSyntheticLambda356(chatUsersActivity$$ExternalSyntheticLambda13, 24));
            builder6.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda131(24));
            alertDialogArr[0] = alertDialog6;
            alertDialog6.dismissDialogByButtons = false;
            alertDialog6.setOnDismissListener(new GroupCallActivity$6$$ExternalSyntheticLambda6(1, editTextBoldCursor));
            alertDialogArr[0].setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda55(1, editTextBoldCursor));
            alertDialogArr[0].show();
        }
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
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.setPadding(0, anonymousClass3.getPaddingTop(), 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view) {
        return false;
    }
}
