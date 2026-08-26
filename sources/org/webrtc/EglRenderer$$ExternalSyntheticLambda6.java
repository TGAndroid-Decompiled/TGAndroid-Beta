package org.webrtc;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController$$ExternalSyntheticLambda21;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda67;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda0;
import org.telegram.ui.web.WebInstantView;
import org.telegram.ui.web.WebMetadataCache;

public final class EglRenderer$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public EglRenderer$$ExternalSyntheticLambda6(File file, int[] iArr, StarsController$$ExternalSyntheticLambda67 starsController$$ExternalSyntheticLambda67) {
        this.$r8$classId = 17;
        this.f$0 = file;
        this.f$2 = iArr;
        this.f$1 = starsController$$ExternalSyntheticLambda67;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Photo photo2;
        MessageObject messageObject;
        int id;
        RichTableCell richTableCell;
        BlockRow blockRow;
        BlockRow blockRow2;
        WebMetadataCache.WebMetadata webMetadata;
        Object obj;
        int i = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        Object obj4 = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) obj3).lambda$init$0((EglBase.Context) obj2, (int[]) obj4);
                return;
            case 1:
                break;
            case 2:
                StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) obj3;
                botPreviewsList.reqId = 0;
                botPreviewsList.loading = false;
                botPreviewsList.loaded = true;
                botPreviewsList.done = true;
                ArrayList arrayList = new ArrayList();
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj5 = arrayList2.get(i2);
                        i2++;
                        arrayList.add((TL_bots.botPreviewMedia) obj5);
                    }
                } else {
                    if (!(tLObject instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject;
                    ArrayList arrayList3 = botPreviewsList.lang_codes;
                    arrayList3.clear();
                    arrayList3.addAll(previewinfo.lang_codes);
                    arrayList.addAll(previewinfo.media);
                }
                ArrayList arrayList4 = botPreviewsList.messageObjects;
                ArrayList arrayList5 = new ArrayList(arrayList4);
                arrayList4.clear();
                ArrayList arrayList6 = botPreviewsList.fakeDays;
                arrayList6.clear();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj6 = arrayList.get(i3);
                    i3++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj6;
                    MessageObject messageObject2 = new MessageObject(botPreviewsList.currentAccount, new StoriesController.BotPreview(botPreviewsList, botPreviewsList.dialogId, botpreviewmedia));
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList5.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList5.get(i4)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList5.get(i4);
                        } else {
                            i4++;
                        }
                    }
                    TL_stories.StoryItem storyItem2 = messageObject2.storyItem;
                    TLRPC.Message message = messageObject2.messageOwner;
                    if (messageObject == null) {
                        id = botPreviewsList.lastId;
                        botPreviewsList.lastId = id + 1;
                    } else {
                        id = messageObject.getId();
                    }
                    message.id = id;
                    storyItem2.id = id;
                    messageObject2.parentStoriesList = botPreviewsList;
                    messageObject2.generateThumbs(false);
                    if (arrayList6.isEmpty()) {
                        arrayList6.add(new ArrayList());
                    }
                    ((ArrayList) arrayList6.get(0)).add(Integer.valueOf(messageObject2.getId()));
                    arrayList4.add(messageObject2);
                }
                StoriesController$StoriesList$$ExternalSyntheticLambda1 storiesController$StoriesList$$ExternalSyntheticLambda1 = botPreviewsList.notify;
                AndroidUtilities.cancelRunOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(storiesController$StoriesList$$ExternalSyntheticLambda1);
                Runnable runnable = (Runnable) obj4;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 3:
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.storiesViewPager.setDays(storyViewer.currentAccount, ((StoriesController.StoriesList) obj2).dialogId, (ArrayList) obj4);
                return;
            case 4:
                ((ViewsForPeerStoriesRequester) obj3).lambda$requestInternal$1((TLObject) obj2, (TL_stories.TL_stories_getStoriesViews) obj4);
                return;
            case 5:
                ArrayList arrayList7 = new ArrayList();
                int i5 = 0;
                while (true) {
                    ArrayList arrayList8 = (ArrayList) obj3;
                    if (i5 >= arrayList8.size()) {
                        ((Utilities.Callback) obj4).run(arrayList7);
                        return;
                    }
                    TLRPC.User user = (TLRPC.User) arrayList8.get(i5);
                    Boolean bool = (Boolean) ((HashMap) obj2).get(Long.valueOf(user.id));
                    arrayList7.add(new BotBiometry.Bot(user, bool == null || !bool.booleanValue()));
                    i5++;
                }
                break;
            case 6:
                ((boolean[]) obj3)[0] = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    ((BotVerifySheet$$ExternalSyntheticLambda1) obj4).run(Boolean.TRUE);
                    return;
                }
                return;
            case 7:
                BotWebViewSheet.AnonymousClass3 anonymousClass3 = (BotWebViewSheet.AnonymousClass3) obj3;
                anonymousClass3.getClass();
                boolean z = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                if (z) {
                    botWebViewSheet.webViewContainer.notifyEmojiStatusAccess("cancelled");
                    return;
                } else {
                    BulletinFactory.of(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).makeForError((TLRPC.TL_error) obj4).show(true);
                    return;
                }
            case 8:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) obj3;
                channelAffiliateProgramsFragment.getClass();
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                BulletinFactory.of(channelAffiliateProgramsFragment).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj4)))).show();
                return;
            case 9:
                ((ChannelAffiliateProgramsFragment) obj3).lambda$createView$4((AlertDialog) obj4, (TLObject) obj2);
                return;
            case 10:
                RichEditorListView richEditorListView = (RichEditorListView) obj3;
                if (richEditorListView.tableCellMenu != ((ItemOptions) obj2)) {
                    return;
                }
                richEditorListView.tableCellMenu = null;
                if (richEditorListView.clearDraggedMultiCellSelectionOnMenuDismiss && richEditorListView.activeCellSelectionTable == (richTableCell = (RichTableCell) obj4) && !richTableCell.selectedCells.isEmpty()) {
                    richEditorListView.exitCellSelectionMode();
                    return;
                }
                return;
            case 11:
                RichEditorListView richEditorListView2 = (RichEditorListView) obj3;
                RichEditorListView.AnonymousClass1 anonymousClass1 = richEditorListView2.textSelectionHelper;
                if (anonymousClass1 == null || (blockRow = (BlockRow) obj2) == null || (blockRow2 = (BlockRow) obj4) == null) {
                    return;
                }
                ArrayList arrayList9 = richEditorListView2.itemRows;
                int iIndexOf = arrayList9.indexOf(blockRow);
                int iIndexOf2 = arrayList9.indexOf(blockRow2);
                if (iIndexOf < 0 || iIndexOf2 < 0) {
                    return;
                }
                while (i < arrayList9.size()) {
                    BlockRow blockRow3 = (BlockRow) arrayList9.get(i);
                    long j = blockRow3.authorQuoteId;
                    if (j != 0) {
                        anonymousClass1.cacheText(i, RichTextStyle.plainOf((TL_iv.RichText) richEditorListView2.quoteAuthors.get(Long.valueOf(j))));
                    } else {
                        anonymousClass1.cacheText(i, RichTextCell.readPlainText(blockRow3.block));
                    }
                    i++;
                }
                anonymousClass1.selectAllBlocksRange(Math.min(iIndexOf, iIndexOf2), Math.max(iIndexOf, iIndexOf2));
                return;
            case 12:
                ((RichEditorListView) obj3).updateLanguageOf((BlockRow) obj2, (String) obj4);
                return;
            case 13:
                RichTextCell.Delegate delegate = RichTextCell.this.delegate;
                if (delegate != null) {
                    RichTextCell.Transform transform = (RichTextCell.Transform) obj4;
                    RichEditorListView.AnonymousClass14 anonymousClass14 = (RichEditorListView.AnonymousClass14) delegate;
                    TL_iv.PageBlock pageBlock = transform.block;
                    BlockRow blockRow4 = (BlockRow) obj2;
                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        RichEditorListView.this.applyQuote(blockRow4);
                        return;
                    } else {
                        RichEditorListView.this.transformRow(blockRow4, pageBlock, transform.level, transform.num, transform.checkbox, transform.checked);
                        return;
                    }
                }
                return;
            case 14:
                ((ChatListItemAnimator) obj3).lambda$animateRemoveImpl$9((View) obj2, (RecyclerView.ViewHolder) obj4);
                return;
            case 15:
                ((ChatListItemAnimator) obj3).lambda$animateRemoveGroupImpl$10((ArrayList) obj2, (ArrayList) obj4);
                return;
            case 16:
                ((BotWebViewContainer) obj3).lambda$runWithPermissions$0((Consumer) obj2, (String[]) obj4);
                return;
            case 17:
                BotWebViewContainer.lambda$onEventReceived$34((File) obj3, (int[]) obj4, (StarsController$$ExternalSyntheticLambda67) obj2);
                return;
            case 18:
                ((BotWebViewContainer.MyWebView) obj3).evaluateJS("window.Telegram.WebView.receiveEvent('" + ((String) obj2) + "', " + ((JSONObject) obj4) + ");");
                return;
            case 19:
                String str = (String) obj2;
                String str2 = (String) obj4;
                BotWebViewContainer.BotWebViewProxy botWebViewProxy = (BotWebViewContainer.BotWebViewProxy) obj3;
                botWebViewProxy.getClass();
                try {
                    BotWebViewContainer botWebViewContainer = botWebViewProxy.container;
                    if (botWebViewContainer == null) {
                        return;
                    }
                    botWebViewContainer.onEventReceived(botWebViewProxy, str, str2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 20:
                BotWebViewContainer botWebViewContainer2 = ((BotWebViewContainer.WebViewProxy) obj3).container;
                if (botWebViewContainer2 == null) {
                    return;
                }
                botWebViewContainer2.onWebEventReceived((String) obj2, (String) obj4);
                return;
            case 21:
                HistoryFragment.AnonymousClass2 anonymousClass2 = (HistoryFragment.AnonymousClass2) obj3;
                anonymousClass2.getClass();
                ArrayList arrayList10 = new ArrayList();
                while (true) {
                    ArrayList arrayList11 = (ArrayList) obj2;
                    if (i >= arrayList11.size()) {
                        AndroidUtilities.runOnUIThread(new WebActionBar$$ExternalSyntheticLambda0(3, anonymousClass2, arrayList10));
                        return;
                    }
                    BrowserHistory.Entry entry = (BrowserHistory.Entry) arrayList11.get(i);
                    String str3 = (String) obj4;
                    if (HistoryFragment.AnonymousClass2.matches(entry.url, str3) || ((webMetadata = entry.meta) != null && (HistoryFragment.AnonymousClass2.matches(webMetadata.title, str3) || HistoryFragment.AnonymousClass2.matches(entry.meta.sitename, str3)))) {
                        arrayList10.add(entry);
                    }
                    i++;
                }
                break;
            case 22:
                WebInstantView webInstantView = (WebInstantView) obj3;
                webInstantView.getClass();
                if (WebInstantView.loadingPhotos == null) {
                    return;
                }
                WebInstantView.WebPhoto webPhoto = (WebInstantView.WebPhoto) obj2;
                Bitmap bitmap = (Bitmap) obj4;
                boolean z2 = (webPhoto.w <= 0 || webPhoto.h <= 0) && bitmap != null;
                if (bitmap != null) {
                    webInstantView.loadedPhotos.put(webPhoto.url, bitmap);
                    if (z2) {
                        int i6 = webPhoto.w;
                        if (i6 == 0 && webPhoto.h == 0) {
                            webPhoto.w = bitmap.getWidth();
                            webPhoto.h = bitmap.getHeight();
                        } else if (i6 == 0) {
                            webPhoto.w = (int) ((bitmap.getWidth() / bitmap.getHeight()) * webPhoto.h);
                        } else if (webPhoto.h == 0) {
                            webPhoto.h = (int) ((bitmap.getHeight() / bitmap.getWidth()) * webPhoto.w);
                        }
                    }
                }
                ArrayList arrayList12 = (ArrayList) WebInstantView.loadingPhotos.remove(webPhoto.url);
                if (arrayList12 == null) {
                    return;
                }
                int size3 = arrayList12.size();
                while (i < size3) {
                    Object obj7 = arrayList12.get(i);
                    i++;
                    Pair pair = (Pair) obj7;
                    ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                    if (z2 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
                return;
            case 23:
                ((EglRenderer) obj3).lambda$removeFrameListener$4((CountDownLatch) obj2, (EglRenderer.FrameListener) obj4);
                return;
            default:
                ((VideoFileRenderer) obj3).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj2, (VideoFrame) obj4);
                return;
        }
        while (true) {
            ArrayList arrayList13 = ((StoriesController.BotPreviewsList) obj3).messageObjects;
            FileRefController$$ExternalSyntheticLambda21 fileRefController$$ExternalSyntheticLambda21 = (FileRefController$$ExternalSyntheticLambda21) obj4;
            if (i >= arrayList13.size()) {
                fileRefController$$ExternalSyntheticLambda21.run(null);
                return;
            }
            MessageObject messageObject3 = (MessageObject) arrayList13.get(i);
            if (messageObject3 != null && (storyItem = messageObject3.storyItem) != null && (messageMedia = storyItem.media) != null) {
                TLRPC.MessageMedia messageMedia2 = ((StoriesController.BotPreview) obj2).media;
                TLRPC.Document document = messageMedia2.document;
                if (document == null) {
                    photo = messageMedia2.photo;
                    if (photo != null && (photo2 = messageMedia.photo) != null && photo2.id == photo.id) {
                        fileRefController$$ExternalSyntheticLambda21.run((StoriesController.BotPreview) storyItem);
                        return;
                    }
                } else {
                    TLRPC.Document document2 = messageMedia.document;
                    if (document2 != null) {
                        if (document2.id == document.id) {
                            fileRefController$$ExternalSyntheticLambda21.run((StoriesController.BotPreview) storyItem);
                            return;
                        }
                        photo = messageMedia2.photo;
                        if (photo != null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
    }

    public EglRenderer$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
