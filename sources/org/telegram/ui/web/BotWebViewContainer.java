package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
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
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotsBot;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputInvoiceSlug;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBot;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_bots$allowSendMessage;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.WebMetadataCache;
public abstract class BotWebViewContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static HashMap<String, String> rotatedTONHosts;
    private static int tags;
    private BotBiometry biometry;
    private long blockedDialogsUntil;
    public final boolean bot;
    private TLRPC$User botUser;
    private BotWebViewProxy botWebViewProxy;
    private String buttonData;
    private BottomSheet cameraBottomSheet;
    private int currentAccount;
    private AlertDialog currentDialog;
    private String currentPaymentSlug;
    private Delegate delegate;
    private int dialogSequentialOpenTimes;
    private final CellFlickerDrawable flickerDrawable;
    private BackupImageView flickerView;
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
    private long lastPostStoryMs;
    private String lastQrText;
    private ValueCallback<Uri[]> mFilePathCallback;
    private String mUrl;
    private Runnable onCloseListener;
    private Runnable onPermissionsRequestResultCallback;
    private Activity parentActivity;
    private boolean preserving;
    private Theme.ResourcesProvider resourcesProvider;
    private int shownDialogsCount;
    private final int tag;
    private boolean wasFocusable;
    private boolean wasOpenedByLinkIntent;
    private MyWebView webView;
    private boolean webViewNotAvailable;
    private TextView webViewNotAvailableText;
    private Consumer<Float> webViewProgressListener;
    private WebViewProxy webViewProxy;
    private WebViewScrollListener webViewScrollListener;

    public interface WebViewScrollListener {
        void onWebViewScrolled(WebView webView, int i, int i2);
    }

    public static void lambda$evaluateJs$5(String str) {
    }

    protected void onErrorShown(boolean z, int i, String str) {
    }

    public void onFaviconChanged(Bitmap bitmap) {
    }

    protected void onTitleChanged(String str) {
    }

    protected void onURLChanged(String str, boolean z, boolean z2) {
    }

    public void onWebViewCreated() {
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
        this.lastButtonColor = getColor(Theme.key_featuredStickers_addButton);
        this.lastButtonTextColor = getColor(Theme.key_featuredStickers_buttonText);
        this.lastButtonText = "";
        this.lastDialogType = -1;
        this.shownDialogsCount = 0;
        int i2 = tags;
        tags = i2 + 1;
        this.tag = i2;
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
                BotWebViewContainer.this = this;
                this.imageReceiver = new C00491(this);
            }

            public class C00491 extends ImageReceiver {
                C00491(View view) {
                    super(view);
                    AnonymousClass1.this = r1;
                }

                @Override
                public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                    boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BotWebViewContainer.AnonymousClass1.C00491.this.lambda$setImageBitmapByKey$0(valueAnimator);
                        }
                    });
                    duration.start();
                    return imageBitmapByKey;
                }

                public void lambda$setImageBitmapByKey$0(ValueAnimator valueAnimator) {
                    ((BackupImageView) AnonymousClass1.this).imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    invalidate();
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
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
        backupImageView.setColorFilter(new PorterDuffColorFilter(getColor(Theme.key_dialogSearchHint), PorterDuff.Mode.SRC_IN));
        this.flickerView.getImageReceiver().setAspectFit(true);
        addView(this.flickerView, LayoutHelper.createFrame(-1, -2, 48));
        TextView textView = new TextView(context);
        this.webViewNotAvailableText = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        this.webViewNotAvailableText.setTextColor(getColor(Theme.key_windowBackgroundWhiteGrayText));
        this.webViewNotAvailableText.setTextSize(1, 15.0f);
        this.webViewNotAvailableText.setGravity(17);
        this.webViewNotAvailableText.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        this.webViewNotAvailableText.setPadding(dp, dp, dp, dp);
        addView(this.webViewNotAvailableText, LayoutHelper.createFrame(-1, -2, 17));
        setFocusable(false);
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.isViewPortByMeasureSuppressed = z;
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

    public void replaceWebView(MyWebView myWebView, Object obj) {
        setupWebView(myWebView, obj);
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

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void setupWebView(MyWebView myWebView, Object obj) {
        MyWebView myWebView2 = this.webView;
        if (myWebView2 != null) {
            myWebView2.destroy();
            removeView(this.webView);
        }
        if (myWebView != null) {
            AndroidUtilities.removeFromParent(myWebView);
        }
        MyWebView myWebView3 = myWebView == null ? new MyWebView(getContext(), this.bot) : myWebView;
        this.webView = myWebView3;
        if (!this.bot) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                cookieManager.setAcceptThirdPartyCookies(this.webView, true);
            }
            if (i >= 21) {
                CookieManager.getInstance().flush();
            }
        } else {
            myWebView3.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
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
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            settings.setUserAgentString(replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", "(Linux; Android " + Build.VERSION.RELEASE + "; K)"));
        } catch (Exception e) {
            FileLog.e(e);
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
        if (Build.VERSION.SDK_INT >= 17) {
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
                    WebViewProxy webViewProxy2 = new WebViewProxy(this);
                    this.webViewProxy = webViewProxy2;
                    this.webView.addJavascriptInterface(webViewProxy2, "TelegramWebview");
                } else if (myWebView == null) {
                    this.webView.addJavascriptInterface(webViewProxy, "TelegramWebview");
                }
                this.webViewProxy.setContainer(this);
            }
        }
        onWebViewCreated();
    }

    public void onOpenUri(Uri uri) {
        onOpenUri(uri, null, !this.bot, false);
    }

    private void onOpenUri(Uri uri, String str, boolean z, boolean z2) {
        if (this.isRequestingPageOpen) {
            return;
        }
        if (System.currentTimeMillis() - this.lastClickMs <= 1000 || !z2) {
            this.lastClickMs = 0L;
            boolean[] zArr = {false};
            if (Browser.isInternalUri(uri, zArr) && !zArr[0] && this.delegate != null) {
                setKeyboardFocusable(false);
            }
            Browser.openUrl(getContext(), uri, true, z, false, null, str, false);
        }
    }

    private void updateKeyboardFocusable() {
        boolean z = this.keyboardFocusable && this.isPageLoaded;
        if (this.wasFocusable != z) {
            if (!z) {
                setDescendantFocusability(393216);
                setFocusable(false);
                this.webView.setDescendantFocusability(393216);
                this.webView.clearFocus();
                AndroidUtilities.hideKeyboard(this);
            } else {
                setDescendantFocusability(131072);
                setFocusable(true);
                this.webView.setDescendantFocusability(131072);
            }
        }
        this.wasFocusable = z;
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
        if (this.webView != null && this.isBackButtonVisible) {
            notifyEvent("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public void setPageLoaded(String str, boolean z) {
        MyWebView myWebView = this.webView;
        boolean z2 = myWebView == null || !myWebView.canGoBack();
        MyWebView myWebView2 = this.webView;
        onURLChanged(str, z2, myWebView2 == null || !myWebView2.canGoForward());
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.webView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.flickerView, View.ALPHA, 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() {
                {
                    BotWebViewContainer.this = this;
                }

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

    public void setBotUser(TLRPC$User tLRPC$User) {
        this.botUser = tLRPC$User;
    }

    public void runWithPermissions(final String[] strArr, final Consumer<Boolean> consumer) {
        if (Build.VERSION.SDK_INT < 23) {
            consumer.accept(Boolean.TRUE);
        } else if (checkPermissions(strArr)) {
            consumer.accept(Boolean.TRUE);
        } else {
            this.onPermissionsRequestResultCallback = new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.this.lambda$runWithPermissions$0(consumer, strArr);
                }
            };
            Activity activity = this.parentActivity;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public void lambda$runWithPermissions$0(Consumer consumer, String[] strArr) {
        consumer.accept(Boolean.valueOf(checkPermissions(strArr)));
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
        String str = this.buttonData;
        if (str != null) {
            onEventReceived("web_app_setup_main_button", str);
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

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Runnable runnable;
        if (i != 4000 || (runnable = this.onPermissionsRequestResultCallback) == null) {
            return;
        }
        runnable.run();
        this.onPermissionsRequestResultCallback = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3000 || this.mFilePathCallback == null) {
            return;
        }
        this.mFilePathCallback.onReceiveValue((i2 != -1 || intent == null || intent.getDataString() == null) ? null : new Uri[]{Uri.parse(intent.getDataString())});
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

    public void invalidateViewPortHeight(boolean z, boolean z2) {
        invalidate();
        if ((this.isPageLoaded || z2) && this.bot && (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
            if (z) {
                this.lastExpanded = webViewSwipeContainer.getSwipeOffsetY() == (-webViewSwipeContainer.getOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY();
            }
            int measuredHeight = (int) (((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) - webViewSwipeContainer.getSwipeOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("height", measuredHeight / AndroidUtilities.density);
                jSONObject.put("is_state_stable", z);
                jSONObject.put("is_expanded", this.lastExpanded);
                notifyEvent("viewport_changed", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.flickerView) {
            if (this.isFlickeringCenter) {
                canvas.save();
                canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.isFlickeringCenter) {
                canvas.restore();
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            this.flickerDrawable.draw(canvas, rectF, 0.0f, this);
            invalidate();
            return drawChild;
        } else if (view == this.webViewNotAvailableText) {
            canvas.save();
            canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
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
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.flickerDrawable.setParentWidth(getMeasuredWidth());
    }

    public void setWebViewProgressListener(Consumer<Float> consumer) {
        this.webViewProgressListener = consumer;
    }

    public MyWebView getWebView() {
        return this.webView;
    }

    public void loadFlickerAndSettingsItem(int i, long j, ActionBarMenuSubItem actionBarMenuSubItem) {
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot;
        boolean z;
        String publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            this.flickerView.setImageDrawable(SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(getColor(Theme.key_windowBackgroundGray))));
            setupFlickerParams(false);
            return;
        }
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(i).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                tLRPC$TL_attachMenuBot = null;
                break;
            }
            tLRPC$TL_attachMenuBot = it.next();
            if (tLRPC$TL_attachMenuBot.bot_id == j) {
                break;
            }
        }
        if (tLRPC$TL_attachMenuBot != null) {
            TLRPC$TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                z = true;
            } else {
                z = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                this.flickerView.setVisibility(0);
                this.flickerView.setAlpha(1.0f);
                this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tLRPC$TL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        TLRPC$TL_messages_getAttachMenuBot tLRPC$TL_messages_getAttachMenuBot = new TLRPC$TL_messages_getAttachMenuBot();
        tLRPC$TL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i).getInputUser(j);
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_getAttachMenuBot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewContainer.this.lambda$loadFlickerAndSettingsItem$2(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadFlickerAndSettingsItem$2(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$loadFlickerAndSettingsItem$1(tLObject);
            }
        });
    }

    public void lambda$loadFlickerAndSettingsItem$1(TLObject tLObject) {
        boolean z;
        if (tLObject instanceof TLRPC$TL_attachMenuBotsBot) {
            TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = ((TLRPC$TL_attachMenuBotsBot) tLObject).bot;
            TLRPC$TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                z = true;
            } else {
                z = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                this.flickerView.setVisibility(0);
                this.flickerView.setAlpha(1.0f);
                this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tLRPC$TL_attachMenuBot);
                setupFlickerParams(z);
            }
        }
    }

    private void setupFlickerParams(boolean z) {
        this.isFlickeringCenter = z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.flickerView.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int dp = AndroidUtilities.dp(64.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
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
                BotWebViewContainer.this.lambda$reload$3();
            }
        });
    }

    public void lambda$reload$3() {
        if (this.isSettingsButtonVisible) {
            this.isSettingsButtonVisible = false;
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onSetSettingsButtonVisible(false);
            }
        }
        checkCreateWebView();
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webView.reload();
        }
        updateKeyboardFocusable();
    }

    public void loadUrl(int i, final String str) {
        this.currentAccount = i;
        NotificationCenter.getInstance(i).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$loadUrl$4(str);
            }
        });
    }

    public void lambda$loadUrl$4(String str) {
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        this.mUrl = str;
        checkCreateWebView();
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webView.loadUrl(str);
        }
        updateKeyboardFocusable();
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

            {
                BotWebViewContainer.this = this;
            }

            @Override
            public int getBottomOffset(int i) {
                if (BotWebViewContainer.this.getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                    ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) BotWebViewContainer.this.getParent();
                    return (int) ((webViewSwipeContainer.getOffsetY() + webViewSwipeContainer.getSwipeOffsetY()) - webViewSwipeContainer.getTopActionBarOffsetY());
                }
                return 0;
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
            }
            this.isPageLoaded = false;
            updateKeyboardFocusable();
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
                BotWebViewContainer.this.lambda$evaluateJs$6(z, str);
            }
        });
    }

    public void lambda$evaluateJs$6(boolean z, String str) {
        if (z) {
            checkCreateWebView();
        }
        MyWebView myWebView = this.webView;
        if (myWebView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            myWebView.evaluateJavascript(str, new ValueCallback() {
                @Override
                public final void onReceiveValue(Object obj) {
                    BotWebViewContainer.lambda$evaluateJs$5((String) obj);
                }
            });
            return;
        }
        try {
            myWebView.loadUrl("javascript:" + URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            MyWebView myWebView2 = this.webView;
            myWebView2.loadUrl("javascript:" + URLEncoder.encode(str));
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetNewTheme) {
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            }
            this.flickerView.setColorFilter(new PorterDuffColorFilter(getColor(Theme.key_dialogSearchHint), PorterDuff.Mode.SRC_IN));
            notifyThemeChanged();
        } else if (i == NotificationCenter.onActivityResultReceived) {
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

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void onWebEventReceived(String str, String str2) {
        boolean z;
        if (this.bot || this.delegate == null) {
            return;
        }
        d("onWebEventReceived " + str + " " + str2);
        str.hashCode();
        char c = 65535;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1695046810:
                if (str.equals("actionBarColor")) {
                    c = 0;
                    break;
                }
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = 1;
                    break;
                }
                break;
            case 675009138:
                if (str.equals("siteName")) {
                    c = 2;
                    break;
                }
                break;
            case 997530486:
                if (str.equals("allowScroll")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean equals = TextUtils.equals(str, "actionBarColor");
                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    MyWebView myWebView = this.webView;
                    if (myWebView != null) {
                        if (equals) {
                            myWebView.lastActionBarColorGot = true;
                            myWebView.lastActionBarColor = argb;
                        } else {
                            myWebView.lastBackgroundColorGot = true;
                            myWebView.lastBackgroundColor = argb;
                        }
                        myWebView.saveHistory();
                    }
                    this.delegate.onWebAppBackgroundChanged(equals, argb);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                d("siteName " + str2);
                MyWebView myWebView2 = this.webView;
                if (myWebView2 != null) {
                    myWebView2.lastSiteName = str2;
                    myWebView2.saveHistory();
                    return;
                }
                return;
            case 3:
                try {
                    JSONArray jSONArray2 = new JSONArray(str2);
                    z = jSONArray2.optBoolean(0, true);
                    try {
                        z2 = jSONArray2.optBoolean(1, true);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    z = true;
                }
                d("allowScroll " + z + " " + z2);
                if (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                    ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(z, z2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onEventReceived(java.lang.String r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.BotWebViewContainer.onEventReceived(java.lang.String, java.lang.String):void");
    }

    public void lambda$onEventReceived$7(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$8(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$9(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$10(AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        if (!atomicBoolean.get()) {
            notifyEvent("popup_closed", new JSONObject());
        }
        this.currentDialog = null;
        this.lastDialogClosed = System.currentTimeMillis();
    }

    public void lambda$onEventReceived$12(final String str, final TLRPC$TL_inputInvoiceSlug tLRPC$TL_inputInvoiceSlug, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$11(tLRPC$TL_error, str, tLRPC$TL_inputInvoiceSlug, tLObject);
            }
        });
    }

    public void lambda$onEventReceived$11(TLRPC$TL_error tLRPC$TL_error, String str, TLRPC$TL_inputInvoiceSlug tLRPC$TL_inputInvoiceSlug, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            onInvoiceStatusUpdate(str, "failed");
        } else {
            this.delegate.onWebAppOpenInvoice(tLRPC$TL_inputInvoiceSlug, str, tLObject);
        }
    }

    public void lambda$onEventReceived$19(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$18(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$onEventReceived$18(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (!(tLObject instanceof TLRPC$TL_boolTrue)) {
            if (tLRPC$TL_error != null) {
                unknownError(tLRPC$TL_error.text);
                return;
            }
            final String[] strArr = {"cancelled"};
            showDialog(3, new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.BotWebViewRequestWriteTitle)).setMessage(LocaleController.getString(R.string.BotWebViewRequestWriteMessage)).setPositiveButton(LocaleController.getString(R.string.BotWebViewRequestAllow), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BotWebViewContainer.this.lambda$onEventReceived$15(strArr, dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).create(), new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.this.lambda$onEventReceived$17(strArr);
                }
            });
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "allowed");
            notifyEvent("write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$15(final String[] strArr, final DialogInterface dialogInterface, int i) {
        TL_bots$allowSendMessage tL_bots$allowSendMessage = new TL_bots$allowSendMessage();
        tL_bots$allowSendMessage.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$allowSendMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewContainer.this.lambda$onEventReceived$14(strArr, dialogInterface, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$onEventReceived$14(final String[] strArr, final DialogInterface dialogInterface, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$13(tLObject, strArr, tLRPC$TL_error, dialogInterface);
            }
        });
    }

    public void lambda$onEventReceived$13(TLObject tLObject, String[] strArr, TLRPC$TL_error tLRPC$TL_error, DialogInterface dialogInterface) {
        if (tLObject != null) {
            strArr[0] = "allowed";
            if (tLObject instanceof TLRPC$Updates) {
                MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
            }
        }
        if (tLRPC$TL_error != null) {
            unknownError(tLRPC$TL_error.text);
        }
        dialogInterface.dismiss();
    }

    public void lambda$onEventReceived$17(String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent("write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$21(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$20(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$onEventReceived$20(String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            if (tLObject instanceof TLRPC$TL_dataJSON) {
                jSONObject.put("result", new JSONTokener(((TLRPC$TL_dataJSON) tLObject).data).nextValue());
            } else if (tLRPC$TL_error != null) {
                jSONObject.put("error", tLRPC$TL_error.text);
            }
            notifyEvent("custom_method_invoked", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
            unknownError();
        }
    }

    public void lambda$onEventReceived$23(String[] strArr, boolean z, DialogInterface dialogInterface, int i) {
        strArr[0] = null;
        dialogInterface.dismiss();
        if (z) {
            MessagesController.getInstance(this.currentAccount).unblockPeer(this.botUser.id, new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.this.lambda$onEventReceived$22();
                }
            });
            return;
        }
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(this.currentAccount).getCurrentUser(), this.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC$ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent("phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$22() {
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(this.currentAccount).getCurrentUser(), this.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC$ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent("phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$25(String[] strArr) {
        if (strArr[0] == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent("phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$26() {
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        notifyBiometryReceived();
    }

    public void lambda$onEventReceived$28(Runnable[] runnableArr, DialogInterface dialogInterface, int i) {
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        this.biometry.requestToken(null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                BotWebViewContainer.this.lambda$onEventReceived$27((Boolean) obj, (String) obj2);
            }
        });
    }

    public void lambda$onEventReceived$27(Boolean bool, String str) {
        if (bool.booleanValue()) {
            BotBiometry botBiometry = this.biometry;
            botBiometry.access_granted = true;
            botBiometry.save();
        }
        notifyBiometryReceived();
    }

    public void lambda$onEventReceived$29(Runnable[] runnableArr, DialogInterface dialogInterface, int i) {
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.disabled = true;
        botBiometry.save();
        notifyBiometryReceived();
    }

    public static void lambda$onEventReceived$30(Runnable[] runnableArr, DialogInterface dialogInterface) {
        if (runnableArr[0] != null) {
            runnableArr[0].run();
            runnableArr[0] = null;
        }
    }

    public void lambda$onEventReceived$31(Boolean bool, String str) {
        if (bool.booleanValue()) {
            this.biometry.access_granted = true;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", bool.booleanValue() ? "authorized" : "failed");
            jSONObject.put("token", str);
            notifyEvent("biometry_auth_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$32(String str, Boolean bool) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
            notifyEvent("biometry_token_updated", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onEventReceived$36(final AlertDialog alertDialog, final String str, final String str2, final String str3, final File file) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$35(file, alertDialog, str, str2, str3);
            }
        });
    }

    public void lambda$onEventReceived$35(final File file, final AlertDialog alertDialog, final String str, final String str2, final String str3) {
        if (file == null) {
            alertDialog.dismissUnless(500L);
            return;
        }
        final int[] iArr = new int[11];
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$33(iArr, file, alertDialog, str, str2, str3);
            }
        };
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.lambda$onEventReceived$34(file, iArr, runnable);
            }
        });
    }

    public void lambda$onEventReceived$33(int[] iArr, File file, AlertDialog alertDialog, String str, String str2, String str3) {
        StoryRecorder.SourceView sourceView;
        StoryEntry fromPhotoShoot;
        File file2;
        File file3;
        if (iArr[4] > 0) {
            int i = iArr[1];
            int i2 = iArr[2];
            int photoSize = i > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i;
            int photoSize2 = i2 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i2;
            File makeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "jpg");
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null);
            sourceView = null;
            Bitmap firstFrame = animatedFileDrawable.getFirstFrame(null);
            animatedFileDrawable.recycle();
            if (firstFrame != null) {
                try {
                    file3 = makeCacheFile;
                    firstFrame.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                    file2 = null;
                }
            } else {
                file3 = makeCacheFile;
            }
            file2 = file3;
            fromPhotoShoot = StoryEntry.fromVideoShoot(file, file2 == null ? null : file2.getAbsolutePath(), iArr[4]);
            fromPhotoShoot.width = i;
            fromPhotoShoot.height = i2;
            fromPhotoShoot.setupMatrix();
        } else {
            sourceView = null;
            fromPhotoShoot = StoryEntry.fromPhotoShoot(file, ((Integer) AndroidUtilities.getImageOrientation(file).first).intValue());
        }
        if (fromPhotoShoot.width <= 0 || fromPhotoShoot.height <= 0) {
            alertDialog.dismissUnless(500L);
            return;
        }
        if (str != null) {
            fromPhotoShoot.caption = str;
        }
        if (!TextUtils.isEmpty(str2) && UserConfig.getInstance(this.currentAccount).isPremium()) {
            if (fromPhotoShoot.mediaEntities == null) {
                fromPhotoShoot.mediaEntities = new ArrayList<>();
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
            fromPhotoShoot.mediaEntities.add(mediaEntity);
        }
        StoryRecorder.getInstance(this.parentActivity, UserConfig.selectedAccount).openRepost(sourceView, fromPhotoShoot);
        alertDialog.dismissUnless(500L);
    }

    public static void lambda$onEventReceived$34(File file, int[] iArr, Runnable runnable) {
        AnimatedFileDrawable.getVideoInfo(file.getAbsolutePath(), iArr);
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void createBiometry() {
        if (this.botUser == null) {
            return;
        }
        BotBiometry botBiometry = this.biometry;
        if (botBiometry == null) {
            this.biometry = new BotBiometry(getContext(), this.currentAccount, this.botUser.id);
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
        if (this.blockedDialogsUntil <= 0 || System.currentTimeMillis() >= this.blockedDialogsUntil) {
            if (this.lastDialogType != i || this.shownDialogsCount <= 3) {
                return false;
            }
            this.blockedDialogsUntil = System.currentTimeMillis() + 3000;
            this.shownDialogsCount = 0;
            return true;
        }
        return true;
    }

    private boolean showDialog(int i, AlertDialog alertDialog, final Runnable runnable) {
        if (alertDialog == null || ignoreDialog(i)) {
            return false;
        }
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BotWebViewContainer.this.lambda$showDialog$37(runnable, dialogInterface);
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

    public void lambda$showDialog$37(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
        this.currentDialog = null;
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

            {
                BotWebViewContainer.this = this;
            }

            @Override
            public void didFindQr(String str) {
                try {
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
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider);
            if (makeThemeParams != null) {
                return new JSONObject().put("theme_params", makeThemeParams);
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
            if (this.container == null) {
                FileLog.d("webviewproxy.postEvent: no container");
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewContainer.BotWebViewProxy.this.lambda$postEvent$0(str, str2);
                    }
                });
            }
        }

        public void lambda$postEvent$0(String str, String str2) {
            BotWebViewContainer botWebViewContainer = this.container;
            if (botWebViewContainer == null) {
                return;
            }
            botWebViewContainer.onEventReceived(str, str2);
        }
    }

    public static class WebViewProxy {
        public BotWebViewContainer container;

        public WebViewProxy(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        public void setContainer(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void post(final String str, final String str2) {
            if (this.container == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.WebViewProxy.this.lambda$post$0(str, str2);
                }
            });
        }

        public void lambda$post$0(String str, String str2) {
            BotWebViewContainer botWebViewContainer = this.container;
            if (botWebViewContainer == null) {
                return;
            }
            botWebViewContainer.onWebEventReceived(str, str2);
        }

        @JavascriptInterface
        public void resolveBlob(String str, final byte[] bArr, final String str2) {
            if (this.container == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.WebViewProxy.this.lambda$resolveBlob$2(str2, bArr);
                }
            });
        }

        public void lambda$resolveBlob$2(java.lang.String r6, byte[] r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.BotWebViewContainer.WebViewProxy.lambda$resolveBlob$2(java.lang.String, byte[]):void");
        }

        public static void lambda$resolveBlob$1() {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null || launchActivity.isFinishing()) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
            intent.setFlags(268468224);
            LaunchActivity.instance.startActivity(intent);
        }
    }

    public interface Delegate {
        boolean isClipboardAvailable();

        void onCloseRequested(Runnable runnable);

        void onCloseToTabs();

        void onInstantClose();

        void onSendWebViewData(String str);

        void onSetBackButtonVisible(boolean z);

        void onSetSettingsButtonVisible(boolean z);

        void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3);

        void onWebAppBackgroundChanged(boolean z, int i);

        void onWebAppExpand();

        void onWebAppOpenInvoice(TLRPC$InputInvoice tLRPC$InputInvoice, String str, TLObject tLObject);

        void onWebAppReady();

        void onWebAppSetActionBarColor(int i, int i2, boolean z);

        void onWebAppSetBackgroundColor(int i);

        void onWebAppSetupClosingBehavior(boolean z);

        void onWebAppSwipingBehavior(boolean z);

        void onWebAppSwitchInlineQuery(TLRPC$User tLRPC$User, String str, List<String> list);

        public final class CC {
            public static boolean $default$isClipboardAvailable(Delegate delegate) {
                return false;
            }

            public static void $default$onSendWebViewData(Delegate delegate, String str) {
            }

            public static void $default$onWebAppBackgroundChanged(Delegate delegate, boolean z, int i) {
            }

            public static void $default$onWebAppReady(Delegate delegate) {
            }

            public static void $default$onInstantClose(Delegate _this) {
                _this.onCloseRequested(null);
            }

            public static void $default$onCloseToTabs(Delegate _this) {
                _this.onCloseRequested(null);
            }
        }
    }

    public static final class PopupButton {
        public String id;
        public String text;
        public int textColorKey;

        public PopupButton(org.json.JSONObject r9) throws org.json.JSONException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.BotWebViewContainer.PopupButton.<init>(org.json.JSONObject):void");
        }
    }

    public static boolean isTonsite(String str) {
        return str != null && isTonsite(Uri.parse(str));
    }

    public static boolean isTonsite(Uri uri) {
        return "tonsite".equals(uri.getScheme()) || (uri.getAuthority() != null && uri.getAuthority().endsWith(".ton"));
    }

    public static WebResourceResponse proxyTON(WebResourceRequest webResourceRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            return proxyTON(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }

    public static String rotateTONHost(String str) {
        try {
            str = IDN.toASCII(str);
        } catch (Exception e) {
            FileLog.e(e);
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append("-d");
            }
            sb.append(split[i].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb.toString();
    }

    public static WebResourceResponse proxyTON(String str, String str2, Map<String, String> map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Browser.replaceHostname(Uri.parse(str2), rotateTONHost(AndroidUtilities.getHostAuthority(str2)), "https")).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
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
        private String currentUrl;
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
        private HashMap<String, Bitmap> lastFavicons;
        public String lastSiteName;
        public String lastTitle;
        public boolean lastTitleGot;
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
        private WebViewScrollListener webViewScrollListener;
        private Runnable whenPageLoaded;

        public static void lambda$evaluateJS$1(String str) {
        }

        public boolean isPageLoaded() {
            return this.isPageLoaded;
        }

        public void d(String str) {
            FileLog.d("[webview] #" + this.tag + " " + str);
        }

        public MyWebView(Context context, boolean z) {
            super(context);
            this.tag = BotWebViewContainer.access$1408();
            this.lastFavicons = new HashMap<>();
            this.bot = z;
            d("created new webview " + this);
            setOnLongClickListener(new AnonymousClass1());
            setWebViewClient(new AnonymousClass2(z, context));
            setWebChromeClient(new AnonymousClass3(z));
            setFindListener(new WebView.FindListener() {
                {
                    MyWebView.this = this;
                }

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

        public class AnonymousClass1 implements View.OnLongClickListener {
            AnonymousClass1() {
                MyWebView.this = r1;
            }

            @Override
            public boolean onLongClick(View view) {
                String str;
                WebView.HitTestResult hitTestResult = MyWebView.this.getHitTestResult();
                if (hitTestResult.getType() == 7) {
                    final String extra = hitTestResult.getExtra();
                    BottomSheet.Builder builder = new BottomSheet.Builder(MyWebView.this.getContext(), false, null);
                    try {
                        Uri parse = Uri.parse(extra);
                        str = Browser.replaceHostname(parse, IDN.toUnicode(parse.getHost(), 1), null);
                    } catch (Exception e) {
                        try {
                            FileLog.e((Throwable) e, false);
                            str = extra;
                        } catch (Exception e2) {
                            e = e2;
                            str = extra;
                            FileLog.e(e);
                            builder.setTitleMultipleLines(true);
                            builder.setTitle(str);
                            builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    BotWebViewContainer.MyWebView.AnonymousClass1.this.lambda$onLongClick$0(extra, dialogInterface, i);
                                }
                            });
                            builder.show();
                            return true;
                        }
                    }
                    try {
                        str = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
                    } catch (Exception e3) {
                        e = e3;
                        FileLog.e(e);
                        builder.setTitleMultipleLines(true);
                        builder.setTitle(str);
                        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                BotWebViewContainer.MyWebView.AnonymousClass1.this.lambda$onLongClick$0(extra, dialogInterface, i);
                            }
                        });
                        builder.show();
                        return true;
                    }
                    builder.setTitleMultipleLines(true);
                    builder.setTitle(str);
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BotWebViewContainer.MyWebView.AnonymousClass1.this.lambda$onLongClick$0(extra, dialogInterface, i);
                        }
                    });
                    builder.show();
                    return true;
                }
                return false;
            }

            public void lambda$onLongClick$0(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    MyWebView.this.loadUrl(str);
                } else if (i == 1) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", MyWebView.this.getContext().getPackageName());
                    MyWebView.this.getContext().startActivity(intent);
                } else if (i == 2) {
                    AndroidUtilities.addToClipboard(str);
                    if (MyWebView.this.botWebViewContainer != null) {
                        MyWebView.this.botWebViewContainer.showLinkCopiedBulletin();
                    }
                }
            }
        }

        public class AnonymousClass2 extends WebViewClient {
            private final Runnable resetErrorRunnable = new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.MyWebView.AnonymousClass2.this.lambda$$2();
                }
            };
            final boolean val$bot;
            final Context val$context;

            AnonymousClass2(boolean z, Context context) {
                MyWebView.this = r1;
                this.val$bot = z;
                this.val$context = context;
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                if (Build.VERSION.SDK_INT >= 21) {
                    MyWebView myWebView = MyWebView.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("shouldInterceptRequest ");
                    sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                    myWebView.d(sb.toString());
                    if (webResourceRequest != null && BotWebViewContainer.isTonsite(webResourceRequest.getUrl())) {
                        MyWebView.this.d("proxying ton");
                        return BotWebViewContainer.proxyTON(webResourceRequest);
                    }
                }
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override
            public void onPageCommitVisible(WebView webView, String str) {
                if (MyWebView.this.whenPageLoaded != null) {
                    Runnable runnable = MyWebView.this.whenPageLoaded;
                    MyWebView.this.whenPageLoaded = null;
                    runnable.run();
                }
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onPageCommitVisible " + str);
                if (!this.val$bot) {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.injectedJS = true;
                    String readRes = RLottieDrawable.readRes(null, R.raw.webview_ext);
                    myWebView2.evaluateJS(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                super.onPageCommitVisible(webView, str);
            }

            @Override
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                if (!this.val$bot && (MyWebView.this.currentHistoryEntry == null || !TextUtils.equals(MyWebView.this.currentHistoryEntry.url, str))) {
                    MyWebView.this.currentHistoryEntry = new BrowserHistory.Entry();
                    MyWebView.this.currentHistoryEntry.id = Utilities.fastRandom.nextLong();
                    MyWebView.this.currentHistoryEntry.time = System.currentTimeMillis();
                    MyWebView.this.currentHistoryEntry.url = MyWebView.this.getUrl();
                    MyWebView.this.currentHistoryEntry.meta = WebMetadataCache.WebMetadata.from(MyWebView.this);
                    BrowserHistory.pushHistory(MyWebView.this.currentHistoryEntry);
                }
                MyWebView myWebView = MyWebView.this;
                myWebView.d("doUpdateVisitedHistory " + str + " " + z);
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onURLChanged(str, !MyWebView.this.canGoBack(), !MyWebView.this.canGoForward());
                }
                super.doUpdateVisitedHistory(webView, str, z);
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("shouldInterceptRequest " + str);
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
                if (AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                    new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                        @Override
                        public final void run() {
                            BotWebViewContainer.MyWebView.AnonymousClass2.this.lambda$onRenderProcessGone$0();
                        }
                    })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            BotWebViewContainer.MyWebView.AnonymousClass2.this.lambda$onRenderProcessGone$1(dialogInterface);
                        }
                    }).show();
                    return true;
                }
                return true;
            }

            public void lambda$onRenderProcessGone$0() {
                Browser.openUrl(MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
            }

            public void lambda$onRenderProcessGone$1(DialogInterface dialogInterface) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.delegate == null) {
                    return;
                }
                MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                if (!this.val$bot && Browser.openInExternalApp(this.val$context, str, true)) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.d("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!MyWebView.this.isPageLoaded && !MyWebView.this.canGoBack()) {
                        if (MyWebView.this.botWebViewContainer.delegate != null) {
                            MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                        } else if (MyWebView.this.onCloseListener != null) {
                            MyWebView.this.onCloseListener.run();
                            MyWebView.this.onCloseListener = null;
                        }
                    }
                    return true;
                } else if (this.val$bot || parse == null || parse.getScheme() == null || "https".equals(parse.getScheme()) || "http".equals(parse.getScheme()) || "tonsite".equals(parse.getScheme())) {
                    if (MyWebView.this.botWebViewContainer != null && Browser.isInternalUri(parse, null)) {
                        if (MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols.contains(parse.getScheme())) {
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
                            MyWebView.this.botWebViewContainer.onOpenUri(parse);
                        }
                        MyWebView myWebView3 = MyWebView.this;
                        myWebView3.d("shouldOverrideUrlLoading(" + str + ") = true");
                        return true;
                    }
                    if (parse != null) {
                        MyWebView.this.currentUrl = parse.toString();
                    }
                    MyWebView myWebView4 = MyWebView.this;
                    myWebView4.d("shouldOverrideUrlLoading(" + str + ") = false");
                    return false;
                } else {
                    MyWebView myWebView5 = MyWebView.this;
                    myWebView5.d("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    Browser.openUrl(MyWebView.this.getContext(), parse);
                    return true;
                }
            }

            public void lambda$$2() {
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView.this.errorShown = false;
                    botWebViewContainer.onErrorShown(false, 0, null);
                }
            }

            @Override
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                String str2;
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
                    MyWebView.this.botWebViewContainer.onURLChanged(str, !MyWebView.this.canGoBack(), !MyWebView.this.canGoForward());
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
                    String readRes = RLottieDrawable.readRes(null, R.raw.webview_ext);
                    myWebView.evaluateJS(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                MyWebView.this.saveHistory();
            }

            @Override
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (Build.VERSION.SDK_INT >= 23) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.d("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
                    if (MyWebView.this.botWebViewContainer != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
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
                        botWebViewContainer3.onErrorShown(true, webResourceError.getErrorCode(), webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
                    }
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onReceivedError: " + i + " " + str + " url=" + str2);
                if (Build.VERSION.SDK_INT < 23 && MyWebView.this.botWebViewContainer != null) {
                    AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.lastSiteName = null;
                    myWebView2.lastActionBarColorGot = false;
                    myWebView2.lastBackgroundColorGot = false;
                    myWebView2.lastFaviconGot = false;
                    myWebView2.lastTitleGot = false;
                    myWebView2.errorShownAt = myWebView2.getUrl();
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
                if (Build.VERSION.SDK_INT >= 21) {
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
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        public class AnonymousClass3 extends WebChromeClient {
            private Dialog lastPermissionsDialog;
            final boolean val$bot;

            AnonymousClass3(boolean z) {
                MyWebView.this = r1;
                this.val$bot = z;
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
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onReceivedTitle title=" + str);
                MyWebView myWebView2 = MyWebView.this;
                if (!myWebView2.errorShown) {
                    myWebView2.lastTitleGot = true;
                    myWebView2.lastTitle = str;
                }
                if (myWebView2.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onTitleChanged(str);
                }
                super.onReceivedTitle(webView, str);
            }

            @Override
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
                super.onReceivedTouchIconUrl(webView, str, z);
            }

            @Override
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                BaseFragment safeLastFragment;
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message);
                if (SharedConfig.inappBrowser) {
                    if (MyWebView.this.botWebViewContainer == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                        return false;
                    }
                    if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                        safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
                    }
                    ArticleViewer createArticleViewer = safeLastFragment.createArticleViewer(true);
                    createArticleViewer.open((String) null);
                    MyWebView lastWebView = createArticleViewer.getLastWebView();
                    MyWebView myWebView2 = MyWebView.this;
                    lastWebView.opener = myWebView2;
                    myWebView2.d("onCreateWindow: newWebView=" + lastWebView);
                    ((WebView.WebViewTransport) message.obj).setWebView(lastWebView);
                    message.sendToTarget();
                    return true;
                }
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new AnonymousClass1());
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                return true;
            }

            public class AnonymousClass1 extends WebViewClient {
                AnonymousClass1() {
                    AnonymousClass3.this = r1;
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
                    if (AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                        new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                            @Override
                            public final void run() {
                                BotWebViewContainer.MyWebView.AnonymousClass3.AnonymousClass1.this.lambda$onRenderProcessGone$0();
                            }
                        })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public final void onDismiss(DialogInterface dialogInterface) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.AnonymousClass1.this.lambda$onRenderProcessGone$1(dialogInterface);
                            }
                        }).show();
                        return true;
                    }
                    return true;
                }

                public void lambda$onRenderProcessGone$0() {
                    Browser.openUrl(MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                }

                public void lambda$onRenderProcessGone$1(DialogInterface dialogInterface) {
                    if (MyWebView.this.botWebViewContainer.delegate != null) {
                        MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                    }
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (MyWebView.this.botWebViewContainer != null) {
                        MyWebView.this.botWebViewContainer.onOpenUri(Uri.parse(str));
                        return true;
                    }
                    return true;
                }
            }

            @Override
            public void onCloseWindow(WebView webView) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onCloseWindow " + webView);
                if (MyWebView.this.botWebViewContainer != null && MyWebView.this.botWebViewContainer.delegate != null) {
                    MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                } else if (MyWebView.this.onCloseListener != null) {
                    MyWebView.this.onCloseListener.run();
                    MyWebView.this.onCloseListener = null;
                }
                super.onCloseWindow(webView);
            }

            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Activity findActivity = AndroidUtilities.findActivity(MyWebView.this.getContext());
                if (findActivity != null) {
                    if (MyWebView.this.botWebViewContainer != null) {
                        if (MyWebView.this.botWebViewContainer.mFilePathCallback != null) {
                            MyWebView.this.botWebViewContainer.mFilePathCallback.onReceiveValue(null);
                        }
                        MyWebView.this.botWebViewContainer.mFilePathCallback = valueCallback;
                        if (Build.VERSION.SDK_INT >= 21) {
                            findActivity.startActivityForResult(fileChooserParams.createIntent(), 3000);
                        } else {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            intent.setType("*/*");
                            findActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotWebViewFileChooserTitle)), 3000);
                        }
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
                    MyWebView myWebView = MyWebView.this;
                    myWebView.d("onProgressChanged " + i + "%");
                    MyWebView.this.botWebViewContainer.webViewProgressListener.accept(Float.valueOf(((float) i) / 100.0f));
                    return;
                }
                MyWebView myWebView2 = MyWebView.this;
                myWebView2.d("onProgressChanged " + i + "%: no container");
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.parentActivity == null) {
                    MyWebView.this.d("onGeolocationPermissionsShowPrompt: no container");
                    callback.invoke(str, false, false);
                    return;
                }
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onGeolocationPermissionsShowPrompt " + str);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                Activity activity = MyWebView.this.botWebViewContainer.parentActivity;
                Theme.ResourcesProvider resourcesProvider = MyWebView.this.botWebViewContainer.resourcesProvider;
                String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                int i = R.raw.permission_request_location;
                String formatString = LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName);
                boolean z = this.val$bot;
                Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(activity, resourcesProvider, strArr, i, formatString, LocaleController.formatString(R.string.BotWebViewRequestGeolocationPermissionWithHint, userName), new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onGeolocationPermissionsShowPrompt$1(callback, str, (Boolean) obj);
                    }
                });
                this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                createWebViewPermissionsRequestDialog.show();
            }

            public void lambda$onGeolocationPermissionsShowPrompt$1(final GeolocationPermissions.Callback callback, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onGeolocationPermissionsShowPrompt$0(callback, str, (Boolean) obj);
                            }
                        });
                    } else {
                        callback.invoke(str, false, false);
                    }
                }
            }

            public void lambda$onGeolocationPermissionsShowPrompt$0(GeolocationPermissions.Callback callback, String str, Boolean bool) {
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
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onPermissionRequest " + permissionRequest);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                final String[] resources = permissionRequest.getResources();
                if (resources.length == 1) {
                    final String str = resources[0];
                    if (MyWebView.this.botWebViewContainer.parentActivity == null) {
                        permissionRequest.deny();
                        return;
                    }
                    str.hashCode();
                    if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                        Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$5(permissionRequest, str, (Boolean) obj);
                            }
                        });
                        this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                        createWebViewPermissionsRequestDialog.show();
                    } else if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        Dialog createWebViewPermissionsRequestDialog2 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$3(permissionRequest, str, (Boolean) obj);
                            }
                        });
                        this.lastPermissionsDialog = createWebViewPermissionsRequestDialog2;
                        createWebViewPermissionsRequestDialog2.show();
                    }
                } else if (resources.length == 2) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                        if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                            Dialog createWebViewPermissionsRequestDialog3 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new Consumer() {
                                @Override
                                public final void accept(Object obj) {
                                    BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$7(permissionRequest, resources, (Boolean) obj);
                                }
                            });
                            this.lastPermissionsDialog = createWebViewPermissionsRequestDialog3;
                            createWebViewPermissionsRequestDialog3.show();
                        }
                    }
                }
            }

            public void lambda$onPermissionRequest$3(final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.RECORD_AUDIO"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$2(permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public void lambda$onPermissionRequest$2(PermissionRequest permissionRequest, String str, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                    return;
                }
                permissionRequest.deny();
            }

            public void lambda$onPermissionRequest$5(final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$4(permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public void lambda$onPermissionRequest$4(PermissionRequest permissionRequest, String str, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                    return;
                }
                permissionRequest.deny();
            }

            public void lambda$onPermissionRequest$7(final PermissionRequest permissionRequest, final String[] strArr, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Consumer() {
                            @Override
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.AnonymousClass3.this.lambda$onPermissionRequest$6(permissionRequest, strArr, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            public void lambda$onPermissionRequest$6(PermissionRequest permissionRequest, String[] strArr, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{strArr[0], strArr[1]});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                    return;
                }
                permissionRequest.deny();
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

        public class AnonymousClass5 implements DownloadListener {
            AnonymousClass5() {
                MyWebView.this = r1;
            }

            private String getFilename(String str, String str2, String str3) {
                try {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    String str4 = pathSegments.get(pathSegments.size() - 1);
                    int lastIndexOf = str4.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        if (!TextUtils.isEmpty(str4.substring(lastIndexOf + 1))) {
                            return str4;
                        }
                    }
                } catch (Exception unused) {
                }
                return URLUtil.guessFileName(str, str2, str3);
            }

            @Override
            public void onDownloadStart(final String str, final String str2, String str3, final String str4, long j) {
                MyWebView myWebView = MyWebView.this;
                myWebView.d("onDownloadStart " + str + " " + str2 + " " + str3 + " " + str4 + " " + j);
                try {
                    if (str.startsWith("blob:")) {
                        MyWebView myWebView2 = MyWebView.this;
                        myWebView2.evaluateJS("window.__tg__resolveBlob('" + str.replace("'", "\\'") + "')");
                        return;
                    }
                    final String filename = getFilename(str, str3, str4);
                    final Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            BotWebViewContainer.MyWebView.AnonymousClass5.this.lambda$onDownloadStart$0(str, str4, str2, filename);
                        }
                    };
                    if (!DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j)) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MyWebView.this.getContext());
                        builder.setTitle(LocaleController.getString(R.string.WebDownloadAlertTitle));
                        builder.setMessage(AndroidUtilities.replaceTags(j > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, filename, AndroidUtilities.formatFileSize(j)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, filename)));
                        builder.setPositiveButton(LocaleController.getString(R.string.WebDownloadAlertYes), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            public void lambda$onDownloadStart$0(String str, String str2, String str3, String str4) {
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
            WebMetadataCache.WebMetadata from = WebMetadataCache.WebMetadata.from(this);
            WebMetadataCache.getInstance().save(from);
            BrowserHistory.Entry entry = this.currentHistoryEntry;
            if (entry == null || from == null) {
                return;
            }
            entry.meta = from;
            BrowserHistory.pushHistory(entry);
        }

        public void search(String str, Runnable runnable) {
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
            return super.getUrl();
        }

        @Override
        public Bitmap getFavicon() {
            if (this.errorShown) {
                return null;
            }
            return this.lastFavicon;
        }

        public Bitmap getFavicon(String str) {
            return this.lastFavicons.get(str);
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
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        BotWebViewContainer.MyWebView.lambda$evaluateJS$1((String) obj);
                    }
                });
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                loadUrl("javascript:" + URLEncoder.encode(str));
            }
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
            float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
            if (max <= getHeight()) {
                return 0.0f;
            }
            return Utilities.clamp01(getScrollY() / max);
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
            boolean isFocusable = botWebViewContainer.isFocusable();
            d("onCheckIsTextEditor: " + isFocusable);
            return isFocusable;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.botWebViewContainer.lastClickMs = System.currentTimeMillis();
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
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            d("loadUrl " + str2);
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        @Override
        public void loadUrl(String str, Map<String, String> map) {
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            d("loadUrl " + str2 + " " + map);
            super.loadUrl(str2, map);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        public void loadUrl(String str, WebMetadataCache.WebMetadata webMetadata) {
            applyCachedMeta(webMetadata);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            d("loadUrl " + str2 + " with cached meta");
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
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
            int i = -1;
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null && botWebViewContainer.delegate != null) {
                if (webMetadata.actionBarColor != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(true, webMetadata.actionBarColor);
                    this.lastActionBarColorGot = true;
                }
                int i2 = webMetadata.backgroundColor;
                if (i2 != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(false, webMetadata.backgroundColor);
                    this.lastBackgroundColorGot = true;
                    i = i2;
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
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().flush();
            }
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
        if (str != null && isTonsite(Uri.parse(str))) {
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            String rotateTONHost = rotateTONHost(hostAuthority);
            if (rotatedTONHosts == null) {
                rotatedTONHosts = new HashMap<>();
            }
            rotatedTONHosts.put(rotateTONHost, hostAuthority);
            return Browser.replaceHostname(Uri.parse(str), rotateTONHost, "https");
        }
        return str;
    }

    public static String magic2tonsite(String str) {
        String str2;
        if (rotatedTONHosts == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = rotatedTONHosts.get(hostAuthority)) != null) ? Browser.replace(Uri.parse(str), "tonsite", str2, null) : str;
    }
}
