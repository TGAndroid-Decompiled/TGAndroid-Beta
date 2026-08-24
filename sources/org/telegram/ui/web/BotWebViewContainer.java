package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
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
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateBotAlert;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.OAuthSheet;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.WrappedResourceProvider;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotShareSheet;
import org.telegram.ui.bots.BotStorage;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.bots.WebViewRequestProps;

public abstract class BotWebViewContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean firstWebView = true;
    private static HashMap rotatedTONHosts;
    private static int tags;
    private BotBiometry biometry;
    private long blockedDialogsUntil;
    public final boolean bot;
    private TLRPC.User botUser;
    private BotWebViewProxy botWebViewProxy;
    private String buttonData;
    private BottomSheet cameraBottomSheet;
    private int currentAccount;
    private AlertDialog currentDialog;
    private String currentPaymentSlug;
    private Delegate delegate;
    private int dialogSequentialOpenTimes;
    private BotDownloads downloads;
    private final CellFlickerDrawable flickerDrawable;
    private BackupImageView flickerView;
    private int flickerViewColor;
    private boolean flickerViewColorOverriden;
    private SvgHelper.SvgDrawable flickerViewDrawable;
    private int forceHeight;
    private boolean hasQRPending;
    private boolean hasUserPermissions;
    private boolean isBackButtonVisible;
    private boolean isFlickeringCenter;
    private boolean isPageLoaded;
    private boolean isRequestingPageOpen;
    private boolean isSettingsButtonVisible;
    private boolean isViewPortByMeasureSuppressed;
    private boolean keyboardFocusable;
    private int lastButtonColor;
    private String lastButtonText;
    private int lastButtonTextColor;
    private long lastClickMs;
    private long lastDialogClosed;
    private long lastDialogCooldownTime;
    private int lastDialogType;
    private boolean lastExpanded;
    private final Rect lastInsets;
    private int lastInsetsTopMargin;
    private long lastPostStoryMs;
    private String lastQrText;
    private int lastSecondaryButtonColor;
    private String lastSecondaryButtonPosition;
    private String lastSecondaryButtonText;
    private int lastSecondaryButtonTextColor;
    private int lastViewportHeightReported;
    private boolean lastViewportIsExpanded;
    private boolean lastViewportStateStable;
    private BotLocation location;
    private ValueCallback mFilePathCallback;
    private String mUrl;
    private final Runnable notifyLocationChecked;
    private Runnable onCloseListener;
    private Runnable onPermissionsRequestResultCallback;
    private Utilities.Callback4 onVerifiedAge;
    private MyWebView opener;
    private Activity parentActivity;
    private boolean preserving;
    private Theme.ResourcesProvider resourcesProvider;
    private String secondaryButtonData;
    private BotStorage secureStorage;
    private BotSensors sensors;
    private int shownDialogsCount;
    private BotStorage storage;
    private final int tag;
    private String trustedOrigin;
    private float viewPortHeightOffset;
    private boolean wasFocusable;
    private WebViewRequestProps wasOpenedByBot;
    private boolean wasOpenedByLinkIntent;
    private MyWebView webView;
    private boolean webViewNotAvailable;
    private TextView webViewNotAvailableText;
    private Consumer webViewProgressListener;
    private WebViewProxy webViewProxy;
    private WebViewScrollListener webViewScrollListener;

    public interface WebViewScrollListener {
        void onWebViewScrolled(WebView webView, int i, int i2);
    }

    protected void onErrorShown(boolean z, int i, String str) {
    }

    protected void onFaviconChanged(Bitmap bitmap) {
    }

    protected void onTitleChanged(String str) {
    }

    protected void onURLChanged(String str, boolean z, boolean z2) {
    }

    public void onWebViewCreated(MyWebView myWebView) {
    }

    public void onWebViewDestroyed(MyWebView myWebView) {
    }

    static int access$1408() {
        int i = tags;
        tags = i + 1;
        return i;
    }

    public void showLinkCopiedBulletin() {
        BulletinFactory.of(this, this.resourcesProvider).createCopyLinkBulletin().show(true);
    }

    public BotWebViewContainer(Context context, Theme.ResourcesProvider resourcesProvider, int i, boolean z) {
        super(context);
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.flickerDrawable = cellFlickerDrawable;
        int i2 = Theme.key_featuredStickers_addButton;
        this.lastButtonColor = getColor(i2);
        int i3 = Theme.key_featuredStickers_buttonText;
        this.lastButtonTextColor = getColor(i3);
        this.lastButtonText = "";
        this.lastSecondaryButtonColor = getColor(i2);
        this.lastSecondaryButtonTextColor = getColor(i3);
        this.lastSecondaryButtonText = "";
        this.lastSecondaryButtonPosition = "";
        this.currentAccount = UserConfig.selectedAccount;
        this.forceHeight = -1;
        this.lastInsets = new Rect(0, 0, 0, 0);
        this.lastInsetsTopMargin = 0;
        this.notifyLocationChecked = new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer botWebViewContainer = this.f$0;
                botWebViewContainer.notifyEvent("location_checked", botWebViewContainer.location.checkObject());
            }
        };
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
        cellFlickerDrawable.setColors(i, 153, 204);
        BackupImageView backupImageView = new BackupImageView(context) {
            {
                this.imageReceiver = new C00471(this);
            }

            class C00471 extends ImageReceiver {
                C00471(View view) {
                    super(view);
                }

                @Override
                protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                    boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BotWebViewContainer.AnonymousClass1.C00471.m5056$r8$lambda$4NXBzkF8fPM_vGYaKqx5b49NP0(this.f$0, valueAnimator);
                        }
                    });
                    duration.start();
                    return imageBitmapByKey;
                }

                public static void m5056$r8$lambda$4NXBzkF8fPM_vGYaKqx5b49NP0(C00471 c00471, ValueAnimator valueAnimator) {
                    ((BackupImageView) AnonymousClass1.this).imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    c00471.invalidate();
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                if (BotWebViewContainer.this.isFlickeringCenter) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable = this.imageReceiver.getDrawable();
                if (drawable != null) {
                    this.imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), drawable.getIntrinsicHeight() * (getWidth() / drawable.getIntrinsicWidth()));
                    this.imageReceiver.draw(canvas);
                }
            }
        };
        this.flickerView = backupImageView;
        int color = getColor(Theme.key_bot_loadingIcon);
        this.flickerViewColor = color;
        backupImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.flickerView.getImageReceiver().setAspectFit(true);
        addView(this.flickerView, LayoutHelper.createFrame(-1, -2, 48));
        TextView textView = new TextView(context);
        this.webViewNotAvailableText = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        this.webViewNotAvailableText.setTextColor(getColor(Theme.key_windowBackgroundWhiteGrayText));
        this.webViewNotAvailableText.setTextSize(1, 15.0f);
        this.webViewNotAvailableText.setGravity(17);
        this.webViewNotAvailableText.setVisibility(8);
        int iDp = AndroidUtilities.dp(16.0f);
        this.webViewNotAvailableText.setPadding(iDp, iDp, iDp, iDp);
        addView(this.webViewNotAvailableText, LayoutHelper.createFrame(-1, -2, 17));
        setFocusable(false);
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.isViewPortByMeasureSuppressed = z;
    }

    public void setFlickerViewColor(int i) {
        int iAdaptHSV;
        if (AndroidUtilities.computePerceivedBrightness(i) > 0.7f) {
            iAdaptHSV = Theme.adaptHSV(i, 0.0f, -0.15f);
        } else {
            iAdaptHSV = Theme.adaptHSV(i, 0.025f, 0.15f);
        }
        if (this.flickerViewColor == iAdaptHSV) {
            return;
        }
        BackupImageView backupImageView = this.flickerView;
        this.flickerViewColor = iAdaptHSV;
        backupImageView.setColorFilter(new PorterDuffColorFilter(iAdaptHSV, PorterDuff.Mode.SRC_IN));
        SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
        }
        this.flickerViewColorOverriden = true;
        this.flickerView.invalidate();
        invalidate();
    }

    public void checkCreateWebView() {
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
            if (this.webView != null) {
                removeView(this.webView);
            }
        }
    }

    public void replaceWebView(int i, MyWebView myWebView, Object obj) {
        this.currentAccount = i;
        setupWebView(myWebView, obj);
        if (this.bot) {
            notifyEvent("visibility_changed", obj("is_visible", Boolean.TRUE));
        }
    }

    private void setupWebView(MyWebView myWebView) {
        setupWebView(myWebView, null);
    }

    public BotWebViewProxy getBotProxy() {
        return this.botWebViewProxy;
    }

    public WebViewProxy getProxy() {
        return this.webViewProxy;
    }

    public void setOpener(MyWebView myWebView) {
        MyWebView myWebView2;
        this.opener = myWebView;
        if (this.bot || (myWebView2 = this.webView) == null) {
            return;
        }
        myWebView2.opener = myWebView;
    }

    private static String capitalizeFirst(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private void setupWebView(MyWebView myWebView, Object obj) {
        MyWebView myWebView2;
        String str;
        TLRPC.User user;
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.destroy();
            removeView(this.webView);
        }
        if (myWebView != null) {
            AndroidUtilities.removeFromParent(myWebView);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !isVerifyingAge());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (myWebView == null) {
            Context context = getContext();
            boolean z = this.bot;
            myWebView2 = new MyWebView(context, z, (!z || (user = this.botUser) == null) ? 0L : user.id);
        } else {
            myWebView2 = myWebView;
        }
        this.webView = myWebView2;
        if (!this.bot) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.webView, true);
            CookieManager.getInstance().flush();
            this.webView.opener = this.opener;
        } else {
            myWebView2.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
        }
        if (!MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur) {
            this.webView.setLayerType(2, null);
        }
        this.webView.setContainers(this, this.webViewScrollListener);
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
        if (isVerifyingAge()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String strReplace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb = new StringBuilder();
            sb.append("(Linux; Android ");
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
                strReplaceAll = strReplaceAll + " Telegram-Android/" + packageInfo.versionName + " (" + capitalizeFirst(Build.MANUFACTURER) + " " + Build.MODEL + "; Android " + str2 + "; SDK " + Build.VERSION.SDK_INT + "; " + str + ")";
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
                BotWebViewProxy botWebViewProxy2 = new BotWebViewProxy(this);
                this.botWebViewProxy = botWebViewProxy2;
                this.webView.addJavascriptInterface(botWebViewProxy2, "TelegramWebviewProxy");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(botWebViewProxy, "TelegramWebviewProxy");
            }
            this.botWebViewProxy.setContainer(this);
        } else {
            if (obj instanceof WebViewProxy) {
                this.webViewProxy = (WebViewProxy) obj;
            }
            WebViewProxy webViewProxy = this.webViewProxy;
            if (webViewProxy == null) {
                WebViewProxy webViewProxy2 = new WebViewProxy(this.webView, this);
                this.webViewProxy = webViewProxy2;
                this.webView.addJavascriptInterface(webViewProxy2, "TelegramWebviewProxy");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(webViewProxy, "TelegramWebviewProxy");
            }
            this.webViewProxy.setContainer(this);
        }
        onWebViewCreated(this.webView);
        firstWebView = false;
    }

    public void onOpenUri(Uri uri) {
        onOpenUri(uri, null, !this.bot, false, false);
    }

    private void onOpenUri(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (this.isRequestingPageOpen) {
            return;
        }
        if (System.currentTimeMillis() - this.lastClickMs <= 10000 || !z2) {
            this.lastClickMs = 0L;
            boolean[] zArr = {false};
            if (Browser.isInternalUri(uri, zArr) && !zArr[0] && this.delegate != null) {
                setKeyboardFocusable(false);
            }
            Browser.openUrl(getContext(), uri, true, z, false, null, str, false, true, z3);
        }
    }

    private void updateKeyboardFocusable() {
        if (this.wasFocusable) {
            setDescendantFocusability(393216);
            setFocusable(false);
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setDescendantFocusability(393216);
                this.webView.clearFocus();
            }
            AndroidUtilities.hideKeyboard(this);
        }
        this.wasFocusable = false;
    }

    public void setKeyboardFocusable(boolean z) {
        this.keyboardFocusable = z;
        updateKeyboardFocusable();
    }

    public static int getMainButtonRippleColor(int i) {
        return ColorUtils.calculateLuminance(i) >= 0.30000001192092896d ? 301989888 : 385875967;
    }

    public static Drawable getMainButtonRippleDrawable(int i) {
        return Theme.createSelectorWithBackgroundDrawable(i, getMainButtonRippleColor(i));
    }

    public void updateFlickerBackgroundColor(int i) {
        this.flickerDrawable.setColors(i, 153, 204);
    }

    public boolean onBackPressed() {
        if (this.webView == null || !this.isBackButtonVisible) {
            return false;
        }
        notifyEvent("back_button_pressed", null);
        return true;
    }

    public void setPageLoaded(String str, boolean z) {
        MyWebView myWebView = this.webView;
        String str2 = (myWebView == null || !myWebView.dangerousUrl) ? str : myWebView.urlFallback;
        boolean z2 = myWebView == null || !myWebView.canGoBack();
        MyWebView myWebView2 = this.webView;
        onURLChanged(str2, z2, myWebView2 == null || !myWebView2.canGoForward());
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.isPageLoaded = true;
            updateKeyboardFocusable();
        }
        if (this.isPageLoaded) {
            d("setPageLoaded: already loaded");
            return;
        }
        if (z && this.webView != null && this.flickerView != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.webView, (Property<MyWebView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.flickerView, (Property<BackupImageView, Float>) property, 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewContainer.this.flickerView.setVisibility(8);
                }
            });
            animatorSet.start();
        } else {
            MyWebView myWebView4 = this.webView;
            if (myWebView4 != null) {
                myWebView4.setAlpha(1.0f);
            }
            BackupImageView backupImageView = this.flickerView;
            if (backupImageView != null) {
                backupImageView.setAlpha(0.0f);
                this.flickerView.setVisibility(8);
            }
        }
        this.mUrl = str;
        d("setPageLoaded: isPageLoaded = true!");
        this.isPageLoaded = true;
        updateKeyboardFocusable();
        this.delegate.onWebAppReady();
    }

    public void setState(boolean z, String str) {
        d("setState(" + z + ", " + str + ")");
        this.isPageLoaded = z;
        this.mUrl = str;
        updateKeyboardFocusable();
    }

    public void setIsBackButtonVisible(boolean z) {
        this.isBackButtonVisible = z;
    }

    public String getUrlLoaded() {
        return this.mUrl;
    }

    public boolean hasUserPermissions() {
        return this.hasUserPermissions;
    }

    public void setBotUser(TLRPC.User user) {
        this.botUser = user;
    }

    public void runWithPermissions(final String[] strArr, final Consumer consumer) {
        if (Build.VERSION.SDK_INT < 23) {
            consumer.accept(Boolean.TRUE);
            return;
        }
        if (checkPermissions(strArr)) {
            consumer.accept(Boolean.TRUE);
            return;
        }
        this.onPermissionsRequestResultCallback = new Runnable() {
            @Override
            public final void run() {
                consumer.accept(Boolean.valueOf(this.f$0.checkPermissions(strArr)));
            }
        };
        Activity activity = this.parentActivity;
        if (activity != null) {
            activity.requestPermissions(strArr, 4000);
        }
    }

    public boolean isPageLoaded() {
        return this.isPageLoaded;
    }

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

    private boolean checkPermissions(String[] strArr) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    public void restoreButtonData() {
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

    public void onInvoiceStatusUpdate(String str, String str2) {
        onInvoiceStatusUpdate(str, str2, false);
    }

    public void onInvoiceStatusUpdate(String str, String str2, boolean z) {
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

    public void onSettingsButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("settings_button_pressed", null);
    }

    public void onMainButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("main_button_pressed", null);
    }

    public void onSecondaryButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("secondary_button_pressed", null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Runnable runnable;
        if (i != 4000 || (runnable = this.onPermissionsRequestResultCallback) == null) {
            return;
        }
        runnable.run();
        this.onPermissionsRequestResultCallback = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 3000 || this.mFilePathCallback == null) {
            return;
        }
        if (i2 != -1 || intent == null) {
            uriArr = null;
        } else {
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                uriArr = new Uri[clipData.getItemCount()];
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    uriArr[i3] = clipData.getItemAt(i3).getUri();
                }
            } else if (intent.getData() != null) {
                uriArr = new Uri[]{intent.getData()};
            } else {
                uriArr = null;
            }
        }
        this.mFilePathCallback.onReceiveValue(uriArr);
        this.mFilePathCallback = null;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isViewPortByMeasureSuppressed) {
            return;
        }
        invalidateViewPortHeight(true);
    }

    public void invalidateViewPortHeight() {
        invalidateViewPortHeight(false);
    }

    public void invalidateViewPortHeight(boolean z) {
        invalidateViewPortHeight(z, false);
    }

    public int getMinHeight() {
        if (!(getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            return 0;
        }
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
        if (webViewSwipeContainer.isFullSize()) {
            return (int) ((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) + this.viewPortHeightOffset);
        }
        return 0;
    }

    public void setViewPortHeightOffset(float f) {
        this.viewPortHeightOffset = f;
    }

    public void invalidateViewPortHeight(boolean z, boolean z2) {
        invalidate();
        if ((this.isPageLoaded || z2) && this.bot && (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
            if (z) {
                this.lastExpanded = webViewSwipeContainer.getSwipeOffsetY() == (-webViewSwipeContainer.getOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY();
            }
            int iMax = Math.max(getMinHeight(), (int) (((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) - webViewSwipeContainer.getSwipeOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY() + this.viewPortHeightOffset));
            if (!z2 && iMax == this.lastViewportHeightReported && this.lastViewportStateStable == z && this.lastViewportIsExpanded == this.lastExpanded) {
                return;
            }
            this.lastViewportHeightReported = iMax;
            this.lastViewportStateStable = z;
            this.lastViewportIsExpanded = this.lastExpanded;
            notifyEvent_fast("viewport_changed", "{height:" + (iMax / AndroidUtilities.density) + ",is_state_stable:" + z + ",is_expanded:" + this.lastExpanded + "}");
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
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
                this.flickerDrawable.draw(canvas, rectF, 0.0f, this);
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

    public void setForceHeight(int i) {
        if (this.forceHeight == i) {
            return;
        }
        this.forceHeight = i;
        requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = this.forceHeight;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        this.flickerDrawable.setParentWidth(getMeasuredWidth());
    }

    public void setWebViewProgressListener(Consumer consumer) {
        this.webViewProgressListener = consumer;
    }

    public MyWebView getWebView() {
        return this.webView;
    }

    public void loadFlickerAndSettingsItem(int i, long j, ActionBarMenuSubItem actionBarMenuSubItem) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            this.flickerView.setImage(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(getColor(Theme.key_windowBackgroundGray))));
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
                this.flickerView.setVisibility(0);
                this.flickerView.setAlpha(1.0f);
                this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.flickerViewDrawable = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.flickerViewColor);
                this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
            }
            this.flickerView.setImage(null, null, this.flickerViewDrawable);
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
        this.flickerView.setVisibility(0);
        this.flickerView.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.flickerViewDrawable = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
        }
        this.flickerView.setImage(null, null, this.flickerViewDrawable);
        setupFlickerParams(true);
    }

    private void setupFlickerParams(boolean z) {
        this.isFlickeringCenter = z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.flickerView.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int iDp = AndroidUtilities.dp(100.0f);
            layoutParams.height = iDp;
            layoutParams.width = iDp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        this.flickerView.requestLayout();
    }

    public void reload() {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$yppCkL3c8nWAT3OIteCr5HwtJ_s(this.f$0);
            }
        });
    }

    public static void $r8$lambda$yppCkL3c8nWAT3OIteCr5HwtJ_s(BotWebViewContainer botWebViewContainer) {
        if (botWebViewContainer.isSettingsButtonVisible) {
            botWebViewContainer.isSettingsButtonVisible = false;
            Delegate delegate = botWebViewContainer.delegate;
            if (delegate != null) {
                delegate.onSetSettingsButtonVisible(false);
            }
        }
        botWebViewContainer.checkCreateWebView();
        botWebViewContainer.isPageLoaded = false;
        botWebViewContainer.lastClickMs = 0L;
        botWebViewContainer.hasUserPermissions = false;
        MyWebView myWebView = botWebViewContainer.webView;
        if (myWebView != null) {
            myWebView.onResume();
            botWebViewContainer.webView.reload();
        }
        botWebViewContainer.updateKeyboardFocusable();
        BotSensors botSensors = botWebViewContainer.sensors;
        if (botSensors != null) {
            botSensors.stopAll();
        }
    }

    public void loadUrl(int i, String str) {
        loadUrl(i, str, false);
    }

    public void loadUrl(int i, final String str, boolean z) {
        this.currentAccount = i;
        NotificationCenter.getInstance(i).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.m5047$r8$lambda$QLgWOeqntRncImNGyrUmTw1lDo(this.f$0, str);
            }
        });
    }

    public static void m5047$r8$lambda$QLgWOeqntRncImNGyrUmTw1lDo(BotWebViewContainer botWebViewContainer, String str) {
        botWebViewContainer.isPageLoaded = false;
        botWebViewContainer.lastClickMs = 0L;
        botWebViewContainer.hasUserPermissions = false;
        botWebViewContainer.mUrl = str;
        botWebViewContainer.checkCreateWebView();
        MyWebView myWebView = botWebViewContainer.webView;
        if (myWebView != null) {
            myWebView.onResume();
            botWebViewContainer.webView.loadUrl(str);
        }
        botWebViewContainer.updateKeyboardFocusable();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                if (!(BotWebViewContainer.this.getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
                    return 0;
                }
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) BotWebViewContainer.this.getParent();
                return (int) ((webViewSwipeContainer.getOffsetY() + webViewSwipeContainer.getSwipeOffsetY()) - webViewSwipeContainer.getTopActionBarOffsetY());
            }
        });
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.removeDelegate(this);
    }

    public void preserveWebView() {
        d("preserveWebView");
        this.preserving = true;
        if (this.bot) {
            notifyEvent("visibility_changed", obj("is_visible", Boolean.FALSE));
        }
    }

    public void destroyWebView() {
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
            updateKeyboardFocusable();
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
                botLocation.unlisten(this.notifyLocationChecked);
                this.location = null;
            }
        }
    }

    public void resetWebView() {
        this.webView = null;
    }

    public boolean isBackButtonVisible() {
        return this.isBackButtonVisible;
    }

    public void evaluateJs(final String str, final boolean z) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$hldEizPj3DzLqaHt9ylkEY_RJqk(this.f$0, z, str);
            }
        });
    }

    public static void $r8$lambda$hldEizPj3DzLqaHt9ylkEY_RJqk(BotWebViewContainer botWebViewContainer, boolean z, String str) {
        if (z) {
            botWebViewContainer.checkCreateWebView();
        }
        MyWebView myWebView = botWebViewContainer.webView;
        if (myWebView == null) {
            return;
        }
        myWebView.evaluateJS(str);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetNewTheme) {
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            }
            if (!this.flickerViewColorOverriden) {
                BackupImageView backupImageView = this.flickerView;
                int i3 = Theme.key_bot_loadingIcon;
                int color = getColor(i3);
                this.flickerViewColor = color;
                backupImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.flickerViewColor);
                    this.flickerViewDrawable.setupGradient(i3, this.resourcesProvider, 1.0f, false);
                }
                this.flickerView.invalidate();
            }
            notifyThemeChanged();
            return;
        }
        if (i == NotificationCenter.onActivityResultReceived) {
            onActivityResult(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2]);
        } else if (i == NotificationCenter.onRequestPermissionResultReceived) {
            onRequestPermissionsResult(((Integer) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
        }
    }

    public void notifyThemeChanged() {
        notifyEvent("theme_changed", buildThemeParams());
    }

    public void notifyEvent(String str, JSONObject jSONObject) {
        d("notifyEvent " + str);
        evaluateJs("window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", false);
    }

    private void notifyEvent_fast(String str, String str2) {
        evaluateJs("window.Telegram.WebView.receiveEvent('" + str + "', " + str2 + ");", false);
    }

    private static void notifyEvent(int i, final MyWebView myWebView, final String str, final JSONObject jSONObject) {
        if (myWebView == null) {
            return;
        }
        NotificationCenter.getInstance(i).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                myWebView.evaluateJS("window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");");
            }
        });
    }

    public void setWebViewScrollListener(WebViewScrollListener webViewScrollListener) {
        this.webViewScrollListener = webViewScrollListener;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.setContainers(this, webViewScrollListener);
        }
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.onCloseListener = runnable;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.setCloseListener(runnable);
        }
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.wasOpenedByLinkIntent = z;
    }

    public void setWasOpenedByBot(WebViewRequestProps webViewRequestProps) {
        this.wasOpenedByBot = webViewRequestProps;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void onWebEventReceived(String str, String str2) {
        boolean zOptBoolean;
        boolean zOptBoolean2 = true;
        if (this.bot || this.delegate == null) {
            return;
        }
        if (this.trustedOrigin != null && !TextUtils.equals(getOriginHost(), this.trustedOrigin)) {
            d("onWebEventReceived ignore " + str);
        }
        d("onWebEventReceived " + str + " " + str2);
        str.getClass();
        switch (str) {
            case "actionBarColor":
            case "navigationBarColor":
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean zEquals = TextUtils.equals(str, "actionBarColor");
                    int iArgb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    MyWebView myWebView = this.webView;
                    if (myWebView != null) {
                        if (zEquals) {
                            myWebView.lastActionBarColorGot = true;
                            myWebView.lastActionBarColor = iArgb;
                        } else {
                            myWebView.lastBackgroundColorGot = true;
                            myWebView.lastBackgroundColor = iArgb;
                        }
                        myWebView.saveHistory();
                    }
                    this.delegate.onWebAppBackgroundChanged(zEquals, iArgb);
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
            case "oauth_request":
                d("oauth_request " + str2);
                if (this.webView != null) {
                    final String originHost = getOriginHost();
                    if (!TextUtils.isEmpty(originHost)) {
                        try {
                            final String strOptString = new JSONObject(str2).optString("url");
                            notifyEvent("oauth_supported", obj("version", 1));
                            if (!TextUtils.isEmpty(strOptString)) {
                                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                tL_messages_requestUrlAuth.url = strOptString;
                                int i = tL_messages_requestUrlAuth.flags;
                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                tL_messages_requestUrlAuth.flags = i | 12;
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestUrlAuth, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        BotWebViewContainer.$r8$lambda$_gCnj99tTTkm8jpqLyEwBPS4Sy0(this.f$0, tL_messages_requestUrlAuth, strOptString, originHost, tLObject, tL_error);
                                    }
                                }, 2);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    }
                }
                break;
            case "siteName":
                d("siteName " + str2);
                MyWebView myWebView2 = this.webView;
                if (myWebView2 != null) {
                    myWebView2.lastSiteName = str2;
                    myWebView2.saveHistory();
                    break;
                }
                break;
            case "allowScroll":
                try {
                    JSONArray jSONArray2 = new JSONArray(str2);
                    zOptBoolean = jSONArray2.optBoolean(0, true);
                    try {
                        zOptBoolean2 = jSONArray2.optBoolean(1, true);
                        break;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    zOptBoolean = true;
                }
                if (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                    ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(zOptBoolean, zOptBoolean2);
                    break;
                }
                break;
        }
    }

    public static void $r8$lambda$_gCnj99tTTkm8jpqLyEwBPS4Sy0(final BotWebViewContainer botWebViewContainer, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$gLvgno8HWN7WFUumK9szgGP3OTk(this.f$0, tLObject, tL_messages_requestUrlAuth, str, tL_error, str2);
            }
        });
    }

    public static void $r8$lambda$gLvgno8HWN7WFUumK9szgGP3OTk(BotWebViewContainer botWebViewContainer, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        botWebViewContainer.getClass();
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), Theme.getColor(Theme.key_undo_cancelColor, botWebViewContainer.resourcesProvider))).show();
                    return;
                } else {
                    BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError(tL_error);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            OAuthSheet.handle(false, botWebViewContainer.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, botWebViewContainer);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            OAuthSheet.handle(false, botWebViewContainer.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, botWebViewContainer);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            AlertsCreator.showOpenUrlAlert(botWebViewContainer.getContext(), str, false, true, true, false, 0L, (Browser.Progress) null, (Theme.ResourcesProvider) null);
        }
    }

    public void setTrustedOrigin(String str) {
        this.trustedOrigin = getOriginHost(str);
    }

    public String getOriginHost() {
        MyWebView myWebView = this.webView;
        if (myWebView == null) {
            return null;
        }
        return getOriginHost(myWebView.getUrl());
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

    public void onEventReceived(final BotWebViewProxy botWebViewProxy, String str, String str2) throws JSONException {
        boolean z;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        byte b;
        int i;
        int i2;
        String string;
        String string2;
        long j;
        final String strOptString;
        TextView textView;
        TextView textView2;
        TextView textView3;
        byte b2;
        byte b3;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        BotWebViewVibrationEffect botWebViewVibrationEffect2;
        byte b4;
        int color;
        String string3;
        boolean zOptBoolean3;
        LaunchActivity launchActivity;
        BottomSheetTabs.WebTabData webTabData;
        BottomSheet bottomSheet;
        long j2;
        int i3;
        long j3;
        String strOptString2;
        final String strOptString3;
        final String strOptString4;
        String str3;
        final String strOptString5;
        boolean zOptBoolean4;
        String str4;
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
            long j4 = 1000;
            switch (str) {
                case "web_app_invoke_custom_method":
                    if (this.botUser != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            final String string4 = jSONObject.getString("req_id");
                            String string5 = jSONObject.getString("method");
                            String string6 = jSONObject.get("params").toString();
                            final int i4 = this.currentAccount;
                            final MyWebView myWebView = this.webView;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i4).getInputUser(this.botUser.id);
                            invokewebviewcustommethod.custom_method = string5;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = string6;
                            ConnectionsManager.getInstance(i4).sendRequest(invokewebviewcustommethod, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    BotWebViewContainer.$r8$lambda$Px_Q2zhpAOt1oomXNevljxIeJF4(this.f$0, string4, i4, myWebView, tLObject, tL_error);
                                }
                            });
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            if (e instanceof JSONException) {
                                error("JSON Parse error");
                                return;
                            } else {
                                unknownError();
                                return;
                            }
                        }
                    }
                    break;
                case "web_app_close_scan_qr_popup":
                    if (this.hasQRPending && (bottomSheet = this.cameraBottomSheet) != null) {
                        bottomSheet.dismiss();
                        break;
                    }
                    break;
                case "web_app_biometry_get_info":
                    notifyBiometryReceived();
                    break;
                case "web_app_open_link":
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
                case "web_app_request_file_download":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (this.downloads == null) {
                            this.downloads = BotDownloads.get(getContext(), this.currentAccount, this.botUser.id);
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(str2);
                            final String string7 = jSONObject3.getString("url");
                            final String string8 = jSONObject3.getString("file_name");
                            if (this.downloads.getCached(string7) != null) {
                                this.downloads.download(string7, string8);
                                notifyEvent("file_download_requested", obj("status", "downloading"));
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                                checkdownloadfileparams.file_name = string8;
                                checkdownloadfileparams.url = string7;
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkdownloadfileparams, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        BotWebViewContainer.m5048$r8$lambda$WqHrRe09XgNKOj_EupP91AFOM(this.f$0, string7, string8, tLObject, tL_error);
                                    }
                                });
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            notifyEvent("file_download_requested", obj("status", "cancelled"));
                            return;
                        }
                        break;
                    }
                    break;
                case "web_app_open_popup":
                    try {
                        if (this.currentDialog == null) {
                            if (System.currentTimeMillis() - this.lastDialogClosed <= 150) {
                                int i5 = this.dialogSequentialOpenTimes + 1;
                                this.dialogSequentialOpenTimes = i5;
                                if (i5 >= 3) {
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
                                AlertDialog.Builder message = new AlertDialog.Builder(getContext()).setTitle(strOptString7).setMessage(string9);
                                ArrayList arrayList = new ArrayList();
                                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                    arrayList.add(new PopupButton(jSONArray.getJSONObject(i6)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final PopupButton popupButton = (PopupButton) arrayList.get(0);
                                        message.setPositiveButton(popupButton.text, new AlertDialog.OnButtonClickListener() {
                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.$r8$lambda$3uV12iotRBDF6BS6ArYlbsMUAK4(this.f$0, popupButton, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final PopupButton popupButton2 = (PopupButton) arrayList.get(1);
                                        message.setNegativeButton(popupButton2.text, new AlertDialog.OnButtonClickListener() {
                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.$r8$lambda$JuUcgfOvF9aqBlSw2AXWFR7bBAY(this.f$0, popupButton2, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final PopupButton popupButton3 = (PopupButton) arrayList.get(2);
                                        message.setNeutralButton(popupButton3.text, new AlertDialog.OnButtonClickListener() {
                                            @Override
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.$r8$lambda$yYhdJGFo6OivjOfA9q_VQKNZDtk(this.f$0, popupButton3, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    message.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                        @Override
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            BotWebViewContainer.$r8$lambda$jLTVU7PRvXCJRaw7MRUCEb7qZ4c(this.f$0, atomicBoolean, dialogInterface);
                                        }
                                    });
                                    this.currentDialog = message.show();
                                    if (arrayList.size() >= 1) {
                                        PopupButton popupButton4 = (PopupButton) arrayList.get(0);
                                        if (popupButton4.textColorKey >= 0 && (textView3 = (TextView) this.currentDialog.getButton(-1)) != null) {
                                            textView3.setTextColor(getColor(popupButton4.textColorKey));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        PopupButton popupButton5 = (PopupButton) arrayList.get(1);
                                        if (popupButton5.textColorKey >= 0 && (textView2 = (TextView) this.currentDialog.getButton(-2)) != null) {
                                            textView2.setTextColor(getColor(popupButton5.textColorKey));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        PopupButton popupButton6 = (PopupButton) arrayList.get(2);
                                        if (popupButton6.textColorKey >= 0 && (textView = (TextView) this.currentDialog.getButton(-3)) != null) {
                                            textView.setTextColor(getColor(popupButton6.textColorKey));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    } catch (JSONException e4) {
                        FileLog.e(e4);
                        return;
                    }
                    break;
                case "web_app_open_invoice":
                    try {
                        final String strOptString8 = new JSONObject(str2).optString("slug");
                        if (this.currentPaymentSlug != null) {
                            onInvoiceStatusUpdate(strOptString8, "cancelled", true);
                        } else {
                            this.currentPaymentSlug = strOptString8;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = strOptString8;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    BotWebViewContainer.$r8$lambda$GXU5ScDLKzxoUJ4WEi70ns4vfcs(this.f$0, strOptString8, tL_inputInvoiceSlug, tLObject, tL_error);
                                }
                            });
                        }
                        break;
                    } catch (JSONException e5) {
                        FileLog.e(e5);
                        return;
                    }
                    break;
                case "web_app_set_emoji_status":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j2 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i3 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i3 = 0;
                            }
                        } catch (Exception unused2) {
                            j2 = 0;
                        }
                        long j5 = j2;
                        TLRPC.User user = this.botUser;
                        if (user == null) {
                            notifyEvent("emoji_status_failed", obj("error", "UNKNOWN_ERROR"));
                        } else {
                            SetupEmojiStatusSheet.show(this.currentAccount, user, j5, i3, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    BotWebViewContainer.$r8$lambda$Nzp7Q0ZEfplSKtY29NHByVbRsm8(this.f$0, (String) obj, (TLRPC.Document) obj2);
                                }
                            });
                        }
                        break;
                    }
                    break;
                case "web_app_setup_secondary_button":
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean zOptBoolean6 = jSONObject6.optBoolean("is_active", false);
                        String strTrim = jSONObject6.optString("text", this.lastSecondaryButtonText).trim();
                        boolean z2 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(strTrim);
                        int color2 = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : this.lastSecondaryButtonColor;
                        int color3 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : this.lastSecondaryButtonTextColor;
                        boolean z3 = jSONObject6.optBoolean("is_progress_visible", false) && z2;
                        boolean z4 = jSONObject6.optBoolean("has_shine_effect", false) && z2;
                        String strOptString9 = jSONObject6.has("position") ? jSONObject6.optString("position") : this.lastSecondaryButtonPosition;
                        if (strOptString9 == null) {
                            strOptString9 = "left";
                        }
                        try {
                            j3 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j3 = 0;
                        }
                        this.lastSecondaryButtonColor = color2;
                        this.lastSecondaryButtonTextColor = color3;
                        this.lastSecondaryButtonText = strTrim;
                        this.lastSecondaryButtonPosition = strOptString9;
                        this.secondaryButtonData = str2;
                        this.delegate.onSetupSecondaryButton(z2, zOptBoolean6, strTrim, j3, color2, color3, z3, z4, strOptString9);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                    break;
                case "web_app_setup_closing_behavior":
                    try {
                        this.delegate.onWebAppSetupClosingBehavior(new JSONObject(str2).optBoolean("need_confirmation"));
                        break;
                    } catch (JSONException e7) {
                        FileLog.e(e7);
                        return;
                    }
                    break;
                case "web_app_open_scan_qr_popup":
                    try {
                        if (!this.hasQRPending && this.parentActivity != null) {
                            this.lastQrText = new JSONObject(str2).optString("text");
                            this.hasQRPending = true;
                            if (Build.VERSION.SDK_INT >= 23 && this.parentActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                                NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                                    @Override
                                    public void didReceivedNotification(int i7, int i8, Object... objArr) {
                                        int i9 = NotificationCenter.onRequestPermissionResultReceived;
                                        if (i7 == i9) {
                                            int iIntValue = ((Integer) objArr[0]).intValue();
                                            int[] iArr = (int[]) objArr[2];
                                            if (iIntValue == 5000) {
                                                NotificationCenter.getGlobalInstance().removeObserver(this, i9);
                                                if (iArr[0] == 0) {
                                                    BotWebViewContainer.this.openQrScanActivity();
                                                } else {
                                                    BotWebViewContainer.this.notifyEvent("scan_qr_popup_closed", new JSONObject());
                                                }
                                            }
                                        }
                                    }
                                }, NotificationCenter.onRequestPermissionResultReceived);
                                this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                            } else {
                                openQrScanActivity();
                            }
                        }
                        break;
                    } catch (JSONException e8) {
                        FileLog.e(e8);
                        return;
                    }
                    break;
                case "web_app_request_phone":
                    if (ignoreDialog(4)) {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            notifyEvent("phone_requested", jSONObject7);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                        break;
                    } else {
                        final int i7 = this.currentAccount;
                        final MyWebView myWebView2 = this.webView;
                        final String[] strArr = {"cancelled"};
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                        builder.setTitle(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.botUser);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        final boolean z5 = MessagesController.getInstance(this.currentAccount).blockePeers.indexOfKey(this.botUser.id) >= 0;
                        if (z5) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        builder.setMessage(spannableStringBuilder);
                        builder.setPositiveButton(LocaleController.getString(R.string.ShareContact), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i8) {
                                BotWebViewContainer.$r8$lambda$yLJ5XEHe1w4zqF_UeZHEIhuUebg(this.f$0, strArr, z5, i7, myWebView2, alertDialog, i8);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i8) {
                                alertDialog.dismiss();
                            }
                        });
                        showDialog(4, builder.create(), new Runnable() {
                            @Override
                            public final void run() {
                                BotWebViewContainer.m5050$r8$lambda$Y9Ca0W75ZkbjgWhRuPbDHpLiI(strArr, i7, myWebView2);
                            }
                        });
                        break;
                    }
                    break;
                case "web_app_request_theme":
                    notifyThemeChanged();
                    break;
                case "web_app_secure_storage_get_key":
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context = getContext();
                            int i8 = this.currentAccount;
                            this.secureStorage = new BotStorage(context, i8, UserConfig.getInstance(i8).getClientUserId(), this.botUser.id, true);
                        }
                        getStorageKey(this.secureStorage, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case "web_app_check_location":
                    if (this.location == null) {
                        BotLocation botLocation = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                        this.location = botLocation;
                        botLocation.listen(this.notifyLocationChecked);
                    }
                    this.notifyLocationChecked.run();
                    break;
                case "web_app_biometry_open_settings":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
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
                case "web_app_request_viewport":
                    invalidateViewPortHeight(!((getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) && ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).isSwipeInProgress()), true);
                    break;
                case "web_app_request_emoji_status_access":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        SetupEmojiStatusSheet.askPermission(this.currentAccount, this.botUser.id, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                BotWebViewContainer.$r8$lambda$Eb2qCGsLekNqm9HPkHD0ZdlmAOs(this.f$0, (Boolean) obj, (String) obj2);
                            }
                        });
                        break;
                    }
                    break;
                case "web_app_stop_device_orientation":
                    BotSensors botSensors = this.delegate.getBotSensors();
                    if (botSensors != null && botSensors.stopOrientation()) {
                        notifyEvent("device_orientation_stopped", null);
                        break;
                    } else {
                        notifyEvent("device_orientation_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_device_storage_save_key":
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context2 = getContext();
                            int i9 = this.currentAccount;
                            this.storage = new BotStorage(context2, i9, UserConfig.getInstance(i9).getClientUserId(), this.botUser.id, false);
                        }
                        setStorageKey(this.storage, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case "web_app_device_storage_get_key":
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context3 = getContext();
                            int i10 = this.currentAccount;
                            this.storage = new BotStorage(context3, i10, UserConfig.getInstance(i10).getClientUserId(), this.botUser.id, false);
                        }
                        getStorageKey(this.storage, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case "web_app_biometry_request_auth":
                    try {
                        string2 = new JSONObject(str2).getString("reason");
                        break;
                    } catch (Exception unused4) {
                        string2 = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry = this.biometry;
                    if (botBiometry != null) {
                        if (!botBiometry.access_granted) {
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "failed");
                                notifyEvent("biometry_auth_requested", jSONObject8);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        } else {
                            botBiometry.requestToken(string2, new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    BotWebViewContainer.m5055$r8$lambda$y4bBR0qkd95uGhFgeHcxPpo7Mk(this.f$0, (Boolean) obj, (String) obj2);
                                }
                            });
                        }
                        break;
                    }
                    break;
                case "web_app_toggle_orientation_lock":
                    try {
                        z = new JSONObject(str2).getBoolean("locked");
                        break;
                    } catch (Exception unused5) {
                        z = false;
                    }
                    Delegate delegate2 = this.delegate;
                    if (delegate2 != null) {
                        delegate2.onOrientationLockChanged(z);
                        break;
                    }
                    break;
                case "web_app_allow_scroll":
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        zOptBoolean = jSONArray2.optBoolean(0, true);
                        try {
                            zOptBoolean2 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            zOptBoolean2 = true;
                        }
                        break;
                    } catch (Exception unused7) {
                        zOptBoolean = true;
                    }
                    d("allowScroll " + zOptBoolean + " " + zOptBoolean2);
                    if (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                        ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(zOptBoolean, zOptBoolean2);
                        break;
                    }
                    break;
                case "web_app_open_tg_link":
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String strOptString10 = jSONObject9.optString("path_full");
                        boolean zOptBoolean7 = jSONObject9.optBoolean("force_request", false);
                        if (strOptString10.startsWith("/")) {
                            strOptString10 = strOptString10.substring(1);
                        }
                        onOpenUri(Uri.parse("https://t.me/" + strOptString10), null, false, true, zOptBoolean7);
                        break;
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                        return;
                    }
                    break;
                case "web_app_secure_storage_restore_key":
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context4 = getContext();
                            int i11 = this.currentAccount;
                            this.secureStorage = new BotStorage(context4, i11, UserConfig.getInstance(i11).getClientUserId(), this.botUser.id, true);
                        }
                        restoreStorageKey(this.secureStorage, str2, "secure_storage_key_restored", "secure_storage_failed");
                        break;
                    }
                    break;
                case "web_app_share_to_story":
                    if (!this.isRequestingPageOpen && System.currentTimeMillis() - this.lastClickMs <= 10000 && System.currentTimeMillis() - this.lastPostStoryMs >= 2000) {
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
                                            str3 = strOptString2;
                                        } catch (Exception e12) {
                                            e = e12;
                                            FileLog.e(e);
                                            str3 = strOptString2;
                                            strOptString5 = null;
                                        }
                                    } else {
                                        str3 = strOptString2;
                                        strOptString4 = null;
                                        strOptString5 = null;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    strOptString4 = null;
                                    FileLog.e(e);
                                    str3 = strOptString2;
                                    strOptString5 = null;
                                    if (str3 != null) {
                                        return;
                                    }
                                    if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                        new PremiumFeatureBottomSheet(new BaseFragment() {
                                            @Override
                                            public boolean isLightStatusBar() {
                                                return false;
                                            }

                                            {
                                                this.currentAccount = BotWebViewContainer.this.currentAccount;
                                            }

                                            @Override
                                            public Dialog showDialog(Dialog dialog) {
                                                dialog.show();
                                                return dialog;
                                            }

                                            @Override
                                            public Activity getParentActivity() {
                                                return BotWebViewContainer.this.parentActivity;
                                            }

                                            @Override
                                            public Theme.ResourcesProvider getResourceProvider() {
                                                return new WrappedResourceProvider(BotWebViewContainer.this.resourcesProvider) {
                                                    @Override
                                                    public void appendColors() {
                                                        this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                                                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                                                    }
                                                };
                                            }
                                        }, 14, true).show();
                                        return;
                                    }
                                    final AlertDialog alertDialog = new AlertDialog(this.parentActivity, 3);
                                    new HttpGetFileTask(new Utilities.Callback() {
                                        @Override
                                        public final void run(Object obj) {
                                            BotWebViewContainer.m5044$r8$lambda$FhEYSwvAsOopx_2DJ7_E46tMF4(this.f$0, alertDialog, strOptString3, strOptString4, strOptString5, (File) obj);
                                        }
                                    }, null).execute(str3);
                                    alertDialog.showDelayed(250L);
                                    return;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                strOptString3 = null;
                                strOptString4 = null;
                                FileLog.e(e);
                                str3 = strOptString2;
                                strOptString5 = null;
                                if (str3 != null) {
                                    return;
                                }
                                if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                    new PremiumFeatureBottomSheet(new BaseFragment() {
                                        @Override
                                        public boolean isLightStatusBar() {
                                            return false;
                                        }

                                        {
                                            this.currentAccount = BotWebViewContainer.this.currentAccount;
                                        }

                                        @Override
                                        public Dialog showDialog(Dialog dialog) {
                                            dialog.show();
                                            return dialog;
                                        }

                                        @Override
                                        public Activity getParentActivity() {
                                            return BotWebViewContainer.this.parentActivity;
                                        }

                                        @Override
                                        public Theme.ResourcesProvider getResourceProvider() {
                                            return new WrappedResourceProvider(BotWebViewContainer.this.resourcesProvider) {
                                                @Override
                                                public void appendColors() {
                                                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                                                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                                                }
                                            };
                                        }
                                    }, 14, true).show();
                                    return;
                                }
                                final AlertDialog alertDialog2 = new AlertDialog(this.parentActivity, 3);
                                new HttpGetFileTask(new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        BotWebViewContainer.m5044$r8$lambda$FhEYSwvAsOopx_2DJ7_E46tMF4(this.f$0, alertDialog2, strOptString3, strOptString4, strOptString5, (File) obj);
                                    }
                                }, null).execute(str3);
                                alertDialog2.showDelayed(250L);
                                return;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            strOptString2 = null;
                        }
                        if (str3 != null) {
                            if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                new PremiumFeatureBottomSheet(new BaseFragment() {
                                    @Override
                                    public boolean isLightStatusBar() {
                                        return false;
                                    }

                                    {
                                        this.currentAccount = BotWebViewContainer.this.currentAccount;
                                    }

                                    @Override
                                    public Dialog showDialog(Dialog dialog) {
                                        dialog.show();
                                        return dialog;
                                    }

                                    @Override
                                    public Activity getParentActivity() {
                                        return BotWebViewContainer.this.parentActivity;
                                    }

                                    @Override
                                    public Theme.ResourcesProvider getResourceProvider() {
                                        return new WrappedResourceProvider(BotWebViewContainer.this.resourcesProvider) {
                                            @Override
                                            public void appendColors() {
                                                this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                                                this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                                            }
                                        };
                                    }
                                }, 14, true).show();
                            } else {
                                final AlertDialog alertDialog3 = new AlertDialog(this.parentActivity, 3);
                                new HttpGetFileTask(new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        BotWebViewContainer.m5044$r8$lambda$FhEYSwvAsOopx_2DJ7_E46tMF4(this.f$0, alertDialog3, strOptString3, strOptString4, strOptString5, (File) obj);
                                    }
                                }, null).execute(str3);
                                alertDialog3.showDelayed(250L);
                            }
                        }
                    }
                    break;
                case "web_app_request_location":
                    if (!this.isRequestingPageOpen && this.botUser != null) {
                        if (this.location == null) {
                            BotLocation botLocation2 = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                            this.location = botLocation2;
                            botLocation2.listen(this.notifyLocationChecked);
                        }
                        if (!this.location.granted()) {
                            this.location.request(new Utilities.Callback2() {
                                @Override
                                public final void run(Object obj, Object obj2) {
                                    BotWebViewContainer.$r8$lambda$fCcl6l_AfqiE2aEpkEOUocLKcHA(this.f$0, (Boolean) obj, (Boolean) obj2);
                                }
                            });
                        } else {
                            this.location.requestObject(new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    this.f$0.notifyEvent("location_requested", (JSONObject) obj);
                                }
                            });
                        }
                        break;
                    }
                    break;
                case "web_app_start_gyroscope":
                    BotSensors botSensors2 = this.delegate.getBotSensors();
                    try {
                        j4 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused8) {
                    }
                    long jClamp = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors2 != null && botSensors2.startGyroscope(jClamp)) {
                        notifyEvent("gyroscope_started", null);
                        break;
                    } else {
                        notifyEvent("gyroscope_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_close":
                    try {
                        zOptBoolean3 = new JSONObject(str2).optBoolean("return_back");
                        break;
                    } catch (Exception e16) {
                        FileLog.e(e16);
                        zOptBoolean3 = false;
                    }
                    this.delegate.onCloseRequested(null);
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
                            int i12 = 0;
                            while (true) {
                                if (i12 < tabs.size()) {
                                    BottomSheetTabs.WebTabData webTabData2 = tabs.get(i12);
                                    if (!this.wasOpenedByBot.equals(webTabData2.props) || webTabData2.webView == this.webView) {
                                        i12++;
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
                case "web_app_ready":
                    setPageLoaded(this.webView.getUrl(), true);
                    break;
                case "web_app_read_text_from_clipboard":
                    try {
                        String string10 = new JSONObject(str2).getString("req_id");
                        if (this.delegate.isClipboardAvailable() && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string10).put("data", text != null ? text.toString() : ""));
                            break;
                        }
                        notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string10));
                        break;
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        return;
                    }
                    break;
                case "web_app_hide_keyboard":
                    Activity activityFindActivity2 = AndroidUtilities.findActivity(getContext());
                    if (activityFindActivity2 == null) {
                        activityFindActivity2 = LaunchActivity.instance;
                    }
                    if (activityFindActivity2 != null) {
                        AndroidUtilities.hideKeyboard(activityFindActivity2.getCurrentFocus());
                        break;
                    }
                    break;
                case "web_app_stop_gyroscope":
                    BotSensors botSensors3 = this.delegate.getBotSensors();
                    if (botSensors3 != null && botSensors3.stopGyroscope()) {
                        notifyEvent("gyroscope_stopped", null);
                        break;
                    } else {
                        notifyEvent("gyroscope_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_secure_storage_clear":
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context5 = getContext();
                            int i13 = this.currentAccount;
                            this.secureStorage = new BotStorage(context5, i13, UserConfig.getInstance(i13).getClientUserId(), this.botUser.id, true);
                        }
                        clearStorageKey(this.secureStorage, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case "web_app_device_storage_clear":
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context6 = getContext();
                            int i14 = this.currentAccount;
                            this.storage = new BotStorage(context6, i14, UserConfig.getInstance(i14).getClientUserId(), this.botUser.id, false);
                        }
                        clearStorageKey(this.storage, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case "web_app_start_accelerometer":
                    BotSensors botSensors4 = this.delegate.getBotSensors();
                    try {
                        j4 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused9) {
                    }
                    long jClamp2 = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors4 != null && botSensors4.startAccelerometer(jClamp2)) {
                        notifyEvent("accelerometer_started", null);
                        break;
                    } else {
                        notifyEvent("accelerometer_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_stop_accelerometer":
                    BotSensors botSensors5 = this.delegate.getBotSensors();
                    if (botSensors5 != null && botSensors5.stopAccelerometer()) {
                        notifyEvent("accelerometer_stopped", null);
                        break;
                    } else {
                        notifyEvent("accelerometer_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_send_prepared_message":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            String string11 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string11)) {
                                notifyEvent("prepared_message_failed", obj("error", "MESSAGE_EXPIRED"));
                            } else {
                                BotShareSheet.share(getContext(), this.currentAccount, this.botUser.id, string11, this.resourcesProvider, new Runnable() {
                                    @Override
                                    public final void run() {
                                        BotWebViewContainer.$r8$lambda$pNSCoNoNVQH0pa7Sa6YhtwvWtUU(this.f$0);
                                    }
                                }, new Utilities.Callback2() {
                                    @Override
                                    public final void run(Object obj, Object obj2) {
                                        BotWebViewContainer.$r8$lambda$MZ6TrZltEjOu1jd7fSmzLBuuUFk(this.f$0, botWebViewProxy, (String) obj, (ArrayList) obj2);
                                    }
                                });
                            }
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            notifyEvent("prepared_message_failed", obj("error", "MESSAGE_EXPIRED"));
                            return;
                        }
                        break;
                    }
                    break;
                case "web_app_data_send":
                    try {
                        this.delegate.onSendWebViewData(new JSONObject(str2).optString("data"));
                        break;
                    } catch (JSONException e19) {
                        FileLog.e(e19);
                        return;
                    }
                    break;
                case "web_app_request_content_safe_area":
                    reportSafeContentInsets(this.lastInsetsTopMargin, true);
                    break;
                case "web_app_add_to_home_screen":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            notifyEvent("home_screen_added", null);
                        } else {
                            MediaDataController.getInstance(this.currentAccount).installShortcut(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    BotWebViewContainer.m5038$r8$lambda$Koxb0RlqEW8R297mAIl3qWKpjU(this.f$0, (Boolean) obj);
                                }
                            });
                        }
                        break;
                    }
                    break;
                case "web_app_request_fullscreen":
                    try {
                        zOptBoolean4 = new JSONObject(str2).optBoolean("blur", true);
                        break;
                    } catch (Exception unused10) {
                        zOptBoolean4 = true;
                    }
                    String strOnFullscreenRequested = this.delegate.onFullscreenRequested(true, zOptBoolean4);
                    if (strOnFullscreenRequested != null) {
                        notifyEvent("fullscreen_failed", obj("error", strOnFullscreenRequested));
                        break;
                    } else {
                        notifyEvent("fullscreen_changed", obj("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(zOptBoolean4)));
                        break;
                    }
                    break;
                case "web_app_switch_inline_query":
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i15 = 0; i15 < jSONArray3.length(); i15++) {
                            arrayList2.add(jSONArray3.getString(i15));
                        }
                        this.delegate.onWebAppSwitchInlineQuery(this.botUser, jSONObject11.getString("query"), arrayList2);
                        break;
                    } catch (JSONException e20) {
                        FileLog.e(e20);
                        return;
                    }
                    break;
                case "web_app_secure_storage_save_key":
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context7 = getContext();
                            int i16 = this.currentAccount;
                            this.secureStorage = new BotStorage(context7, i16, UserConfig.getInstance(i16).getClientUserId(), this.botUser.id, true);
                        }
                        setStorageKey(this.secureStorage, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case "web_app_exit_fullscreen":
                    String strOnFullscreenRequested2 = this.delegate.onFullscreenRequested(false, true);
                    if (strOnFullscreenRequested2 != null) {
                        notifyEvent("fullscreen_failed", obj("error", strOnFullscreenRequested2));
                        break;
                    } else {
                        notifyEvent("fullscreen_changed", obj("is_fullscreen", Boolean.FALSE));
                        break;
                    }
                    break;
                case "web_app_verify_age":
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
                        break;
                    }
                    break;
                case "web_app_open_location_settings":
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
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
                case "web_app_setup_back_button":
                    try {
                        boolean zOptBoolean8 = new JSONObject(str2).optBoolean("is_visible");
                        if (zOptBoolean8 != this.isBackButtonVisible) {
                            this.isBackButtonVisible = zOptBoolean8;
                            this.delegate.onSetBackButtonVisible(zOptBoolean8);
                        }
                        break;
                    } catch (JSONException e22) {
                        FileLog.e(e22);
                        return;
                    }
                    break;
                case "web_app_biometry_request_access":
                    try {
                        string = new JSONObject(str2).getString("reason");
                        break;
                    } catch (Exception unused11) {
                        string = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry2 = this.biometry;
                    if (botBiometry2 != null) {
                        boolean z7 = botBiometry2.access_requested;
                        if (z7) {
                            notifyBiometryReceived();
                        } else if (!botBiometry2.access_granted) {
                            final Runnable[] runnableArr = {new Runnable() {
                                @Override
                                public final void run() {
                                    BotWebViewContainer.$r8$lambda$CgNy5VrFYTHJyTvE0nvPrrq48mg(this.f$0);
                                }
                            }};
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                            if (TextUtils.isEmpty(string)) {
                                builder2.setTitle(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                            } else {
                                builder2.setTitle(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                                builder2.setMessage(string);
                            }
                            builder2.setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog4, int i17) {
                                    BotWebViewContainer.$r8$lambda$PQmpbf8IAW8Leg__D5NV4fNhexU(this.f$0, runnableArr, alertDialog4, i17);
                                }
                            });
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog4, int i17) {
                                    BotWebViewContainer.m5037$r8$lambda$CIVm328ckHxSQHivxqBlVyeI(this.f$0, runnableArr, alertDialog4, i17);
                                }
                            });
                            builder2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    BotWebViewContainer.$r8$lambda$gFHAK0CBbUCCK1DFE62CWJmWiMc(runnableArr, dialogInterface);
                                }
                            });
                            builder2.show();
                        } else {
                            if (!z7) {
                                botBiometry2.access_requested = true;
                                botBiometry2.save();
                            }
                            notifyBiometryReceived();
                        }
                        break;
                    }
                    break;
                case "web_app_trigger_haptic_feedback":
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
                        break;
                    } catch (Exception e23) {
                        FileLog.e(e23);
                        return;
                    }
                    break;
                case "web_app_setup_main_button":
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean zOptBoolean9 = jSONObject14.optBoolean("is_active", false);
                        String strTrim2 = jSONObject14.optString("text", this.lastButtonText).trim();
                        boolean z8 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(strTrim2);
                        int color4 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.lastButtonColor;
                        int color5 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.lastButtonTextColor;
                        boolean z9 = jSONObject14.optBoolean("is_progress_visible", false) && z8;
                        boolean z10 = jSONObject14.optBoolean("has_shine_effect", false) && z8;
                        try {
                            j = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j = 0;
                        }
                        this.lastButtonColor = color4;
                        this.lastButtonTextColor = color5;
                        this.lastButtonText = strTrim2;
                        this.buttonData = str2;
                        this.delegate.onSetupMainButton(z8, zOptBoolean9, strTrim2, j, color4, color5, z9, z10);
                        break;
                    } catch (Exception e24) {
                        FileLog.e(e24);
                        return;
                    }
                    break;
                case "web_app_setup_swipe_behavior":
                    try {
                        this.delegate.onWebAppSwipingBehavior(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        break;
                    } catch (JSONException e25) {
                        FileLog.e(e25);
                        return;
                    }
                    break;
                case "web_app_setup_settings_button":
                    try {
                        boolean zOptBoolean10 = new JSONObject(str2).optBoolean("is_visible");
                        if (zOptBoolean10 != this.isSettingsButtonVisible) {
                            this.isSettingsButtonVisible = zOptBoolean10;
                            this.delegate.onSetSettingsButtonVisible(zOptBoolean10);
                        }
                        break;
                    } catch (JSONException e26) {
                        FileLog.e(e26);
                        return;
                    }
                    break;
                case "web_app_check_home_screen":
                    if (this.botUser != null && Build.VERSION.SDK_INT >= 26) {
                        str4 = MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed";
                    } else {
                        str4 = "unsupported";
                    }
                    notifyEvent("home_screen_checked", obj("status", str4));
                    break;
                case "web_app_request_chat":
                    try {
                        strOptString = new JSONObject(str2).optString("req_id");
                        break;
                    } catch (Exception e27) {
                        FileLog.e(e27);
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                        getrequestedwebviewbutton.webapp_req_id = strOptString;
                        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getrequestedwebviewbutton, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                BotWebViewContainer.$r8$lambda$lqFBsisDkJCNGvVJtYERukbQd0A(this.f$0, strOptString, (TL_keyboard.KeyboardButton) obj, (TLRPC.TL_error) obj2);
                            }
                        });
                        break;
                    }
                    break;
                case "web_app_start_device_orientation":
                    BotSensors botSensors6 = this.delegate.getBotSensors();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j4 = jSONObject15.getLong("refresh_rate");
                        zOptBoolean5 = jSONObject15.optBoolean("need_absolute", false);
                        break;
                    } catch (Exception unused13) {
                        zOptBoolean5 = false;
                    }
                    long jClamp3 = Utilities.clamp(j4, 1000L, 20L);
                    if (botSensors6 != null && botSensors6.startOrientation(zOptBoolean5, jClamp3)) {
                        notifyEvent("device_orientation_started", null);
                        break;
                    } else {
                        notifyEvent("device_orientation_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case "web_app_biometry_update_token":
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        final String string12 = jSONObject16.getString("token");
                        try {
                            string3 = jSONObject16.getString("reason");
                        } catch (Exception unused14) {
                            string3 = null;
                        }
                        createBiometry();
                        BotBiometry botBiometry3 = this.biometry;
                        if (botBiometry3 != null) {
                            if (!botBiometry3.access_granted) {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    notifyEvent("biometry_token_updated", jSONObject17);
                                } catch (Exception e28) {
                                    FileLog.e(e28);
                                    return;
                                }
                            } else {
                                botBiometry3.updateToken(string3, string12, new Utilities.Callback() {
                                    @Override
                                    public final void run(Object obj) {
                                        BotWebViewContainer.$r8$lambda$RW51g3PiR4Nm1fJRrn8DB4Hp1j4(this.f$0, string12, (Boolean) obj);
                                    }
                                });
                            }
                            break;
                        }
                        break;
                    } catch (Exception e29) {
                        FileLog.e(e29);
                        if (e29 instanceof JSONException) {
                            error("JSON Parse error");
                            return;
                        } else {
                            unknownError();
                            return;
                        }
                    }
                    break;
                case "web_app_set_bottom_bar_color":
                    try {
                        String strOptString15 = new JSONObject(str2).optString("color", null);
                        if (TextUtils.isEmpty(strOptString15)) {
                            color = Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider);
                        } else {
                            color = Color.parseColor(strOptString15);
                        }
                        Delegate delegate4 = this.delegate;
                        if (delegate4 != null) {
                            delegate4.onWebAppSetNavigationBarColor(color);
                        }
                        break;
                    } catch (Exception e30) {
                        FileLog.e(e30);
                        return;
                    }
                    break;
                case "web_app_set_header_color":
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String strOptString16 = jSONObject18.optString("color", null);
                        if (!TextUtils.isEmpty(strOptString16)) {
                            int color6 = Color.parseColor(strOptString16);
                            if (color6 != 0) {
                                this.delegate.onWebAppSetActionBarColor(-1, color6, true);
                            }
                        } else {
                            String strOptString17 = jSONObject18.optString("color_key");
                            int iHashCode3 = strOptString17.hashCode();
                            if (iHashCode3 != -1265068311) {
                                if (iHashCode3 == -210781868 && strOptString17.equals("secondary_bg_color")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strOptString17.equals("bg_color")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b != 0) {
                                if (b != 1) {
                                    i2 = -1;
                                } else {
                                    i = Theme.key_windowBackgroundGray;
                                }
                                if (i2 >= 0) {
                                    this.delegate.onWebAppSetActionBarColor(i2, Theme.getColor(i2, this.resourcesProvider), false);
                                }
                            } else {
                                i = Theme.key_windowBackgroundWhite;
                            }
                            i2 = i;
                            if (i2 >= 0) {
                                this.delegate.onWebAppSetActionBarColor(i2, Theme.getColor(i2, this.resourcesProvider), false);
                            }
                        }
                        break;
                    } catch (Exception e31) {
                        FileLog.e(e31);
                        return;
                    }
                    break;
                case "web_app_request_safe_area":
                    reportSafeInsets(this.lastInsets, true);
                    break;
                case "web_app_set_background_color":
                    try {
                        this.delegate.onWebAppSetBackgroundColor(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        break;
                    } catch (Exception e32) {
                        FileLog.e(e32);
                        return;
                    }
                    break;
                case "web_app_request_write_access":
                    if (ignoreDialog(3)) {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            notifyEvent("write_access_requested", jSONObject19);
                        } catch (Exception e33) {
                            FileLog.e(e33);
                            return;
                        }
                        break;
                    } else {
                        final int i17 = this.currentAccount;
                        final MyWebView myWebView3 = this.webView;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(cansendmessage, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                BotWebViewContainer.$r8$lambda$eIpxr9bxEz3eMcRwyZQeS97eaug(this.f$0, i17, myWebView3, tLObject, tL_error);
                            }
                        });
                        break;
                    }
                    break;
                case "web_app_expand":
                    this.delegate.onWebAppExpand();
                    break;
                default:
                    FileLog.d("unknown webapp event " + str);
                    break;
            }
        }
    }

    public static void $r8$lambda$3uV12iotRBDF6BS6ArYlbsMUAK4(BotWebViewContainer botWebViewContainer, PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        alertDialog.dismiss();
        try {
            botWebViewContainer.lastClickMs = System.currentTimeMillis();
            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$JuUcgfOvF9aqBlSw2AXWFR7bBAY(BotWebViewContainer botWebViewContainer, PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        alertDialog.dismiss();
        try {
            botWebViewContainer.lastClickMs = System.currentTimeMillis();
            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$yYhdJGFo6OivjOfA9q_VQKNZDtk(BotWebViewContainer botWebViewContainer, PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        alertDialog.dismiss();
        try {
            botWebViewContainer.lastClickMs = System.currentTimeMillis();
            botWebViewContainer.notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$jLTVU7PRvXCJRaw7MRUCEb7qZ4c(BotWebViewContainer botWebViewContainer, AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        botWebViewContainer.getClass();
        if (!atomicBoolean.get()) {
            botWebViewContainer.notifyEvent("popup_closed", new JSONObject());
        }
        botWebViewContainer.currentDialog = null;
        botWebViewContainer.lastDialogClosed = System.currentTimeMillis();
    }

    public static void $r8$lambda$GXU5ScDLKzxoUJ4WEi70ns4vfcs(final BotWebViewContainer botWebViewContainer, final String str, final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$MXthtFFSJMxMqjmJ381vCimbCas(this.f$0, tL_error, str, tL_inputInvoiceSlug, tLObject);
            }
        });
    }

    public static void $r8$lambda$MXthtFFSJMxMqjmJ381vCimbCas(BotWebViewContainer botWebViewContainer, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewContainer.onInvoiceStatusUpdate(str, "failed");
        } else {
            botWebViewContainer.delegate.onWebAppOpenInvoice(tL_inputInvoiceSlug, str, tLObject);
        }
    }

    public static void $r8$lambda$eIpxr9bxEz3eMcRwyZQeS97eaug(final BotWebViewContainer botWebViewContainer, final int i, final MyWebView myWebView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$GOCJnDeoAq1sQ9eVaN3I_wi_H7s(this.f$0, tLObject, i, myWebView, tL_error);
            }
        });
    }

    public static void $r8$lambda$GOCJnDeoAq1sQ9eVaN3I_wi_H7s(final BotWebViewContainer botWebViewContainer, TLObject tLObject, final int i, final MyWebView myWebView, TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                botWebViewContainer.unknownError(tL_error.text);
                return;
            } else {
                final String[] strArr = {"cancelled"};
                botWebViewContainer.showDialog(3, new AlertDialog.Builder(botWebViewContainer.getContext()).setTitle(LocaleController.getString(R.string.BotWebViewRequestWriteTitle)).setMessage(LocaleController.getString(R.string.BotWebViewRequestWriteMessage)).setPositiveButton(LocaleController.getString(R.string.BotWebViewRequestAllow), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        BotWebViewContainer.$r8$lambda$g8d9ER4iIk6wDWjkkevyEsw9Kz4(this.f$0, strArr, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                }).create(), new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewContainer.$r8$lambda$qXRhl_p8dL9DYtielvcD3tI08ZE(strArr, i, myWebView);
                    }
                });
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "allowed");
            notifyEvent(i, myWebView, "write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$g8d9ER4iIk6wDWjkkevyEsw9Kz4(final BotWebViewContainer botWebViewContainer, final String[] strArr, final AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
        allowsendmessage.bot = MessagesController.getInstance(botWebViewContainer.currentAccount).getInputUser(botWebViewContainer.botUser);
        ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequest(allowsendmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotWebViewContainer.$r8$lambda$zvKaSzj1Qa8mtqrESNHjsF_psrg(this.f$0, strArr, alertDialog, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$zvKaSzj1Qa8mtqrESNHjsF_psrg(final BotWebViewContainer botWebViewContainer, final String[] strArr, final AlertDialog alertDialog, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.m5052$r8$lambda$gvKITzydsf6Q09_O1BNAnqC344(this.f$0, tLObject, strArr, tL_error, alertDialog);
            }
        });
    }

    public static void m5052$r8$lambda$gvKITzydsf6Q09_O1BNAnqC344(BotWebViewContainer botWebViewContainer, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, AlertDialog alertDialog) {
        botWebViewContainer.getClass();
        if (tLObject != null) {
            strArr[0] = "allowed";
            if (tLObject instanceof TLRPC.Updates) {
                MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
        }
        if (tL_error != null) {
            botWebViewContainer.unknownError(tL_error.text);
        }
        alertDialog.dismiss();
    }

    public static void $r8$lambda$qXRhl_p8dL9DYtielvcD3tI08ZE(String[] strArr, int i, MyWebView myWebView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent(i, myWebView, "write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$Px_Q2zhpAOt1oomXNevljxIeJF4(final BotWebViewContainer botWebViewContainer, final String str, final int i, final MyWebView myWebView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$MFUOZnAgEKRdp1xr3Zuc21rAb_I(this.f$0, str, tLObject, tL_error, i, myWebView);
            }
        });
    }

    public static void $r8$lambda$MFUOZnAgEKRdp1xr3Zuc21rAb_I(BotWebViewContainer botWebViewContainer, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, MyWebView myWebView) {
        botWebViewContainer.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            if (tLObject instanceof TLRPC.TL_dataJSON) {
                jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject).data).nextValue());
            } else if (tL_error != null) {
                jSONObject.put("error", tL_error.text);
            }
            notifyEvent(i, myWebView, "custom_method_invoked", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
            botWebViewContainer.unknownError();
        }
    }

    public static void $r8$lambda$yLJ5XEHe1w4zqF_UeZHEIhuUebg(final BotWebViewContainer botWebViewContainer, String[] strArr, boolean z, final int i, final MyWebView myWebView, AlertDialog alertDialog, int i2) {
        botWebViewContainer.getClass();
        strArr[0] = null;
        alertDialog.dismiss();
        if (z) {
            MessagesController.getInstance(botWebViewContainer.currentAccount).unblockPeer(botWebViewContainer.botUser.id, new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.m5043$r8$lambda$8U7M4QWoUXKIPJHqq86sNDG1zg(this.f$0, i, myWebView);
                }
            });
            return;
        }
        SendMessagesHelper.getInstance(botWebViewContainer.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(botWebViewContainer.currentAccount).getCurrentUser(), botWebViewContainer.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m5043$r8$lambda$8U7M4QWoUXKIPJHqq86sNDG1zg(BotWebViewContainer botWebViewContainer, int i, MyWebView myWebView) {
        SendMessagesHelper.getInstance(botWebViewContainer.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(botWebViewContainer.currentAccount).getCurrentUser(), botWebViewContainer.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m5050$r8$lambda$Y9Ca0W75ZkbjgWhRuPbDHpLiI(String[] strArr, int i, MyWebView myWebView) {
        if (strArr[0] == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$CgNy5VrFYTHJyTvE0nvPrrq48mg(BotWebViewContainer botWebViewContainer) {
        BotBiometry botBiometry = botWebViewContainer.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        botWebViewContainer.notifyBiometryReceived();
    }

    public static void $r8$lambda$PQmpbf8IAW8Leg__D5NV4fNhexU(final BotWebViewContainer botWebViewContainer, Runnable[] runnableArr, AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = botWebViewContainer.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        botWebViewContainer.biometry.requestToken(null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotWebViewContainer.$r8$lambda$UgRk41ndqvasCe5TU1VOMMqaN4I(this.f$0, (Boolean) obj, (String) obj2);
            }
        });
    }

    public static void $r8$lambda$UgRk41ndqvasCe5TU1VOMMqaN4I(BotWebViewContainer botWebViewContainer, Boolean bool, String str) {
        botWebViewContainer.getClass();
        if (bool.booleanValue()) {
            BotBiometry botBiometry = botWebViewContainer.biometry;
            botBiometry.access_granted = true;
            botBiometry.save();
        }
        botWebViewContainer.notifyBiometryReceived();
    }

    public static void m5037$r8$lambda$CIVm328ckHxSQHivxqBlVyeI(BotWebViewContainer botWebViewContainer, Runnable[] runnableArr, AlertDialog alertDialog, int i) {
        botWebViewContainer.getClass();
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = botWebViewContainer.biometry;
        botBiometry.access_requested = true;
        botBiometry.disabled = true;
        botBiometry.save();
        botWebViewContainer.notifyBiometryReceived();
    }

    public static void $r8$lambda$gFHAK0CBbUCCK1DFE62CWJmWiMc(Runnable[] runnableArr, DialogInterface dialogInterface) {
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
    }

    public static void m5055$r8$lambda$y4bBR0qkd95uGhFgeHcxPpo7Mk(BotWebViewContainer botWebViewContainer, Boolean bool, String str) {
        botWebViewContainer.getClass();
        if (bool.booleanValue()) {
            botWebViewContainer.biometry.access_granted = true;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", bool.booleanValue() ? "authorized" : "failed");
            jSONObject.put("token", str);
            botWebViewContainer.notifyEvent("biometry_auth_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$RW51g3PiR4Nm1fJRrn8DB4Hp1j4(BotWebViewContainer botWebViewContainer, String str, Boolean bool) {
        String str2;
        botWebViewContainer.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            if (bool.booleanValue()) {
                str2 = TextUtils.isEmpty(str) ? "removed" : "updated";
            } else {
                str2 = "failed";
            }
            jSONObject.put("status", str2);
            botWebViewContainer.notifyEvent("biometry_token_updated", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m5044$r8$lambda$FhEYSwvAsOopx_2DJ7_E46tMF4(final BotWebViewContainer botWebViewContainer, final AlertDialog alertDialog, final String str, final String str2, final String str3, final File file) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$8RoDHMieNiJ7V38eZSfkUcyFZf0(this.f$0, file, alertDialog, str, str2, str3);
            }
        });
    }

    public static void $r8$lambda$8RoDHMieNiJ7V38eZSfkUcyFZf0(final BotWebViewContainer botWebViewContainer, final File file, final AlertDialog alertDialog, final String str, final String str2, final String str3) {
        botWebViewContainer.getClass();
        if (file == null) {
            alertDialog.dismissUnless(500L);
            return;
        }
        final int[] iArr = new int[11];
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$lbaekv9AbkriH6aaaL0w1uGpHsw(this.f$0, iArr, file, alertDialog, str, str2, str3);
            }
        };
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.$r8$lambda$5vDhNZmS1Gy5aEK62vD5qGc07_g(file, iArr, runnable);
            }
        });
    }

    public static void $r8$lambda$lbaekv9AbkriH6aaaL0w1uGpHsw(BotWebViewContainer botWebViewContainer, int[] iArr, File file, AlertDialog alertDialog, String str, String str2, String str3) {
        StoryRecorder.SourceView sourceView;
        StoryEntry storyEntryFromPhotoShoot;
        BotWebViewContainer botWebViewContainer2;
        File file2;
        botWebViewContainer.getClass();
        if (iArr[4] > 0) {
            int i = iArr[1];
            int i2 = iArr[2];
            int photoSize = i > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i;
            int photoSize2 = i2 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i2;
            File fileMakeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "jpg");
            sourceView = null;
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null);
            Bitmap firstFrame = animatedFileDrawable.getFirstFrame(null);
            animatedFileDrawable.recycle();
            if (firstFrame != null) {
                try {
                    firstFrame.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(fileMakeCacheFile));
                } catch (Exception e) {
                    FileLog.e(e);
                    file2 = null;
                }
            }
            file2 = fileMakeCacheFile;
            storyEntryFromPhotoShoot = StoryEntry.fromVideoShoot(file, file2 == null ? null : file2.getAbsolutePath(), iArr[4]);
            storyEntryFromPhotoShoot.width = i;
            storyEntryFromPhotoShoot.height = i2;
            storyEntryFromPhotoShoot.setupMatrix();
        } else {
            sourceView = null;
            storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(file, ((Integer) AndroidUtilities.getImageOrientation(file).first).intValue());
        }
        if (storyEntryFromPhotoShoot.width <= 0 || storyEntryFromPhotoShoot.height <= 0) {
            alertDialog.dismissUnless(500L);
            return;
        }
        if (str != null) {
            storyEntryFromPhotoShoot.caption = str;
        }
        if (TextUtils.isEmpty(str2)) {
            botWebViewContainer2 = botWebViewContainer;
        } else {
            botWebViewContainer2 = botWebViewContainer;
            if (UserConfig.getInstance(botWebViewContainer2.currentAccount).isPremium()) {
                if (storyEntryFromPhotoShoot.mediaEntities == null) {
                    storyEntryFromPhotoShoot.mediaEntities = new ArrayList();
                }
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 7;
                mediaEntity.subType = (byte) -1;
                mediaEntity.color = -1;
                LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
                mediaEntity.linkSettings = webPagePreview;
                webPagePreview.url = str2;
                if (str3 != null) {
                    webPagePreview.flags |= 2;
                    webPagePreview.name = str3;
                }
                storyEntryFromPhotoShoot.mediaEntities.add(mediaEntity);
            }
        }
        StoryRecorder.getInstance(botWebViewContainer2.parentActivity, UserConfig.selectedAccount).openRepost(sourceView, storyEntryFromPhotoShoot);
        alertDialog.dismissUnless(500L);
    }

    public static void $r8$lambda$5vDhNZmS1Gy5aEK62vD5qGc07_g(File file, int[] iArr, Runnable runnable) {
        AnimatedFileNative.getVideoInfo(file.getAbsolutePath(), iArr, 0L);
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void m5038$r8$lambda$Koxb0RlqEW8R297mAIl3qWKpjU(BotWebViewContainer botWebViewContainer, Boolean bool) {
        botWebViewContainer.getClass();
        if (bool.booleanValue()) {
            botWebViewContainer.notifyEvent("home_screen_added", null);
        } else {
            botWebViewContainer.notifyEvent("home_screen_failed", obj("error", "UNSUPPORTED"));
        }
    }

    public static void $r8$lambda$Nzp7Q0ZEfplSKtY29NHByVbRsm8(BotWebViewContainer botWebViewContainer, String str, TLRPC.Document document) {
        if (str != null) {
            botWebViewContainer.getClass();
            botWebViewContainer.notifyEvent("emoji_status_failed", obj("error", str));
            return;
        }
        botWebViewContainer.notifyEvent("emoji_status_set", null);
        Delegate delegate = botWebViewContainer.delegate;
        if (delegate != null) {
            delegate.onEmojiStatusSet(document);
        }
    }

    public static void $r8$lambda$Eb2qCGsLekNqm9HPkHD0ZdlmAOs(BotWebViewContainer botWebViewContainer, Boolean bool, String str) {
        Delegate delegate;
        botWebViewContainer.notifyEmojiStatusAccess(str);
        if (bool.booleanValue() && "allowed".equalsIgnoreCase(str) && (delegate = botWebViewContainer.delegate) != null) {
            delegate.onEmojiStatusGranted(true);
        }
    }

    public static void $r8$lambda$fCcl6l_AfqiE2aEpkEOUocLKcHA(final BotWebViewContainer botWebViewContainer, Boolean bool, Boolean bool2) {
        if (botWebViewContainer.delegate != null && bool.booleanValue()) {
            botWebViewContainer.delegate.onLocationGranted(bool2.booleanValue());
        }
        botWebViewContainer.location.requestObject(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.notifyEvent("location_requested", (JSONObject) obj);
            }
        });
    }

    public static void m5048$r8$lambda$WqHrRe09XgNKOj_EupP91AFOM(final BotWebViewContainer botWebViewContainer, final String str, final String str2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        botWebViewContainer.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.m5042$r8$lambda$7wzd5Aymt5Pns_JhAKK6jw5uz0(this.f$0, tLObject, str, str2);
            }
        });
    }

    public static void m5042$r8$lambda$7wzd5Aymt5Pns_JhAKK6jw5uz0(final BotWebViewContainer botWebViewContainer, TLObject tLObject, final String str, final String str2) {
        botWebViewContainer.getClass();
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            botWebViewContainer.notifyEvent("file_download_requested", obj("status", "cancelled"));
        } else {
            BotDownloads.showAlert(botWebViewContainer.getContext(), str, str2, UserObject.getUserName(botWebViewContainer.botUser), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BotWebViewContainer.m5041$r8$lambda$1ZmayrAPS0mpmOEVXiVcFrtZ2g(this.f$0, str, str2, (Boolean) obj);
                }
            });
        }
    }

    public static void m5041$r8$lambda$1ZmayrAPS0mpmOEVXiVcFrtZ2g(BotWebViewContainer botWebViewContainer, String str, String str2, Boolean bool) {
        botWebViewContainer.getClass();
        if (!bool.booleanValue()) {
            botWebViewContainer.notifyEvent("file_download_requested", obj("status", "cancelled"));
        } else {
            botWebViewContainer.downloads.download(str, str2);
            botWebViewContainer.notifyEvent("file_download_requested", obj("status", "downloading"));
        }
    }

    public static void $r8$lambda$pNSCoNoNVQH0pa7Sa6YhtwvWtUU(BotWebViewContainer botWebViewContainer) {
        Delegate delegate = botWebViewContainer.delegate;
        if (delegate != null) {
            delegate.onCloseToTabs();
        }
        LaunchActivity.dismissAllWeb();
    }

    public static void $r8$lambda$MZ6TrZltEjOu1jd7fSmzLBuuUFk(BotWebViewContainer botWebViewContainer, final BotWebViewProxy botWebViewProxy, String str, final ArrayList arrayList) {
        botWebViewContainer.getClass();
        if (TextUtils.isEmpty(str)) {
            botWebViewContainer.notifyEvent("prepared_message_sent", null);
            Delegate delegate = botWebViewContainer.delegate;
            if (delegate != null) {
                delegate.onOpenBackFromTabs();
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.m5040$r8$lambda$yU6t9dY2ERHgkkmIJow83D94pc(botWebViewProxy, arrayList);
                }
            }, 500L);
            return;
        }
        botWebViewContainer.notifyEvent("prepared_message_failed", obj("error", str));
    }

    public static void m5040$r8$lambda$yU6t9dY2ERHgkkmIJow83D94pc(BotWebViewProxy botWebViewProxy, ArrayList arrayList) {
        BotWebViewContainer botWebViewContainer;
        Delegate delegate;
        if (botWebViewProxy == null || (botWebViewContainer = botWebViewProxy.container) == null || (delegate = botWebViewContainer.delegate) == null) {
            return;
        }
        delegate.onSharedTo(arrayList);
    }

    public static void $r8$lambda$lqFBsisDkJCNGvVJtYERukbQd0A(final BotWebViewContainer botWebViewContainer, final String str, TL_keyboard.KeyboardButton keyboardButton, TLRPC.TL_error tL_error) {
        int i;
        botWebViewContainer.getClass();
        final TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) TLKeyboardHelper.getType(keyboardButton, TL_keyboard.TL_buttonTypeRequestPeer.class);
        if (tL_buttonTypeRequestPeer == null) {
            if (tL_error != null) {
                BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError(tL_error);
                botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
                return;
            } else {
                BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError("UNKNOWN_BUTTON");
                botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
                return;
            }
        }
        TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
            Context context = botWebViewContainer.getContext();
            int i2 = botWebViewContainer.currentAccount;
            TLRPC.User user = botWebViewContainer.botUser;
            Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BotWebViewContainer.$r8$lambda$faZLhZecaFbyhi5RGxc5FcO1zKc(this.f$0, str, tL_buttonTypeRequestPeer, (TLRPC.User) obj);
                }
            };
            Theme.ResourcesProvider resourcesProvider = botWebViewContainer.resourcesProvider;
            CreateBotAlert.show(context, i2, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, callback, resourcesProvider, BulletinFactory.of(botWebViewContainer, resourcesProvider), true);
            return;
        }
        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
            final boolean[] zArr = new boolean[1];
            MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheetOpen = MultiContactsSelectorBottomSheet.open(tL_requestPeerTypeUser.bot, tL_requestPeerTypeUser.premium, i, new MultiContactsSelectorBottomSheet.SelectorListener() {
                @Override
                public final void onUserSelected(List list) {
                    BotWebViewContainer.$r8$lambda$ykznKomKUEgnQP1_p4Wlm0T44UI(this.f$0, zArr, str, tL_buttonTypeRequestPeer, list);
                }
            });
            if (multiContactsSelectorBottomSheetOpen != null) {
                multiContactsSelectorBottomSheetOpen.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.m5046$r8$lambda$OI31RbEGHA1t9JzzfkhhtB6MQ8(this.f$0, zArr, str, dialogInterface);
                    }
                });
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putInt("dialogsType", 15);
        bundle.putLong("requestPeerBotId", botWebViewContainer.botUser.id);
        try {
            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
            bundle.putByteArray("requestPeerType", serializedData.toByteArray());
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
        final boolean[] zArr2 = new boolean[1];
        DialogsActivity dialogsActivity = new DialogsActivity(bundle) {
            @Override
            public void onFragmentDestroy() {
                super.onFragmentDestroy();
                boolean[] zArr3 = zArr2;
                if (zArr3[0]) {
                    return;
                }
                zArr3[0] = true;
                BotWebViewContainer.this.notifyEvent("requested_chat_failed", BotWebViewContainer.obj());
            }
        };
        dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
            @Override
            public boolean canSelectStories() {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
            }

            @Override
            public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i3, int i4, TopicsFragment topicsFragment) {
                return BotWebViewContainer.$r8$lambda$oH32YzXrtbOcqA5gpMEVyR1tWpc(this.f$0, zArr2, str, tL_buttonTypeRequestPeer, dialogsActivity2, arrayList, charSequence, z, z2, i3, i4, topicsFragment);
            }

            @Override
            public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
            }
        });
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        safeLastFragment.showAsSheet(dialogsActivity, bottomSheetParams);
    }

    public static void $r8$lambda$faZLhZecaFbyhi5RGxc5FcO1zKc(final BotWebViewContainer botWebViewContainer, final String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, final TLRPC.User user) {
        botWebViewContainer.getClass();
        if (user == null) {
            botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
            return;
        }
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
        tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
        ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotWebViewContainer.$r8$lambda$w345IPjP_0oEop8tsRi45Bza2b8(this.f$0, str, user, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
        botWebViewContainer.notifyEvent("requested_chat_sent", obj("req_id", str));
    }

    public static void $r8$lambda$w345IPjP_0oEop8tsRi45Bza2b8(BotWebViewContainer botWebViewContainer, String str, TLRPC.User user, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates == null) {
            if (tL_error != null) {
                BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError(tL_error);
                botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
                return;
            } else {
                BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError("UNKNOWN_BUTTON");
                botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
                return;
            }
        }
        MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates, false);
        botWebViewContainer.notifyEvent("requested_chat_sent", obj("req_id", str));
        long j = botWebViewContainer.botUser.id;
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        AnonymousClass6 anonymousClass6 = botWebViewContainer.new AnonymousClass6(bundle, user, j);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(anonymousClass6);
        }
        Delegate delegate = botWebViewContainer.delegate;
        if (delegate != null) {
            delegate.onCloseToTabs();
        }
    }

    class AnonymousClass6 extends ChatActivity {
        private boolean shownToast;
        final long val$managerId;
        final TLRPC.User val$newBot;

        AnonymousClass6(Bundle bundle, TLRPC.User user, long j) {
            super(bundle);
            this.val$newBot = user;
            this.val$managerId = j;
        }

        @Override
        public void onBecomeFullyVisible() {
            super.onBecomeFullyVisible();
            if (this.shownToast) {
                return;
            }
            this.shownToast = true;
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(this);
            int i = R.raw.contact_check;
            String string = LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.val$newBot));
            String string2 = LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(BotWebViewContainer.this.botUser));
            final long j = this.val$managerId;
            bulletinFactoryOf.createSimpleBulletin(i, string, AndroidUtilities.replaceSingleTag(string2, new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.AnonymousClass6.m5057$r8$lambda$QQqI8t_41hMtmo8gtQn5iSk0eA(this.f$0, j);
                }
            })).show();
        }

        public static void m5057$r8$lambda$QQqI8t_41hMtmo8gtQn5iSk0eA(AnonymousClass6 anonymousClass6, long j) {
            anonymousClass6.getClass();
            anonymousClass6.presentFragment(ChatActivity.of(j));
        }
    }

    public static void $r8$lambda$ykznKomKUEgnQP1_p4Wlm0T44UI(final BotWebViewContainer botWebViewContainer, boolean[] zArr, final String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, List list) {
        botWebViewContainer.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        zArr[0] = true;
        TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
        MessagesController.getInstance(botWebViewContainer.currentAccount);
        tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
        tL_messages_sendBotRequestedPeer.webapp_req_id = str;
        tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(botWebViewContainer.currentAccount).getInputPeer(((Long) it.next()).longValue()));
        }
        ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotWebViewContainer.$r8$lambda$aLufqnisHmmc4SiKBxnd25Lse50(this.f$0, str, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$aLufqnisHmmc4SiKBxnd25Lse50(BotWebViewContainer botWebViewContainer, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates, false);
            botWebViewContainer.notifyEvent("requested_chat_sent", obj("req_id", str));
        } else if (tL_error != null) {
            BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError(tL_error);
            botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
        } else {
            BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError("UNKNOWN_BUTTON");
            botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
        }
    }

    public static void m5046$r8$lambda$OI31RbEGHA1t9JzzfkhhtB6MQ8(BotWebViewContainer botWebViewContainer, boolean[] zArr, String str, DialogInterface dialogInterface) {
        botWebViewContainer.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
    }

    public static boolean $r8$lambda$oH32YzXrtbOcqA5gpMEVyR1tWpc(final BotWebViewContainer botWebViewContainer, boolean[] zArr, final String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        botWebViewContainer.getClass();
        if (arrayList != null && !arrayList.isEmpty()) {
            int i3 = 0;
            zArr[0] = true;
            TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
            MessagesController.getInstance(botWebViewContainer.currentAccount);
            tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(botWebViewContainer.botUser);
            tL_messages_sendBotRequestedPeer.webapp_req_id = str;
            tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                hashSet.add(Long.valueOf(((MessagesStorage.TopicKey) obj).dialogId));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInstance(botWebViewContainer.currentAccount).getInputPeer(((Long) it.next()).longValue()));
            }
            ConnectionsManager.getInstance(botWebViewContainer.currentAccount).sendRequestTyped(tL_messages_sendBotRequestedPeer, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    BotWebViewContainer.m5049$r8$lambda$Wsxp1YWA7tpepuc6QlzJApak04(this.f$0, str, (TLRPC.Updates) obj2, (TLRPC.TL_error) obj3);
                }
            });
        }
        dialogsActivity.finishFragment();
        return true;
    }

    public static void m5049$r8$lambda$Wsxp1YWA7tpepuc6QlzJApak04(BotWebViewContainer botWebViewContainer, String str, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates, false);
            botWebViewContainer.notifyEvent("requested_chat_sent", obj("req_id", str));
        } else if (tL_error != null) {
            BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError(tL_error);
            botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
        } else {
            BulletinFactory.of(botWebViewContainer, botWebViewContainer.resourcesProvider).showForError("UNKNOWN_BUTTON");
            botWebViewContainer.notifyEvent("requested_chat_failed", obj("req_id", str));
        }
    }

    private void setStorageKey(BotStorage botStorage, String str, String str2, String str3) {
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
                        notifyEvent(str2, obj("req_id", string));
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

    private void getStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        Object obj;
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
                    Pair key = botStorage.getKey(strOptString);
                    if (botStorage.secured && (obj = key.first) == null) {
                        notifyEvent(str2, obj("req_id", string, "value", obj, "can_restore", key.second));
                    } else {
                        notifyEvent(str2, obj("req_id", string, "value", key.first));
                    }
                } catch (RuntimeException e) {
                    notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
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

    private void restoreStorageKey(final BotStorage botStorage, String str, final String str2, final String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String string = jSONObject.getString("req_id");
            try {
                final String strOptString = jSONObject.optString("key");
                if (strOptString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    List storagesWithKey = botStorage.getStoragesWithKey(strOptString);
                    if (storagesWithKey.isEmpty()) {
                        notifyEvent(str3, obj("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                    } else {
                        botStorage.showChooseStorage(getContext(), storagesWithKey, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                BotWebViewContainer.m5039$r8$lambda$xkbbQLMGaBSKg2mFT7RW3PPmzw(this.f$0, str3, string, botStorage, strOptString, str2, (String) obj);
                            }
                        });
                    }
                } catch (Exception e) {
                    notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
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

    public static void m5039$r8$lambda$xkbbQLMGaBSKg2mFT7RW3PPmzw(BotWebViewContainer botWebViewContainer, String str, String str2, BotStorage botStorage, String str3, String str4, String str5) {
        botWebViewContainer.getClass();
        if (str5 == null) {
            botWebViewContainer.notifyEvent(str, obj("req_id", str2, "error", "RESTORE_CANCELLED"));
            return;
        }
        try {
            botStorage.restoreFrom(str5);
            botWebViewContainer.notifyEvent(str4, obj("req_id", str2, "value", (String) botStorage.getKey(str3).first));
        } catch (Exception e) {
            botWebViewContainer.notifyEvent(str, obj("req_id", str2, "error", e.getMessage()));
        }
    }

    private void clearStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                botStorage.clear();
                notifyEvent(str2, obj("req_id", string));
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

    public void reportSafeInsets(Rect rect, int i) {
        reportSafeInsets(rect, false);
        reportSafeContentInsets(i, false);
    }

    private void reportSafeInsets(Rect rect, boolean z) {
        if (rect != null) {
            if (z || !this.lastInsets.equals(rect)) {
                notifyEvent("safe_area_changed", obj("left", Float.valueOf(rect.left / AndroidUtilities.density), "top", Float.valueOf(rect.top / AndroidUtilities.density), "right", Float.valueOf(rect.right / AndroidUtilities.density), "bottom", Float.valueOf(rect.bottom / AndroidUtilities.density)));
                this.lastInsets.set(rect);
            }
        }
    }

    private void reportSafeContentInsets(int i, boolean z) {
        if (z || i != this.lastInsetsTopMargin) {
            notifyEvent("content_safe_area_changed", obj("left", 0, "top", Float.valueOf(i / AndroidUtilities.density), "right", 0, "bottom", 0));
            this.lastInsetsTopMargin = i;
        }
    }

    public void notifyEmojiStatusAccess(String str) {
        notifyEvent("emoji_status_access_requested", obj("status", str));
    }

    private void createBiometry() {
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

    private void notifyBiometryReceived() {
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

    private void unknownError() {
        unknownError(null);
    }

    private void unknownError(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        error(sb.toString());
    }

    private void error(String str) {
        BulletinFactory.of(this, this.resourcesProvider).createSimpleBulletin(R.raw.error, str).show();
    }

    private boolean ignoreDialog(int i) {
        if (this.currentDialog != null) {
            return true;
        }
        if (this.blockedDialogsUntil > 0 && System.currentTimeMillis() < this.blockedDialogsUntil) {
            return true;
        }
        if (this.lastDialogType != i || this.shownDialogsCount <= 3) {
            return false;
        }
        this.blockedDialogsUntil = System.currentTimeMillis() + 3000;
        this.shownDialogsCount = 0;
        return true;
    }

    private boolean showDialog(int i, AlertDialog alertDialog, final Runnable runnable) {
        if (alertDialog == null || ignoreDialog(i)) {
            return false;
        }
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BotWebViewContainer.m5053$r8$lambda$sWpH9_ejm9fLBlaBDzCIm1blnw(this.f$0, runnable, dialogInterface);
            }
        });
        this.currentDialog = alertDialog;
        alertDialog.setDismissDialogByButtons(false);
        this.currentDialog.show();
        if (this.lastDialogType != i) {
            this.lastDialogType = i;
            this.shownDialogsCount = 0;
            this.blockedDialogsUntil = 0L;
        }
        this.shownDialogsCount++;
        return true;
    }

    public static void m5053$r8$lambda$sWpH9_ejm9fLBlaBDzCIm1blnw(BotWebViewContainer botWebViewContainer, Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            botWebViewContainer.getClass();
            runnable.run();
        }
        botWebViewContainer.currentDialog = null;
    }

    public void openQrScanActivity() {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return;
        }
        this.cameraBottomSheet = CameraScanActivity.showAsSheet(activity, false, 3, new CameraScanActivity.CameraScanActivityDelegate() {
            @Override
            public void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
            }

            @Override
            public boolean processQr(String str, Runnable runnable) {
                return CameraScanActivity.CameraScanActivityDelegate.CC.$default$processQr(this, str, runnable);
            }

            @Override
            public void didFindQr(String str) {
                try {
                    BotWebViewContainer.this.lastClickMs = System.currentTimeMillis();
                    BotWebViewContainer.this.notifyEvent("qr_text_received", new JSONObject().put("data", str));
                } catch (JSONException e) {
                    FileLog.e(e);
                }
            }

            @Override
            public String getSubtitleText() {
                return BotWebViewContainer.this.lastQrText;
            }

            @Override
            public void onDismiss() {
                BotWebViewContainer.this.notifyEvent("scan_qr_popup_closed", null);
                BotWebViewContainer.this.hasQRPending = false;
            }
        });
    }

    private JSONObject buildThemeParams() {
        try {
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, true);
            if (jSONObjectMakeThemeParams != null) {
                return new JSONObject().put("theme_params", jSONObjectMakeThemeParams);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return new JSONObject();
    }

    private int getColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    public static class BotWebViewProxy {
        public BotWebViewContainer container;

        public BotWebViewProxy(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        public void setContainer(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            try {
                if (this.container == null) {
                    FileLog.d("webviewproxy.postEvent: no container");
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            BotWebViewContainer.BotWebViewProxy.$r8$lambda$HMKe2dSTzx71q3LX6nbnyEFmlyM(this.f$0, str, str2);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void $r8$lambda$HMKe2dSTzx71q3LX6nbnyEFmlyM(BotWebViewProxy botWebViewProxy, String str, String str2) {
            botWebViewProxy.getClass();
            try {
                BotWebViewContainer botWebViewContainer = botWebViewProxy.container;
                if (botWebViewContainer == null) {
                    return;
                }
                botWebViewContainer.onEventReceived(botWebViewProxy, str, str2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static class WebViewProxy {
        public BotWebViewContainer container;
        public final MyWebView webView;

        public WebViewProxy(MyWebView myWebView, BotWebViewContainer botWebViewContainer) {
            this.webView = myWebView;
            this.container = botWebViewContainer;
        }

        public void setContainer(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            if (this.container == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.WebViewProxy.$r8$lambda$XiiLD1aDxLYjQJBNdRQrxVXYNIk(this.f$0, str, str2);
                }
            });
        }

        public static void $r8$lambda$XiiLD1aDxLYjQJBNdRQrxVXYNIk(WebViewProxy webViewProxy, String str, String str2) {
            BotWebViewContainer botWebViewContainer = webViewProxy.container;
            if (botWebViewContainer == null) {
                return;
            }
            botWebViewContainer.onWebEventReceived(str, str2);
        }

        @JavascriptInterface
        public void resolveShare(final String str, final byte[] bArr, final String str2, final String str3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.WebViewProxy.$r8$lambda$cZosmsiCezdrN2yNaOmmXcNbL_U(this.f$0, str, bArr, str2, str3);
                }
            });
        }

        public static void $r8$lambda$cZosmsiCezdrN2yNaOmmXcNbL_U(final WebViewProxy webViewProxy, String str, byte[] bArr, String str2, String str3) {
            String strOptString;
            String strOptString2;
            String strOptString3;
            String str4;
            LaunchActivity launchActivity;
            if (webViewProxy.container == null) {
                return;
            }
            if (System.currentTimeMillis() - webViewProxy.container.lastClickMs <= 10000) {
                webViewProxy.container.lastClickMs = 0L;
                Context context = webViewProxy.webView.getContext();
                Activity activityFindActivity = AndroidUtilities.findActivity(context);
                if (activityFindActivity == null && (launchActivity = LaunchActivity.instance) != null) {
                    activityFindActivity = launchActivity;
                }
                if (context == null || activityFindActivity == null || !(activityFindActivity instanceof LaunchActivity) || activityFindActivity.isFinishing() || !webViewProxy.webView.isAttachedToWindow()) {
                    webViewProxy.webView.evaluateJS("window.navigator.__share__receive(\"security\")");
                    return;
                }
                LaunchActivity launchActivity2 = (LaunchActivity) activityFindActivity;
                File file = null;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    strOptString = jSONObject.optString("url", null);
                    try {
                        strOptString2 = jSONObject.optString("text", null);
                        try {
                            strOptString3 = jSONObject.optString("title", null);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            strOptString3 = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strOptString2 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    strOptString = null;
                    strOptString2 = null;
                }
                StringBuilder sb = new StringBuilder();
                if (strOptString3 != null) {
                    sb.append(strOptString3);
                }
                if (strOptString2 != null) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strOptString2);
                }
                if (strOptString != null) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(strOptString);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                if (bArr != null) {
                    int i = 0;
                    while (true) {
                        if (file == null || file.exists()) {
                            File directory = FileLoader.getDirectory(4);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(FileLoader.fixFileName(str2 == null ? "file" : str2));
                            if (i > 0) {
                                str4 = " (" + i + ")";
                            } else {
                                str4 = "";
                            }
                            sb2.append(str4);
                            file = new File(directory, sb2.toString());
                            i++;
                        } else {
                            try {
                                break;
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    try {
                        if (str3 == null) {
                            intent.setType("text/plain");
                        } else {
                            intent.setType(str3);
                        }
                        if (str2 != null) {
                            intent.putExtra("android.intent.extra.TITLE", str2);
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            try {
                                intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(launchActivity2, ApplicationLoader.getApplicationId() + ".provider", file));
                                intent.setFlags(1);
                            } catch (Exception unused) {
                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                            }
                        } else {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                } else {
                    intent.setType("text/plain");
                }
                launchActivity2.whenWebviewShareAPIDone(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotWebViewContainer.WebViewProxy.$r8$lambda$APyhynYErYBJpKLMeSHYDgulq6U(this.f$0, (Boolean) obj);
                    }
                });
                launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                return;
            }
            webViewProxy.webView.evaluateJS("window.navigator.__share__receive(\"security\")");
        }

        public static void $r8$lambda$APyhynYErYBJpKLMeSHYDgulq6U(WebViewProxy webViewProxy, Boolean bool) {
            MyWebView myWebView = webViewProxy.webView;
            StringBuilder sb = new StringBuilder();
            sb.append("window.navigator.__share__receive(");
            sb.append(bool.booleanValue() ? "" : "'abort'");
            sb.append(")");
            myWebView.evaluateJS(sb.toString());
        }
    }

    public interface Delegate {
        BotSensors getBotSensors();

        boolean isClipboardAvailable();

        void onCloseRequested(Runnable runnable);

        void onCloseToTabs();

        void onEmojiStatusGranted(boolean z);

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

        void onWebAppBackgroundChanged(boolean z, int i);

        void onWebAppExpand();

        void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject);

        void onWebAppReady();

        void onWebAppSetActionBarColor(int i, int i2, boolean z);

        void onWebAppSetBackgroundColor(int i);

        void onWebAppSetNavigationBarColor(int i);

        void onWebAppSetupClosingBehavior(boolean z);

        void onWebAppSwipingBehavior(boolean z);

        void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List list);

        public abstract class CC {
            public static BotSensors $default$getBotSensors(Delegate delegate) {
                return null;
            }

            public static boolean $default$isClipboardAvailable(Delegate delegate) {
                return false;
            }

            public static void $default$onEmojiStatusGranted(Delegate delegate, boolean z) {
            }

            public static void $default$onEmojiStatusSet(Delegate delegate, TLRPC.Document document) {
            }

            public static void $default$onLocationGranted(Delegate delegate, boolean z) {
            }

            public static void $default$onOpenBackFromTabs(Delegate delegate) {
            }

            public static void $default$onOrientationLockChanged(Delegate delegate, boolean z) {
            }

            public static void $default$onSendWebViewData(Delegate delegate, String str) {
            }

            public static void $default$onSharedTo(Delegate delegate, ArrayList arrayList) {
            }

            public static void $default$onWebAppBackgroundChanged(Delegate delegate, boolean z, int i) {
            }

            public static void $default$onWebAppReady(Delegate delegate) {
            }

            public static void $default$onWebAppSetNavigationBarColor(Delegate delegate, int i) {
            }

            public static String $default$onFullscreenRequested(Delegate delegate, boolean z, boolean z2) {
                return "UNSUPPORTED";
            }
        }
    }

    public static final class PopupButton {
        public String id;
        public String text;
        public int textColorKey;

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

    public static boolean isTonsite(String str) {
        return str != null && isTonsite(Uri.parse(str));
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

    public static WebResourceResponse proxyTON(WebResourceRequest webResourceRequest) {
        return proxyTON(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
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

    public static WebResourceResponse proxyTON(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Browser.replaceHostname(Uri.parse(str2), rotateTONHost(AndroidUtilities.getHostAuthority(str2)), "https")).openConnection();
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

    public static class MyWebView extends WebView {
        public final boolean bot;
        private BotWebViewContainer botWebViewContainer;
        private BrowserHistory.Entry currentHistoryEntry;
        private BottomSheet currentSheet;
        private String currentUrl;
        public boolean dangerousUrl;
        public boolean errorShown;
        public String errorShownAt;
        public boolean injectedJS;
        private boolean isPageLoaded;
        public int lastActionBarColor;
        public boolean lastActionBarColorGot;
        public int lastBackgroundColor;
        public boolean lastBackgroundColorGot;
        public Bitmap lastFavicon;
        public boolean lastFaviconGot;
        private String lastFaviconUrl;
        private HashMap lastFavicons;
        public String lastSiteName;
        public String lastTitle;
        public boolean lastTitleGot;
        private String lastUrl;
        private Runnable onCloseListener;
        private String openedByUrl;
        public MyWebView opener;
        private int prevScrollX;
        private int prevScrollY;
        private int searchCount;
        private int searchIndex;
        private Runnable searchListener;
        private boolean searchLoading;
        private final int tag;
        public String urlFallback;
        private WebViewScrollListener webViewScrollListener;
        private Runnable whenPageLoaded;

        public static void m5058$r8$lambda$n4G84VuBJd3zHi0noWbm8zvFCg(String str) {
        }

        public boolean isPageLoaded() {
            return this.isPageLoaded;
        }

        public void d(String str) {
            FileLog.d("[webview] #" + this.tag + " " + str);
        }

        public MyWebView(Context context, boolean z, long j) {
            super(context);
            this.tag = BotWebViewContainer.access$1408();
            this.urlFallback = "about:blank";
            this.lastFavicons = new HashMap();
            this.bot = z;
            d("created new webview " + this);
            setOnLongClickListener(new AnonymousClass1());
            setWebViewClient(new AnonymousClass2(z, context));
            setWebChromeClient(new AnonymousClass3(context, z, j));
            setFindListener(new WebView.FindListener() {
                @Override
                public void onFindResultReceived(int i, int i2, boolean z2) {
                    MyWebView.this.searchIndex = i;
                    MyWebView.this.searchCount = i2;
                    MyWebView.this.searchLoading = !z2;
                    if (MyWebView.this.searchListener != null) {
                        MyWebView.this.searchListener.run();
                    }
                }
            });
            if (z) {
                return;
            }
            setDownloadListener(new AnonymousClass5());
        }

        class AnonymousClass1 implements View.OnLongClickListener {
            AnonymousClass1() {
            }

            @Override
            public boolean onLongClick(View view) {
                WebView.HitTestResult hitTestResult = MyWebView.this.getHitTestResult();
                if (hitTestResult.getType() == 7) {
                    final String extra = hitTestResult.getExtra();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            BotWebViewContainer.MyWebView.AnonymousClass1.$r8$lambda$tsslrC86A4YWqVNnPWddUzhQhpk(this.f$0, extra);
                        }
                    });
                    return true;
                }
                if (hitTestResult.getType() != 5) {
                    return false;
                }
                final String extra2 = hitTestResult.getExtra();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewContainer.MyWebView.AnonymousClass1.m5060$r8$lambda$T_xtGRv2OeOjArqZHoLFfYUKvw(this.f$0, extra2);
                    }
                });
                return true;
            }

            public static void $r8$lambda$tsslrC86A4YWqVNnPWddUzhQhpk(final AnonymousClass1 anonymousClass1, final String str) {
                String strReplaceHostname;
                anonymousClass1.getClass();
                BottomSheet.Builder builder = new BottomSheet.Builder(MyWebView.this.getContext(), false, null);
                try {
                    Uri uri = Uri.parse(str);
                    strReplaceHostname = (uri == null || uri.getScheme().equalsIgnoreCase("data")) ? str : Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    try {
                        FileLog.e((Throwable) e, false);
                    } catch (Exception e2) {
                        e = e2;
                        strReplaceHostname = str;
                        FileLog.e(e);
                        builder.setTitleMultipleLines(true);
                        builder.setTitle(strReplaceHostname);
                        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                BotWebViewContainer.MyWebView.AnonymousClass1.m5059$r8$lambda$Mcnso9ll299ehCbMZ0c3cFUblY(this.f$0, str, dialogInterface, i);
                            }
                        });
                        MyWebView.this.currentSheet = builder.show();
                    }
                }
                try {
                    strReplaceHostname = URLDecoder.decode(strReplaceHostname.replaceAll("\\+", "%2b"), "UTF-8");
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                }
                builder.setTitleMultipleLines(true);
                builder.setTitle(strReplaceHostname);
                builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass1.m5059$r8$lambda$Mcnso9ll299ehCbMZ0c3cFUblY(this.f$0, str, dialogInterface, i);
                    }
                });
                MyWebView.this.currentSheet = builder.show();
            }

            public static void m5059$r8$lambda$Mcnso9ll299ehCbMZ0c3cFUblY(AnonymousClass1 anonymousClass1, String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    MyWebView.this.loadUrl(str);
                    return;
                }
                anonymousClass1.getClass();
                if (i != 1) {
                    if (i == 2) {
                        AndroidUtilities.addToClipboard(str);
                        if (MyWebView.this.botWebViewContainer != null) {
                            MyWebView.this.botWebViewContainer.showLinkCopiedBulletin();
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", MyWebView.this.getContext().getPackageName());
                    MyWebView.this.getContext().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    MyWebView.this.loadUrl(str);
                }
            }

            public static void m5060$r8$lambda$T_xtGRv2OeOjArqZHoLFfYUKvw(final AnonymousClass1 anonymousClass1, final String str) {
                String strDecode;
                anonymousClass1.getClass();
                BottomSheet.Builder builder = new BottomSheet.Builder(MyWebView.this.getContext(), false, null);
                try {
                    Uri uri = Uri.parse(str);
                    strDecode = Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    try {
                        FileLog.e((Throwable) e, false);
                        strDecode = str;
                    } catch (Exception e2) {
                        e = e2;
                        strDecode = str;
                        FileLog.e(e);
                        builder.setTitleMultipleLines(true);
                        builder.setTitle(strDecode);
                        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)}, new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                BotWebViewContainer.MyWebView.AnonymousClass1.m5061$r8$lambda$hd2SSlT12bhXlyhBYkFGFIal6o(this.f$0, str, dialogInterface, i);
                            }
                        });
                        MyWebView.this.currentSheet = builder.show();
                    }
                }
                try {
                    strDecode = URLDecoder.decode(strDecode.replaceAll("\\+", "%2b"), "UTF-8");
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                }
                builder.setTitleMultipleLines(true);
                builder.setTitle(strDecode);
                builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)}, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass1.m5061$r8$lambda$hd2SSlT12bhXlyhBYkFGFIal6o(this.f$0, str, dialogInterface, i);
                    }
                });
                MyWebView.this.currentSheet = builder.show();
            }

            public static void m5061$r8$lambda$hd2SSlT12bhXlyhBYkFGFIal6o(AnonymousClass1 anonymousClass1, String str, DialogInterface dialogInterface, int i) {
                anonymousClass1.getClass();
                if (i == 0) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.putExtra("create_new_tab", true);
                        intent.putExtra("com.android.browser.application_id", MyWebView.this.getContext().getPackageName());
                        MyWebView.this.getContext().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        MyWebView.this.loadUrl(str);
                        return;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        AndroidUtilities.addToClipboard(str);
                        if (MyWebView.this.botWebViewContainer != null) {
                            MyWebView.this.botWebViewContainer.showLinkCopiedBulletin();
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    String strGuessFileName = URLUtil.guessFileName(str, null, "image/*");
                    if (strGuessFileName == null) {
                        strGuessFileName = "image.png";
                    }
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setMimeType("image/*");
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strGuessFileName);
                    DownloadManager downloadManager = (DownloadManager) MyWebView.this.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    if (MyWebView.this.botWebViewContainer != null) {
                        BulletinFactory.of(MyWebView.this.botWebViewContainer, MyWebView.this.botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.ic_download, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, strGuessFileName))).show(true);
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        }

        class AnonymousClass2 extends WebViewClient {
            private boolean firstRequest = true;
            private final Runnable resetErrorRunnable = new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.MyWebView.AnonymousClass2.$r8$lambda$tHLf8mLy7D2CauvgcHFlSSbL418(this.f$0);
                }
            };
            final boolean val$bot;
            final Context val$context;

            AnonymousClass2(boolean z, Context context) {
                this.val$bot = z;
                this.val$context = context;
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                int i;
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("shouldInterceptRequest ");
                HttpURLConnection httpURLConnection = null;
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                myWebView.d(sb.toString());
                if (webResourceRequest != null && BotWebViewContainer.isTonsite(webResourceRequest.getUrl())) {
                    MyWebView.this.d("proxying ton");
                    this.firstRequest = false;
                    return BotWebViewContainer.proxyTON(webResourceRequest);
                }
                if (!this.val$bot && MyWebView.this.opener != null && this.firstRequest) {
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
                                    if (!MyWebView.this.dangerousUrl && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                        for (String str : next.getValue()) {
                                            if (str != null && !"unsafe-none".equals(str.toLowerCase()) && !"same-site".equals(str.toLowerCase())) {
                                                MyWebView.this.d("<!> dangerous header CORS policy: " + key + ": " + str + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                                MyWebView.this.dangerousUrl = true;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        BotWebViewContainer.MyWebView.AnonymousClass2.$r8$lambda$5bZiH0Us0c937ByQMUNfYNkZj_A(this.f$0);
                                                    }
                                                });
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
                            String str2 = contentEncoding;
                            this.firstRequest = false;
                            return new WebResourceResponse(contentType, str2, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), map, httpURLConnection2.getInputStream());
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

            public static void $r8$lambda$5bZiH0Us0c937ByQMUNfYNkZj_A(AnonymousClass2 anonymousClass2) {
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView.urlFallback, !myWebView.canGoBack(), !MyWebView.this.canGoForward());
                }
            }

            @Override
            public void onPageCommitVisible(WebView webView, String str) {
                if (MyWebView.this.whenPageLoaded != null) {
                    Runnable runnable = MyWebView.this.whenPageLoaded;
                    MyWebView.this.whenPageLoaded = null;
                    runnable.run();
                }
                MyWebView.this.d("onPageCommitVisible " + str);
                if (!this.val$bot) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    MyWebView.this.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                } else {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.injectedJS = true;
                    myWebView2.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                super.onPageCommitVisible(webView, str);
            }

            @Override
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                if (!this.val$bot && (MyWebView.this.currentHistoryEntry == null || !TextUtils.equals(MyWebView.this.currentHistoryEntry.url, str))) {
                    MyWebView.this.currentHistoryEntry = new BrowserHistory.Entry();
                    MyWebView.this.currentHistoryEntry.id = Utilities.fastRandom.nextLong();
                    MyWebView.this.currentHistoryEntry.time = System.currentTimeMillis();
                    MyWebView.this.currentHistoryEntry.url = BotWebViewContainer.magic2tonsite(MyWebView.this.getUrl());
                    MyWebView.this.currentHistoryEntry.meta = WebMetadataCache.WebMetadata.from(MyWebView.this);
                    BrowserHistory.pushHistory(MyWebView.this.currentHistoryEntry);
                }
                MyWebView.this.d("doUpdateVisitedHistory " + str + " " + z);
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView.dangerousUrl ? myWebView.urlFallback : str, !myWebView.canGoBack(), !MyWebView.this.canGoForward());
                }
                super.doUpdateVisitedHistory(webView, str, z);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                MyWebView.this.d("shouldInterceptRequest " + str);
                if (BotWebViewContainer.isTonsite(str)) {
                    MyWebView.this.d("proxying ton");
                    return BotWebViewContainer.proxyTON("GET", str, null);
                }
                return super.shouldInterceptRequest(webView, str);
            }

            @Override
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (Build.VERSION.SDK_INT >= 26) {
                    MyWebView myWebView = MyWebView.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessGone priority=");
                    sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                    sb.append(" didCrash=");
                    sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
                    myWebView.d(sb.toString());
                } else {
                    MyWebView.this.d("onRenderProcessGone");
                }
                try {
                    if (!AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                        return true;
                    }
                    new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                        @Override
                        public final void run() {
                            Browser.openUrl(BotWebViewContainer.MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                        }
                    })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            BotWebViewContainer.MyWebView.AnonymousClass2.m5062$r8$lambda$sKvG_VjLlS0lCVI6LGy33jmB6w(this.f$0, dialogInterface);
                        }
                    }).show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            public static void m5062$r8$lambda$sKvG_VjLlS0lCVI6LGy33jmB6w(AnonymousClass2 anonymousClass2, DialogInterface dialogInterface) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.delegate == null) {
                    return;
                }
                MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null || str.trim().startsWith("sms:")) {
                    return false;
                }
                if (str.trim().startsWith("tel:")) {
                    MyWebView myWebView = MyWebView.this;
                    if (myWebView.opener != null) {
                        if (myWebView.botWebViewContainer.delegate != null) {
                            MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                        } else if (MyWebView.this.onCloseListener != null) {
                            MyWebView.this.onCloseListener.run();
                            MyWebView.this.onCloseListener = null;
                        }
                    }
                    Browser.openUrl(this.val$context, str);
                    return true;
                }
                Uri uri = Uri.parse(str);
                if (!this.val$bot) {
                    if (Browser.openInExternalApp(this.val$context, str, true)) {
                        MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                        if (!MyWebView.this.isPageLoaded && !MyWebView.this.canGoBack()) {
                            if (MyWebView.this.botWebViewContainer.delegate != null) {
                                MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                            } else if (MyWebView.this.onCloseListener != null) {
                                MyWebView.this.onCloseListener.run();
                                MyWebView.this.onCloseListener = null;
                            }
                        }
                        return true;
                    }
                    if (str.startsWith("intent://") || (uri != null && uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent"))) {
                        try {
                            String stringExtra = Intent.parseUri(uri.toString(), 1).getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                MyWebView.this.loadUrl(stringExtra);
                                return true;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    if (uri != null && uri.getScheme() != null && !"https".equals(uri.getScheme()) && !"http".equals(uri.getScheme()) && !"tonsite".equals(uri.getScheme())) {
                        MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                        Browser.openUrl(MyWebView.this.getContext(), uri);
                        return true;
                    }
                }
                if (MyWebView.this.botWebViewContainer != null && Browser.isInternalUri(uri, null)) {
                    if (!this.val$bot && "1".equals(uri.getQueryParameter("embed")) && "t.me".equals(uri.getAuthority())) {
                        return false;
                    }
                    if (MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols.contains(uri.getScheme())) {
                        MyWebView myWebView2 = MyWebView.this;
                        if (myWebView2.opener != null) {
                            if (myWebView2.botWebViewContainer.delegate != null) {
                                MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                            } else if (MyWebView.this.onCloseListener != null) {
                                MyWebView.this.onCloseListener.run();
                                MyWebView.this.onCloseListener = null;
                            }
                            if (MyWebView.this.opener.botWebViewContainer != null && MyWebView.this.opener.botWebViewContainer.delegate != null) {
                                MyWebView.this.opener.botWebViewContainer.delegate.onCloseToTabs();
                            }
                        }
                        MyWebView.this.botWebViewContainer.onOpenUri(uri);
                    }
                    MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
                if (uri != null) {
                    MyWebView.this.currentUrl = uri.toString();
                }
                MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }

            public static void $r8$lambda$tHLf8mLy7D2CauvgcHFlSSbL418(AnonymousClass2 anonymousClass2) {
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView.this.errorShown = false;
                    botWebViewContainer.onErrorShown(false, 0, null);
                }
            }

            @Override
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                String str2;
                if (MyWebView.this.botWebViewContainer == null || !MyWebView.this.botWebViewContainer.isVerifyingAge()) {
                    MyWebView.this.getSettings().setMediaPlaybackRequiresUserGesture(true);
                }
                if (MyWebView.this.currentSheet != null) {
                    MyWebView.this.currentSheet.dismiss();
                    MyWebView.this.currentSheet = null;
                }
                MyWebView.this.currentHistoryEntry = null;
                MyWebView.this.currentUrl = str;
                MyWebView myWebView = MyWebView.this;
                myWebView.lastSiteName = null;
                myWebView.lastActionBarColorGot = false;
                myWebView.lastBackgroundColorGot = false;
                myWebView.lastFaviconGot = false;
                myWebView.d("onPageStarted " + str);
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView myWebView2 = MyWebView.this;
                    if (myWebView2.errorShown && ((str2 = myWebView2.errorShownAt) == null || !TextUtils.equals(str2, str))) {
                        AndroidUtilities.runOnUIThread(this.resetErrorRunnable, 40L);
                    }
                }
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView3 = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView3.dangerousUrl ? myWebView3.urlFallback : str, !myWebView3.canGoBack(), true ^ MyWebView.this.canGoForward());
                }
                super.onPageStarted(webView, str, bitmap);
                MyWebView.this.injectedJS = false;
            }

            @Override
            public void onPageFinished(WebView webView, String str) {
                boolean z;
                MyWebView.this.isPageLoaded = true;
                if (MyWebView.this.whenPageLoaded != null) {
                    Runnable runnable = MyWebView.this.whenPageLoaded;
                    MyWebView.this.whenPageLoaded = null;
                    runnable.run();
                    z = false;
                } else {
                    z = true;
                }
                MyWebView.this.d("onPageFinished");
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.setPageLoaded(str, z);
                } else {
                    MyWebView.this.d("onPageFinished: no container");
                }
                if (!this.val$bot) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    MyWebView.this.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                } else {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.injectedJS = true;
                    myWebView2.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                MyWebView.this.saveHistory();
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView3 = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView3.dangerousUrl ? myWebView3.urlFallback : myWebView3.getUrl(), !MyWebView.this.canGoBack(), true ^ MyWebView.this.canGoForward());
                }
            }

            @Override
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (Build.VERSION.SDK_INT >= 23) {
                    MyWebView.this.d("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
                    if (MyWebView.this.botWebViewContainer != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        MyWebView myWebView = MyWebView.this;
                        myWebView.lastSiteName = null;
                        myWebView.lastActionBarColorGot = false;
                        myWebView.lastBackgroundColorGot = false;
                        myWebView.lastFaviconGot = false;
                        myWebView.lastTitleGot = false;
                        myWebView.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? MyWebView.this.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastTitle = null;
                        botWebViewContainer.onTitleChanged(null);
                        BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastFavicon = null;
                        botWebViewContainer2.onFaviconChanged(null);
                        BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.errorShown = true;
                        botWebViewContainer3.onErrorShown(true, webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
                    }
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                MyWebView.this.d("onReceivedError: " + i + " " + str + " url=" + str2);
                if (Build.VERSION.SDK_INT < 23 && MyWebView.this.botWebViewContainer != null) {
                    AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                    MyWebView myWebView = MyWebView.this;
                    myWebView.lastSiteName = null;
                    myWebView.lastActionBarColorGot = false;
                    myWebView.lastBackgroundColorGot = false;
                    myWebView.lastFaviconGot = false;
                    myWebView.lastTitleGot = false;
                    myWebView.errorShownAt = myWebView.getUrl();
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView.this.lastTitle = null;
                    botWebViewContainer.onTitleChanged(null);
                    BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                    MyWebView.this.lastFavicon = null;
                    botWebViewContainer2.onFaviconChanged(null);
                    BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                    MyWebView.this.errorShown = true;
                    botWebViewContainer3.onErrorShown(true, i, str);
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedHttpError: statusCode=");
                sb.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
                sb.append(" request=");
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                myWebView.d(sb.toString());
                if (MyWebView.this.botWebViewContainer != null) {
                    if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        MyWebView myWebView2 = MyWebView.this;
                        myWebView2.lastSiteName = null;
                        myWebView2.lastActionBarColorGot = false;
                        myWebView2.lastBackgroundColorGot = false;
                        myWebView2.lastFaviconGot = false;
                        myWebView2.lastTitleGot = false;
                        myWebView2.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? MyWebView.this.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastTitle = null;
                        botWebViewContainer.onTitleChanged(null);
                        BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastFavicon = null;
                        botWebViewContainer2.onFaviconChanged(null);
                        BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.errorShown = true;
                        botWebViewContainer3.onErrorShown(true, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
                    }
                }
            }

            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedSslError: error=");
                sb.append(sslError);
                sb.append(" url=");
                sb.append(sslError == null ? null : sslError.getUrl());
                myWebView.d(sb.toString());
                sslErrorHandler.cancel();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        class AnonymousClass3 extends WebChromeClient {
            private Dialog lastPermissionsDialog;
            final boolean val$bot;
            final long val$botId;
            final Context val$context;

            AnonymousClass3(Context context, boolean z, long j) {
                this.val$context = context;
                this.val$bot = z;
                this.val$botId = j;
            }

            @Override
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                final boolean[] zArr = {false};
                new AlertDialog.Builder(this.val$context, MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$JIRgPyLkvZvw66mMqbAAjH2Ayd8(zArr, jsResult, alertDialog, i);
                    }
                }).setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$K1Afog_syJZf2IitVkUD71GBLv4(zArr, jsResult, dialogInterface);
                    }
                }).show();
                return true;
            }

            public static void $r8$lambda$JIRgPyLkvZvw66mMqbAAjH2Ayd8(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.confirm();
            }

            public static void $r8$lambda$K1Afog_syJZf2IitVkUD71GBLv4(boolean[] zArr, JsResult jsResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            @Override
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                final boolean[] zArr = {false};
                new AlertDialog.Builder(this.val$context, MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$2yWw2BLNVDPE9RgDuTMCL9FnW_0(zArr, jsResult, alertDialog, i);
                    }
                }).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.m5066$r8$lambda$R0Kpxaui4vPzYr1rro_d6_1xc4(zArr, jsResult, alertDialog, i);
                    }
                }).setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$io3EJ7eiBtyg5Jwe4zT5o_y4Yrg(zArr, jsResult, dialogInterface);
                    }
                }).show();
                return true;
            }

            public static void $r8$lambda$2yWw2BLNVDPE9RgDuTMCL9FnW_0(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            public static void m5066$r8$lambda$R0Kpxaui4vPzYr1rro_d6_1xc4(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.confirm();
            }

            public static void $r8$lambda$io3EJ7eiBtyg5Jwe4zT5o_y4Yrg(boolean[] zArr, JsResult jsResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            @Override
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
                Theme.ResourcesProvider resourcesProvider = MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider;
                final boolean[] zArr = {false};
                AlertDialog.Builder message = new AlertDialog.Builder(this.val$context, resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2);
                final EditTextCaption editTextCaption = new EditTextCaption(this.val$context, resourcesProvider);
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
                LinearLayout linearLayout = new LinearLayout(this.val$context);
                linearLayout.setOrientation(1);
                linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
                message.makeCustomMaxHeight();
                message.setView(linearLayout);
                message.setWidth(AndroidUtilities.dp(292.0f));
                message.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.m5065$r8$lambda$LMHOtTZ1WIWSZO19WLo8NoNkI(zArr, jsPromptResult, alertDialog, i);
                    }
                });
                message.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$FlsajW65O1qximWu9YktPhKFj1I(zArr, jsPromptResult, editTextCaption, alertDialog, i);
                    }
                });
                message.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$46yWweFpbnX7LDYh2i48Aea3vk4(zArr, jsPromptResult, dialogInterface);
                    }
                });
                message.overrideDismissListener(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$LbrLC539usybksXm7pXYylqEpbM(editTextCaption, (Runnable) obj);
                    }
                });
                final AlertDialog alertDialogShow = message.show();
                editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 6) {
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        editTextCaption.requestFocus();
                    }
                });
                return true;
            }

            public static void m5065$r8$lambda$LMHOtTZ1WIWSZO19WLo8NoNkI(boolean[] zArr, JsPromptResult jsPromptResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.cancel();
            }

            public static void $r8$lambda$FlsajW65O1qximWu9YktPhKFj1I(boolean[] zArr, JsPromptResult jsPromptResult, EditTextCaption editTextCaption, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.confirm(editTextCaption.getText().toString());
            }

            public static void $r8$lambda$46yWweFpbnX7LDYh2i48Aea3vk4(boolean[] zArr, JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.cancel();
            }

            public static void $r8$lambda$LbrLC539usybksXm7pXYylqEpbM(EditTextCaption editTextCaption, Runnable runnable) {
                AndroidUtilities.hideKeyboard(editTextCaption);
                AndroidUtilities.runOnUIThread(runnable, 80L);
            }

            @Override
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                String str;
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedIcon favicon=");
                if (bitmap == null) {
                    str = "null";
                } else {
                    str = bitmap.getWidth() + "x" + bitmap.getHeight();
                }
                sb.append(str);
                myWebView.d(sb.toString());
                if (bitmap != null && (!TextUtils.equals(MyWebView.this.getUrl(), MyWebView.this.lastFaviconUrl) || MyWebView.this.lastFavicon == null || bitmap.getWidth() > MyWebView.this.lastFavicon.getWidth())) {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.lastFavicon = bitmap;
                    myWebView2.lastFaviconUrl = myWebView2.getUrl();
                    MyWebView myWebView3 = MyWebView.this;
                    myWebView3.lastFaviconGot = true;
                    myWebView3.saveHistory();
                }
                Bitmap bitmap2 = (Bitmap) MyWebView.this.lastFavicons.get(MyWebView.this.getUrl());
                if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
                    MyWebView.this.lastFavicons.put(MyWebView.this.getUrl(), bitmap);
                }
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onFaviconChanged(bitmap);
                }
                super.onReceivedIcon(webView, bitmap);
            }

            @Override
            public void onReceivedTitle(WebView webView, String str) {
                MyWebView.this.d("onReceivedTitle title=" + str);
                MyWebView myWebView = MyWebView.this;
                if (!myWebView.errorShown) {
                    myWebView.lastTitleGot = true;
                    myWebView.lastTitle = str;
                }
                if (myWebView.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onTitleChanged(str);
                }
                super.onReceivedTitle(webView, str);
            }

            @Override
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                MyWebView.this.d("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
                super.onReceivedTouchIconUrl(webView, str, z);
            }

            @Override
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                BaseFragment safeLastFragment;
                MyWebView.this.d("onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message);
                String url = MyWebView.this.getUrl();
                if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
                    if (MyWebView.this.botWebViewContainer == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                        return false;
                    }
                    if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                        safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
                    }
                    ArticleViewer articleViewerCreateArticleViewer = safeLastFragment.createArticleViewer(true);
                    articleViewerCreateArticleViewer.setOpener(MyWebView.this);
                    articleViewerCreateArticleViewer.open((String) null);
                    MyWebView lastWebView = articleViewerCreateArticleViewer.getLastWebView();
                    if (!TextUtils.isEmpty(url)) {
                        lastWebView.urlFallback = url;
                    }
                    MyWebView.this.d("onCreateWindow: newWebView=" + lastWebView);
                    if (lastWebView != null) {
                        ((WebView.WebViewTransport) message.obj).setWebView(lastWebView);
                        message.sendToTarget();
                        return true;
                    }
                    articleViewerCreateArticleViewer.close(true, true);
                    return false;
                }
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new AnonymousClass2(webView2));
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                return true;
            }

            class AnonymousClass2 extends WebViewClient {
                final WebView val$newWebView;

                AnonymousClass2(WebView webView) {
                    this.val$newWebView = webView;
                }

                @Override
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        MyWebView myWebView = MyWebView.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append("newWebView.onRenderProcessGone priority=");
                        sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                        sb.append(" didCrash=");
                        sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
                        myWebView.d(sb.toString());
                    } else {
                        MyWebView.this.d("newWebView.onRenderProcessGone");
                    }
                    try {
                        if (!AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                            return true;
                        }
                        new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                            @Override
                            public final void run() {
                                Browser.openUrl(BotWebViewContainer.MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                            }
                        })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.AnonymousClass2.$r8$lambda$QCjlnk0Yg8dlW92YwSJKM0QNC8Y(this.f$0, dialogInterface);
                            }
                        }).show();
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
                }

                public static void $r8$lambda$QCjlnk0Yg8dlW92YwSJKM0QNC8Y(AnonymousClass2 anonymousClass2, DialogInterface dialogInterface) {
                    if (MyWebView.this.botWebViewContainer.delegate != null) {
                        MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                    }
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (MyWebView.this.botWebViewContainer == null) {
                        return true;
                    }
                    MyWebView.this.botWebViewContainer.onOpenUri(Uri.parse(str));
                    this.val$newWebView.destroy();
                    return true;
                }
            }

            @Override
            public void onCloseWindow(WebView webView) {
                MyWebView.this.d("onCloseWindow " + webView);
                if (MyWebView.this.botWebViewContainer != null && MyWebView.this.botWebViewContainer.delegate != null) {
                    MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                } else if (MyWebView.this.onCloseListener != null) {
                    MyWebView.this.onCloseListener.run();
                    MyWebView.this.onCloseListener = null;
                }
                super.onCloseWindow(webView);
            }

            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Activity activityFindActivity = AndroidUtilities.findActivity(MyWebView.this.getContext());
                if (activityFindActivity != null) {
                    if (MyWebView.this.botWebViewContainer != null) {
                        if (MyWebView.this.botWebViewContainer.mFilePathCallback != null) {
                            MyWebView.this.botWebViewContainer.mFilePathCallback.onReceiveValue(null);
                        }
                        MyWebView.this.botWebViewContainer.mFilePathCallback = valueCallback;
                        boolean z = fileChooserParams.getMode() == 1;
                        Intent intentCreateIntent = fileChooserParams.createIntent();
                        if (z) {
                            intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        }
                        activityFindActivity.startActivityForResult(intentCreateIntent, 3000);
                        MyWebView.this.d("onShowFileChooser: true");
                        return true;
                    }
                    MyWebView.this.d("onShowFileChooser: no container, false");
                    return false;
                }
                MyWebView.this.d("onShowFileChooser: no activity, false");
                return false;
            }

            @Override
            public void onProgressChanged(WebView webView, int i) {
                if (MyWebView.this.botWebViewContainer != null && MyWebView.this.botWebViewContainer.webViewProgressListener != null) {
                    MyWebView.this.d("onProgressChanged " + i + "%");
                    MyWebView.this.botWebViewContainer.webViewProgressListener.accept(Float.valueOf(((float) i) / 100.0f));
                    return;
                }
                MyWebView.this.d("onProgressChanged " + i + "%: no container");
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.parentActivity == null) {
                    MyWebView.this.d("onGeolocationPermissionsShowPrompt: no container");
                    callback.invoke(str, false, false);
                    return;
                }
                MyWebView.this.d("onGeolocationPermissionsShowPrompt " + str);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                Dialog dialogCreateWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.m5067$r8$lambda$TGVu2J0dKB4Q74Mu5qkT_tbb4(this.f$0, callback, str, (Boolean) obj);
                    }
                });
                this.lastPermissionsDialog = dialogCreateWebViewPermissionsRequestDialog;
                dialogCreateWebViewPermissionsRequestDialog.show();
            }

            public static void m5067$r8$lambda$TGVu2J0dKB4Q74Mu5qkT_tbb4(final AnonymousClass3 anonymousClass3, final GeolocationPermissions.Callback callback, final String str, Boolean bool) {
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$cMQsC1gqIihMh8ptQ5WjjNFg0YQ(this.f$0, callback, str, (Boolean) obj);
                            }
                        });
                    } else {
                        callback.invoke(str, false, false);
                    }
                }
            }

            public static void $r8$lambda$cMQsC1gqIihMh8ptQ5WjjNFg0YQ(AnonymousClass3 anonymousClass3, GeolocationPermissions.Callback callback, String str, Boolean bool) {
                anonymousClass3.getClass();
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
            }

            @Override
            public void onGeolocationPermissionsHidePrompt() {
                if (this.lastPermissionsDialog != null) {
                    MyWebView.this.d("onGeolocationPermissionsHidePrompt: dialog.dismiss");
                    this.lastPermissionsDialog.dismiss();
                    this.lastPermissionsDialog = null;
                    return;
                }
                MyWebView.this.d("onGeolocationPermissionsHidePrompt: no dialog");
            }

            @Override
            public void onPermissionRequest(final PermissionRequest permissionRequest) {
                Dialog dialog = this.lastPermissionsDialog;
                if (dialog != null) {
                    dialog.dismiss();
                    this.lastPermissionsDialog = null;
                }
                if (MyWebView.this.botWebViewContainer == null) {
                    MyWebView.this.d("onPermissionRequest: no container");
                    permissionRequest.deny();
                    return;
                }
                MyWebView.this.d("onPermissionRequest " + permissionRequest);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                final String[] resources = permissionRequest.getResources();
                if (resources.length == 1) {
                    final String str = resources[0];
                    if (MyWebView.this.botWebViewContainer.parentActivity != null) {
                        if (MyWebView.this.botWebViewContainer.isVerifyingAge()) {
                            permissionRequest.grant(resources);
                            return;
                        }
                        str.getClass();
                        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                            Dialog dialogCreateWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new Consumer() {
                                @Override
                                public final void accept(Object obj) {
                                    BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$rDZ_IGIHsv01ia13BEA7WRXEUtE(this.f$0, permissionRequest, str, (Boolean) obj);
                                }
                            });
                            this.lastPermissionsDialog = dialogCreateWebViewPermissionsRequestDialog;
                            dialogCreateWebViewPermissionsRequestDialog.show();
                            return;
                        } else {
                            if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                                Dialog dialogCreateWebViewPermissionsRequestDialog2 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new Consumer() {
                                    @Override
                                    public final void accept(Object obj) {
                                        BotWebViewContainer.MyWebView.AnonymousClass3.m5064$r8$lambda$1nFMKyuoMtuAXzNkByIEbiPfzI(this.f$0, permissionRequest, str, (Boolean) obj);
                                    }
                                });
                                this.lastPermissionsDialog = dialogCreateWebViewPermissionsRequestDialog2;
                                dialogCreateWebViewPermissionsRequestDialog2.show();
                                return;
                            }
                            return;
                        }
                    }
                    permissionRequest.deny();
                    return;
                }
                if (resources.length == 2) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                        if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                            Dialog dialogCreateWebViewPermissionsRequestDialog3 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new Consumer() {
                                @Override
                                public final void accept(Object obj) {
                                    BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$Ddmx9HgeJtR6c6R4d9uMG7mp4tw(this.f$0, permissionRequest, resources, (Boolean) obj);
                                }
                            });
                            this.lastPermissionsDialog = dialogCreateWebViewPermissionsRequestDialog3;
                            dialogCreateWebViewPermissionsRequestDialog3.show();
                        }
                    }
                }
            }

            public static void m5064$r8$lambda$1nFMKyuoMtuAXzNkByIEbiPfzI(final AnonymousClass3 anonymousClass3, final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.RECORD_AUDIO"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$16i4F6TaevqKPDUxkoDB0gPQrfg(this.f$0, permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public static void $r8$lambda$16i4F6TaevqKPDUxkoDB0gPQrfg(AnonymousClass3 anonymousClass3, PermissionRequest permissionRequest, String str, Boolean bool) {
                anonymousClass3.getClass();
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            public static void $r8$lambda$rDZ_IGIHsv01ia13BEA7WRXEUtE(final AnonymousClass3 anonymousClass3, final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$S1SlzAiUWaCJHm6i5EfHAiNQLSQ(this.f$0, permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public static void $r8$lambda$S1SlzAiUWaCJHm6i5EfHAiNQLSQ(AnonymousClass3 anonymousClass3, PermissionRequest permissionRequest, String str, Boolean bool) {
                anonymousClass3.getClass();
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            public static void $r8$lambda$Ddmx9HgeJtR6c6R4d9uMG7mp4tw(final AnonymousClass3 anonymousClass3, final PermissionRequest permissionRequest, final String[] strArr, Boolean bool) {
                if (anonymousClass3.lastPermissionsDialog != null) {
                    anonymousClass3.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.$r8$lambda$0W7foGjWovNLsC5o_67s5oH0gWk(this.f$0, permissionRequest, strArr, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public static void $r8$lambda$0W7foGjWovNLsC5o_67s5oH0gWk(AnonymousClass3 anonymousClass3, PermissionRequest permissionRequest, String[] strArr, Boolean bool) {
                anonymousClass3.getClass();
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{strArr[0], strArr[1]});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            @Override
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (this.lastPermissionsDialog != null) {
                    MyWebView.this.d("onPermissionRequestCanceled: dialog.dismiss");
                    this.lastPermissionsDialog.dismiss();
                    this.lastPermissionsDialog = null;
                    return;
                }
                MyWebView.this.d("onPermissionRequestCanceled: no dialog");
            }

            @Override
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            }
        }

        class AnonymousClass5 implements DownloadListener {
            AnonymousClass5() {
            }

            private String getFilename(String str, String str2, String str3) {
                try {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    String str4 = pathSegments.get(pathSegments.size() - 1);
                    int iLastIndexOf = str4.lastIndexOf(".");
                    if (iLastIndexOf > 0 && !TextUtils.isEmpty(str4.substring(iLastIndexOf + 1))) {
                        return str4;
                    }
                } catch (Exception unused) {
                }
                return URLUtil.guessFileName(str, str2, str3);
            }

            @Override
            public void onDownloadStart(final String str, final String str2, String str3, final String str4, long j) {
                MyWebView.this.d("onDownloadStart " + str + " " + str2 + " " + str3 + " " + str4 + " " + j);
                try {
                    if (str.startsWith("blob:")) {
                        return;
                    }
                    final String strEscape = AndroidUtilities.escape(getFilename(str, str3, str4));
                    try {
                        final Runnable runnable = new Runnable() {
                            @Override
                            public final void run() {
                                BotWebViewContainer.MyWebView.AnonymousClass5.m5069$r8$lambda$MT1uemcVcSddZVB9rIcKdlbKVM(this.f$0, str, str4, str2, strEscape);
                            }
                        };
                        if (!DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j)) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(MyWebView.this.getContext());
                            builder.setTitle(LocaleController.getString(R.string.WebDownloadAlertTitle));
                            builder.setMessage(AndroidUtilities.replaceTags(j > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, strEscape, AndroidUtilities.formatFileSize(j)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, strEscape)));
                            builder.setPositiveButton(LocaleController.getString(R.string.WebDownloadAlertYes), new AlertDialog.OnButtonClickListener() {
                                @Override
                                public final void onClick(AlertDialog alertDialog, int i) {
                                    runnable.run();
                                }
                            });
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            TextView textView = (TextView) builder.show().getButton(-2);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                                return;
                            }
                            return;
                        }
                        runnable.run();
                        return;
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                FileLog.e(e);
            }

            public static void m5069$r8$lambda$MT1uemcVcSddZVB9rIcKdlbKVM(AnonymousClass5 anonymousClass5, String str, String str2, String str3, String str4) {
                anonymousClass5.getClass();
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setMimeType(str2);
                    request.addRequestHeader("User-Agent", str3);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str4);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str4);
                    DownloadManager downloadManager = (DownloadManager) MyWebView.this.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    if (MyWebView.this.botWebViewContainer != null) {
                        BulletinFactory.of(MyWebView.this.botWebViewContainer, MyWebView.this.botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.ic_download, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str4))).show(true);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        public void saveHistory() {
            if (this.bot) {
                return;
            }
            WebMetadataCache.WebMetadata webMetadataFrom = WebMetadataCache.WebMetadata.from(this);
            WebMetadataCache.getInstance().save(webMetadataFrom);
            BrowserHistory.Entry entry = this.currentHistoryEntry;
            if (entry == null || webMetadataFrom == null) {
                return;
            }
            entry.meta = webMetadataFrom;
            BrowserHistory.pushHistory(entry);
        }

        public void search(String str, Runnable runnable) {
            this.searchLoading = true;
            this.searchListener = runnable;
            findAllAsync(str);
        }

        public int getSearchIndex() {
            return this.searchIndex;
        }

        public int getSearchCount() {
            return this.searchCount;
        }

        @Override
        public String getTitle() {
            return this.lastTitle;
        }

        public void setTitle(String str) {
            this.lastTitle = str;
        }

        public String getOpenURL() {
            return this.openedByUrl;
        }

        @Override
        public String getUrl() {
            if (this.dangerousUrl) {
                return this.urlFallback;
            }
            String url = super.getUrl();
            this.lastUrl = url;
            return url;
        }

        public boolean isUrlDangerous() {
            return this.dangerousUrl;
        }

        @Override
        public Bitmap getFavicon() {
            if (this.errorShown) {
                return null;
            }
            return this.lastFavicon;
        }

        public Bitmap getFavicon(String str) {
            return (Bitmap) this.lastFavicons.get(str);
        }

        public void setContainers(BotWebViewContainer botWebViewContainer, WebViewScrollListener webViewScrollListener) {
            d("setContainers(" + botWebViewContainer + ", " + webViewScrollListener + ")");
            boolean z = this.botWebViewContainer == null && botWebViewContainer != null;
            this.botWebViewContainer = botWebViewContainer;
            this.webViewScrollListener = webViewScrollListener;
            if (z) {
                evaluateJS("window.__tg__postBackgroundChange()");
            }
        }

        public void setCloseListener(Runnable runnable) {
            this.onCloseListener = runnable;
        }

        public void evaluateJS(String str) {
            evaluateJavascript(str, new ValueCallback() {
                @Override
                public final void onReceiveValue(Object obj) {
                    BotWebViewContainer.MyWebView.m5058$r8$lambda$n4G84VuBJd3zHi0noWbm8zvFCg((String) obj);
                }
            });
        }

        @Override
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            WebViewScrollListener webViewScrollListener = this.webViewScrollListener;
            if (webViewScrollListener != null) {
                webViewScrollListener.onWebViewScrolled(this, getScrollX() - this.prevScrollX, getScrollY() - this.prevScrollY);
            }
            this.prevScrollX = getScrollX();
            this.prevScrollY = getScrollY();
        }

        public float getScrollProgress() {
            float fMax = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
            if (fMax <= getHeight()) {
                return 0.0f;
            }
            return Utilities.clamp01(getScrollY() / fMax);
        }

        public void setScrollProgress(float f) {
            setScrollY((int) (f * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
        }

        @Override
        public void setScrollX(int i) {
            super.setScrollX(i);
            this.prevScrollX = i;
        }

        @Override
        public void setScrollY(int i) {
            super.setScrollY(i);
            this.prevScrollY = i;
        }

        @Override
        public boolean onCheckIsTextEditor() {
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
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.botWebViewContainer.lastClickMs = System.currentTimeMillis();
                if (!this.botWebViewContainer.isVerifyingAge()) {
                    getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onAttachedToWindow() {
            d("attached");
            AndroidUtilities.checkAndroidTheme(getContext(), true);
            super.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            d("detached");
            AndroidUtilities.checkAndroidTheme(getContext(), false);
            super.onDetachedFromWindow();
        }

        @Override
        public void destroy() {
            d("destroy");
            super.destroy();
        }

        @Override
        public void loadUrl(String str) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2);
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        @Override
        public void loadUrl(String str, Map map) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2 + " " + map);
            super.loadUrl(str2, (Map<String, String>) map);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        public void loadUrl(String str, WebMetadataCache.WebMetadata webMetadata) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            applyCachedMeta(webMetadata);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2 + " with cached meta");
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        public void checkCachedMetaProperties(String str) {
            if (this.bot) {
                return;
            }
            applyCachedMeta(WebMetadataCache.getInstance().get(AndroidUtilities.getHostAuthority(str, true)));
        }

        public boolean applyCachedMeta(WebMetadataCache.WebMetadata webMetadata) {
            boolean z = false;
            if (webMetadata == null) {
                return false;
            }
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null && botWebViewContainer.delegate != null) {
                if (webMetadata.actionBarColor != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(true, webMetadata.actionBarColor);
                    this.lastActionBarColorGot = true;
                }
                int i = webMetadata.backgroundColor;
                if (i != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(false, webMetadata.backgroundColor);
                    this.lastBackgroundColorGot = true;
                } else {
                    i = -1;
                }
                Bitmap bitmap = webMetadata.favicon;
                if (bitmap != null) {
                    BotWebViewContainer botWebViewContainer2 = this.botWebViewContainer;
                    this.lastFavicon = bitmap;
                    botWebViewContainer2.onFaviconChanged(bitmap);
                    this.lastFaviconGot = true;
                }
                if (!TextUtils.isEmpty(webMetadata.sitename)) {
                    String str = webMetadata.sitename;
                    this.lastSiteName = str;
                    BotWebViewContainer botWebViewContainer3 = this.botWebViewContainer;
                    this.lastTitle = str;
                    botWebViewContainer3.onTitleChanged(str);
                    z = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i);
                }
            }
            if (!z) {
                setTitle(null);
                BotWebViewContainer botWebViewContainer4 = this.botWebViewContainer;
                if (botWebViewContainer4 != null) {
                    botWebViewContainer4.onTitleChanged(null);
                }
            }
            return true;
        }

        @Override
        public void reload() {
            CookieManager.getInstance().flush();
            d("reload");
            super.reload();
        }

        @Override
        public void loadData(String str, String str2, String str3) {
            this.openedByUrl = null;
            d("loadData " + str + " " + str2 + " " + str3);
            super.loadData(str, str2, str3);
        }

        @Override
        public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
            this.openedByUrl = null;
            d("loadDataWithBaseURL " + str + " " + str2 + " " + str3 + " " + str4 + " " + str5);
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }

        @Override
        public void stopLoading() {
            d("stopLoading");
            super.stopLoading();
        }

        @Override
        public void stopNestedScroll() {
            d("stopNestedScroll");
            super.stopNestedScroll();
        }

        @Override
        public void postUrl(String str, byte[] bArr) {
            d("postUrl " + str + " " + bArr);
            super.postUrl(str, bArr);
        }

        @Override
        public void onPause() {
            d("onPause");
            super.onPause();
        }

        @Override
        public void onResume() {
            d("onResume");
            super.onResume();
        }

        @Override
        public void pauseTimers() {
            d("pauseTimers");
            super.pauseTimers();
        }

        @Override
        public void resumeTimers() {
            d("resumeTimers");
            super.resumeTimers();
        }

        @Override
        public boolean canGoBack() {
            return super.canGoBack();
        }

        @Override
        public void goBack() {
            d("goBack");
            super.goBack();
        }

        @Override
        public void goForward() {
            d("goForward");
            super.goForward();
        }

        @Override
        public void clearHistory() {
            d("clearHistory");
            super.clearHistory();
        }

        @Override
        public void setFocusable(int i) {
            d("setFocusable " + i);
            super.setFocusable(i);
        }

        @Override
        public void setFocusable(boolean z) {
            d("setFocusable " + z);
            super.setFocusable(z);
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

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
        }
    }

    public void d(String str) {
        FileLog.d("[webviewcontainer] #" + this.tag + " " + str);
    }

    public static String tonsite2magic(String str) {
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
        return Browser.replaceHostname(Uri.parse(str), strRotateTONHost, "https");
    }

    public static String magic2tonsite(String str) {
        String hostAuthority;
        String str2;
        if (rotatedTONHosts == null || str == null || (hostAuthority = AndroidUtilities.getHostAuthority(str)) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = (String) rotatedTONHosts.get(hostAuthority)) != null) ? Browser.replace(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    public static JSONObject obj() {
        try {
            return new JSONObject();
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject obj(String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
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

    public static JSONObject obj(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject obj(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            jSONObject.put(str4, obj4);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isVerifyingAge() {
        return this.onVerifiedAge != null;
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.onVerifiedAge = callback4;
    }
}
