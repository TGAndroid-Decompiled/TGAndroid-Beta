package org.telegram.ui.web;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import j$.util.Objects;
import java.io.File;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda53;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda155;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda9;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda75;
import org.telegram.ui.ShareActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda19;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda25;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda16;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.WebviewActivity;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotDownloads.FileDownload;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotShareSheet;
import org.telegram.ui.bots.BotStorage;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda19;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public abstract class BotWebViewContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static HashMap rotatedTONHosts;
    public static int tags;
    public BotBiometry biometry;
    public long blockedDialogsUntil;
    public final boolean bot;
    public TLRPC.User botUser;
    public BotWebViewProxy botWebViewProxy;
    public String buttonData;
    public CameraScanActivity.AnonymousClass1 cameraBottomSheet;
    public int currentAccount;
    public AlertDialog currentDialog;
    public String currentPaymentSlug;
    public Delegate delegate;
    public int dialogSequentialOpenTimes;
    public BotDownloads downloads;
    public final CellFlickerDrawable flickerDrawable;
    public final UserCell.AnonymousClass2 flickerView;
    public int flickerViewColor;
    public boolean flickerViewColorOverriden;
    public SvgHelper.SvgDrawable flickerViewDrawable;
    public int forceHeight;
    public boolean hasQRPending;
    public boolean hasUserPermissions;
    public boolean isBackButtonVisible;
    public boolean isFlickeringCenter;
    public boolean isPageLoaded;
    public boolean isSettingsButtonVisible;
    public boolean isViewPortByMeasureSuppressed;
    public int lastButtonColor;
    public String lastButtonText;
    public int lastButtonTextColor;
    public long lastClickMs;
    public long lastDialogClosed;
    public long lastDialogCooldownTime;
    public int lastDialogType;
    public boolean lastExpanded;
    public final Rect lastInsets;
    public int lastInsetsTopMargin;
    public long lastPostStoryMs;
    public String lastQrText;
    public int lastSecondaryButtonColor;
    public String lastSecondaryButtonPosition;
    public String lastSecondaryButtonText;
    public int lastSecondaryButtonTextColor;
    public int lastViewportHeightReported;
    public boolean lastViewportIsExpanded;
    public boolean lastViewportStateStable;
    public BotLocation location;
    public ValueCallback mFilePathCallback;
    public String mUrl;
    public final BotWebViewContainer$$ExternalSyntheticLambda5 notifyLocationChecked;
    public Runnable onCloseListener;
    public EglRenderer$$ExternalSyntheticLambda6 onPermissionsRequestResultCallback;
    public Utilities.Callback4 onVerifiedAge;
    public MyWebView opener;
    public Activity parentActivity;
    public boolean preserving;
    public final Theme.ResourcesProvider resourcesProvider;
    public String secondaryButtonData;
    public BotStorage secureStorage;
    public int shownDialogsCount;
    public BotStorage storage;
    public final int tag;
    public String trustedOrigin;
    public float viewPortHeightOffset;
    public WebViewRequestProps wasOpenedByBot;
    public boolean wasOpenedByLinkIntent;
    public MyWebView webView;
    public boolean webViewNotAvailable;
    public final TextView webViewNotAvailableText;
    public Consumer webViewProgressListener;
    public WebViewProxy webViewProxy;
    public WebViewScrollListener webViewScrollListener;

    public final class BotWebViewProxy {
        public BotWebViewContainer container;

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            try {
                if (this.container == null) {
                    FileLog.d("webviewproxy.postEvent: no container");
                } else {
                    AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(this, str, str2, 9));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public interface Delegate {
        BotSensors getBotSensors();

        boolean isClipboardAvailable();

        void onCloseRequested();

        void onCloseToTabs();

        void onEmojiStatusGranted();

        void onEmojiStatusSet(TLRPC.Document document);

        String onFullscreenRequested(boolean z, boolean z2);

        void onInstantClose();

        void onLocationGranted(boolean z);

        void onOpenBackFromTabs();

        void onOrientationLockChanged(boolean z);

        void onSendWebViewData(String str);

        void onSetBackButtonVisible(boolean z);

        void onSetSettingsButtonVisible(boolean z);

        void onSetupMainButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4);

        void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2);

        void onSharedTo(ArrayList arrayList);

        void onWebAppBackgroundChanged(int i, boolean z);

        void onWebAppExpand();

        void onWebAppOpenInvoice(TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str, TLObject tLObject);

        void onWebAppSetActionBarColor(int i, int i2, boolean z);

        void onWebAppSetBackgroundColor(int i);

        void onWebAppSetNavigationBarColor(int i);

        void onWebAppSetupClosingBehavior(boolean z);

        void onWebAppSwipingBehavior(boolean z);

        void onWebAppSwitchInlineQuery(TLRPC.User user, String str, ArrayList arrayList);
    }

    public final class PopupButton {
        public final String id;
        public final String text;
        public final int textColorKey;

        public PopupButton(JSONObject jSONObject) throws JSONException {
            byte b = -1;
            this.textColorKey = -1;
            this.id = jSONObject.getString("id");
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case -1829997182:
                    if (string.equals("destructive")) {
                        b = 5;
                    }
                    break;
                case -1367724422:
                    if (string.equals("cancel")) {
                        b = 4;
                    }
                    break;
                case 3548:
                    if (string.equals("ok")) {
                        b = 2;
                    }
                    break;
                case 94756344:
                    if (string.equals("close")) {
                        b = 3;
                    }
                    break;
                case 1544803905:
                    if (string.equals("default")) {
                        b = 1;
                    }
                    break;
            }
            if (b == 2) {
                this.text = LocaleController.getString(R.string.OK);
                return;
            }
            if (b == 3) {
                this.text = LocaleController.getString(R.string.Close);
            } else {
                if (b == 4) {
                    this.text = LocaleController.getString(R.string.Cancel);
                    return;
                }
                if (b == 5) {
                    this.textColorKey = Theme.key_text_RedBold;
                }
                this.text = jSONObject.getString("text");
            }
        }
    }

    public final class WebViewProxy {
        public BotWebViewContainer container;
        public final MyWebView webView;

        public WebViewProxy(MyWebView myWebView, BotWebViewContainer botWebViewContainer) {
            this.webView = myWebView;
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            if (this.container == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(this, str, str2, 10));
        }

        @JavascriptInterface
        public void resolveShare(String str, byte[] bArr, String str2, String str3) {
            AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0((Object) this, str, (Serializable) bArr, str2, str3, 11));
        }
    }

    public interface WebViewScrollListener {
    }

    public BotWebViewContainer(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.flickerDrawable = cellFlickerDrawable;
        int i2 = Theme.key_featuredStickers_addButton;
        this.lastButtonColor = getColor$2(i2);
        int i3 = Theme.key_featuredStickers_buttonText;
        this.lastButtonTextColor = getColor$2(i3);
        this.lastButtonText = "";
        this.lastSecondaryButtonColor = getColor$2(i2);
        this.lastSecondaryButtonTextColor = getColor$2(i3);
        this.lastSecondaryButtonText = "";
        this.lastSecondaryButtonPosition = "";
        this.currentAccount = UserConfig.selectedAccount;
        this.forceHeight = -1;
        this.lastInsets = new Rect(0, 0, 0, 0);
        this.lastInsetsTopMargin = 0;
        this.notifyLocationChecked = new BotWebViewContainer$$ExternalSyntheticLambda5(this, 0);
        this.lastDialogType = -1;
        this.shownDialogsCount = 0;
        int i4 = tags;
        tags = i4 + 1;
        this.tag = i4;
        this.bot = z;
        this.resourcesProvider = resourcesProvider;
        d("created new webview container");
        if (context instanceof Activity) {
            this.parentActivity = (Activity) context;
        }
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.setColors(i, 153);
        UserCell.AnonymousClass2 anonymousClass2 = new UserCell.AnonymousClass2(this, context);
        this.flickerView = anonymousClass2;
        int color$2 = getColor$2(Theme.key_bot_loadingIcon);
        this.flickerViewColor = color$2;
        anonymousClass2.setColorFilter(new PorterDuffColorFilter(color$2, PorterDuff.Mode.SRC_IN));
        anonymousClass2.getImageReceiver().setAspectFit(true);
        addView(anonymousClass2, LayoutHelper.createFrame(-1, -2, 48));
        TextView textView = new TextView(context);
        this.webViewNotAvailableText = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(getColor$2(Theme.key_windowBackgroundWhiteGrayText));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int iDp = AndroidUtilities.dp(16.0f);
        textView.setPadding(iDp, iDp, iDp, iDp);
        addView(textView, LayoutHelper.createFrame(-1, -2, 17));
        setFocusable(false);
    }

    public static String access$3500(String str) {
        if (str == null || !isTonsite(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String strRotateTONHost = rotateTONHost(hostAuthority);
        if (rotatedTONHosts == null) {
            rotatedTONHosts = new HashMap();
        }
        rotatedTONHosts.put(strRotateTONHost, hostAuthority);
        return Browser.replace(Uri.parse(str), "https", null, strRotateTONHost, null);
    }

    public static boolean isTonsite(Uri uri) {
        if ("tonsite".equals(uri.getScheme())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null && uri.getScheme() == null) {
            authority = Uri.parse("http://" + uri.toString()).getAuthority();
        }
        if (authority != null) {
            return authority.endsWith(".ton") || authority.endsWith(".adnl");
        }
        return false;
    }

    public static String magic2tonsite(String str) {
        String hostAuthority;
        String str2;
        if (rotatedTONHosts == null || str == null || (hostAuthority = AndroidUtilities.getHostAuthority(str)) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = (String) rotatedTONHosts.get(hostAuthority)) != null) ? Browser.replace(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static JSONObject obj(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse proxyTON(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Browser.replace(Uri.parse(str2), "https", null, rotateTONHost(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String rotateTONHost(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrSplit.length; i++) {
            if (i > 0) {
                sb.append("-d");
            }
            sb.append(strArrSplit[i].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb.toString();
    }

    private void setupFlickerParams(boolean z) {
        this.isFlickeringCenter = z;
        UserCell.AnonymousClass2 anonymousClass2 = this.flickerView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int iDp = AndroidUtilities.dp(100.0f);
            layoutParams.height = iDp;
            layoutParams.width = iDp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        anonymousClass2.requestLayout();
    }

    private void setupWebView(MyWebView myWebView) {
        setupWebView(myWebView, null);
    }

    public final void checkCreateWebView() {
        if (this.webView != null || this.webViewNotAvailable) {
            return;
        }
        try {
            setupWebView(null);
        } catch (Throwable th) {
            FileLog.e(th);
            this.flickerView.setVisibility(8);
            this.webViewNotAvailable = true;
            this.webViewNotAvailableText.setVisibility(0);
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                removeView(myWebView);
            }
        }
    }

    public final void clearStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                botStorage.setJSON(new JSONObject());
                notifyEvent(str2, obj(string, "req_id"));
            } catch (RuntimeException e) {
                notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void createBiometry() {
        if (this.botUser == null) {
            return;
        }
        BotBiometry botBiometry = this.biometry;
        if (botBiometry == null) {
            this.biometry = BotBiometry.get(getContext(), this.currentAccount, this.botUser.id);
        } else {
            botBiometry.load();
        }
    }

    public final void d(String str) {
        FileLog.d("[webviewcontainer] #" + this.tag + " " + str);
    }

    public final void destroyWebView() {
        d("destroyWebView preserving=" + this.preserving);
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            if (myWebView.getParent() != null) {
                removeView(this.webView);
            }
            if (!this.preserving) {
                this.webView.destroy();
                onWebViewDestroyed(this.webView);
            }
            this.isPageLoaded = false;
            if (this.biometry != null) {
                this.biometry = null;
            }
            if (this.storage != null) {
                this.storage = null;
            }
            if (this.secureStorage != null) {
                this.secureStorage = null;
            }
            BotLocation botLocation = this.location;
            if (botLocation != null) {
                botLocation.listeners.remove(this.notifyLocationChecked);
                this.location = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EglRenderer$$ExternalSyntheticLambda6 eglRenderer$$ExternalSyntheticLambda6;
        Uri[] uriArr;
        if (i == NotificationCenter.didSetNewTheme) {
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setBackgroundColor(getColor$2(Theme.key_windowBackgroundWhite));
            }
            if (!this.flickerViewColorOverriden) {
                int i3 = Theme.key_bot_loadingIcon;
                int color$2 = getColor$2(i3);
                this.flickerViewColor = color$2;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(color$2, PorterDuff.Mode.SRC_IN);
                UserCell.AnonymousClass2 anonymousClass2 = this.flickerView;
                anonymousClass2.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.flickerViewColor);
                    this.flickerViewDrawable.setupGradient(i3, this.resourcesProvider, 1.0f, false);
                }
                anonymousClass2.invalidate();
            }
            notifyThemeChanged();
            return;
        }
        if (i != NotificationCenter.onActivityResultReceived) {
            if (i == NotificationCenter.onRequestPermissionResultReceived) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                if (iIntValue != 4000 || (eglRenderer$$ExternalSyntheticLambda6 = this.onPermissionsRequestResultCallback) == null) {
                    return;
                }
                eglRenderer$$ExternalSyntheticLambda6.run();
                this.onPermissionsRequestResultCallback = null;
                return;
            }
            return;
        }
        int iIntValue2 = ((Integer) objArr[0]).intValue();
        int iIntValue3 = ((Integer) objArr[1]).intValue();
        Intent intent = (Intent) objArr[2];
        if (iIntValue2 != 3000 || this.mFilePathCallback == null) {
            return;
        }
        if (iIntValue3 != -1 || intent == null) {
            uriArr = null;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            uriArr = new Uri[clipData.getItemCount()];
            for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                uriArr[i4] = clipData.getItemAt(i4).getUri();
            }
        } else if (intent.getData() != null) {
            uriArr = new Uri[]{intent.getData()};
        } else {
            uriArr = null;
        }
        this.mFilePathCallback.onReceiveValue(uriArr);
        this.mFilePathCallback = null;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.flickerView) {
            if (this.isFlickeringCenter) {
                canvas.save();
                canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (this.isFlickeringCenter) {
                canvas.restore();
            }
            if (!this.isFlickeringCenter) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.flickerDrawable.draw(0.0f, canvas, rectF, this);
                invalidate();
            }
            return zDrawChild;
        }
        if (view == this.webViewNotAvailableText) {
            canvas.save();
            canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean zDrawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild2;
        }
        if (view == this.webView) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public BotWebViewProxy getBotProxy() {
        return this.botWebViewProxy;
    }

    public final int getColor$2(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public int getMinHeight() {
        if (!(getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            return 0;
        }
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
        if (webViewSwipeContainer.fullsize) {
            return (int) ((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) + this.viewPortHeightOffset);
        }
        return 0;
    }

    public String getOriginHost() {
        MyWebView myWebView = this.webView;
        if (myWebView == null) {
            return null;
        }
        return getOriginHost(myWebView.getUrl());
    }

    public WebViewProxy getProxy() {
        return this.webViewProxy;
    }

    public final void getStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String strOptString = jSONObject2.optString("key");
                if (strOptString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair key = botStorage.getKey(strOptString);
                    if (!botStorage.secured || (obj = key.first) != null) {
                        notifyEvent(str2, obj("req_id", string, "value", key.first));
                        return;
                    }
                    Object obj2 = key.second;
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("req_id", string);
                        jSONObject.put("value", obj);
                        jSONObject.put("can_restore", obj2);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    notifyEvent(str2, jSONObject);
                } catch (RuntimeException e) {
                    notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused2) {
                notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public String getUrlLoaded() {
        return this.mUrl;
    }

    public MyWebView getWebView() {
        return this.webView;
    }

    public final boolean ignoreDialog(int i) {
        if (this.currentDialog != null || (this.blockedDialogsUntil > 0 && System.currentTimeMillis() < this.blockedDialogsUntil)) {
            return true;
        }
        if (this.lastDialogType != i || this.shownDialogsCount <= 3) {
            return false;
        }
        this.blockedDialogsUntil = System.currentTimeMillis() + 3000;
        this.shownDialogsCount = 0;
        return true;
    }

    public final void invalidateViewPortHeight(boolean z, boolean z2) {
        invalidate();
        if ((this.isPageLoaded || z2) && this.bot && (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
            if (z) {
                this.lastExpanded = webViewSwipeContainer.getSwipeOffsetY() == webViewSwipeContainer.getTopActionBarOffsetY() + (-webViewSwipeContainer.getOffsetY());
            }
            int iMax = Math.max(getMinHeight(), (int) (webViewSwipeContainer.getTopActionBarOffsetY() + ((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) - webViewSwipeContainer.getSwipeOffsetY()) + this.viewPortHeightOffset));
            if (!z2 && iMax == this.lastViewportHeightReported && this.lastViewportStateStable == z && this.lastViewportIsExpanded == this.lastExpanded) {
                return;
            }
            this.lastViewportHeightReported = iMax;
            this.lastViewportStateStable = z;
            this.lastViewportIsExpanded = this.lastExpanded;
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda3(this, SurfaceContainer$$ExternalSyntheticOutline0.m("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (iMax / AndroidUtilities.density) + ",is_state_stable:" + z + ",is_expanded:" + this.lastExpanded + "}", ");"), 1));
        }
    }

    public final void loadFlickerAndSettingsItem(int i, long j) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
        String publicUsername = UserObject.getPublicUsername(user);
        UserCell.AnonymousClass2 anonymousClass2 = this.flickerView;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            anonymousClass2.setVisibility(0);
            anonymousClass2.setAlpha(1.0f);
            anonymousClass2.setImage(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(getColor$2(Theme.key_windowBackgroundGray))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
                i2++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != j);
        boolean z = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                anonymousClass2.setVisibility(0);
                anonymousClass2.setAlpha(1.0f);
                anonymousClass2.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            anonymousClass2.setVisibility(0);
            anonymousClass2.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.flickerViewDrawable = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.flickerViewColor);
                this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, resourcesProvider, 1.0f, false);
            }
            anonymousClass2.setImage(null, null, this.flickerViewDrawable);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        anonymousClass2.setVisibility(0);
        anonymousClass2.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.flickerViewDrawable = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, resourcesProvider, 1.0f, false);
        }
        anonymousClass2.setImage(null, null, this.flickerViewDrawable);
        setupFlickerParams(true);
    }

    public final void notifyBiometryReceived() {
        if (this.botUser == null) {
            return;
        }
        createBiometry();
        BotBiometry botBiometry = this.biometry;
        if (botBiometry == null) {
            return;
        }
        try {
            notifyEvent("biometry_info_received", botBiometry.getStatus());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void notifyEvent(String str, JSONObject jSONObject) {
        d("notifyEvent " + str);
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new BotWebViewContainer$$ExternalSyntheticLambda3(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 1));
    }

    public final void notifyThemeChanged() {
        JSONObject jSONObjectPut;
        try {
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, true);
            jSONObjectPut = jSONObjectMakeThemeParams != null ? new JSONObject().put("theme_params", jSONObjectMakeThemeParams) : new JSONObject();
        } catch (Exception e) {
            FileLog.e(e);
        }
        notifyEvent("theme_changed", jSONObjectPut);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.addDelegate(this, new ChatActivity.AnonymousClass103(this, 21));
    }

    public final boolean onBackPressed() {
        if (this.webView == null || !this.isBackButtonVisible) {
            return false;
        }
        notifyEvent("back_button_pressed", null);
        return true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.removeDelegate(this);
    }

    public void onErrorShown(String str, boolean z) {
    }

    public final void onEventReceived(BotWebViewProxy botWebViewProxy, String str, String str2) throws JSONException {
        String str3;
        byte b;
        boolean z;
        byte b2;
        byte b3;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        BotWebViewVibrationEffect botWebViewVibrationEffect2;
        byte b4;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        boolean zOptBoolean3;
        LaunchActivity launchActivity;
        BottomSheetTabs.WebTabData webTabData;
        byte b5;
        int i;
        int i2;
        String string;
        String string2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String strOptString;
        String string3;
        final int i3;
        CameraScanActivity.AnonymousClass1 anonymousClass1;
        BotDownloads.FileDownload fileDownload;
        BotDownloads.FileDownload fileDownload2;
        long j;
        int i4;
        long j2;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String str4;
        String strOptString5;
        boolean zOptBoolean4;
        long j3;
        boolean zOptBoolean5;
        if (this.bot) {
            if (this.webView == null || this.delegate == null) {
                d("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (this.trustedOrigin != null && !TextUtils.equals(getOriginHost(), this.trustedOrigin)) {
                d("onEventReceived ignore " + str);
            }
            d("onEventReceived " + str);
            str.getClass();
            BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5 = this.notifyLocationChecked;
            long j4 = 1000;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            switch (str.hashCode()) {
                case -2016939055:
                    str3 = "is_visible";
                    if (str.equals("web_app_invoke_custom_method")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1898902656:
                    str3 = "is_visible";
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case -1736707758:
                    str3 = "is_visible";
                    if (str.equals("web_app_biometry_get_info")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1717314938:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_link")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case -1715704462:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_file_download")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case -1693280352:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_popup")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case -1390641887:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_invoice")) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case -1385387727:
                    str3 = "is_visible";
                    if (str.equals("web_app_set_emoji_status")) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case -1353432696:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_secondary_button")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case -1341039673:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_closing_behavior")) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case -1309122684:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        b = 10;
                    } else {
                        b = -1;
                    }
                    break;
                case -1263619595:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_phone")) {
                        b = 11;
                    } else {
                        b = -1;
                    }
                    break;
                case -1259935152:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_theme")) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    break;
                case -1229296877:
                    str3 = "is_visible";
                    if (str.equals("web_app_secure_storage_get_key")) {
                        b = 13;
                    } else {
                        b = -1;
                    }
                    break;
                case -1183558219:
                    str3 = "is_visible";
                    if (str.equals("web_app_check_location")) {
                        b = 14;
                    } else {
                        b = -1;
                    }
                    break;
                case -1093591555:
                    str3 = "is_visible";
                    if (str.equals("web_app_biometry_open_settings")) {
                        b = 15;
                    } else {
                        b = -1;
                    }
                    break;
                case -921083201:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_viewport")) {
                        b = 16;
                    } else {
                        b = -1;
                    }
                    break;
                case -907261345:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_emoji_status_access")) {
                        b = 17;
                    } else {
                        b = -1;
                    }
                    break;
                case -620103109:
                    str3 = "is_visible";
                    if (str.equals("web_app_stop_device_orientation")) {
                        b = 18;
                    } else {
                        b = -1;
                    }
                    break;
                case -585008607:
                    str3 = "is_visible";
                    if (str.equals("web_app_device_storage_save_key")) {
                        b = 19;
                    } else {
                        b = -1;
                    }
                    break;
                case -581005326:
                    str3 = "is_visible";
                    if (str.equals("web_app_device_storage_get_key")) {
                        b = 20;
                    } else {
                        b = -1;
                    }
                    break;
                case -512688845:
                    str3 = "is_visible";
                    if (str.equals("web_app_biometry_request_auth")) {
                        b = 21;
                    } else {
                        b = -1;
                    }
                    break;
                case -498118340:
                    str3 = "is_visible";
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        b = 22;
                    } else {
                        b = -1;
                    }
                    break;
                case -474676372:
                    str3 = "is_visible";
                    if (str.equals("web_app_allow_scroll")) {
                        b = 23;
                    } else {
                        b = -1;
                    }
                    break;
                case -439770054:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_tg_link")) {
                        b = 24;
                    } else {
                        b = -1;
                    }
                    break;
                case -293897269:
                    str3 = "is_visible";
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        b = 25;
                    } else {
                        b = -1;
                    }
                    break;
                case -244584646:
                    str3 = "is_visible";
                    if (str.equals("web_app_share_to_story")) {
                        b = 26;
                    } else {
                        b = -1;
                    }
                    break;
                case -216725042:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_location")) {
                        b = 27;
                    } else {
                        b = -1;
                    }
                    break;
                case -111186465:
                    str3 = "is_visible";
                    if (str.equals("web_app_start_gyroscope")) {
                        b = 28;
                    } else {
                        b = -1;
                    }
                    break;
                case -71726289:
                    str3 = "is_visible";
                    if (str.equals("web_app_close")) {
                        b = 29;
                    } else {
                        b = -1;
                    }
                    break;
                case -58095910:
                    str3 = "is_visible";
                    if (str.equals("web_app_ready")) {
                        b = 30;
                    } else {
                        b = -1;
                    }
                    break;
                case 22015443:
                    str3 = "is_visible";
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        b = 31;
                    } else {
                        b = -1;
                    }
                    break;
                case 127735931:
                    str3 = "is_visible";
                    if (str.equals("web_app_hide_keyboard")) {
                        b = 32;
                    } else {
                        b = -1;
                    }
                    break;
                case 189207985:
                    str3 = "is_visible";
                    if (str.equals("web_app_stop_gyroscope")) {
                        b = 33;
                    } else {
                        b = -1;
                    }
                    break;
                case 267846314:
                    str3 = "is_visible";
                    if (str.equals("web_app_secure_storage_clear")) {
                        b = 34;
                    } else {
                        b = -1;
                    }
                    break;
                case 348967753:
                    str3 = "is_visible";
                    if (str.equals("web_app_device_storage_clear")) {
                        b = 35;
                    } else {
                        b = -1;
                    }
                    break;
                case 420328489:
                    str3 = "is_visible";
                    if (str.equals("web_app_start_accelerometer")) {
                        b = 36;
                    } else {
                        b = -1;
                    }
                    break;
                case 475603707:
                    str3 = "is_visible";
                    if (str.equals("web_app_stop_accelerometer")) {
                        b = 37;
                    } else {
                        b = -1;
                    }
                    break;
                case 622108947:
                    str3 = "is_visible";
                    if (str.equals("web_app_send_prepared_message")) {
                        b = 38;
                    } else {
                        b = -1;
                    }
                    break;
                case 668142772:
                    str3 = "is_visible";
                    if (str.equals("web_app_data_send")) {
                        b = 39;
                    } else {
                        b = -1;
                    }
                    break;
                case 671811520:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_content_safe_area")) {
                        b = 40;
                    } else {
                        b = -1;
                    }
                    break;
                case 721956751:
                    str3 = "is_visible";
                    if (str.equals("web_app_add_to_home_screen")) {
                        b = 41;
                    } else {
                        b = -1;
                    }
                    break;
                case 748864404:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_fullscreen")) {
                        b = 42;
                    } else {
                        b = -1;
                    }
                    break;
                case 751292356:
                    str3 = "is_visible";
                    if (str.equals("web_app_switch_inline_query")) {
                        b = 43;
                    } else {
                        b = -1;
                    }
                    break;
                case 792789792:
                    str3 = "is_visible";
                    if (str.equals("web_app_secure_storage_save_key")) {
                        b = 44;
                    } else {
                        b = -1;
                    }
                    break;
                case 796110323:
                    str3 = "is_visible";
                    if (str.equals("web_app_exit_fullscreen")) {
                        b = 45;
                    } else {
                        b = -1;
                    }
                    break;
                case 880626018:
                    str3 = "is_visible";
                    if (str.equals("web_app_verify_age")) {
                        b = 46;
                    } else {
                        b = -1;
                    }
                    break;
                case 909476449:
                    str3 = "is_visible";
                    if (str.equals("web_app_open_location_settings")) {
                        b = 47;
                    } else {
                        b = -1;
                    }
                    break;
                case 1011447167:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_back_button")) {
                        b = 48;
                    } else {
                        b = -1;
                    }
                    break;
                case 1210129967:
                    str3 = "is_visible";
                    if (str.equals("web_app_biometry_request_access")) {
                        b = 49;
                    } else {
                        b = -1;
                    }
                    break;
                case 1273834781:
                    str3 = "is_visible";
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        b = 50;
                    } else {
                        b = -1;
                    }
                    break;
                case 1398490221:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_main_button")) {
                        b = 51;
                    } else {
                        b = -1;
                    }
                    break;
                case 1453051298:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        b = 52;
                    } else {
                        b = -1;
                    }
                    break;
                case 1455972419:
                    str3 = "is_visible";
                    if (str.equals("web_app_setup_settings_button")) {
                        b = 53;
                    } else {
                        b = -1;
                    }
                    break;
                case 1495787980:
                    str3 = "is_visible";
                    if (str.equals("web_app_check_home_screen")) {
                        b = 54;
                    } else {
                        b = -1;
                    }
                    break;
                case 1759965681:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_chat")) {
                        b = 55;
                    } else {
                        b = -1;
                    }
                    break;
                case 1812395469:
                    str3 = "is_visible";
                    if (str.equals("web_app_start_device_orientation")) {
                        b = 56;
                    } else {
                        b = -1;
                    }
                    break;
                case 1882780382:
                    str3 = "is_visible";
                    if (str.equals("web_app_biometry_update_token")) {
                        b = 57;
                    } else {
                        b = -1;
                    }
                    break;
                case 1899078473:
                    str3 = "is_visible";
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        b = 58;
                    } else {
                        b = -1;
                    }
                    break;
                case 1917103703:
                    str3 = "is_visible";
                    if (str.equals("web_app_set_header_color")) {
                        b = 59;
                    } else {
                        b = -1;
                    }
                    break;
                case 1937068806:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_safe_area")) {
                        b = 60;
                    } else {
                        b = -1;
                    }
                    break;
                case 2001330488:
                    str3 = "is_visible";
                    if (str.equals("web_app_set_background_color")) {
                        b = 61;
                    } else {
                        b = -1;
                    }
                    break;
                case 2036090717:
                    str3 = "is_visible";
                    if (str.equals("web_app_request_write_access")) {
                        b = 62;
                    } else {
                        b = -1;
                    }
                    break;
                case 2139805763:
                    str3 = "is_visible";
                    if (str.equals("web_app_expand")) {
                        b = 63;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    str3 = "is_visible";
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    if (this.botUser != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            String string4 = jSONObject.getString("req_id");
                            String string5 = jSONObject.getString("method");
                            String string6 = jSONObject.get("params").toString();
                            int i5 = this.currentAccount;
                            MyWebView myWebView = this.webView;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i5).getInputUser(this.botUser.id);
                            invokewebviewcustommethod.custom_method = string5;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = string6;
                            ConnectionsManager.getInstance(i5).sendRequest(invokewebviewcustommethod, new ArticleViewer$$ExternalSyntheticLambda53(this, string4, i5, myWebView, 8));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            if (e instanceof JSONException) {
                                new BulletinFactory(this, resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, "JSON Parse error").show();
                                return;
                            } else {
                                unknownError(null);
                                return;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.hasQRPending && (anonymousClass1 = this.cameraBottomSheet) != null) {
                        anonymousClass1.lambda$showGiftOfferSheet$15();
                        break;
                    }
                    break;
                case 2:
                    notifyBiometryReceived();
                    break;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri uri = Uri.parse(jSONObject2.optString("url"));
                        String strOptString6 = jSONObject2.optString("try_browser");
                        if (MessagesController.getInstance(this.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(this.currentAccount).webAppAllowedProtocols.contains(uri.getScheme())) {
                            onOpenUri(uri, strOptString6, jSONObject2.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                    break;
                case 4:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (this.downloads == null) {
                            Context context = getContext();
                            int i6 = this.currentAccount;
                            long j5 = this.botUser.id;
                            HashMap map = BotDownloads.instances;
                            Pair pair = new Pair(Integer.valueOf(i6), Long.valueOf(j5));
                            HashMap map2 = BotDownloads.instances;
                            BotDownloads botDownloads = (BotDownloads) map2.get(pair);
                            if (botDownloads == null) {
                                botDownloads = new BotDownloads(context, i6, j5);
                                map2.put(pair, botDownloads);
                            }
                            this.downloads = botDownloads;
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(str2);
                            String string7 = jSONObject3.getString("url");
                            String string8 = jSONObject3.getString("file_name");
                            ArrayList arrayList = this.downloads.files;
                            int size = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    fileDownload = (BotDownloads.FileDownload) obj;
                                    if (!TextUtils.equals(fileDownload.url, string7) || !fileDownload.done) {
                                    }
                                } else {
                                    fileDownload = null;
                                }
                            }
                            if (fileDownload != null) {
                                BotDownloads botDownloads2 = this.downloads;
                                ArrayList arrayList2 = botDownloads2.files;
                                int size2 = arrayList2.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < size2) {
                                        Object obj2 = arrayList2.get(i8);
                                        i8++;
                                        BotDownloads.FileDownload fileDownload3 = (BotDownloads.FileDownload) obj2;
                                        if (TextUtils.equals(fileDownload3.url, string7) && fileDownload3.done) {
                                            fileDownload2 = fileDownload3;
                                        }
                                    } else {
                                        fileDownload2 = null;
                                    }
                                }
                                if (fileDownload2 != null) {
                                    botDownloads2.currentFile = fileDownload2;
                                    fileDownload2.resaved = true;
                                    NotificationCenter.getInstance(botDownloads2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
                                } else {
                                    BotDownloads.FileDownload fileDownload4 = botDownloads2.new FileDownload(string7, string8);
                                    botDownloads2.currentFile = fileDownload4;
                                    fileDownload4.shown = false;
                                    botDownloads2.files.add(fileDownload4);
                                    botDownloads2.save();
                                    NotificationCenter.getInstance(botDownloads2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
                                }
                                notifyEvent("file_download_requested", obj("downloading", "status"));
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                                checkdownloadfileparams.file_name = string8;
                                checkdownloadfileparams.url = string7;
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkdownloadfileparams, new StarGiftSheet$$ExternalSyntheticLambda7(this, string7, string8, 12));
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            notifyEvent("file_download_requested", obj("cancelled", "status"));
                            return;
                        }
                        break;
                    }
                    break;
                case 5:
                    try {
                        if (this.currentDialog == null) {
                            if (System.currentTimeMillis() - this.lastDialogClosed <= 150) {
                                int i9 = this.dialogSequentialOpenTimes + 1;
                                this.dialogSequentialOpenTimes = i9;
                                if (i9 >= 3) {
                                    this.dialogSequentialOpenTimes = 0;
                                    this.lastDialogCooldownTime = System.currentTimeMillis();
                                }
                            }
                            if (System.currentTimeMillis() - this.lastDialogCooldownTime <= 3000) {
                                break;
                            } else {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String strOptString7 = jSONObject4.optString("title", null);
                                String string9 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                                builder.setTitle(strOptString7);
                                builder.setMessage(string9);
                                ArrayList arrayList3 = new ArrayList();
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    arrayList3.add(new PopupButton(jSONArray.getJSONObject(i10)));
                                }
                                if (arrayList3.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList3.size() >= 1) {
                                        final int i11 = 0;
                                        final PopupButton popupButton = (PopupButton) arrayList3.get(0);
                                        builder.setPositiveButton(popupButton.text, new AlertDialog.OnButtonClickListener(this) {
                                            public final BotWebViewContainer f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i12) {
                                                switch (i11) {
                                                    case 0:
                                                        BotWebViewContainer.PopupButton popupButton2 = popupButton;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer = this.f$0;
                                                        botWebViewContainer.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton2.id));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e4) {
                                                            FileLog.e(e4);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        BotWebViewContainer.PopupButton popupButton3 = popupButton;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer2 = this.f$0;
                                                        botWebViewContainer2.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer2.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer2.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton3.id));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e5) {
                                                            FileLog.e(e5);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        BotWebViewContainer.PopupButton popupButton4 = popupButton;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer3 = this.f$0;
                                                        botWebViewContainer3.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer3.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer3.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton4.id));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e6) {
                                                            FileLog.e(e6);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList3.size() >= 2) {
                                        final int i12 = 1;
                                        final PopupButton popupButton2 = (PopupButton) arrayList3.get(1);
                                        builder.setNegativeButton(popupButton2.text, new AlertDialog.OnButtonClickListener(this) {
                                            public final BotWebViewContainer f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i13) {
                                                switch (i12) {
                                                    case 0:
                                                        BotWebViewContainer.PopupButton popupButton3 = popupButton2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer = this.f$0;
                                                        botWebViewContainer.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton3.id));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e4) {
                                                            FileLog.e(e4);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        BotWebViewContainer.PopupButton popupButton4 = popupButton2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer2 = this.f$0;
                                                        botWebViewContainer2.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer2.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer2.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton4.id));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e5) {
                                                            FileLog.e(e5);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        BotWebViewContainer.PopupButton popupButton5 = popupButton2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer3 = this.f$0;
                                                        botWebViewContainer3.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer3.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer3.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton5.id));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e6) {
                                                            FileLog.e(e6);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList3.size() == 3) {
                                        final int i13 = 2;
                                        final PopupButton popupButton3 = (PopupButton) arrayList3.get(2);
                                        builder.setNeutralButton(popupButton3.text, new AlertDialog.OnButtonClickListener(this) {
                                            public final BotWebViewContainer f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i14) {
                                                switch (i13) {
                                                    case 0:
                                                        BotWebViewContainer.PopupButton popupButton4 = popupButton3;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer = this.f$0;
                                                        botWebViewContainer.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton4.id));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e4) {
                                                            FileLog.e(e4);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        BotWebViewContainer.PopupButton popupButton5 = popupButton3;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer2 = this.f$0;
                                                        botWebViewContainer2.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer2.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer2.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton5.id));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e5) {
                                                            FileLog.e(e5);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        BotWebViewContainer.PopupButton popupButton6 = popupButton3;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        BotWebViewContainer botWebViewContainer3 = this.f$0;
                                                        botWebViewContainer3.getClass();
                                                        alertDialog.dismiss();
                                                        try {
                                                            botWebViewContainer3.lastClickMs = System.currentTimeMillis();
                                                            botWebViewContainer3.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton6.id));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e6) {
                                                            FileLog.e(e6);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    builder.alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(15, this, atomicBoolean));
                                    this.currentDialog = builder.show();
                                    if (arrayList3.size() >= 1) {
                                        PopupButton popupButton4 = (PopupButton) arrayList3.get(0);
                                        if (popupButton4.textColorKey >= 0 && (textView3 = (TextView) this.currentDialog.getButton(-1)) != null) {
                                            textView3.setTextColor(getColor$2(popupButton4.textColorKey));
                                        }
                                    }
                                    if (arrayList3.size() >= 2) {
                                        PopupButton popupButton5 = (PopupButton) arrayList3.get(1);
                                        if (popupButton5.textColorKey >= 0 && (textView2 = (TextView) this.currentDialog.getButton(-2)) != null) {
                                            textView2.setTextColor(getColor$2(popupButton5.textColorKey));
                                        }
                                    }
                                    if (arrayList3.size() == 3) {
                                        PopupButton popupButton6 = (PopupButton) arrayList3.get(2);
                                        if (popupButton6.textColorKey >= 0 && (textView = (TextView) this.currentDialog.getButton(-3)) != null) {
                                            textView.setTextColor(getColor$2(popupButton6.textColorKey));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        FileLog.e(e4);
                        return;
                    }
                    break;
                case 6:
                    try {
                        String strOptString8 = new JSONObject(str2).optString("slug");
                        if (this.currentPaymentSlug != null) {
                            onInvoiceStatusUpdate(strOptString8, "cancelled", true);
                        } else {
                            this.currentPaymentSlug = strOptString8;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = strOptString8;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new StarGiftSheet$$ExternalSyntheticLambda7(this, strOptString8, tL_inputInvoiceSlug, 11));
                        }
                    } catch (JSONException e5) {
                        FileLog.e(e5);
                        return;
                    }
                    break;
                case 7:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i4 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i4 = 0;
                            }
                        } catch (Exception unused2) {
                            j = 0;
                        }
                        long j6 = j;
                        TLRPC.User user = this.botUser;
                        if (user == null) {
                            notifyEvent("emoji_status_failed", obj("UNKNOWN_ERROR", "error"));
                        } else {
                            SetupEmojiStatusSheet.show(this.currentAccount, user, j6, i4, new BotWebViewContainer$$ExternalSyntheticLambda12(this, 3));
                        }
                        break;
                    }
                    break;
                case 8:
                    String str5 = str3;
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean zOptBoolean6 = jSONObject6.optBoolean("is_active", false);
                        String strTrim = jSONObject6.optString("text", this.lastSecondaryButtonText).trim();
                        boolean z2 = jSONObject6.optBoolean(str5, false) && !TextUtils.isEmpty(strTrim);
                        int color = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : this.lastSecondaryButtonColor;
                        int color2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : this.lastSecondaryButtonTextColor;
                        boolean z3 = jSONObject6.optBoolean("is_progress_visible", false) && z2;
                        boolean z4 = jSONObject6.optBoolean("has_shine_effect", false) && z2;
                        String strOptString9 = jSONObject6.has("position") ? jSONObject6.optString("position") : this.lastSecondaryButtonPosition;
                        if (strOptString9 == null) {
                            strOptString9 = "left";
                        }
                        try {
                            j2 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j2 = 0;
                        }
                        this.lastSecondaryButtonColor = color;
                        this.lastSecondaryButtonTextColor = color2;
                        this.lastSecondaryButtonText = strTrim;
                        this.lastSecondaryButtonPosition = strOptString9;
                        this.secondaryButtonData = str2;
                        this.delegate.onSetupSecondaryButton(z2, zOptBoolean6, strTrim, j2, color, color2, z3, z4, strOptString9);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                    break;
                case 9:
                    try {
                        this.delegate.onWebAppSetupClosingBehavior(new JSONObject(str2).optBoolean("need_confirmation"));
                    } catch (JSONException e7) {
                        FileLog.e(e7);
                        return;
                    }
                    break;
                case 10:
                    try {
                        if (!this.hasQRPending && this.parentActivity != null) {
                            this.lastQrText = new JSONObject(str2).optString("text");
                            this.hasQRPending = true;
                            if (Build.VERSION.SDK_INT < 23 || this.parentActivity.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = this.parentActivity;
                                if (activity != null) {
                                    this.cameraBottomSheet = CameraScanActivity.showAsSheet(activity, 3, new PollItemMenu.AnonymousClass6(this, 14));
                                }
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                                    @Override
                                    public final void didReceivedNotification(int i14, int i15, Object... objArr) {
                                        int i16 = NotificationCenter.onRequestPermissionResultReceived;
                                        if (i14 == i16) {
                                            int iIntValue = ((Integer) objArr[0]).intValue();
                                            int[] iArr = (int[]) objArr[2];
                                            if (iIntValue == 5000) {
                                                NotificationCenter.getGlobalInstance().removeObserver(this, i16);
                                                int i17 = iArr[0];
                                                BotWebViewContainer botWebViewContainer = BotWebViewContainer.this;
                                                if (i17 != 0) {
                                                    botWebViewContainer.notifyEvent("scan_qr_popup_closed", new JSONObject());
                                                    return;
                                                }
                                                Activity activity2 = botWebViewContainer.parentActivity;
                                                if (activity2 == null) {
                                                    return;
                                                }
                                                botWebViewContainer.cameraBottomSheet = CameraScanActivity.showAsSheet(activity2, 3, new PollItemMenu.AnonymousClass6(botWebViewContainer, 14));
                                            }
                                        }
                                    }
                                }, NotificationCenter.onRequestPermissionResultReceived);
                                this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                            }
                        }
                    } catch (JSONException e8) {
                        FileLog.e(e8);
                        return;
                    }
                    break;
                case 11:
                    if (!ignoreDialog(4)) {
                        int i14 = this.currentAccount;
                        MyWebView myWebView2 = this.webView;
                        String[] strArr = {"cancelled"};
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), resourcesProvider);
                        builder2.setTitle(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.botUser);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        boolean z5 = MessagesController.getInstance(this.currentAccount).blockePeers.indexOfKey(this.botUser.id) >= 0;
                        if (z5) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        builder2.setMessage(spannableStringBuilder);
                        builder2.setPositiveButton(LocaleController.getString(R.string.ShareContact), new BotWebViewContainer$$ExternalSyntheticLambda16(this, strArr, z5, i14, myWebView2));
                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new TopicsFragment$$ExternalSyntheticLambda25(10));
                        showDialog(new BotWebViewContainer$$ExternalSyntheticLambda18(strArr, i14, myWebView2, 0), builder2.create(), 4);
                    } else {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            notifyEvent("phone_requested", jSONObject7);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    break;
                case 12:
                    notifyThemeChanged();
                    break;
                case 13:
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            getContext();
                            int i15 = this.currentAccount;
                            this.secureStorage = new BotStorage(UserConfig.getInstance(i15).getClientUserId(), this.botUser.id, i15, true);
                        }
                        getStorageKey(this.secureStorage, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.location == null) {
                        BotLocation botLocation = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                        this.location = botLocation;
                        botLocation.listeners.add(botWebViewContainer$$ExternalSyntheticLambda5);
                    }
                    botWebViewContainer$$ExternalSyntheticLambda5.run();
                    break;
                case 15:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        this.lastClickMs = 0L;
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null && safeLastFragment.getParentLayout() != null) {
                            INavigationLayout parentLayout = safeLastFragment.getParentLayout();
                            safeLastFragment.presentFragment(ProfileActivity.of(this.botUser.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                            Delegate delegate = this.delegate;
                            if (delegate != null) {
                                delegate.onCloseToTabs();
                            }
                            break;
                        }
                    }
                    break;
                case 16:
                    invalidateViewPortHeight(!((getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) && ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).isSwipeInProgress()), true);
                    break;
                case 17:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        SetupEmojiStatusSheet.askPermission(this.currentAccount, this.botUser.id, new BotWebViewContainer$$ExternalSyntheticLambda12(this, 2));
                        break;
                    }
                    break;
                case 18:
                    BotSensors botSensors = this.delegate.getBotSensors();
                    if (botSensors == null || !botSensors.stopOrientation()) {
                        notifyEvent("device_orientation_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("device_orientation_stopped", null);
                    }
                    break;
                case 19:
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            getContext();
                            int i16 = this.currentAccount;
                            this.storage = new BotStorage(UserConfig.getInstance(i16).getClientUserId(), this.botUser.id, i16, false);
                        }
                        setStorageKey(this.storage, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            getContext();
                            int i17 = this.currentAccount;
                            this.storage = new BotStorage(UserConfig.getInstance(i17).getClientUserId(), this.botUser.id, i17, false);
                        }
                        getStorageKey(this.storage, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case 21:
                    try {
                        string = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        string = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry = this.biometry;
                    if (botBiometry != null) {
                        if (botBiometry.access_granted) {
                            botBiometry.prompt(string, true, null, new BotBiometry$$ExternalSyntheticLambda8(0, botBiometry, new BotWebViewContainer$$ExternalSyntheticLambda12(this, 1)));
                        } else {
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "failed");
                                notifyEvent("biometry_auth_requested", jSONObject8);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                        break;
                    }
                    break;
                case 22:
                    try {
                        z = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z = false;
                    }
                    Delegate delegate2 = this.delegate;
                    if (delegate2 != null) {
                        delegate2.onOrientationLockChanged(z);
                    }
                    break;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        zOptBoolean = jSONArray2.optBoolean(0, true);
                        try {
                            zOptBoolean2 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            zOptBoolean2 = true;
                        }
                    } catch (Exception unused7) {
                        zOptBoolean = true;
                    }
                    d("allowScroll " + zOptBoolean + " " + zOptBoolean2);
                    if (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                        ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(zOptBoolean, zOptBoolean2);
                    }
                    break;
                case 24:
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String strOptString10 = jSONObject9.optString("path_full");
                        boolean zOptBoolean7 = jSONObject9.optBoolean("force_request", false);
                        if (strOptString10.startsWith("/")) {
                            strOptString10 = strOptString10.substring(1);
                        }
                        onOpenUri(Uri.parse("https://t.me/" + strOptString10), null, false, true, zOptBoolean7);
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                        return;
                    }
                    break;
                case 25:
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            getContext();
                            int i18 = this.currentAccount;
                            this.secureStorage = new BotStorage(UserConfig.getInstance(i18).getClientUserId(), this.botUser.id, i18, true);
                        }
                        restoreStorageKey(this.secureStorage, str2);
                        break;
                    }
                    break;
                case 26:
                    if (System.currentTimeMillis() - this.lastClickMs <= 10000 && System.currentTimeMillis() - this.lastPostStoryMs >= 2000) {
                        this.lastClickMs = 0L;
                        this.lastPostStoryMs = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject10 = new JSONObject(str2);
                            strOptString2 = jSONObject10.optString("media_url");
                            try {
                                strOptString3 = jSONObject10.optString("text");
                                try {
                                    JSONObject jSONObjectOptJSONObject = jSONObject10.optJSONObject("widget_link");
                                    if (jSONObjectOptJSONObject != null) {
                                        strOptString4 = jSONObjectOptJSONObject.optString("url");
                                        try {
                                            strOptString5 = jSONObjectOptJSONObject.optString("name");
                                            str4 = strOptString2;
                                        } catch (Exception e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            str4 = strOptString2;
                                            strOptString5 = null;
                                        }
                                    } else {
                                        str4 = strOptString2;
                                        strOptString4 = null;
                                        strOptString5 = null;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    strOptString4 = null;
                                    FileLog.e(e);
                                    str4 = strOptString2;
                                    strOptString5 = null;
                                    if (str4 != null) {
                                        return;
                                    }
                                    if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                        new PremiumFeatureBottomSheet((BaseFragment) new SendGiftSheet.AnonymousClass8(this), 14, true).show();
                                        return;
                                    }
                                    AlertDialog alertDialog = new AlertDialog(this.parentActivity);
                                    new HttpGetFileTask(new ChatActivity$$ExternalSyntheticLambda155(this, alertDialog, strOptString3, strOptString4, strOptString5, 6), null).execute(str4);
                                    alertDialog.showDelayed(250L);
                                    return;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                strOptString3 = null;
                                strOptString4 = null;
                                FileLog.e(e);
                                str4 = strOptString2;
                                strOptString5 = null;
                                if (str4 != null) {
                                    return;
                                }
                                if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                    new PremiumFeatureBottomSheet((BaseFragment) new SendGiftSheet.AnonymousClass8(this), 14, true).show();
                                    return;
                                }
                                AlertDialog alertDialog2 = new AlertDialog(this.parentActivity);
                                new HttpGetFileTask(new ChatActivity$$ExternalSyntheticLambda155(this, alertDialog2, strOptString3, strOptString4, strOptString5, 6), null).execute(str4);
                                alertDialog2.showDelayed(250L);
                                return;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            strOptString2 = null;
                        }
                        if (str4 != null) {
                            if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                new PremiumFeatureBottomSheet((BaseFragment) new SendGiftSheet.AnonymousClass8(this), 14, true).show();
                            } else {
                                AlertDialog alertDialog3 = new AlertDialog(this.parentActivity);
                                new HttpGetFileTask(new ChatActivity$$ExternalSyntheticLambda155(this, alertDialog3, strOptString3, strOptString4, strOptString5, 6), null).execute(str4);
                                alertDialog3.showDelayed(250L);
                            }
                        }
                    }
                    break;
                case 27:
                    if (this.botUser != null) {
                        if (this.location == null) {
                            BotLocation botLocation2 = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                            this.location = botLocation2;
                            botLocation2.listeners.add(botWebViewContainer$$ExternalSyntheticLambda5);
                        }
                        BotLocation botLocation3 = this.location;
                        if (botLocation3.appHasPermission() && botLocation3.granted) {
                            this.location.requestObject(new BotWebViewContainer$$ExternalSyntheticLambda11(this, 0));
                        } else {
                            this.location.request(new BotWebViewContainer$$ExternalSyntheticLambda12(this, 0));
                        }
                        break;
                    }
                    break;
                case 28:
                    BotSensors botSensors2 = this.delegate.getBotSensors();
                    try {
                        j4 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused8) {
                    }
                    long jClamp = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors2 == null || !botSensors2.startGyroscope(jClamp)) {
                        notifyEvent("gyroscope_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("gyroscope_started", null);
                    }
                    break;
                case 29:
                    try {
                        zOptBoolean3 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e16) {
                        FileLog.e(e16);
                        zOptBoolean3 = false;
                    }
                    this.delegate.onCloseRequested();
                    if (zOptBoolean3) {
                        if (this.wasOpenedByLinkIntent && LaunchActivity.instance != null) {
                            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                            if (activityFindActivity == null) {
                                activityFindActivity = LaunchActivity.instance;
                            }
                            if (activityFindActivity != null && !activityFindActivity.isFinishing()) {
                                activityFindActivity.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.wasOpenedByBot != null && (launchActivity = LaunchActivity.instance) != null && launchActivity.getBottomSheetTabs() != null) {
                            BottomSheetTabs bottomSheetTabs = LaunchActivity.instance.getBottomSheetTabs();
                            ArrayList<BottomSheetTabs.WebTabData> tabs = bottomSheetTabs.getTabs();
                            int i19 = 0;
                            while (true) {
                                if (i19 < tabs.size()) {
                                    BottomSheetTabs.WebTabData webTabData2 = tabs.get(i19);
                                    if (!this.wasOpenedByBot.equals(webTabData2.props) || webTabData2.webView == this.webView) {
                                        i19++;
                                    } else {
                                        webTabData = webTabData2;
                                    }
                                } else {
                                    webTabData = null;
                                }
                            }
                            if (webTabData != null) {
                                bottomSheetTabs.openTab(webTabData);
                            }
                            break;
                        }
                    }
                    break;
                case 30:
                    setPageLoaded(this.webView.getUrl());
                    break;
                case 31:
                    try {
                        String string10 = new JSONObject(str2).getString("req_id");
                        if (!this.delegate.isClipboardAvailable() || System.currentTimeMillis() - this.lastClickMs > 10000) {
                            notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string10));
                        } else {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string10).put("data", text != null ? text.toString() : ""));
                        }
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        return;
                    }
                    break;
                case 32:
                    Activity activityFindActivity2 = AndroidUtilities.findActivity(getContext());
                    if (activityFindActivity2 == null) {
                        activityFindActivity2 = LaunchActivity.instance;
                    }
                    if (activityFindActivity2 != null) {
                        AndroidUtilities.hideKeyboard(activityFindActivity2.getCurrentFocus());
                    }
                    break;
                case 33:
                    BotSensors botSensors3 = this.delegate.getBotSensors();
                    if (botSensors3 == null || !botSensors3.stopGyroscope()) {
                        notifyEvent("gyroscope_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("gyroscope_stopped", null);
                    }
                    break;
                case 34:
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            getContext();
                            int i20 = this.currentAccount;
                            this.secureStorage = new BotStorage(UserConfig.getInstance(i20).getClientUserId(), this.botUser.id, i20, true);
                        }
                        clearStorageKey(this.secureStorage, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case 35:
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            getContext();
                            int i21 = this.currentAccount;
                            this.storage = new BotStorage(UserConfig.getInstance(i21).getClientUserId(), this.botUser.id, i21, false);
                        }
                        clearStorageKey(this.storage, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case 36:
                    BotSensors botSensors4 = this.delegate.getBotSensors();
                    try {
                        j4 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused9) {
                    }
                    long jClamp2 = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors4 == null || !botSensors4.startAccelerometer(jClamp2)) {
                        notifyEvent("accelerometer_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("accelerometer_started", null);
                    }
                    break;
                case 37:
                    BotSensors botSensors5 = this.delegate.getBotSensors();
                    if (botSensors5 == null || !botSensors5.stopAccelerometer()) {
                        notifyEvent("accelerometer_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("accelerometer_stopped", null);
                    }
                    break;
                case 38:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            String string11 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string11)) {
                                notifyEvent("prepared_message_failed", obj("MESSAGE_EXPIRED", "error"));
                            } else {
                                BotShareSheet.share(getContext(), this.currentAccount, this.botUser.id, string11, this.resourcesProvider, new BotWebViewContainer$$ExternalSyntheticLambda5(this, 3), new OAuthSheet$$ExternalSyntheticLambda18(28, this, botWebViewProxy));
                            }
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            notifyEvent("prepared_message_failed", obj("MESSAGE_EXPIRED", "error"));
                            return;
                        }
                        break;
                    }
                    break;
                case 39:
                    try {
                        this.delegate.onSendWebViewData(new JSONObject(str2).optString("data"));
                    } catch (JSONException e19) {
                        FileLog.e(e19);
                        return;
                    }
                    break;
                case 40:
                    reportSafeContentInsets(this.lastInsetsTopMargin, true);
                    break;
                case 41:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            notifyEvent("home_screen_added", null);
                        } else {
                            MediaDataController.getInstance(this.currentAccount).installShortcut(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new BotWebViewContainer$$ExternalSyntheticLambda11(this, 1));
                        }
                        break;
                    }
                    break;
                case 42:
                    try {
                        zOptBoolean4 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        zOptBoolean4 = true;
                    }
                    String strOnFullscreenRequested = this.delegate.onFullscreenRequested(true, zOptBoolean4);
                    if (strOnFullscreenRequested == null) {
                        notifyEvent("fullscreen_changed", obj("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(zOptBoolean4)));
                    } else {
                        notifyEvent("fullscreen_failed", obj(strOnFullscreenRequested, "error"));
                    }
                    break;
                case 43:
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList4 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i22 = 0; i22 < jSONArray3.length(); i22++) {
                            arrayList4.add(jSONArray3.getString(i22));
                        }
                        this.delegate.onWebAppSwitchInlineQuery(this.botUser, jSONObject11.getString("query"), arrayList4);
                    } catch (JSONException e20) {
                        FileLog.e(e20);
                        return;
                    }
                    break;
                case 44:
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            getContext();
                            int i23 = this.currentAccount;
                            this.secureStorage = new BotStorage(UserConfig.getInstance(i23).getClientUserId(), this.botUser.id, i23, true);
                        }
                        setStorageKey(this.secureStorage, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case 45:
                    String strOnFullscreenRequested2 = this.delegate.onFullscreenRequested(false, true);
                    if (strOnFullscreenRequested2 == null) {
                        notifyEvent("fullscreen_changed", obj(Boolean.FALSE, "is_fullscreen"));
                    } else {
                        notifyEvent("fullscreen_failed", obj(strOnFullscreenRequested2, "error"));
                    }
                    break;
                case 46:
                    if (this.onVerifiedAge != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z6 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String strOptString11 = jSONObject12.optString("gender");
                            final double dOptDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.onVerifiedAge.run(Boolean.valueOf(z6), Double.valueOf(d), strOptString11, Double.valueOf(dOptDouble));
                                }
                            });
                        } catch (Exception e21) {
                            FileLog.e(e21);
                            return;
                        }
                    }
                    break;
                case 47:
                    if (this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        this.lastClickMs = 0L;
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null && safeLastFragment2.getParentLayout() != null) {
                            INavigationLayout parentLayout2 = safeLastFragment2.getParentLayout();
                            safeLastFragment2.presentFragment(ProfileActivity.of(this.botUser.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                            Delegate delegate3 = this.delegate;
                            if (delegate3 != null) {
                                delegate3.onCloseToTabs();
                            }
                            break;
                        }
                    }
                    break;
                case 48:
                    try {
                        boolean zOptBoolean8 = new JSONObject(str2).optBoolean(str3);
                        if (zOptBoolean8 != this.isBackButtonVisible) {
                            this.isBackButtonVisible = zOptBoolean8;
                            this.delegate.onSetBackButtonVisible(zOptBoolean8);
                        }
                    } catch (JSONException e22) {
                        FileLog.e(e22);
                        return;
                    }
                    break;
                case 49:
                    try {
                        string3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused11) {
                        string3 = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry2 = this.biometry;
                    if (botBiometry2 != null) {
                        boolean z7 = botBiometry2.access_requested;
                        if (z7) {
                            notifyBiometryReceived();
                        } else if (botBiometry2.access_granted) {
                            if (!z7) {
                                botBiometry2.access_requested = true;
                                botBiometry2.save();
                            }
                            notifyBiometryReceived();
                        } else {
                            final Runnable[] runnableArr = {new BotWebViewContainer$$ExternalSyntheticLambda5(this, 1)};
                            AlertDialog.Builder builder3 = new AlertDialog.Builder(getContext(), resourcesProvider);
                            if (TextUtils.isEmpty(string3)) {
                                builder3.setTitle(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                i3 = 0;
                                builder3.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                            } else {
                                i3 = 0;
                                builder3.setTitle(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                                builder3.setMessage(string3);
                            }
                            builder3.setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener(this) {
                                public final BotWebViewContainer f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(AlertDialog alertDialog4, int i24) {
                                    switch (i3) {
                                        case 0:
                                            BotWebViewContainer botWebViewContainer = this.f$0;
                                            botWebViewContainer.getClass();
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            BotBiometry botBiometry3 = botWebViewContainer.biometry;
                                            botBiometry3.access_requested = true;
                                            botBiometry3.save();
                                            BotBiometry botBiometry4 = botWebViewContainer.biometry;
                                            BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = new BotWebViewContainer$$ExternalSyntheticLambda12(botWebViewContainer, 4);
                                            botBiometry4.getClass();
                                            botBiometry4.prompt(null, true, null, new BotBiometry$$ExternalSyntheticLambda8(0, botBiometry4, botWebViewContainer$$ExternalSyntheticLambda12));
                                            break;
                                        default:
                                            BotWebViewContainer botWebViewContainer2 = this.f$0;
                                            botWebViewContainer2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            BotBiometry botBiometry5 = botWebViewContainer2.biometry;
                                            botBiometry5.access_requested = true;
                                            botBiometry5.disabled = true;
                                            botBiometry5.save();
                                            botWebViewContainer2.notifyBiometryReceived();
                                            break;
                                    }
                                }
                            });
                            final int i24 = 1;
                            builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener(this) {
                                public final BotWebViewContainer f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(AlertDialog alertDialog4, int i25) {
                                    switch (i24) {
                                        case 0:
                                            BotWebViewContainer botWebViewContainer = this.f$0;
                                            botWebViewContainer.getClass();
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            BotBiometry botBiometry3 = botWebViewContainer.biometry;
                                            botBiometry3.access_requested = true;
                                            botBiometry3.save();
                                            BotBiometry botBiometry4 = botWebViewContainer.biometry;
                                            BotWebViewContainer$$ExternalSyntheticLambda12 botWebViewContainer$$ExternalSyntheticLambda12 = new BotWebViewContainer$$ExternalSyntheticLambda12(botWebViewContainer, 4);
                                            botBiometry4.getClass();
                                            botBiometry4.prompt(null, true, null, new BotBiometry$$ExternalSyntheticLambda8(0, botBiometry4, botWebViewContainer$$ExternalSyntheticLambda12));
                                            break;
                                        default:
                                            BotWebViewContainer botWebViewContainer2 = this.f$0;
                                            botWebViewContainer2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            BotBiometry botBiometry5 = botWebViewContainer2.biometry;
                                            botBiometry5.access_requested = true;
                                            botBiometry5.disabled = true;
                                            botBiometry5.save();
                                            botWebViewContainer2.notifyBiometryReceived();
                                            break;
                                    }
                                }
                            });
                            builder3.alertDialog.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(runnableArr, 10));
                            builder3.show();
                        }
                        break;
                    }
                    break;
                case 50:
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String strOptString12 = jSONObject13.optString("type");
                        int iHashCode = strOptString12.hashCode();
                        if (iHashCode != -1184809658) {
                            if (iHashCode != 193071555) {
                                if (iHashCode == 595233003 && strOptString12.equals("notification")) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strOptString12.equals("selection_change")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                        } else if (strOptString12.equals("impact")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            String strOptString13 = jSONObject13.optString("impact_style");
                            switch (strOptString13.hashCode()) {
                                case -1078030475:
                                    if (strOptString13.equals("medium")) {
                                        b3 = 1;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 3535914:
                                    if (strOptString13.equals("soft")) {
                                        b3 = 4;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 99152071:
                                    if (strOptString13.equals("heavy")) {
                                        b3 = 2;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 102970646:
                                    if (strOptString13.equals("light")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                case 108511787:
                                    if (strOptString13.equals("rigid")) {
                                        b3 = 3;
                                    } else {
                                        b3 = -1;
                                    }
                                    break;
                                default:
                                    b3 = -1;
                                    break;
                            }
                            if (b3 == 0) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_LIGHT;
                            } else if (b3 == 1) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_MEDIUM;
                            } else if (b3 == 2) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_HEAVY;
                            } else if (b3 == 3) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_RIGID;
                            } else if (b3 != 4) {
                                botWebViewVibrationEffect2 = null;
                            } else {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_SOFT;
                            }
                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                        } else if (b2 == 1) {
                            String strOptString14 = jSONObject13.optString("notification_type");
                            int iHashCode2 = strOptString14.hashCode();
                            if (iHashCode2 != -1867169789) {
                                if (iHashCode2 != 96784904) {
                                    if (iHashCode2 == 1124446108 && strOptString14.equals("warning")) {
                                        b4 = 2;
                                    } else {
                                        b4 = -1;
                                    }
                                } else if (strOptString14.equals("error")) {
                                    b4 = 0;
                                } else {
                                    b4 = -1;
                                }
                            } else if (strOptString14.equals("success")) {
                                b4 = 1;
                            } else {
                                b4 = -1;
                            }
                            if (b4 == 0) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_ERROR;
                            } else if (b4 == 1) {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_SUCCESS;
                            } else if (b4 != 2) {
                                botWebViewVibrationEffect2 = null;
                            } else {
                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_WARNING;
                            }
                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                        } else if (b2 != 2) {
                            botWebViewVibrationEffect2 = null;
                        } else {
                            botWebViewVibrationEffect = BotWebViewVibrationEffect.SELECTION_CHANGE;
                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                        }
                        if (botWebViewVibrationEffect2 != null) {
                            botWebViewVibrationEffect2.vibrate();
                        }
                    } catch (Exception e23) {
                        FileLog.e(e23);
                        return;
                    }
                    break;
                case 51:
                    String str6 = str3;
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean zOptBoolean9 = jSONObject14.optBoolean("is_active", false);
                        String strTrim2 = jSONObject14.optString("text", this.lastButtonText).trim();
                        boolean z8 = jSONObject14.optBoolean(str6, false) && !TextUtils.isEmpty(strTrim2);
                        int color3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.lastButtonColor;
                        int color4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.lastButtonTextColor;
                        boolean z9 = jSONObject14.optBoolean("is_progress_visible", false) && z8;
                        boolean z10 = jSONObject14.optBoolean("has_shine_effect", false) && z8;
                        try {
                            j3 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j3 = 0;
                        }
                        this.lastButtonColor = color3;
                        this.lastButtonTextColor = color4;
                        this.lastButtonText = strTrim2;
                        this.buttonData = str2;
                        this.delegate.onSetupMainButton(z8, zOptBoolean9, strTrim2, j3, color3, color4, z9, z10);
                    } catch (Exception e24) {
                        FileLog.e(e24);
                        return;
                    }
                    break;
                case 52:
                    try {
                        this.delegate.onWebAppSwipingBehavior(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                    } catch (JSONException e25) {
                        FileLog.e(e25);
                        return;
                    }
                    break;
                case 53:
                    try {
                        boolean zOptBoolean10 = new JSONObject(str2).optBoolean(str3);
                        if (zOptBoolean10 != this.isSettingsButtonVisible) {
                            this.isSettingsButtonVisible = zOptBoolean10;
                            this.delegate.onSetSettingsButtonVisible(zOptBoolean10);
                        }
                    } catch (JSONException e26) {
                        FileLog.e(e26);
                        return;
                    }
                    break;
                case 54:
                    notifyEvent("home_screen_checked", obj((this.botUser == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    break;
                case 55:
                    try {
                        strOptString = new JSONObject(str2).optString("req_id");
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                        getrequestedwebviewbutton.webapp_req_id = strOptString;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getrequestedwebviewbutton, new LinkManager$$ExternalSyntheticLambda9(0), new BotWebViewContainer$$ExternalSyntheticLambda28(this, strOptString, 0));
                        break;
                    }
                    break;
                case 56:
                    BotSensors botSensors6 = this.delegate.getBotSensors();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j4 = jSONObject15.getLong("refresh_rate");
                        zOptBoolean5 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        zOptBoolean5 = false;
                    }
                    long jClamp3 = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors6 == null || !botSensors6.startOrientation(jClamp3, zOptBoolean5)) {
                        notifyEvent("device_orientation_failed", obj("UNSUPPORTED", "error"));
                    } else {
                        notifyEvent("device_orientation_started", null);
                    }
                    break;
                case 57:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string12 = jSONObject16.getString("token");
                        try {
                            string2 = jSONObject16.getString("reason");
                        } catch (Exception unused14) {
                            string2 = null;
                        }
                        createBiometry();
                        BotBiometry botBiometry3 = this.biometry;
                        if (botBiometry3 != null) {
                            if (botBiometry3.access_granted) {
                                botBiometry3.updateToken(string2, string12, new ThemeActivity$$ExternalSyntheticLambda19(21, this, string12));
                            } else {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    notifyEvent("biometry_token_updated", jSONObject17);
                                } catch (Exception e28) {
                                    FileLog.e(e28);
                                    return;
                                }
                            }
                            break;
                        }
                        break;
                    } catch (Exception e29) {
                        FileLog.e(e29);
                        if (e29 instanceof JSONException) {
                            new BulletinFactory(this, resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, "JSON Parse error").show();
                            return;
                        } else {
                            unknownError(null);
                            return;
                        }
                    }
                    break;
                case 58:
                    try {
                        String strOptString15 = new JSONObject(str2).optString("color", null);
                        int color5 = TextUtils.isEmpty(strOptString15) ? Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider) : Color.parseColor(strOptString15);
                        Delegate delegate4 = this.delegate;
                        if (delegate4 != null) {
                            delegate4.onWebAppSetNavigationBarColor(color5);
                        }
                    } catch (Exception e30) {
                        FileLog.e(e30);
                        return;
                    }
                    break;
                case 59:
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String strOptString16 = jSONObject18.optString("color", null);
                        if (TextUtils.isEmpty(strOptString16)) {
                            String strOptString17 = jSONObject18.optString("color_key");
                            int iHashCode3 = strOptString17.hashCode();
                            if (iHashCode3 != -1265068311) {
                                if (iHashCode3 == -210781868 && strOptString17.equals("secondary_bg_color")) {
                                    b5 = 1;
                                } else {
                                    b5 = -1;
                                }
                            } else if (strOptString17.equals("bg_color")) {
                                b5 = 0;
                            } else {
                                b5 = -1;
                            }
                            if (b5 != 0) {
                                if (b5 != 1) {
                                    i2 = -1;
                                } else {
                                    i = Theme.key_windowBackgroundGray;
                                }
                                if (i2 >= 0) {
                                    this.delegate.onWebAppSetActionBarColor(i2, Theme.getColor(i2, resourcesProvider), false);
                                }
                            } else {
                                i = Theme.key_windowBackgroundWhite;
                            }
                            i2 = i;
                            if (i2 >= 0) {
                                this.delegate.onWebAppSetActionBarColor(i2, Theme.getColor(i2, resourcesProvider), false);
                            }
                        } else {
                            int color6 = Color.parseColor(strOptString16);
                            if (color6 != 0) {
                                this.delegate.onWebAppSetActionBarColor(-1, color6, true);
                            }
                        }
                    } catch (Exception e31) {
                        FileLog.e(e31);
                        return;
                    }
                    break;
                case 60:
                    reportSafeInsets(this.lastInsets, true);
                    break;
                case 61:
                    try {
                        this.delegate.onWebAppSetBackgroundColor(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                    } catch (Exception e32) {
                        FileLog.e(e32);
                        return;
                    }
                    break;
                case 62:
                    if (!ignoreDialog(3)) {
                        int i25 = this.currentAccount;
                        MyWebView myWebView3 = this.webView;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(cansendmessage, new ProfileActivity$$ExternalSyntheticLambda75(this, i25, myWebView3, 10));
                    } else {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            notifyEvent("write_access_requested", jSONObject19);
                        } catch (Exception e33) {
                            FileLog.e(e33);
                            return;
                        }
                    }
                    break;
                case 63:
                    this.delegate.onWebAppExpand();
                    break;
                default:
                    FileLog.d("unknown webapp event ".concat(str));
                    break;
            }
        }
    }

    public final void onInvoiceStatusUpdate(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            notifyEvent("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z || !Objects.equals(this.currentPaymentSlug, str)) {
                return;
            }
            this.currentPaymentSlug = null;
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.forceHeight;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        this.flickerDrawable.parentWidth = getMeasuredWidth();
    }

    public final void onOpenUri(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (System.currentTimeMillis() - this.lastClickMs <= 10000 || !z2) {
            this.lastClickMs = 0L;
            boolean[] zArr = {false};
            if (Browser.isInternalUri(uri, false, zArr) && !zArr[0] && this.delegate != null) {
                setKeyboardFocusable(false);
            }
            Browser.openUrl(getContext(), uri, true, z, false, null, str, false, true, z3);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isViewPortByMeasureSuppressed) {
            return;
        }
        invalidateViewPortHeight(true, false);
    }

    public void onTitleChanged() {
    }

    public void onURLChanged(boolean z, boolean z2) {
    }

    public abstract void onWebViewCreated(MyWebView myWebView);

    public void onWebViewDestroyed(MyWebView myWebView) {
    }

    public final void reportSafeContentInsets(int i, boolean z) {
        JSONObject jSONObject;
        if (z || i != this.lastInsetsTopMargin) {
            Float fValueOf = Float.valueOf(i / AndroidUtilities.density);
            try {
                jSONObject = new JSONObject();
                jSONObject.put("left", (Object) 0);
                jSONObject.put("top", fValueOf);
                jSONObject.put("right", (Object) 0);
                jSONObject.put("bottom", (Object) 0);
            } catch (Exception unused) {
                jSONObject = null;
            }
            notifyEvent("content_safe_area_changed", jSONObject);
            this.lastInsetsTopMargin = i;
        }
    }

    public final void reportSafeInsets(Rect rect, boolean z) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.lastInsets;
            if (z || !rect2.equals(rect)) {
                Float fValueOf = Float.valueOf(rect.left / AndroidUtilities.density);
                Float fValueOf2 = Float.valueOf(rect.top / AndroidUtilities.density);
                Float fValueOf3 = Float.valueOf(rect.right / AndroidUtilities.density);
                Float fValueOf4 = Float.valueOf(rect.bottom / AndroidUtilities.density);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", fValueOf);
                    jSONObject.put("top", fValueOf2);
                    jSONObject.put("right", fValueOf3);
                    jSONObject.put("bottom", fValueOf4);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                notifyEvent("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void restoreButtonData() {
        try {
            String str = this.buttonData;
            if (str != null) {
                onEventReceived(this.botWebViewProxy, "web_app_setup_main_button", str);
            }
            String str2 = this.secondaryButtonData;
            if (str2 != null) {
                onEventReceived(this.botWebViewProxy, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void restoreStorageKey(BotStorage botStorage, String str) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String strOptString = jSONObject.optString("key");
                if (strOptString == null) {
                    notifyEvent("secure_storage_failed", obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList storagesWithKey = botStorage.getStoragesWithKey(strOptString);
                    if (storagesWithKey.isEmpty()) {
                        notifyEvent("secure_storage_failed", obj("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = new GiftSheet$$ExternalSyntheticLambda23(this, string, botStorage, strOptString, 16);
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    Theme.ResourcesProvider resourceProvider = safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourceProvider, false, false);
                    LinearLayout linearLayoutM = zzkf.m(context, 1);
                    BackupImageView backupImageView = new BackupImageView(context);
                    TLRPC.User user = MessagesController.getInstance(botStorage.account).getUser(Long.valueOf(botStorage.bot_id));
                    AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                    avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                    backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                    backupImageView.onNewImageSet();
                    linearLayoutM.addView(backupImageView, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 13));
                    int i = Theme.key_windowBackgroundWhiteBlackText;
                    TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i, true, null);
                    zzkg.m(R.string.BotRestoreStorageTitle, textViewMakeTextView, 17);
                    linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 10));
                    TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i, false, null);
                    textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    textViewMakeTextView2.setGravity(17);
                    linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 19));
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, resourceProvider);
                    textInfoPrivacyCell.setBackground(new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, resourceProvider)), Theme.getThemedDrawable(context, R.drawable.greydivider, Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourceProvider))));
                    textInfoPrivacyCell.setFixedSize(12);
                    linearLayoutM.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, 12, 7, 0, 0, 0, 0));
                    HeaderCell headerCell = new HeaderCell(context, resourceProvider);
                    headerCell.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    linearLayoutM.addView(headerCell, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0));
                    int i2 = 1;
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourceProvider, true);
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (i3 < storagesWithKey.size()) {
                        BotStorage.StorageConfig storageConfig = (BotStorage.StorageConfig) storagesWithKey.get(i3);
                        BotStorage.C1StorageCell c1StorageCell = new BotStorage.C1StorageCell(storageConfig, i3 < storagesWithKey.size() - i2, context);
                        c1StorageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourceProvider), 2, -1));
                        ButtonWithCounterView buttonWithCounterView2 = buttonWithCounterView;
                        c1StorageCell.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(strArr, storageConfig, arrayList, buttonWithCounterView2, 15));
                        linearLayoutM.addView(c1StorageCell, LayoutHelper.createLinear(-1, 56));
                        arrayList.add(c1StorageCell);
                        i3++;
                        giftSheet$$ExternalSyntheticLambda23 = giftSheet$$ExternalSyntheticLambda23;
                        buttonWithCounterView = buttonWithCounterView2;
                        i2 = 1;
                    }
                    GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda24 = giftSheet$$ExternalSyntheticLambda23;
                    ButtonWithCounterView buttonWithCounterView3 = buttonWithCounterView;
                    buttonWithCounterView3.setText(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    buttonWithCounterView3.setEnabled(strArr[0] != null);
                    linearLayoutM.addView(buttonWithCounterView3, LayoutHelper.createLinear(-1, 48, 7, 8, 8, 8, 4));
                    bottomSheetM.customView = linearLayoutM;
                    bottomSheetM.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourceProvider));
                    buttonWithCounterView3.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(zArr, giftSheet$$ExternalSyntheticLambda24, strArr, bottomSheetM, 16));
                    bottomSheetM.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(zArr, giftSheet$$ExternalSyntheticLambda24, 14));
                    bottomSheetM.show();
                } catch (Exception e) {
                    notifyEvent("secure_storage_failed", obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                notifyEvent("secure_storage_failed", obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent("secure_storage_failed", obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void runWithPermissions(Consumer consumer, String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            consumer.accept(Boolean.TRUE);
            return;
        }
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                this.onPermissionsRequestResultCallback = new EglRenderer$$ExternalSyntheticLambda6(this, consumer, strArr, 7);
                Activity activity = this.parentActivity;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        consumer.accept(Boolean.TRUE);
    }

    public void setBotUser(TLRPC.User user) {
        this.botUser = user;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setFlickerViewColor(int i) {
        int iAdaptHSV = AndroidUtilities.computePerceivedBrightness(i) > 0.7f ? Theme.adaptHSV(0.0f, -0.15f, i) : Theme.adaptHSV(0.025f, 0.15f, i);
        if (this.flickerViewColor == iAdaptHSV) {
            return;
        }
        this.flickerViewColor = iAdaptHSV;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iAdaptHSV, PorterDuff.Mode.SRC_IN);
        UserCell.AnonymousClass2 anonymousClass2 = this.flickerView;
        anonymousClass2.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
        }
        this.flickerViewColorOverriden = true;
        anonymousClass2.invalidate();
        invalidate();
    }

    public void setForceHeight(int i) {
        if (this.forceHeight == i) {
            return;
        }
        this.forceHeight = i;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z) {
        this.isBackButtonVisible = z;
    }

    public void setKeyboardFocusable(boolean z) {
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.onCloseListener = runnable;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.onVerifiedAge = callback4;
    }

    public void setOpener(MyWebView myWebView) {
        MyWebView myWebView2;
        this.opener = myWebView;
        if (this.bot || (myWebView2 = this.webView) == null) {
            return;
        }
        myWebView2.opener = myWebView;
    }

    public void setPageLoaded(String str) {
        MyWebView myWebView = this.webView;
        boolean z = myWebView == null || !myWebView.canGoBack();
        MyWebView myWebView2 = this.webView;
        onURLChanged(z, myWebView2 == null || !myWebView2.canGoForward());
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.isPageLoaded = true;
        }
        if (this.isPageLoaded) {
            d("setPageLoaded: already loaded");
            return;
        }
        UserCell.AnonymousClass2 anonymousClass2 = this.flickerView;
        if (myWebView3 == null || anonymousClass2 == null) {
            if (myWebView3 != null) {
                myWebView3.setAlpha(1.0f);
            }
            if (anonymousClass2 != null) {
                anonymousClass2.setAlpha(0.0f);
                anonymousClass2.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.webView, (Property<MyWebView, Float>) property, 1.0f), ObjectAnimator.ofFloat(anonymousClass2, (Property<UserCell.AnonymousClass2, Float>) property, 0.0f));
            animatorSet.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 15));
            animatorSet.start();
        }
        this.mUrl = str;
        d("setPageLoaded: isPageLoaded = true!");
        this.isPageLoaded = true;
        this.delegate.getClass();
    }

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

    public final void setStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String strOptString = jSONObject.optString("key");
                if (strOptString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        botStorage.setKey(strOptString, jSONObject.optString("value"));
                        notifyEvent(str2, obj(string, "req_id"));
                    } catch (RuntimeException e) {
                        notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    notifyEvent(str3, obj("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void setTrustedOrigin(String str) {
        this.trustedOrigin = getOriginHost(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.isViewPortByMeasureSuppressed = z;
    }

    public void setViewPortHeightOffset(float f) {
        this.viewPortHeightOffset = f;
    }

    public void setWasOpenedByBot(WebViewRequestProps webViewRequestProps) {
        this.wasOpenedByBot = webViewRequestProps;
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.wasOpenedByLinkIntent = z;
    }

    public void setWebViewProgressListener(Consumer consumer) {
        this.webViewProgressListener = consumer;
    }

    public void setWebViewScrollListener(WebViewScrollListener webViewScrollListener) {
        this.webViewScrollListener = webViewScrollListener;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.d("setContainers(" + this + ", " + webViewScrollListener + ")");
            boolean z = myWebView.botWebViewContainer == null;
            myWebView.botWebViewContainer = this;
            myWebView.webViewScrollListener = webViewScrollListener;
            if (z) {
                myWebView.evaluateJS("window.__tg__postBackgroundChange()");
            }
        }
    }

    public final void showDialog(Runnable runnable, AlertDialog alertDialog, int i) {
        if (alertDialog == null || ignoreDialog(i)) {
            return;
        }
        alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(16, this, runnable));
        this.currentDialog = alertDialog;
        alertDialog.dismissDialogByButtons = false;
        alertDialog.show();
        if (this.lastDialogType != i) {
            this.lastDialogType = i;
            this.shownDialogsCount = 0;
            this.blockedDialogsUntil = 0L;
        }
        this.shownDialogsCount++;
    }

    public final void unknownError(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb.append(str != null ? ": ".concat(str) : "");
        new BulletinFactory(this, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.error, 36, sb.toString()).show();
    }

    public final class MyWebView extends WebView {
        public static final int $r8$clinit = 0;
        public final boolean bot;
        public BotWebViewContainer botWebViewContainer;
        public BrowserHistory.Entry currentHistoryEntry;
        public BottomSheet currentSheet;
        public boolean dangerousUrl;
        public boolean errorShown;
        public String errorShownAt;
        public boolean injectedJS;
        public boolean isPageLoaded;
        public int lastActionBarColor;
        public boolean lastActionBarColorGot;
        public int lastBackgroundColor;
        public boolean lastBackgroundColorGot;
        public Bitmap lastFavicon;
        public boolean lastFaviconGot;
        public String lastFaviconUrl;
        public final HashMap lastFavicons;
        public String lastSiteName;
        public String lastTitle;
        public boolean lastTitleGot;
        public Runnable onCloseListener;
        public String openedByUrl;
        public MyWebView opener;
        public int searchCount;
        public int searchIndex;
        public Runnable searchListener;
        public final int tag;
        public String urlFallback;
        public WebViewScrollListener webViewScrollListener;

        public final class AnonymousClass1 implements View.OnLongClickListener {
            public AnonymousClass1() {
            }

            @Override
            public final boolean onLongClick(View view) {
                WebView.HitTestResult hitTestResult = MyWebView.this.getHitTestResult();
                if (hitTestResult.getType() == 7) {
                    final String extra = hitTestResult.getExtra();
                    final int i = 0;
                    AndroidUtilities.runOnUIThread(new Runnable(this) {
                        public final BotWebViewContainer.MyWebView.AnonymousClass1 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            String strReplace;
                            String strDecode;
                            String strReplace2;
                            String strDecode2;
                            final BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass1 = this.f$0;
                            final String str = extra;
                            final int i2 = 1;
                            final int i3 = 0;
                            switch (i) {
                                case 0:
                                    BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                                    BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(myWebView.getContext(), null, false, false);
                                    try {
                                        Uri uri = Uri.parse(str);
                                        strReplace = (uri != null && !uri.getScheme().equalsIgnoreCase("data")) ? Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null) : str;
                                    } catch (Exception e) {
                                        try {
                                            FileLog.e((Throwable) e, false);
                                        } catch (Exception e2) {
                                            e = e2;
                                            strReplace = str;
                                            FileLog.e(e);
                                            strDecode = strReplace;
                                            bottomSheetM.multipleLinesTitle = true;
                                            bottomSheetM.title = strDecode;
                                            bottomSheetM.bigTitle = false;
                                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                                @Override
                                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                                    String str2 = str;
                                                    BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                                    switch (i2) {
                                                        case 0:
                                                            BotWebViewContainer.MyWebView myWebView2 = BotWebViewContainer.MyWebView.this;
                                                            if (i4 == 0) {
                                                                try {
                                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                    intent.putExtra("create_new_tab", true);
                                                                    intent.putExtra("com.android.browser.application_id", myWebView2.getContext().getPackageName());
                                                                    myWebView2.getContext().startActivity(intent);
                                                                } catch (Exception e3) {
                                                                    FileLog.e(e3);
                                                                    myWebView2.loadUrl(str2);
                                                                    return;
                                                                }
                                                            } else if (i4 == 1) {
                                                                try {
                                                                    String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                                    if (strGuessFileName == null) {
                                                                        strGuessFileName = "image.png";
                                                                    }
                                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                                    request.setMimeType("image/*");
                                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) myWebView2.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    BotWebViewContainer botWebViewContainer = myWebView2.botWebViewContainer;
                                                                    if (botWebViewContainer != null) {
                                                                        new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                                    }
                                                                } catch (Exception e4) {
                                                                    FileLog.e(e4);
                                                                    return;
                                                                }
                                                            } else if (i4 == 2) {
                                                                AndroidUtilities.addToClipboard(str2);
                                                                BotWebViewContainer botWebViewContainer2 = myWebView2.botWebViewContainer;
                                                                if (botWebViewContainer2 != null) {
                                                                    new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                            if (i4 == 0) {
                                                                myWebView3.loadUrl(str2);
                                                            } else if (i4 == 1) {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                                    myWebView3.getContext().startActivity(intent2);
                                                                } catch (Exception e5) {
                                                                    FileLog.e(e5);
                                                                    myWebView3.loadUrl(str2);
                                                                    return;
                                                                }
                                                            } else if (i4 == 2) {
                                                                AndroidUtilities.addToClipboard(str2);
                                                                BotWebViewContainer botWebViewContainer3 = myWebView3.botWebViewContainer;
                                                                if (botWebViewContainer3 != null) {
                                                                    new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            bottomSheetM.items = charSequenceArr;
                                            bottomSheetM.onClickListener = onClickListener;
                                            bottomSheetM.show();
                                            myWebView.currentSheet = bottomSheetM;
                                            return;
                                        }
                                    }
                                    try {
                                        strDecode = URLDecoder.decode(strReplace.replaceAll("\\+", "%2b"), "UTF-8");
                                    } catch (Exception e3) {
                                        e = e3;
                                        FileLog.e(e);
                                        strDecode = strReplace;
                                    }
                                    bottomSheetM.multipleLinesTitle = true;
                                    bottomSheetM.title = strDecode;
                                    bottomSheetM.bigTitle = false;
                                    CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                                        @Override
                                        public final void onClick(DialogInterface dialogInterface, int i4) {
                                            String str2 = str;
                                            BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                            switch (i2) {
                                                case 0:
                                                    BotWebViewContainer.MyWebView myWebView2 = BotWebViewContainer.MyWebView.this;
                                                    if (i4 == 0) {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", myWebView2.getContext().getPackageName());
                                                            myWebView2.getContext().startActivity(intent);
                                                        } catch (Exception e4) {
                                                            FileLog.e(e4);
                                                            myWebView2.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i4 == 1) {
                                                        try {
                                                            String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                            if (strGuessFileName == null) {
                                                                strGuessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) myWebView2.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            BotWebViewContainer botWebViewContainer = myWebView2.botWebViewContainer;
                                                            if (botWebViewContainer != null) {
                                                                new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                            }
                                                        } catch (Exception e5) {
                                                            FileLog.e(e5);
                                                            return;
                                                        }
                                                    } else if (i4 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        BotWebViewContainer botWebViewContainer2 = myWebView2.botWebViewContainer;
                                                        if (botWebViewContainer2 != null) {
                                                            new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                    if (i4 == 0) {
                                                        myWebView3.loadUrl(str2);
                                                    } else if (i4 == 1) {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                            myWebView3.getContext().startActivity(intent2);
                                                        } catch (Exception e6) {
                                                            FileLog.e(e6);
                                                            myWebView3.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i4 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        BotWebViewContainer botWebViewContainer3 = myWebView3.botWebViewContainer;
                                                        if (botWebViewContainer3 != null) {
                                                            new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    bottomSheetM.items = charSequenceArr2;
                                    bottomSheetM.onClickListener = onClickListener2;
                                    bottomSheetM.show();
                                    myWebView.currentSheet = bottomSheetM;
                                    break;
                                default:
                                    BotWebViewContainer.MyWebView myWebView2 = BotWebViewContainer.MyWebView.this;
                                    BottomSheet bottomSheetM2 = VoIPService$$ExternalSyntheticOutline0.m(myWebView2.getContext(), null, false, false);
                                    try {
                                        Uri uri2 = Uri.parse(str);
                                        strReplace2 = Browser.replace(uri2, null, null, Browser.IDN_toUnicode(uri2.getHost()), null);
                                        break;
                                    } catch (Exception e4) {
                                        try {
                                            FileLog.e((Throwable) e4, false);
                                            strReplace2 = str;
                                        } catch (Exception e5) {
                                            e = e5;
                                            strReplace2 = str;
                                            FileLog.e(e);
                                            strDecode2 = strReplace2;
                                            bottomSheetM2.multipleLinesTitle = true;
                                            bottomSheetM2.title = strDecode2;
                                            bottomSheetM2.bigTitle = false;
                                            CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() {
                                                @Override
                                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                                    String str2 = str;
                                                    BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                                    switch (i3) {
                                                        case 0:
                                                            BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                            if (i4 == 0) {
                                                                try {
                                                                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                    intent.putExtra("create_new_tab", true);
                                                                    intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                                    myWebView3.getContext().startActivity(intent);
                                                                } catch (Exception e6) {
                                                                    FileLog.e(e6);
                                                                    myWebView3.loadUrl(str2);
                                                                    return;
                                                                }
                                                            } else if (i4 == 1) {
                                                                try {
                                                                    String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                                    if (strGuessFileName == null) {
                                                                        strGuessFileName = "image.png";
                                                                    }
                                                                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                                    request.setMimeType("image/*");
                                                                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                    request.setNotificationVisibility(1);
                                                                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                                    DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                                    if (downloadManager != null) {
                                                                        downloadManager.enqueue(request);
                                                                    }
                                                                    BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                                    if (botWebViewContainer != null) {
                                                                        new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                                    }
                                                                } catch (Exception e7) {
                                                                    FileLog.e(e7);
                                                                    return;
                                                                }
                                                            } else if (i4 == 2) {
                                                                AndroidUtilities.addToClipboard(str2);
                                                                BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                                if (botWebViewContainer2 != null) {
                                                                    new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                            if (i4 == 0) {
                                                                myWebView4.loadUrl(str2);
                                                            } else if (i4 == 1) {
                                                                try {
                                                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                    intent2.putExtra("create_new_tab", true);
                                                                    intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                                    myWebView4.getContext().startActivity(intent2);
                                                                } catch (Exception e8) {
                                                                    FileLog.e(e8);
                                                                    myWebView4.loadUrl(str2);
                                                                    return;
                                                                }
                                                            } else if (i4 == 2) {
                                                                AndroidUtilities.addToClipboard(str2);
                                                                BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                                if (botWebViewContainer3 != null) {
                                                                    new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            bottomSheetM2.items = charSequenceArr3;
                                            bottomSheetM2.onClickListener = onClickListener3;
                                            bottomSheetM2.show();
                                            myWebView2.currentSheet = bottomSheetM2;
                                        }
                                    }
                                    try {
                                        strDecode2 = URLDecoder.decode(strReplace2.replaceAll("\\+", "%2b"), "UTF-8");
                                    } catch (Exception e6) {
                                        e = e6;
                                        FileLog.e(e);
                                        strDecode2 = strReplace2;
                                    }
                                    bottomSheetM2.multipleLinesTitle = true;
                                    bottomSheetM2.title = strDecode2;
                                    bottomSheetM2.bigTitle = false;
                                    CharSequence[] charSequenceArr4 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                    DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() {
                                        @Override
                                        public final void onClick(DialogInterface dialogInterface, int i4) {
                                            String str2 = str;
                                            BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                            switch (i3) {
                                                case 0:
                                                    BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                    if (i4 == 0) {
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent.putExtra("create_new_tab", true);
                                                            intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                            myWebView3.getContext().startActivity(intent);
                                                        } catch (Exception e7) {
                                                            FileLog.e(e7);
                                                            myWebView3.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i4 == 1) {
                                                        try {
                                                            String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                            if (strGuessFileName == null) {
                                                                strGuessFileName = "image.png";
                                                            }
                                                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                            request.setMimeType("image/*");
                                                            request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                            request.setNotificationVisibility(1);
                                                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                            DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                            if (downloadManager != null) {
                                                                downloadManager.enqueue(request);
                                                            }
                                                            BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                            if (botWebViewContainer != null) {
                                                                new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                            }
                                                        } catch (Exception e8) {
                                                            FileLog.e(e8);
                                                            return;
                                                        }
                                                    } else if (i4 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                        if (botWebViewContainer2 != null) {
                                                            new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                    if (i4 == 0) {
                                                        myWebView4.loadUrl(str2);
                                                    } else if (i4 == 1) {
                                                        try {
                                                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                            intent2.putExtra("create_new_tab", true);
                                                            intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                            myWebView4.getContext().startActivity(intent2);
                                                        } catch (Exception e9) {
                                                            FileLog.e(e9);
                                                            myWebView4.loadUrl(str2);
                                                            return;
                                                        }
                                                    } else if (i4 == 2) {
                                                        AndroidUtilities.addToClipboard(str2);
                                                        BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                        if (botWebViewContainer3 != null) {
                                                            new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    bottomSheetM2.items = charSequenceArr4;
                                    bottomSheetM2.onClickListener = onClickListener4;
                                    bottomSheetM2.show();
                                    myWebView2.currentSheet = bottomSheetM2;
                                    break;
                            }
                        }
                    });
                    return true;
                }
                if (hitTestResult.getType() != 5) {
                    return false;
                }
                final String extra2 = hitTestResult.getExtra();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) {
                    public final BotWebViewContainer.MyWebView.AnonymousClass1 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        String strReplace;
                        String strDecode;
                        String strReplace2;
                        String strDecode2;
                        final BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass1 = this.f$0;
                        final String str = extra2;
                        final int i3 = 1;
                        final int i4 = 0;
                        switch (i2) {
                            case 0:
                                BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                                BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(myWebView.getContext(), null, false, false);
                                try {
                                    Uri uri = Uri.parse(str);
                                    strReplace = (uri != null && !uri.getScheme().equalsIgnoreCase("data")) ? Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null) : str;
                                } catch (Exception e) {
                                    try {
                                        FileLog.e((Throwable) e, false);
                                    } catch (Exception e2) {
                                        e = e2;
                                        strReplace = str;
                                        FileLog.e(e);
                                        strDecode = strReplace;
                                        bottomSheetM.multipleLinesTitle = true;
                                        bottomSheetM.title = strDecode;
                                        bottomSheetM.bigTitle = false;
                                        CharSequence[] charSequenceArr2 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                                            @Override
                                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                                String str2 = str;
                                                BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                                switch (i3) {
                                                    case 0:
                                                        BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                        if (i5 == 0) {
                                                            try {
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                intent.putExtra("create_new_tab", true);
                                                                intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                                myWebView3.getContext().startActivity(intent);
                                                            } catch (Exception e7) {
                                                                FileLog.e(e7);
                                                                myWebView3.loadUrl(str2);
                                                                return;
                                                            }
                                                        } else if (i5 == 1) {
                                                            try {
                                                                String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                                if (strGuessFileName == null) {
                                                                    strGuessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                                if (botWebViewContainer != null) {
                                                                    new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                                }
                                                            } catch (Exception e8) {
                                                                FileLog.e(e8);
                                                                return;
                                                            }
                                                        } else if (i5 == 2) {
                                                            AndroidUtilities.addToClipboard(str2);
                                                            BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                            if (botWebViewContainer2 != null) {
                                                                new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                        if (i5 == 0) {
                                                            myWebView4.loadUrl(str2);
                                                        } else if (i5 == 1) {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                                myWebView4.getContext().startActivity(intent2);
                                                            } catch (Exception e9) {
                                                                FileLog.e(e9);
                                                                myWebView4.loadUrl(str2);
                                                                return;
                                                            }
                                                        } else if (i5 == 2) {
                                                            AndroidUtilities.addToClipboard(str2);
                                                            BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                            if (botWebViewContainer3 != null) {
                                                                new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        bottomSheetM.items = charSequenceArr2;
                                        bottomSheetM.onClickListener = onClickListener2;
                                        bottomSheetM.show();
                                        myWebView.currentSheet = bottomSheetM;
                                        return;
                                    }
                                }
                                try {
                                    strDecode = URLDecoder.decode(strReplace.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e3) {
                                    e = e3;
                                    FileLog.e(e);
                                    strDecode = strReplace;
                                }
                                bottomSheetM.multipleLinesTitle = true;
                                bottomSheetM.title = strDecode;
                                bottomSheetM.bigTitle = false;
                                CharSequence[] charSequenceArr3 = {LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)};
                                DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() {
                                    @Override
                                    public final void onClick(DialogInterface dialogInterface, int i5) {
                                        String str2 = str;
                                        BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                        switch (i3) {
                                            case 0:
                                                BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                if (i5 == 0) {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                        myWebView3.getContext().startActivity(intent);
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        myWebView3.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i5 == 1) {
                                                    try {
                                                        String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                        if (strGuessFileName == null) {
                                                            strGuessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                        if (botWebViewContainer != null) {
                                                            new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                        }
                                                    } catch (Exception e8) {
                                                        FileLog.e(e8);
                                                        return;
                                                    }
                                                } else if (i5 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                    if (botWebViewContainer2 != null) {
                                                        new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                    }
                                                }
                                                break;
                                            default:
                                                BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                if (i5 == 0) {
                                                    myWebView4.loadUrl(str2);
                                                } else if (i5 == 1) {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                        myWebView4.getContext().startActivity(intent2);
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        myWebView4.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i5 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                    if (botWebViewContainer3 != null) {
                                                        new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                bottomSheetM.items = charSequenceArr3;
                                bottomSheetM.onClickListener = onClickListener3;
                                bottomSheetM.show();
                                myWebView.currentSheet = bottomSheetM;
                                break;
                            default:
                                BotWebViewContainer.MyWebView myWebView2 = BotWebViewContainer.MyWebView.this;
                                BottomSheet bottomSheetM2 = VoIPService$$ExternalSyntheticOutline0.m(myWebView2.getContext(), null, false, false);
                                try {
                                    Uri uri2 = Uri.parse(str);
                                    strReplace2 = Browser.replace(uri2, null, null, Browser.IDN_toUnicode(uri2.getHost()), null);
                                    break;
                                } catch (Exception e4) {
                                    try {
                                        FileLog.e((Throwable) e4, false);
                                        strReplace2 = str;
                                    } catch (Exception e5) {
                                        e = e5;
                                        strReplace2 = str;
                                        FileLog.e(e);
                                        strDecode2 = strReplace2;
                                        bottomSheetM2.multipleLinesTitle = true;
                                        bottomSheetM2.title = strDecode2;
                                        bottomSheetM2.bigTitle = false;
                                        CharSequence[] charSequenceArr4 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                        DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() {
                                            @Override
                                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                                String str2 = str;
                                                BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                                switch (i4) {
                                                    case 0:
                                                        BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                        if (i5 == 0) {
                                                            try {
                                                                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                intent.putExtra("create_new_tab", true);
                                                                intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                                myWebView3.getContext().startActivity(intent);
                                                            } catch (Exception e7) {
                                                                FileLog.e(e7);
                                                                myWebView3.loadUrl(str2);
                                                                return;
                                                            }
                                                        } else if (i5 == 1) {
                                                            try {
                                                                String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                                if (strGuessFileName == null) {
                                                                    strGuessFileName = "image.png";
                                                                }
                                                                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                                request.setMimeType("image/*");
                                                                request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                                request.setNotificationVisibility(1);
                                                                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                                DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                                if (downloadManager != null) {
                                                                    downloadManager.enqueue(request);
                                                                }
                                                                BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                                if (botWebViewContainer != null) {
                                                                    new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                                }
                                                            } catch (Exception e8) {
                                                                FileLog.e(e8);
                                                                return;
                                                            }
                                                        } else if (i5 == 2) {
                                                            AndroidUtilities.addToClipboard(str2);
                                                            BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                            if (botWebViewContainer2 != null) {
                                                                new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                        if (i5 == 0) {
                                                            myWebView4.loadUrl(str2);
                                                        } else if (i5 == 1) {
                                                            try {
                                                                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                                intent2.putExtra("create_new_tab", true);
                                                                intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                                myWebView4.getContext().startActivity(intent2);
                                                            } catch (Exception e9) {
                                                                FileLog.e(e9);
                                                                myWebView4.loadUrl(str2);
                                                                return;
                                                            }
                                                        } else if (i5 == 2) {
                                                            AndroidUtilities.addToClipboard(str2);
                                                            BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                            if (botWebViewContainer3 != null) {
                                                                new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        bottomSheetM2.items = charSequenceArr4;
                                        bottomSheetM2.onClickListener = onClickListener4;
                                        bottomSheetM2.show();
                                        myWebView2.currentSheet = bottomSheetM2;
                                    }
                                }
                                try {
                                    strDecode2 = URLDecoder.decode(strReplace2.replaceAll("\\+", "%2b"), "UTF-8");
                                } catch (Exception e6) {
                                    e = e6;
                                    FileLog.e(e);
                                    strDecode2 = strReplace2;
                                }
                                bottomSheetM2.multipleLinesTitle = true;
                                bottomSheetM2.title = strDecode2;
                                bottomSheetM2.bigTitle = false;
                                CharSequence[] charSequenceArr5 = {LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)};
                                DialogInterface.OnClickListener onClickListener5 = new DialogInterface.OnClickListener() {
                                    @Override
                                    public final void onClick(DialogInterface dialogInterface, int i5) {
                                        String str2 = str;
                                        BotWebViewContainer.MyWebView.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                        switch (i4) {
                                            case 0:
                                                BotWebViewContainer.MyWebView myWebView3 = BotWebViewContainer.MyWebView.this;
                                                if (i5 == 0) {
                                                    try {
                                                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent.putExtra("create_new_tab", true);
                                                        intent.putExtra("com.android.browser.application_id", myWebView3.getContext().getPackageName());
                                                        myWebView3.getContext().startActivity(intent);
                                                    } catch (Exception e7) {
                                                        FileLog.e(e7);
                                                        myWebView3.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i5 == 1) {
                                                    try {
                                                        String strGuessFileName = URLUtil.guessFileName(str2, null, "image/*");
                                                        if (strGuessFileName == null) {
                                                            strGuessFileName = "image.png";
                                                        }
                                                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                                                        request.setMimeType("image/*");
                                                        request.setDescription(LocaleController.getString(R.string.WebDownloading));
                                                        request.setNotificationVisibility(1);
                                                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                                                        DownloadManager downloadManager = (DownloadManager) myWebView3.getContext().getSystemService("download");
                                                        if (downloadManager != null) {
                                                            downloadManager.enqueue(request);
                                                        }
                                                        BotWebViewContainer botWebViewContainer = myWebView3.botWebViewContainer;
                                                        if (botWebViewContainer != null) {
                                                            new BulletinFactory(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                                                        }
                                                    } catch (Exception e8) {
                                                        FileLog.e(e8);
                                                        return;
                                                    }
                                                } else if (i5 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    BotWebViewContainer botWebViewContainer2 = myWebView3.botWebViewContainer;
                                                    if (botWebViewContainer2 != null) {
                                                        new BulletinFactory(botWebViewContainer2, botWebViewContainer2.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                    }
                                                }
                                                break;
                                            default:
                                                BotWebViewContainer.MyWebView myWebView4 = BotWebViewContainer.MyWebView.this;
                                                if (i5 == 0) {
                                                    myWebView4.loadUrl(str2);
                                                } else if (i5 == 1) {
                                                    try {
                                                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                                                        intent2.putExtra("create_new_tab", true);
                                                        intent2.putExtra("com.android.browser.application_id", myWebView4.getContext().getPackageName());
                                                        myWebView4.getContext().startActivity(intent2);
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        myWebView4.loadUrl(str2);
                                                        return;
                                                    }
                                                } else if (i5 == 2) {
                                                    AndroidUtilities.addToClipboard(str2);
                                                    BotWebViewContainer botWebViewContainer3 = myWebView4.botWebViewContainer;
                                                    if (botWebViewContainer3 != null) {
                                                        new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createCopyLinkBulletin(false).show(true);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                };
                                bottomSheetM2.items = charSequenceArr5;
                                bottomSheetM2.onClickListener = onClickListener5;
                                bottomSheetM2.show();
                                myWebView2.currentSheet = bottomSheetM2;
                                break;
                        }
                    }
                });
                return true;
            }
        }

        public final class AnonymousClass3 extends WebChromeClient {
            public AlertDialog lastPermissionsDialog;
            public final boolean val$bot;
            public final long val$botId;
            public final Context val$context;

            public final class AnonymousClass2 extends WebViewClient {
                public final WebView val$newWebView;

                public AnonymousClass2(WebView webView) {
                    this.val$newWebView = webView;
                }

                @Override
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    int i = Build.VERSION.SDK_INT;
                    MyWebView myWebView = MyWebView.this;
                    if (i >= 26) {
                        StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
                        sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                        sb.append(" didCrash=");
                        sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
                        myWebView.d(sb.toString());
                    } else {
                        myWebView.d("newWebView.onRenderProcessGone");
                    }
                    try {
                        if (!AndroidUtilities.isSafeToShow(myWebView.getContext())) {
                            return true;
                        }
                        Context context = myWebView.getContext();
                        BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, botWebViewContainer == null ? null : botWebViewContainer.resourcesProvider);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = LocaleController.getString(R.string.ChromeCrashTitle);
                        alertDialog.message = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new VoIPFragment$8$$ExternalSyntheticLambda1(this, 22));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(this, 12));
                        builder.show();
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
                }

                @Override
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    if (botWebViewContainer != null) {
                        botWebViewContainer.onOpenUri(Uri.parse(str), null, !botWebViewContainer.bot, false, false);
                        this.val$newWebView.destroy();
                    }
                    return true;
                }
            }

            public AnonymousClass3(Context context, boolean z, long j) {
                this.val$context = context;
                this.val$bot = z;
                this.val$botId = j;
            }

            @Override
            public final Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            }

            @Override
            public final void onCloseWindow(WebView webView) {
                Delegate delegate;
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onCloseWindow " + webView);
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer == null || (delegate = botWebViewContainer.delegate) == null) {
                    Runnable runnable = myWebView.onCloseListener;
                    if (runnable != null) {
                        runnable.run();
                        myWebView.onCloseListener = null;
                    }
                } else {
                    delegate.onCloseRequested();
                }
                super.onCloseWindow(webView);
            }

            @Override
            public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                BaseFragment safeLastFragment;
                String str = "onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message;
                MyWebView myWebView = MyWebView.this;
                myWebView.d(str);
                String url = myWebView.getUrl();
                if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
                    WebView webView2 = new WebView(webView.getContext());
                    webView2.setWebViewClient(new AnonymousClass2(webView2));
                    ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                    message.sendToTarget();
                    return true;
                }
                if (myWebView.botWebViewContainer == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                    return false;
                }
                if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                    safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
                }
                ArticleViewer articleViewerCreateArticleViewer = safeLastFragment.createArticleViewer(true);
                if (articleViewerCreateArticleViewer.pages != null) {
                    int i = 0;
                    while (true) {
                        ArticleViewer.PageLayout[] pageLayoutArr = articleViewerCreateArticleViewer.pages;
                        if (i >= pageLayoutArr.length) {
                            break;
                        }
                        ArticleViewer.PageLayout pageLayout = pageLayoutArr[i];
                        if (pageLayout != null) {
                            pageLayout.webViewContainer.setOpener(myWebView);
                        }
                        i++;
                    }
                }
                MyWebView webView3 = null;
                articleViewerCreateArticleViewer.open(null, null, null, null);
                ArticleViewer.PageLayout pageLayout2 = articleViewerCreateArticleViewer.pages[0];
                if (pageLayout2 != null && pageLayout2.isWeb()) {
                    if (articleViewerCreateArticleViewer.pages[0].getWebView() == null) {
                        articleViewerCreateArticleViewer.pages[0].webViewContainer.checkCreateWebView();
                    }
                    webView3 = articleViewerCreateArticleViewer.pages[0].getWebView();
                }
                if (!TextUtils.isEmpty(url)) {
                    webView3.urlFallback = url;
                }
                myWebView.d("onCreateWindow: newWebView=" + webView3);
                if (webView3 == null) {
                    articleViewerCreateArticleViewer.close(true, true);
                    return false;
                }
                ((WebView.WebViewTransport) message.obj).setWebView(webView3);
                message.sendToTarget();
                return true;
            }

            @Override
            public final void onGeolocationPermissionsHidePrompt() {
                AlertDialog alertDialog = this.lastPermissionsDialog;
                MyWebView myWebView = MyWebView.this;
                if (alertDialog == null) {
                    myWebView.d("onGeolocationPermissionsHidePrompt: no dialog");
                    return;
                }
                myWebView.d("onGeolocationPermissionsHidePrompt: dialog.dismiss");
                this.lastPermissionsDialog.dismiss();
                this.lastPermissionsDialog = null;
            }

            @Override
            public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                int i = 0;
                MyWebView myWebView = MyWebView.this;
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer == null || botWebViewContainer.parentActivity == null) {
                    myWebView.d("onGeolocationPermissionsShowPrompt: no container");
                    callback.invoke(str, false, false);
                    return;
                }
                myWebView.d("onGeolocationPermissionsShowPrompt " + str);
                boolean z = this.val$bot;
                String userName = z ? UserObject.getUserName(myWebView.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(myWebView.getUrl());
                BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                AlertDialog alertDialogCreateWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(botWebViewContainer2.parentActivity, botWebViewContainer2.resourcesProvider, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13(this, callback, str, i));
                this.lastPermissionsDialog = alertDialogCreateWebViewPermissionsRequestDialog;
                alertDialogCreateWebViewPermissionsRequestDialog.show();
            }

            @Override
            public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                boolean[] zArr = {false};
                BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, botWebViewContainer == null ? null : botWebViewContainer.resourcesProvider);
                String name = this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = name;
                alertDialog.message = str2;
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5(zArr, jsResult, 2));
                alertDialog.setOnDismissListener(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda7(zArr, jsResult, 1));
                builder.show();
                return true;
            }

            @Override
            public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                int i = 0;
                int i2 = 1;
                boolean[] zArr = {false};
                BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, botWebViewContainer == null ? null : botWebViewContainer.resourcesProvider);
                String name = this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = name;
                alertDialog.message = str2;
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5(zArr, jsResult, i));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5(zArr, jsResult, i2));
                alertDialog.setOnDismissListener(new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda7(zArr, jsResult, 0));
                builder.show();
                return true;
            }

            @Override
            public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
                int i = 1;
                BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                Theme.ResourcesProvider resourcesProvider = botWebViewContainer == null ? null : botWebViewContainer.resourcesProvider;
                final boolean[] zArr = {false};
                Context context = this.val$context;
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                String name = this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = name;
                alertDialog.message = str2;
                final EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider);
                editTextCaption.lineYFix = true;
                editTextCaption.setTextSize(1, 18.0f);
                editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
                editTextCaption.setFocusable(true);
                editTextCaption.setInputType(147457);
                editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
                editTextCaption.setImeOptions(6);
                editTextCaption.setBackgroundDrawable(null);
                editTextCaption.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
                editTextCaption.setText(str3);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.addView(editTextCaption, LayoutHelper.createLinear(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
                builder.makeCustomMaxHeight();
                builder.setView(linearLayout);
                alertDialog.customWidth = AndroidUtilities.dp(292.0f);
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new TodoItemMenu$$ExternalSyntheticLambda19(15, zArr, jsPromptResult));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new RichInlineButtonEditor$$ExternalSyntheticLambda19(zArr, jsPromptResult, editTextCaption, i));
                alertDialog.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda16(zArr, jsPromptResult, 17));
                alertDialog.overridenDissmissListener = new EditTextEmoji$$ExternalSyntheticLambda2(editTextCaption, i);
                final AlertDialog alertDialogShow = builder.show();
                editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                        if (i2 != 6) {
                            return false;
                        }
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            jsPromptResult.confirm(editTextCaption.getText().toString());
                            alertDialogShow.dismiss();
                        }
                        return true;
                    }
                });
                AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(editTextCaption, 21));
                return true;
            }

            @Override
            public final void onPermissionRequest(PermissionRequest permissionRequest) {
                int i = 1;
                int i2 = 0;
                AlertDialog alertDialog = this.lastPermissionsDialog;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    this.lastPermissionsDialog = null;
                }
                MyWebView myWebView = MyWebView.this;
                if (myWebView.botWebViewContainer == null) {
                    myWebView.d("onPermissionRequest: no container");
                    permissionRequest.deny();
                    return;
                }
                myWebView.d("onPermissionRequest " + permissionRequest);
                boolean z = this.val$bot;
                String userName = z ? UserObject.getUserName(myWebView.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(myWebView.getUrl());
                String[] resources = permissionRequest.getResources();
                if (resources.length != 1) {
                    if (resources.length == 2) {
                        if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                                AlertDialog alertDialogCreateWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(botWebViewContainer.parentActivity, botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12(this, permissionRequest, resources, i2));
                                this.lastPermissionsDialog = alertDialogCreateWebViewPermissionsRequestDialog;
                                alertDialogCreateWebViewPermissionsRequestDialog.show();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str = resources[0];
                BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                if (botWebViewContainer2.parentActivity == null) {
                    permissionRequest.deny();
                    return;
                }
                if (botWebViewContainer2.onVerifiedAge != null) {
                    permissionRequest.grant(resources);
                    return;
                }
                str.getClass();
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    BotWebViewContainer botWebViewContainer3 = myWebView.botWebViewContainer;
                    AlertDialog alertDialogCreateWebViewPermissionsRequestDialog2 = AlertsCreator.createWebViewPermissionsRequestDialog(botWebViewContainer3.parentActivity, botWebViewContainer3.resourcesProvider, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(this, permissionRequest, str, i));
                    this.lastPermissionsDialog = alertDialogCreateWebViewPermissionsRequestDialog2;
                    alertDialogCreateWebViewPermissionsRequestDialog2.show();
                    return;
                }
                if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    BotWebViewContainer botWebViewContainer4 = myWebView.botWebViewContainer;
                    AlertDialog alertDialogCreateWebViewPermissionsRequestDialog3 = AlertsCreator.createWebViewPermissionsRequestDialog(botWebViewContainer4.parentActivity, botWebViewContainer4.resourcesProvider, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10(this, permissionRequest, str, i2));
                    this.lastPermissionsDialog = alertDialogCreateWebViewPermissionsRequestDialog3;
                    alertDialogCreateWebViewPermissionsRequestDialog3.show();
                }
            }

            @Override
            public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                AlertDialog alertDialog = this.lastPermissionsDialog;
                MyWebView myWebView = MyWebView.this;
                if (alertDialog == null) {
                    myWebView.d("onPermissionRequestCanceled: no dialog");
                    return;
                }
                myWebView.d("onPermissionRequestCanceled: dialog.dismiss");
                this.lastPermissionsDialog.dismiss();
                this.lastPermissionsDialog = null;
            }

            @Override
            public final void onProgressChanged(WebView webView, int i) {
                MyWebView myWebView = MyWebView.this;
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer == null || botWebViewContainer.webViewProgressListener == null) {
                    myWebView.d("onProgressChanged " + i + "%: no container");
                    return;
                }
                myWebView.d("onProgressChanged " + i + "%");
                myWebView.botWebViewContainer.webViewProgressListener.accept(Float.valueOf(((float) i) / 100.0f));
            }

            @Override
            public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
                String str;
                StringBuilder sb = new StringBuilder("onReceivedIcon favicon=");
                if (bitmap == null) {
                    str = "null";
                } else {
                    str = bitmap.getWidth() + "x" + bitmap.getHeight();
                }
                sb.append(str);
                String string = sb.toString();
                MyWebView myWebView = MyWebView.this;
                myWebView.d(string);
                if (bitmap != null && (!TextUtils.equals(myWebView.getUrl(), myWebView.lastFaviconUrl) || myWebView.lastFavicon == null || bitmap.getWidth() > myWebView.lastFavicon.getWidth())) {
                    myWebView.lastFavicon = bitmap;
                    myWebView.lastFaviconUrl = myWebView.getUrl();
                    myWebView.lastFaviconGot = true;
                    MyWebView.access$400(myWebView);
                }
                Bitmap bitmap2 = (Bitmap) myWebView.lastFavicons.get(myWebView.getUrl());
                if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
                    myWebView.lastFavicons.put(myWebView.getUrl(), bitmap);
                }
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                super.onReceivedIcon(webView, bitmap);
            }

            @Override
            public final void onReceivedTitle(WebView webView, String str) {
                String strM = SurfaceContainer$$ExternalSyntheticOutline0.m("onReceivedTitle title=", str);
                MyWebView myWebView = MyWebView.this;
                myWebView.d(strM);
                if (!myWebView.errorShown) {
                    myWebView.lastTitleGot = true;
                    myWebView.lastTitle = str;
                }
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null) {
                    botWebViewContainer.onTitleChanged();
                }
                super.onReceivedTitle(webView, str);
            }

            @Override
            public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                MyWebView.this.d("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
                super.onReceivedTouchIconUrl(webView, str, z);
            }

            @Override
            public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                MyWebView myWebView = MyWebView.this;
                Activity activityFindActivity = AndroidUtilities.findActivity(myWebView.getContext());
                if (activityFindActivity == null) {
                    myWebView.d("onShowFileChooser: no activity, false");
                    return false;
                }
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer == null) {
                    myWebView.d("onShowFileChooser: no container, false");
                    return false;
                }
                ValueCallback valueCallback2 = botWebViewContainer.mFilePathCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                myWebView.botWebViewContainer.mFilePathCallback = valueCallback;
                boolean z = fileChooserParams.getMode() == 1;
                Intent intentCreateIntent = fileChooserParams.createIntent();
                if (z) {
                    intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                }
                activityFindActivity.startActivityForResult(intentCreateIntent, 3000);
                myWebView.d("onShowFileChooser: true");
                return true;
            }
        }

        public final class AnonymousClass5 implements DownloadListener {
            public AnonymousClass5() {
            }

            @Override
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                String strGuessFileName;
                StringBuilder sbM = RendererCapabilities.CC.m("onDownloadStart ", str, " ", str2, " ");
                SurfaceContainer$$ExternalSyntheticOutline0.m(sbM, str3, " ", str4, " ");
                sbM.append(j);
                String string = sbM.toString();
                MyWebView myWebView = MyWebView.this;
                myWebView.d(string);
                try {
                    if (str.startsWith("blob:")) {
                        return;
                    }
                    try {
                        List<String> pathSegments = Uri.parse(str).getPathSegments();
                        strGuessFileName = pathSegments.get(pathSegments.size() - 1);
                        int iLastIndexOf = strGuessFileName.lastIndexOf(".");
                        if (iLastIndexOf <= 0 || TextUtils.isEmpty(strGuessFileName.substring(iLastIndexOf + 1))) {
                            strGuessFileName = URLUtil.guessFileName(str, str3, str4);
                        }
                    } catch (Exception unused) {
                    }
                    String strEscape = AndroidUtilities.escape(strGuessFileName);
                    WebInstantView$4$$ExternalSyntheticLambda0 webInstantView$4$$ExternalSyntheticLambda0 = new WebInstantView$4$$ExternalSyntheticLambda0((Object) this, str, (Serializable) str4, str2, strEscape, 10);
                    if (DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j)) {
                        webInstantView$4$$ExternalSyntheticLambda0.run();
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(myWebView.getContext(), 0, null);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = LocaleController.getString(R.string.WebDownloadAlertTitle);
                    alertDialog.message = AndroidUtilities.replaceTags(j > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, strEscape, AndroidUtilities.formatFileSize(j)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, strEscape));
                    builder.setPositiveButton(LocaleController.getString(R.string.WebDownloadAlertYes), new TodoItemMenu$$ExternalSyntheticLambda3(webInstantView$4$$ExternalSyntheticLambda0, 18));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    TextView textView = (TextView) builder.show().getButton(-2);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        public MyWebView(Context context, boolean z, long j) {
            super(context);
            int i = BotWebViewContainer.tags;
            BotWebViewContainer.tags = i + 1;
            this.tag = i;
            this.urlFallback = "about:blank";
            this.lastFavicons = new HashMap();
            this.bot = z;
            d("created new webview " + this);
            setOnLongClickListener(new AnonymousClass1());
            setWebViewClient(new AnonymousClass2(z, context));
            setWebChromeClient(new AnonymousClass3(context, z, j));
            setFindListener(new WebView.FindListener() {
                @Override
                public final void onFindResultReceived(int i2, int i3, boolean z2) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.searchIndex = i2;
                    myWebView.searchCount = i3;
                    Runnable runnable = myWebView.searchListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            if (z) {
                return;
            }
            setDownloadListener(new AnonymousClass5());
        }

        public static void access$400(MyWebView myWebView) {
            if (myWebView.bot) {
                return;
            }
            WebMetadataCache.WebMetadata webMetadataFrom = WebMetadataCache.WebMetadata.from(myWebView);
            if (WebMetadataCache.instance == null) {
                WebMetadataCache.instance = new WebMetadataCache();
            }
            WebMetadataCache webMetadataCache = WebMetadataCache.instance;
            if (webMetadataFrom == null) {
                webMetadataCache.getClass();
            } else {
                if (webMetadataCache.cache == null) {
                    webMetadataCache.cache = new HashMap();
                }
                if (!TextUtils.isEmpty(webMetadataFrom.domain)) {
                    webMetadataCache.cache.put(webMetadataFrom.domain, webMetadataFrom);
                    webMetadataCache.load();
                    webMetadataCache.scheduleSave();
                }
            }
            BrowserHistory.Entry entry = myWebView.currentHistoryEntry;
            if (entry == null || webMetadataFrom == null) {
                return;
            }
            entry.meta = webMetadataFrom;
            BrowserHistory.pushHistory(entry);
        }

        public final void applyCachedMeta(WebMetadataCache.WebMetadata webMetadata) {
            Delegate delegate;
            if (webMetadata == null) {
                return;
            }
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            boolean z = false;
            if (botWebViewContainer != null && (delegate = botWebViewContainer.delegate) != null) {
                int i = webMetadata.actionBarColor;
                if (i != 0) {
                    delegate.onWebAppBackgroundChanged(i, true);
                    this.lastActionBarColorGot = true;
                }
                int i2 = webMetadata.backgroundColor;
                if (i2 != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(i2, false);
                    this.lastBackgroundColorGot = true;
                } else {
                    i2 = -1;
                }
                Bitmap bitmap = webMetadata.favicon;
                if (bitmap != null) {
                    BotWebViewContainer botWebViewContainer2 = this.botWebViewContainer;
                    this.lastFavicon = bitmap;
                    botWebViewContainer2.getClass();
                    this.lastFaviconGot = true;
                }
                if (!TextUtils.isEmpty(webMetadata.sitename)) {
                    String str = webMetadata.sitename;
                    this.lastSiteName = str;
                    BotWebViewContainer botWebViewContainer3 = this.botWebViewContainer;
                    this.lastTitle = str;
                    botWebViewContainer3.onTitleChanged();
                    z = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i2);
                }
            }
            if (z) {
                return;
            }
            setTitle(null);
            BotWebViewContainer botWebViewContainer4 = this.botWebViewContainer;
            if (botWebViewContainer4 != null) {
                botWebViewContainer4.onTitleChanged();
            }
        }

        @Override
        public final boolean canGoBack() {
            return super.canGoBack();
        }

        @Override
        public final void clearHistory() {
            d("clearHistory");
            super.clearHistory();
        }

        public final void d(String str) {
            FileLog.d("[webview] #" + this.tag + " " + str);
        }

        @Override
        public final void destroy() {
            d("destroy");
            super.destroy();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        public final void evaluateJS(String str) {
            evaluateJavascript(str, new WebInstantView$$ExternalSyntheticLambda7(1));
        }

        @Override
        public Bitmap getFavicon() {
            if (this.errorShown) {
                return null;
            }
            return this.lastFavicon;
        }

        public String getOpenURL() {
            return this.openedByUrl;
        }

        public float getScrollProgress() {
            float fMax = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
            if (fMax <= getHeight()) {
                return 0.0f;
            }
            return Utilities.clamp01(getScrollY() / fMax);
        }

        public int getSearchCount() {
            return this.searchCount;
        }

        public int getSearchIndex() {
            return this.searchIndex;
        }

        @Override
        public String getTitle() {
            return this.lastTitle;
        }

        @Override
        public String getUrl() {
            return this.dangerousUrl ? this.urlFallback : super.getUrl();
        }

        @Override
        public final void goBack() {
            d("goBack");
            super.goBack();
        }

        @Override
        public final void goForward() {
            d("goForward");
            super.goForward();
        }

        @Override
        public final void loadData(String str, String str2, String str3) {
            this.openedByUrl = null;
            StringBuilder sbM = RendererCapabilities.CC.m("loadData ", str, " ", str2, " ");
            sbM.append(str3);
            d(sbM.toString());
            super.loadData(str, str2, str3);
        }

        @Override
        public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
            this.openedByUrl = null;
            StringBuilder sbM = RendererCapabilities.CC.m("loadDataWithBaseURL ", str, " ", str2, " ");
            SurfaceContainer$$ExternalSyntheticOutline0.m(sbM, str3, " ", str4, " ");
            sbM.append(str5);
            d(sbM.toString());
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }

        @Override
        public final void loadUrl(String str) {
            BottomSheet bottomSheet = this.currentSheet;
            WebMetadataCache.WebMetadata webMetadata = null;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                this.currentSheet = null;
            }
            if (!this.bot) {
                String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
                if (WebMetadataCache.instance == null) {
                    WebMetadataCache.instance = new WebMetadataCache();
                }
                WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                webMetadataCache.load();
                WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) webMetadataCache.cache.get(hostAuthority);
                if (webMetadata2 != null) {
                    webMetadata2.time = Math.max(webMetadata2.time, System.currentTimeMillis());
                    webMetadataCache.scheduleSave();
                    webMetadata = webMetadata2;
                }
                applyCachedMeta(webMetadata);
            }
            this.openedByUrl = str;
            String strAccess$3500 = BotWebViewContainer.access$3500(str);
            d("loadUrl " + strAccess$3500);
            super.loadUrl(strAccess$3500);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                botWebViewContainer.onURLChanged(!canGoBack(), !canGoForward());
            }
        }

        @Override
        public final void onAttachedToWindow() {
            d("attached");
            AndroidUtilities.checkAndroidTheme(getContext(), true);
            super.onAttachedToWindow();
        }

        @Override
        public final boolean onCheckIsTextEditor() {
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer == null) {
                d("onCheckIsTextEditor: no container");
                return false;
            }
            boolean zIsFocusable = botWebViewContainer.isFocusable();
            d("onCheckIsTextEditor: " + zIsFocusable);
            return zIsFocusable;
        }

        @Override
        public final void onDetachedFromWindow() {
            d("detached");
            AndroidUtilities.checkAndroidTheme(getContext(), false);
            super.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public final void onPause() {
            d("onPause");
            super.onPause();
        }

        @Override
        public final void onResume() {
            d("onResume");
            super.onResume();
        }

        @Override
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            WebViewScrollListener webViewScrollListener = this.webViewScrollListener;
            if (webViewScrollListener != null) {
                getScrollX();
                getScrollY();
                ArticleViewer.this.updatePages();
            }
            getScrollX();
            getScrollY();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.botWebViewContainer.lastClickMs = System.currentTimeMillis();
                if (this.botWebViewContainer.onVerifiedAge == null) {
                    getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void pauseTimers() {
            d("pauseTimers");
            super.pauseTimers();
        }

        @Override
        public final void postUrl(String str, byte[] bArr) {
            d("postUrl " + str + " " + bArr);
            super.postUrl(str, bArr);
        }

        @Override
        public final void reload() {
            CookieManager.getInstance().flush();
            d("reload");
            super.reload();
        }

        @Override
        public final void resumeTimers() {
            d("resumeTimers");
            super.resumeTimers();
        }

        public void setCloseListener(Runnable runnable) {
            this.onCloseListener = runnable;
        }

        @Override
        public void setFocusable(int i) {
            d("setFocusable " + i);
            super.setFocusable(i);
        }

        @Override
        public void setFocusableInTouchMode(boolean z) {
            d("setFocusableInTouchMode " + z);
            super.setFocusableInTouchMode(z);
        }

        @Override
        public void setFocusedByDefault(boolean z) {
            d("setFocusedByDefault " + z);
            super.setFocusedByDefault(z);
        }

        public void setScrollProgress(float f) {
            setScrollY((int) (f * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
        }

        @Override
        public void setScrollX(int i) {
            super.setScrollX(i);
        }

        @Override
        public void setScrollY(int i) {
            super.setScrollY(i);
        }

        public void setTitle(String str) {
            this.lastTitle = str;
        }

        @Override
        public final void stopLoading() {
            d("stopLoading");
            super.stopLoading();
        }

        @Override
        public final void stopNestedScroll() {
            d("stopNestedScroll");
            super.stopNestedScroll();
        }

        @Override
        public void setFocusable(boolean z) {
            d("setFocusable " + z);
            super.setFocusable(z);
        }

        public final class AnonymousClass2 extends WebViewClient {
            public boolean firstRequest = true;
            public final BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2 resetErrorRunnable = new BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2(this, 0);
            public final boolean val$bot;
            public final Context val$context;

            public AnonymousClass2(boolean z, Context context) {
                this.val$bot = z;
                this.val$context = context;
            }

            @Override
            public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                BrowserHistory.Entry entry;
                boolean z2 = this.val$bot;
                MyWebView myWebView = MyWebView.this;
                if (!z2 && ((entry = myWebView.currentHistoryEntry) == null || !TextUtils.equals(entry.url, str))) {
                    BrowserHistory.Entry entry2 = new BrowserHistory.Entry();
                    myWebView.currentHistoryEntry = entry2;
                    entry2.id = Utilities.fastRandom.nextLong();
                    myWebView.currentHistoryEntry.time = System.currentTimeMillis();
                    myWebView.currentHistoryEntry.url = BotWebViewContainer.magic2tonsite(myWebView.getUrl());
                    myWebView.currentHistoryEntry.meta = WebMetadataCache.WebMetadata.from(myWebView);
                    BrowserHistory.pushHistory(myWebView.currentHistoryEntry);
                }
                myWebView.d("doUpdateVisitedHistory " + str + " " + z);
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null) {
                    botWebViewContainer.onURLChanged(!myWebView.canGoBack(), !myWebView.canGoForward());
                }
                super.doUpdateVisitedHistory(webView, str, z);
            }

            @Override
            public final void onPageCommitVisible(WebView webView, String str) {
                MyWebView myWebView = MyWebView.this;
                myWebView.getClass();
                myWebView.d("onPageCommitVisible " + str);
                if (this.val$bot) {
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                } else {
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                }
                super.onPageCommitVisible(webView, str);
            }

            @Override
            public final void onPageFinished(WebView webView, String str) {
                MyWebView myWebView = MyWebView.this;
                myWebView.isPageLoaded = true;
                myWebView.d("onPageFinished");
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null) {
                    botWebViewContainer.setPageLoaded(str);
                } else {
                    myWebView.d("onPageFinished: no container");
                }
                if (this.val$bot) {
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                } else {
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                }
                MyWebView.access$400(myWebView);
                BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                if (botWebViewContainer2 != null) {
                    if (!myWebView.dangerousUrl) {
                        myWebView.getUrl();
                    }
                    botWebViewContainer2.onURLChanged(!myWebView.canGoBack(), !myWebView.canGoForward());
                }
            }

            @Override
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                String str2;
                MyWebView myWebView = MyWebView.this;
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null) {
                    int i = BotWebViewContainer.tags;
                    if (botWebViewContainer.onVerifiedAge == null) {
                        myWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
                    }
                } else {
                    myWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
                }
                BottomSheet bottomSheet = myWebView.currentSheet;
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    myWebView.currentSheet = null;
                }
                myWebView.currentHistoryEntry = null;
                myWebView.lastSiteName = null;
                myWebView.lastActionBarColorGot = false;
                myWebView.lastBackgroundColorGot = false;
                myWebView.lastFaviconGot = false;
                myWebView.d("onPageStarted " + str);
                if (myWebView.botWebViewContainer != null && myWebView.errorShown && ((str2 = myWebView.errorShownAt) == null || !TextUtils.equals(str2, str))) {
                    AndroidUtilities.runOnUIThread(this.resetErrorRunnable, 40L);
                }
                BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                if (botWebViewContainer2 != null) {
                    botWebViewContainer2.onURLChanged(!myWebView.canGoBack(), true ^ myWebView.canGoForward());
                }
                super.onPageStarted(webView, str, bitmap);
                myWebView.injectedJS = false;
            }

            @Override
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (Build.VERSION.SDK_INT >= 23) {
                    String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
                    MyWebView myWebView = MyWebView.this;
                    myWebView.d(str);
                    if (myWebView.botWebViewContainer != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        myWebView.lastSiteName = null;
                        myWebView.lastActionBarColorGot = false;
                        myWebView.lastBackgroundColorGot = false;
                        myWebView.lastFaviconGot = false;
                        myWebView.lastTitleGot = false;
                        myWebView.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? myWebView.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                        myWebView.lastTitle = null;
                        botWebViewContainer.onTitleChanged();
                        BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                        myWebView.lastFavicon = null;
                        botWebViewContainer2.getClass();
                        BotWebViewContainer botWebViewContainer3 = myWebView.botWebViewContainer;
                        myWebView.errorShown = true;
                        webResourceError.getErrorCode();
                        botWebViewContainer3.onErrorShown(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
                    }
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                StringBuilder sb = new StringBuilder("onReceivedHttpError: statusCode=");
                sb.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
                sb.append(" request=");
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                String string = sb.toString();
                MyWebView myWebView = MyWebView.this;
                myWebView.d(string);
                if (myWebView.botWebViewContainer != null) {
                    if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        myWebView.lastSiteName = null;
                        myWebView.lastActionBarColorGot = false;
                        myWebView.lastBackgroundColorGot = false;
                        myWebView.lastFaviconGot = false;
                        myWebView.lastTitleGot = false;
                        myWebView.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? myWebView.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                        myWebView.lastTitle = null;
                        botWebViewContainer.onTitleChanged();
                        BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                        myWebView.lastFavicon = null;
                        botWebViewContainer2.getClass();
                        BotWebViewContainer botWebViewContainer3 = myWebView.botWebViewContainer;
                        myWebView.errorShown = true;
                        webResourceResponse.getStatusCode();
                        botWebViewContainer3.onErrorShown(webResourceResponse.getReasonPhrase(), true);
                    }
                }
            }

            @Override
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                StringBuilder sb = new StringBuilder("onReceivedSslError: error=");
                sb.append(sslError);
                sb.append(" url=");
                sb.append(sslError == null ? null : sslError.getUrl());
                MyWebView.this.d(sb.toString());
                sslErrorHandler.cancel();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                int i = Build.VERSION.SDK_INT;
                MyWebView myWebView = MyWebView.this;
                if (i >= 26) {
                    StringBuilder sb = new StringBuilder("onRenderProcessGone priority=");
                    sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                    sb.append(" didCrash=");
                    sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
                    myWebView.d(sb.toString());
                } else {
                    myWebView.d("onRenderProcessGone");
                }
                try {
                    if (!AndroidUtilities.isSafeToShow(myWebView.getContext())) {
                        return true;
                    }
                    Context context = myWebView.getContext();
                    BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                    AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, botWebViewContainer == null ? null : botWebViewContainer.resourcesProvider);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = LocaleController.getString(R.string.ChromeCrashTitle);
                    alertDialog.message = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2(this, 2));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    alertDialog.setOnDismissListener(new ShareActivity$$ExternalSyntheticLambda0(this, 11));
                    builder.show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            @Override
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                int i;
                StringBuilder sb = new StringBuilder("shouldInterceptRequest ");
                HttpURLConnection httpURLConnection = null;
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                String string = sb.toString();
                MyWebView myWebView = MyWebView.this;
                myWebView.d(string);
                if (webResourceRequest != null && BotWebViewContainer.isTonsite(webResourceRequest.getUrl())) {
                    myWebView.d("proxying ton");
                    this.firstRequest = false;
                    return BotWebViewContainer.proxyTON(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
                }
                if (!this.val$bot && myWebView.opener != null && this.firstRequest) {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
                        try {
                            httpURLConnection2.setRequestMethod(webResourceRequest.getMethod());
                            if (webResourceRequest.getRequestHeaders() != null) {
                                for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                                }
                            }
                            httpURLConnection2.connect();
                            HashMap map = new HashMap();
                            Iterator<Map.Entry<String, List<String>>> it = httpURLConnection2.getHeaderFields().entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry<String, List<String>> next = it.next();
                                String key = next.getKey();
                                if (key != null) {
                                    map.put(key, TextUtils.join(", ", next.getValue()));
                                    if (!myWebView.dangerousUrl && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                        for (String str : next.getValue()) {
                                            if (str != null && !"unsafe-none".equals(str.toLowerCase()) && !"same-site".equals(str.toLowerCase())) {
                                                myWebView.d("<!> dangerous header CORS policy: " + key + ": " + str + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                                myWebView.dangerousUrl = true;
                                                AndroidUtilities.runOnUIThread(new BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2(this, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            String contentType = httpURLConnection2.getContentType();
                            String contentEncoding = httpURLConnection2.getContentEncoding();
                            if (contentType.indexOf("; ") >= 0) {
                                String[] strArrSplit = contentType.split("; ");
                                if (!TextUtils.isEmpty(strArrSplit[0])) {
                                    contentType = strArrSplit[0];
                                }
                                for (i = 1; i < strArrSplit.length; i++) {
                                    if (strArrSplit[i].startsWith("charset=")) {
                                        contentEncoding = strArrSplit[i].substring(8);
                                    }
                                }
                            }
                            this.firstRequest = false;
                            return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), map, httpURLConnection2.getInputStream());
                        } catch (Exception e) {
                            e = e;
                            httpURLConnection = httpURLConnection2;
                            FileLog.e(e);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.firstRequest = false;
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                this.firstRequest = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Delegate delegate;
                if (str != null && !str.trim().startsWith("sms:")) {
                    boolean zStartsWith = str.trim().startsWith("tel:");
                    Context context = this.val$context;
                    MyWebView myWebView = MyWebView.this;
                    if (zStartsWith) {
                        if (myWebView.opener != null) {
                            Delegate delegate2 = myWebView.botWebViewContainer.delegate;
                            if (delegate2 != null) {
                                delegate2.onInstantClose();
                            } else {
                                Runnable runnable = myWebView.onCloseListener;
                                if (runnable != null) {
                                    runnable.run();
                                    myWebView.onCloseListener = null;
                                }
                            }
                        }
                        Browser.openUrl(context, str);
                        return true;
                    }
                    Uri uri = Uri.parse(str);
                    boolean z = this.val$bot;
                    if (!z) {
                        if (Browser.openInExternalApp(context, str, true)) {
                            myWebView.d("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                            if (!myWebView.isPageLoaded && !myWebView.canGoBack()) {
                                Delegate delegate3 = myWebView.botWebViewContainer.delegate;
                                if (delegate3 != null) {
                                    delegate3.onInstantClose();
                                    return true;
                                }
                                Runnable runnable2 = myWebView.onCloseListener;
                                if (runnable2 != null) {
                                    runnable2.run();
                                    myWebView.onCloseListener = null;
                                }
                            }
                            return true;
                        }
                        if (str.startsWith("intent://") || (uri != null && uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent"))) {
                            try {
                                String stringExtra = Intent.parseUri(uri.toString(), 1).getStringExtra("browser_fallback_url");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    myWebView.loadUrl(stringExtra);
                                    return true;
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        if (uri != null && uri.getScheme() != null && !"https".equals(uri.getScheme()) && !"http".equals(uri.getScheme()) && !"tonsite".equals(uri.getScheme())) {
                            myWebView.d("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                            Browser.openUrl(myWebView.getContext(), uri, true, true);
                            return true;
                        }
                    }
                    if (myWebView.botWebViewContainer == null || !Browser.isInternalUri(uri, false, null)) {
                        if (uri != null) {
                            uri.toString();
                        }
                        myWebView.d("shouldOverrideUrlLoading(" + str + ") = false");
                        return false;
                    }
                    if (z || !"1".equals(uri.getQueryParameter("embed")) || !"t.me".equals(uri.getAuthority())) {
                        if (MessagesController.getInstance(myWebView.botWebViewContainer.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(myWebView.botWebViewContainer.currentAccount).webAppAllowedProtocols.contains(uri.getScheme())) {
                            if (myWebView.opener != null) {
                                Delegate delegate4 = myWebView.botWebViewContainer.delegate;
                                if (delegate4 != null) {
                                    delegate4.onInstantClose();
                                } else {
                                    Runnable runnable3 = myWebView.onCloseListener;
                                    if (runnable3 != null) {
                                        runnable3.run();
                                        myWebView.onCloseListener = null;
                                    }
                                }
                                BotWebViewContainer botWebViewContainer = myWebView.opener.botWebViewContainer;
                                if (botWebViewContainer != null && (delegate = botWebViewContainer.delegate) != null) {
                                    delegate.onCloseToTabs();
                                }
                            }
                            BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                            botWebViewContainer2.onOpenUri(uri, null, !botWebViewContainer2.bot, false, false);
                        }
                        myWebView.d("shouldOverrideUrlLoading(" + str + ") = true");
                        return true;
                    }
                }
                return false;
            }

            @Override
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onReceivedError: " + i + " " + str + " url=" + str2);
                if (Build.VERSION.SDK_INT < 23 && myWebView.botWebViewContainer != null) {
                    AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                    myWebView.lastSiteName = null;
                    myWebView.lastActionBarColorGot = false;
                    myWebView.lastBackgroundColorGot = false;
                    myWebView.lastFaviconGot = false;
                    myWebView.lastTitleGot = false;
                    myWebView.errorShownAt = myWebView.getUrl();
                    BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                    myWebView.lastTitle = null;
                    botWebViewContainer.onTitleChanged();
                    BotWebViewContainer botWebViewContainer2 = myWebView.botWebViewContainer;
                    myWebView.lastFavicon = null;
                    botWebViewContainer2.getClass();
                    BotWebViewContainer botWebViewContainer3 = myWebView.botWebViewContainer;
                    myWebView.errorShown = true;
                    botWebViewContainer3.onErrorShown(str, true);
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("shouldInterceptRequest " + str);
                int i = BotWebViewContainer.tags;
                if (str != null && BotWebViewContainer.isTonsite(Uri.parse(str))) {
                    myWebView.d("proxying ton");
                    return BotWebViewContainer.proxyTON("GET", str, null);
                }
                return super.shouldInterceptRequest(webView, str);
            }
        }

        @Override
        public final void loadUrl(String str, Map map) {
            BottomSheet bottomSheet = this.currentSheet;
            WebMetadataCache.WebMetadata webMetadata = null;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                this.currentSheet = null;
            }
            if (!this.bot) {
                String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
                if (WebMetadataCache.instance == null) {
                    WebMetadataCache.instance = new WebMetadataCache();
                }
                WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                webMetadataCache.load();
                WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) webMetadataCache.cache.get(hostAuthority);
                if (webMetadata2 != null) {
                    webMetadata2.time = Math.max(webMetadata2.time, System.currentTimeMillis());
                    webMetadataCache.scheduleSave();
                    webMetadata = webMetadata2;
                }
                applyCachedMeta(webMetadata);
            }
            this.openedByUrl = str;
            String strAccess$3500 = BotWebViewContainer.access$3500(str);
            d("loadUrl " + strAccess$3500 + " " + map);
            super.loadUrl(strAccess$3500, (Map<String, String>) map);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                botWebViewContainer.onURLChanged(!canGoBack(), !canGoForward());
            }
        }

        public final void loadUrl(String str, WebMetadataCache.WebMetadata webMetadata) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                this.currentSheet = null;
            }
            applyCachedMeta(webMetadata);
            this.openedByUrl = str;
            String strAccess$3500 = BotWebViewContainer.access$3500(str);
            d("loadUrl " + strAccess$3500 + " with cached meta");
            super.loadUrl(strAccess$3500);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                botWebViewContainer.onURLChanged(!canGoBack(), !canGoForward());
            }
        }
    }

    public final void setupWebView(MyWebView myWebView, Object obj) {
        MyWebView myWebView2;
        String str;
        TLRPC.User user;
        boolean z;
        String upperCase = "";
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.destroy();
            removeView(this.webView);
        }
        if (myWebView != null) {
            AndroidUtilities.removeFromParent(myWebView);
        }
        try {
            if (SharedConfig.debugWebView) {
                if (this.onVerifiedAge != null) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            WebView.setWebContentsDebuggingEnabled(z);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (myWebView == null) {
            Context context = getContext();
            boolean z2 = this.bot;
            myWebView2 = new MyWebView(context, z2, (!z2 || (user = this.botUser) == null) ? 0L : user.id);
        } else {
            myWebView2 = myWebView;
        }
        this.webView = myWebView2;
        if (this.bot) {
            myWebView2.setBackgroundColor(getColor$2(Theme.key_windowBackgroundWhite));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.webView, true);
            CookieManager.getInstance().flush();
            this.webView.opener = this.opener;
        }
        if (!MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur) {
            this.webView.setLayerType(2, null);
        }
        MyWebView myWebView4 = this.webView;
        WebViewScrollListener webViewScrollListener = this.webViewScrollListener;
        myWebView4.getClass();
        myWebView4.d("setContainers(" + this + ", " + webViewScrollListener + ")");
        boolean z3 = myWebView4.botWebViewContainer == null;
        myWebView4.botWebViewContainer = this;
        myWebView4.webViewScrollListener = webViewScrollListener;
        if (z3) {
            myWebView4.evaluateJS("window.__tg__postBackgroundChange()");
        }
        this.webView.setCloseListener(this.onCloseListener);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.bot) {
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setCacheMode(-1);
            settings.setSaveFormData(true);
            settings.setSavePassword(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(true);
            }
        }
        if (this.onVerifiedAge != null) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String strReplace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb = new StringBuilder("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb.append(str2);
            sb.append("; K)");
            String strReplaceAll = strReplace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.bot) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass == 0) {
                    str = "LOW";
                } else {
                    str = devicePerformanceClass == 1 ? "AVERAGE" : "HIGH";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strReplaceAll);
                sb2.append(" Telegram-Android/");
                sb2.append(packageInfo.versionName);
                sb2.append(" (");
                String str3 = Build.MANUFACTURER;
                if (str3 != null) {
                    if (str3.length() <= 1) {
                        upperCase = str3.toUpperCase();
                    } else {
                        upperCase = str3.substring(0, 1).toUpperCase() + str3.substring(1).toLowerCase();
                    }
                }
                sb2.append(upperCase);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                sb2.append("; Android ");
                sb2.append(str2);
                sb2.append("; SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append("; ");
                sb2.append(str);
                sb2.append(")");
                strReplaceAll = sb2.toString();
            }
            settings.setUserAgentString(strReplaceAll);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.webView.setVerticalScrollBarEnabled(false);
        if (myWebView == null && this.bot) {
            this.webView.setAlpha(0.0f);
        }
        addView(this.webView);
        if (this.bot) {
            if (obj instanceof BotWebViewProxy) {
                this.botWebViewProxy = (BotWebViewProxy) obj;
            }
            BotWebViewProxy botWebViewProxy = this.botWebViewProxy;
            if (botWebViewProxy == null) {
                BotWebViewProxy botWebViewProxy2 = new BotWebViewProxy();
                botWebViewProxy2.container = this;
                this.botWebViewProxy = botWebViewProxy2;
                this.webView.addJavascriptInterface(botWebViewProxy2, "TelegramWebviewProxy");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(botWebViewProxy, "TelegramWebviewProxy");
            }
            this.botWebViewProxy.container = this;
        } else {
            if (obj instanceof WebViewProxy) {
                this.webViewProxy = (WebViewProxy) obj;
            }
            WebViewProxy webViewProxy = this.webViewProxy;
            if (webViewProxy == null) {
                MyWebView myWebView5 = this.webView;
                WebViewProxy webViewProxy2 = new WebViewProxy(myWebView5, this);
                this.webViewProxy = webViewProxy2;
                myWebView5.addJavascriptInterface(webViewProxy2, "TelegramWebviewProxy");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(webViewProxy, "TelegramWebviewProxy");
            }
            this.webViewProxy.container = this;
        }
        onWebViewCreated(this.webView);
    }

    public static JSONObject obj(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getOriginHost(String str) {
        if (str != null && !str.isEmpty()) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
            if (scheme != null && host != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(host);
                if (port != 0 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb.append(":");
                    sb.append(port);
                }
                return sb.toString();
            }
        }
        return null;
    }

    public static void notifyEvent(int i, MyWebView myWebView, String str, JSONObject jSONObject) {
        if (myWebView == null) {
            return;
        }
        NotificationCenter.getInstance(i).doOnIdle(new EglRenderer$$ExternalSyntheticLambda6(myWebView, str, jSONObject, 6));
    }
}
