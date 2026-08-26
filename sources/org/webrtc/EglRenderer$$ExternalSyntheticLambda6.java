package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda135;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebInstantView;
import org.telegram.ui.web.WebMetadataCache;

public final class EglRenderer$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public EglRenderer$$ExternalSyntheticLambda6(File file, int[] iArr, ChatActivity$$ExternalSyntheticLambda135 chatActivity$$ExternalSyntheticLambda135) {
        this.$r8$classId = 8;
        this.f$0 = file;
        this.f$2 = iArr;
        this.f$1 = chatActivity$$ExternalSyntheticLambda135;
    }

    @Override
    public final void run() {
        BlockRow blockRow;
        BlockRow blockRow2;
        boolean zOptBoolean;
        WebMetadataCache.WebMetadata webMetadata;
        Object obj;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean zOptBoolean2 = true;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) obj3).lambda$init$0((EglBase.Context) obj2, (int[]) obj4);
                break;
            case 1:
                RichEditorListView richEditorListView = (RichEditorListView) obj3;
                RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView.textSelectionHelper;
                if (anonymousClass1 != null && (blockRow = (BlockRow) obj2) != null && (blockRow2 = (BlockRow) obj4) != null) {
                    ArrayList arrayList = richEditorListView.itemRows;
                    int iIndexOf = arrayList.indexOf(blockRow);
                    int iIndexOf2 = arrayList.indexOf(blockRow2);
                    if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            BlockRow blockRow3 = (BlockRow) arrayList.get(i3);
                            long j = blockRow3.authorQuoteId;
                            if (j != 0) {
                                anonymousClass1.cacheText(i3, RichTextStyle.plainOf((TL_iv.RichText) richEditorListView.quoteAuthors.get(Long.valueOf(j))));
                            } else {
                                anonymousClass1.cacheText(i3, RichTextCell.readPlainText(blockRow3.block));
                            }
                        }
                        anonymousClass1.selectAllBlocksRange(Math.min(iIndexOf, iIndexOf2), Math.max(iIndexOf, iIndexOf2));
                        break;
                    }
                }
                break;
            case 2:
                ((RichEditorListView) obj3).updateLanguageOf((BlockRow) obj2, (String) obj4);
                break;
            case 3:
                RichTextCell.Delegate delegate = RichTextCell.this.delegate;
                if (delegate != null) {
                    RichTextCell.Transform transform = (RichTextCell.Transform) obj4;
                    RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                    TL_iv.PageBlock pageBlock = transform.block;
                    BlockRow blockRow4 = (BlockRow) obj2;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        RichEditorListView.this.applyQuote(blockRow4);
                    } else {
                        RichEditorListView.this.transformRow(blockRow4, pageBlock, transform.level, transform.num, transform.checkbox, transform.checked);
                    }
                }
                break;
            case 4:
                ChatListItemAnimator chatListItemAnimator = (ChatListItemAnimator) obj3;
                chatListItemAnimator.getClass();
                int i4 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) obj2;
                    if (i4 >= arrayList2.size()) {
                        ArrayList arrayList3 = (ArrayList) obj4;
                        if (chatListItemAnimator.mRemoveAnimations.removeAll(arrayList3)) {
                            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                chatListItemAnimator.dispatchAnimationFinished((RecyclerView.ViewHolder) arrayList3.get(i5));
                            }
                            chatListItemAnimator.dispatchFinishedWhenDone();
                        }
                        chatListItemAnimator.thanosViews.removeAll(arrayList2);
                    } else {
                        ((View) arrayList2.get(i4)).setVisibility(0);
                        i4++;
                    }
                    break;
                }
                break;
            case 5:
                ChatListItemAnimator chatListItemAnimator2 = (ChatListItemAnimator) obj3;
                chatListItemAnimator2.getClass();
                View view = (View) obj2;
                view.setVisibility(0);
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj4;
                if (chatListItemAnimator2.mRemoveAnimations.remove(viewHolder)) {
                    chatListItemAnimator2.dispatchAnimationFinished(viewHolder);
                    chatListItemAnimator2.dispatchFinishedWhenDone();
                }
                chatListItemAnimator2.thanosViews.remove(view);
                break;
            case 6:
                ((BotWebViewContainer.MyWebView) obj3).evaluateJS("window.Telegram.WebView.receiveEvent('" + ((String) obj2) + "', " + ((JSONObject) obj4) + ");");
                break;
            case 7:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj3;
                botWebViewContainer.getClass();
                for (String str : (String[]) obj4) {
                    if (botWebViewContainer.getContext().checkSelfPermission(str) != 0) {
                        ((Consumer) obj2).accept(Boolean.valueOf(z));
                    }
                    break;
                }
                z = true;
                ((Consumer) obj2).accept(Boolean.valueOf(z));
                break;
            case 8:
                AnimatedFileNative.getVideoInfo(((File) obj3).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((ChatActivity$$ExternalSyntheticLambda135) obj2);
                break;
            case 9:
                String str2 = (String) obj2;
                String str3 = (String) obj4;
                BotWebViewContainer.BotWebViewProxy botWebViewProxy = (BotWebViewContainer.BotWebViewProxy) obj3;
                botWebViewProxy.getClass();
                try {
                    BotWebViewContainer botWebViewContainer2 = botWebViewProxy.container;
                    if (botWebViewContainer2 != null) {
                        int i6 = BotWebViewContainer.tags;
                        botWebViewContainer2.onEventReceived(botWebViewProxy, str2, str3);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 10:
                BotWebViewContainer botWebViewContainer3 = ((BotWebViewContainer.WebViewProxy) obj3).container;
                if (botWebViewContainer3 != null) {
                    int i7 = BotWebViewContainer.tags;
                    if (!botWebViewContainer3.bot && botWebViewContainer3.delegate != null) {
                        String str4 = (String) obj2;
                        if (botWebViewContainer3.trustedOrigin != null && !TextUtils.equals(botWebViewContainer3.getOriginHost(), botWebViewContainer3.trustedOrigin)) {
                            botWebViewContainer3.d("onWebEventReceived ignore " + str4);
                            break;
                        } else {
                            StringBuilder sbM4m = SurfaceContainer$$ExternalSyntheticOutline0.m4m("onWebEventReceived ", str4, " ");
                            String str5 = (String) obj4;
                            sbM4m.append(str5);
                            botWebViewContainer3.d(sbM4m.toString());
                            str4.getClass();
                            switch (str4) {
                                case "actionBarColor":
                                case "navigationBarColor":
                                    try {
                                        JSONArray jSONArray = new JSONArray(str5);
                                        boolean zEquals = TextUtils.equals(str4, "actionBarColor");
                                        int iArgb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                        BotWebViewContainer.MyWebView myWebView = botWebViewContainer3.webView;
                                        if (myWebView != null) {
                                            if (zEquals) {
                                                myWebView.lastActionBarColorGot = true;
                                                myWebView.lastActionBarColor = iArgb;
                                            } else {
                                                myWebView.lastBackgroundColorGot = true;
                                                myWebView.lastBackgroundColor = iArgb;
                                            }
                                            BotWebViewContainer.MyWebView.access$400(myWebView);
                                        }
                                        botWebViewContainer3.delegate.onWebAppBackgroundChanged(iArgb, zEquals);
                                        break;
                                    } catch (Exception unused) {
                                        return;
                                    }
                                    break;
                                case "oauth_request":
                                    botWebViewContainer3.d("oauth_request " + str5);
                                    if (botWebViewContainer3.webView != null) {
                                        String originHost = botWebViewContainer3.getOriginHost();
                                        if (!TextUtils.isEmpty(originHost)) {
                                            try {
                                                String strOptString = new JSONObject(str5).optString("url");
                                                botWebViewContainer3.notifyEvent("oauth_supported", BotWebViewContainer.obj(1, "version"));
                                                if (!TextUtils.isEmpty(strOptString)) {
                                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                    tL_messages_requestUrlAuth.url = strOptString;
                                                    int i8 = tL_messages_requestUrlAuth.flags;
                                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                    tL_messages_requestUrlAuth.flags = i8 | 12;
                                                    ConnectionsManager.getInstance(botWebViewContainer3.currentAccount).sendRequest(tL_messages_requestUrlAuth, new LoginActivity$$ExternalSyntheticLambda42(botWebViewContainer3, tL_messages_requestUrlAuth, strOptString, originHost), 2);
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                case "siteName":
                                    botWebViewContainer3.d("siteName " + str5);
                                    BotWebViewContainer.MyWebView myWebView2 = botWebViewContainer3.webView;
                                    if (myWebView2 != null) {
                                        myWebView2.lastSiteName = str5;
                                        BotWebViewContainer.MyWebView.access$400(myWebView2);
                                        break;
                                    }
                                    break;
                                case "allowScroll":
                                    try {
                                        JSONArray jSONArray2 = new JSONArray(str5);
                                        zOptBoolean = jSONArray2.optBoolean(0, true);
                                        try {
                                            zOptBoolean2 = jSONArray2.optBoolean(1, true);
                                            break;
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                        zOptBoolean = true;
                                    }
                                    if (botWebViewContainer3.getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) botWebViewContainer3.getParent();
                                        webViewSwipeContainer.allowedScrollX = zOptBoolean;
                                        webViewSwipeContainer.allowedScrollY = zOptBoolean2;
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                }
                break;
            case 11:
                HistoryFragment.AnonymousClass2 anonymousClass2 = (HistoryFragment.AnonymousClass2) obj3;
                anonymousClass2.getClass();
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    ArrayList arrayList5 = (ArrayList) obj2;
                    if (i2 >= arrayList5.size()) {
                        AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(20, anonymousClass2, arrayList4));
                    } else {
                        BrowserHistory.Entry entry = (BrowserHistory.Entry) arrayList5.get(i2);
                        String str6 = (String) obj4;
                        if (HistoryFragment.AnonymousClass2.matches(entry.url, str6) || ((webMetadata = entry.meta) != null && (HistoryFragment.AnonymousClass2.matches(webMetadata.title, str6) || HistoryFragment.AnonymousClass2.matches(entry.meta.sitename, str6)))) {
                            arrayList4.add(entry);
                        }
                        i2++;
                    }
                    break;
                }
                break;
            case 12:
                WebInstantView webInstantView = (WebInstantView) obj3;
                webInstantView.getClass();
                if (WebInstantView.loadingPhotos != null) {
                    WebInstantView.WebPhoto webPhoto = (WebInstantView.WebPhoto) obj2;
                    Bitmap bitmap = (Bitmap) obj4;
                    boolean z2 = (webPhoto.w <= 0 || webPhoto.h <= 0) && bitmap != null;
                    if (bitmap != null) {
                        webInstantView.loadedPhotos.put(webPhoto.url, bitmap);
                        if (z2) {
                            int i9 = webPhoto.w;
                            if (i9 == 0 && webPhoto.h == 0) {
                                webPhoto.w = bitmap.getWidth();
                                webPhoto.h = bitmap.getHeight();
                            } else if (i9 == 0) {
                                webPhoto.w = (int) ((bitmap.getWidth() / bitmap.getHeight()) * webPhoto.h);
                            } else if (webPhoto.h == 0) {
                                webPhoto.h = (int) ((bitmap.getHeight() / bitmap.getWidth()) * webPhoto.w);
                            }
                        }
                    }
                    ArrayList arrayList6 = (ArrayList) WebInstantView.loadingPhotos.remove(webPhoto.url);
                    if (arrayList6 != null) {
                        int size = arrayList6.size();
                        while (i < size) {
                            Object obj5 = arrayList6.get(i);
                            i++;
                            Pair pair = (Pair) obj5;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (z2 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 13:
                ((EglRenderer) obj3).lambda$removeFrameListener$4((CountDownLatch) obj2, (EglRenderer.FrameListener) obj4);
                break;
            default:
                ((VideoFileRenderer) obj3).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj2, (VideoFrame) obj4);
                break;
        }
    }

    public EglRenderer$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
