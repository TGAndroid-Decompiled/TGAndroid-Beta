package org.telegram.ui.web;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.content.FileProvider;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.zzcl;
import com.google.android.gms.internal.mlkit_vision_common.zzks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda98;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda29;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda50;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.ThemePreviewActivity;

public final class WebInstantView$4$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public WebInstantView$4$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run() {
        boolean z;
        long j;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        String strOptString;
        String strOptString2;
        String strOptString3;
        LaunchActivity launchActivity;
        int i = 2;
        JSONObject jSONObject = null;
        File file = null;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        int i2 = 1;
        int i3 = 0;
        switch (this.$r8$classId) {
            case 0:
                String str = (String) this.f$3;
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        WebView webView = (WebView) this.f$1;
                        webView.onPause();
                        webView.destroy();
                        AndroidUtilities.removeFromParent(webView);
                        AndroidUtilities.removeFromParent((FrameLayout) this.f$2);
                    }
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    ((WebInstantView$$ExternalSyntheticLambda0) this.f$4).run(jSONObject);
                    break;
                }
                break;
            case 1:
                List list = (List) this.f$0;
                boolean zIsEmpty = list.isEmpty();
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$1;
                if (zIsEmpty) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda98(0, callback2));
                } else {
                    ProductDetails productDetails = (ProductDetails) list.get(0);
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails == null) {
                        FileLog.d("StarsController.buy queryProductDetails done: no details");
                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda98(4, callback2));
                    } else {
                        TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) this.f$2;
                        tL_inputStorePaymentStarsTopup.currency = oneTimePurchaseOfferDetails.zzc;
                        tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TL_stars.TL_starsTopupOption) this.f$3).currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
                        BillingController.getInstance().addResultListener(productDetails.zzc, new ChatActivity$$ExternalSyntheticLambda211(callback2, 13));
                        BillingController.getInstance().setOnCanceled(new StarsController$$ExternalSyntheticLambda98(2, callback2));
                        FileLog.d("StarsController.buy launchBillingFlow");
                        BillingController billingController = BillingController.getInstance();
                        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                        zzcl zzclVar = new zzcl((char) 0, 16);
                        zzclVar.setProductDetails((ProductDetails) list.get(0));
                        billingController.launchBillingFlow((Activity) this.f$4, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(zzclVar.build()));
                    }
                }
                break;
            case 2:
                DialogStoriesCell.StoryCell storyCellFindStoryCell = (DialogStoriesCell.StoryCell) this.f$0;
                if (storyCellFindStoryCell == null) {
                    storyCellFindStoryCell = ((DialogsActivity.AnonymousClass25) this.f$1).findStoryCell(((Long) this.f$2).longValue());
                }
                ((StoryRecorder) this.f$3).replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCellFindStoryCell));
                ((Runnable) this.f$4).run();
                break;
            case 3:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                ButtonWithCounterView$$ExternalSyntheticLambda3 buttonWithCounterView$$ExternalSyntheticLambda3 = (ButtonWithCounterView$$ExternalSyntheticLambda3) this.f$1;
                if (buttonWithCounterView$$ExternalSyntheticLambda3 != null) {
                    peerStoriesView.getClass();
                    buttonWithCounterView$$ExternalSyntheticLambda3.run();
                }
                DarkThemeResourceProvider darkThemeResourceProvider = peerStoriesView.resourcesProvider;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$2;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = peerStoriesView.storyContainer;
                if (tL_error == null || "STORY_NOT_MODIFIED".equals(tL_error.text)) {
                    StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = (StoryPrivacyBottomSheet.StoryPrivacy) this.f$4;
                    TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f$3;
                    storyItem.parsedPrivacy = storyPrivacy;
                    ArrayList<TLRPC.PrivacyRule> arrayList = new ArrayList<>();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList2 = storyPrivacy.rules;
                        if (i4 >= arrayList2.size()) {
                            storyItem.privacy = arrayList;
                            int i5 = storyPrivacy.type;
                            storyItem.close_friends = i5 == 1;
                            storyItem.contacts = i5 == 2;
                            storyItem.selected_contacts = i5 == 3;
                            MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().updateStoryItem(storyItem.dialogId, storyItem, true);
                            peerStoriesView.editedPrivacy = true;
                            if (i5 == 4) {
                                new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).show();
                            } else if (i5 != 1) {
                                ArrayList arrayList3 = storyPrivacy.selectedUserIds;
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        HashSet hashSet = new HashSet();
                                        hashSet.addAll(arrayList3);
                                        Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
                                        while (it.hasNext()) {
                                            hashSet.addAll((ArrayList) it.next());
                                        }
                                        z = false;
                                        new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).show();
                                    }
                                    peerStoriesView.updatePosition(z);
                                    break;
                                } else if (arrayList3.isEmpty()) {
                                    new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).show();
                                } else {
                                    new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList3.size(), new Object[0])).show();
                                }
                            } else {
                                new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).show();
                            }
                        } else {
                            TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i4);
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                arrayList.add(new TLRPC.TL_privacyValueAllowAll());
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                arrayList.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                arrayList.add(new TLRPC.TL_privacyValueAllowContacts());
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                for (int iM = 0; iM < tL_inputPrivacyValueDisallowUsers.users.size(); iM = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueDisallowUsers.users.get(iM).user_id, tL_privacyValueDisallowUsers.users, iM, 1)) {
                                }
                                arrayList.add(tL_privacyValueDisallowUsers);
                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                for (int iM2 = 0; iM2 < tL_inputPrivacyValueAllowUsers.users.size(); iM2 = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueAllowUsers.users.get(iM2).user_id, tL_privacyValueAllowUsers.users, iM2, 1)) {
                                }
                                arrayList.add(tL_privacyValueAllowUsers);
                            }
                            i4++;
                        }
                    }
                } else {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, new BulletinFactory(anonymousClass4, darkThemeResourceProvider), R.raw.error, 36);
                }
                z = false;
                peerStoriesView.updatePosition(z);
                break;
            case 4:
                PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
                Activity activity = (Activity) this.f$1;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.f$2;
                StoryViewer storyViewer = (StoryViewer) this.f$3;
                PeerStoriesView.SharedResources sharedResources = (PeerStoriesView.SharedResources) this.f$4;
                StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, anonymousClass8.this$0.currentAccount);
                PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass8.this$0.playerSharedScope;
                long j2 = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
                StoryEntry storyEntryFromStoryItem = StoryEntry.fromStoryItem(anonymousClass8.this$0.currentStory.getPath(), anonymousClass8.this$0.currentStory.storyItem);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
                storyEntryFromStoryItem.editStoryPeerId = anonymousClass1.dialogId;
                TL_stories.StoryItem storyItem3 = anonymousClass1.currentStory.storyItem;
                if (storyItem3 == null || (messageMedia = storyItem3.media) == null || (document = messageMedia.document) == null) {
                    j = 0;
                } else {
                    for (int i6 = 0; i6 < document.attributes.size(); i6++) {
                        if (document.attributes.get(i6) instanceof TLRPC.TL_documentAttributeVideo) {
                            tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i6);
                            if (tL_documentAttributeVideo == null) {
                                j = 0;
                            } else {
                                j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                            }
                        }
                    }
                    if (tL_documentAttributeVideo == null) {
                        j = 0;
                    } else {
                        j = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                    }
                }
                storyEntryFromStoryItem.cover = j;
                StoryEntry storyEntryCopy$1 = storyEntryFromStoryItem.copy$1();
                storyEntryCopy$1.isEditingCover = true;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass8.this$0;
                TL_stories.StoryItem storyItem4 = anonymousClass2.currentStory.storyItem;
                storyEntryCopy$1.editingCoverDocument = storyItem4.media.document;
                storyEntryCopy$1.updateDocumentRef = new ArticleViewer$$ExternalSyntheticLambda33(anonymousClass8, storyItem4, storyItem2, 19);
                if (anonymousClass2.isBotsPreview()) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass8.this$0;
                    storyEntryCopy$1.botId = anonymousClass3.dialogId;
                    storyEntryCopy$1.editingBotPreview = MessagesController.toInputMedia(anonymousClass3.currentStory.storyItem.media);
                    StoriesController.StoriesList storiesList = storyViewer.storiesList;
                    if (storiesList instanceof StoriesController.BotPreviewsList) {
                        storyEntryCopy$1.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                    }
                }
                storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy$1, j2);
                storyRecorder.onFullyOpenListener = new PeerStoriesView$8$$ExternalSyntheticLambda29(anonymousClass8, i);
                storyRecorder.onClosePrepareListener = new PeerStoriesView$8$$ExternalSyntheticLambda50(anonymousClass8, sharedResources, i3);
                break;
            case 5:
                SelfStoryViewsPage.AnonymousClass4 anonymousClass5 = (SelfStoryViewsPage.AnonymousClass4) this.f$0;
                anonymousClass5.getClass();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                arrayList4.add((TLRPC.User) this.f$1);
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass6 = anonymousClass5.this$0;
                ContactsController.getInstance(anonymousClass6.currentAccount).deleteContact(arrayList4, false);
                zzks.m(R.string.DeletedFromYourContacts, new Object[]{(String) this.f$3}, new BulletinFactory(anonymousClass6, anonymousClass6.resourcesProvider), R.raw.ic_ban);
                ((ReactedUserHolderView) this.f$2).animateAlpha(anonymousClass6.isStoryShownToUser((TL_stories.StoryView) this.f$4) ? 1.0f : 0.5f, true);
                break;
            case 6:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                ((AlertDialog) this.f$1).dismiss();
                TLObject tLObject = (TLObject) this.f$2;
                boolean z2 = tLObject instanceof TL_phone.groupCallStreamRtmpUrl;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                if (z2) {
                    CreateRtmpStreamBottomSheet[] createRtmpStreamBottomSheetArr = new CreateRtmpStreamBottomSheet[1];
                    CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(page.getContext(), ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (TL_phone.getGroupCallStreamRtmpUrl) this.f$3, (TL_phone.groupCallStreamRtmpUrl) tLObject, storyPrivacyBottomSheet.liveSettings ? null : new ThemeActivity$$ExternalSyntheticLambda19(6, page, createRtmpStreamBottomSheetArr), new DarkThemeResourceProvider());
                    createRtmpStreamBottomSheetArr[0] = createRtmpStreamBottomSheet;
                    createRtmpStreamBottomSheet.show();
                } else {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f$4;
                    if (tL_error2 != null) {
                        new BulletinFactory(storyPrivacyBottomSheet.container, ((BottomSheet) storyPrivacyBottomSheet).resourcesProvider).showForError(true, tL_error2);
                    }
                }
                break;
            case 7:
                ((TimelineView) this.f$0).lambda$new$6((ViewGroup) this.f$1, (Theme.ResourcesProvider) this.f$2, (BlurringShader.BlurManager) this.f$3, (ThemePreviewActivity.AnonymousClass14) this.f$4);
                break;
            case 8:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f$1;
                String str2 = (String) this.f$3;
                if (tL_error3 != null) {
                    botWebViewContainer.onInvoiceStatusUpdate(str2, "failed", false);
                } else {
                    botWebViewContainer.delegate.onWebAppOpenInvoice((TLRPC.TL_inputInvoiceSlug) this.f$2, str2, (TLObject) this.f$4);
                }
                break;
            case 9:
                BotWebViewContainer botWebViewContainer2 = (BotWebViewContainer) this.f$0;
                botWebViewContainer2.getClass();
                TLObject tLObject2 = (TLObject) this.f$1;
                if (tLObject2 != null) {
                    ((String[]) this.f$2)[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        MessagesController.getInstance(botWebViewContainer2.currentAccount).processUpdates((TLRPC.Updates) tLObject2, false);
                    }
                }
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f$3;
                if (tL_error4 != null) {
                    botWebViewContainer2.unknownError(tL_error4.text);
                }
                ((AlertDialog) this.f$4).dismiss();
                break;
            case 10:
                String str3 = (String) this.f$3;
                String str4 = (String) this.f$1;
                String str5 = (String) this.f$2;
                String str6 = (String) this.f$4;
                BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str3));
                    request.setMimeType(str4);
                    request.addRequestHeader("User-Agent", str5);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str6);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str6);
                    DownloadManager downloadManager = (DownloadManager) myWebView.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    BotWebViewContainer botWebViewContainer3 = myWebView.botWebViewContainer;
                    if (botWebViewContainer3 != null) {
                        new BulletinFactory(botWebViewContainer3, botWebViewContainer3.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str6))).show(true);
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            default:
                String str7 = (String) this.f$3;
                BotWebViewContainer.WebViewProxy webViewProxy = (BotWebViewContainer.WebViewProxy) this.f$0;
                if (webViewProxy.container != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    BotWebViewContainer botWebViewContainer4 = webViewProxy.container;
                    long j3 = jCurrentTimeMillis - botWebViewContainer4.lastClickMs;
                    BotWebViewContainer.MyWebView myWebView2 = webViewProxy.webView;
                    if (j3 > 10000) {
                        myWebView2.evaluateJS("window.navigator.__share__receive(\"security\")");
                    } else {
                        botWebViewContainer4.lastClickMs = 0L;
                        Context context = myWebView2.getContext();
                        Activity activityFindActivity = AndroidUtilities.findActivity(context);
                        if (activityFindActivity == null && (launchActivity = LaunchActivity.instance) != null) {
                            activityFindActivity = launchActivity;
                        }
                        if (context == null || activityFindActivity == null || !(activityFindActivity instanceof LaunchActivity) || activityFindActivity.isFinishing() || !myWebView2.isAttachedToWindow()) {
                            myWebView2.evaluateJS("window.navigator.__share__receive(\"security\")");
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) activityFindActivity;
                            try {
                                JSONObject jSONObject2 = new JSONObject(str7);
                                strOptString = jSONObject2.optString("url", null);
                                try {
                                    strOptString2 = jSONObject2.optString("text", null);
                                    try {
                                        strOptString3 = jSONObject2.optString("title", null);
                                    } catch (Exception e3) {
                                        e = e3;
                                        FileLog.e(e);
                                        strOptString3 = null;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    strOptString2 = null;
                                }
                            } catch (Exception e5) {
                                e = e5;
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
                            byte[] bArr = (byte[]) this.f$1;
                            if (bArr != null) {
                                while (true) {
                                    String str8 = (String) this.f$2;
                                    if (file == null || file.exists()) {
                                        File directory = FileLoader.getDirectory(4);
                                        StringBuilder sb2 = new StringBuilder();
                                        if (str8 == null) {
                                            str8 = "file";
                                        }
                                        sb2.append(FileLoader.fixFileName(str8));
                                        sb2.append(i3 > 0 ? SurfaceContainer$$ExternalSyntheticOutline0.m(i3, " (", ")") : "");
                                        file = new File(directory, sb2.toString());
                                        i3++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e6) {
                                            FileLog.e(e6);
                                        }
                                        String str9 = (String) this.f$4;
                                        try {
                                            if (str9 == null) {
                                                intent.setType("text/plain");
                                            } else {
                                                intent.setType(str9);
                                            }
                                            if (str8 != null) {
                                                intent.putExtra("android.intent.extra.TITLE", str8);
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
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                }
                            } else {
                                intent.setType("text/plain");
                            }
                            launchActivity2.webviewShareAPIDoneListener = new HistoryFragment$$ExternalSyntheticLambda0(webViewProxy, i2);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public WebInstantView$4$$ExternalSyntheticLambda0(Object obj, String str, Serializable serializable, String str2, String str3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = str;
        this.f$1 = serializable;
        this.f$2 = str2;
        this.f$4 = str3;
    }

    public WebInstantView$4$$ExternalSyntheticLambda0(Object obj, TLObject tLObject, String str, Object obj2, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$3 = str;
        this.f$2 = obj2;
        this.f$4 = tLObject2;
    }
}
