package org.webrtc;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Binder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda112;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.TextViewWithLoading;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellGrid;
import org.telegram.ui.iv.RichTableCellHost;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.iv.TableModel;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.SearchEngine;

public final class EglRenderer$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public EglRenderer$$ExternalSyntheticLambda8(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        TL_iv.RichText richText;
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) this.f$0).lambda$releaseEglSurface$5(this.f$1, (Runnable) this.f$2);
                return;
            case 1:
                Context context = (Context) this.f$0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f$2;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        SharedPreferences.Editor editorEdit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f$1) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            case 2:
                ((CameraController) this.f$0).lambda$initCamera$4(this.f$1, (Runnable) this.f$2);
                return;
            case 3:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$52((ArrayList) this.f$2, this.f$1);
                return;
            case 4:
                AlertDialog alertDialog = (AlertDialog) this.f$0;
                alertDialog.getClass();
                View view = (View) this.f$2;
                if (view instanceof TextViewWithLoading) {
                    TextViewWithLoading textViewWithLoading = (TextViewWithLoading) view;
                    if (textViewWithLoading.loading) {
                        textViewWithLoading.loading = false;
                        textViewWithLoading.invalidate();
                    }
                }
                if (this.f$1) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            case 5:
                Theme.PatternsLoader patternsLoader = (Theme.PatternsLoader) this.f$0;
                ArrayList arrayList = (ArrayList) this.f$2;
                if (arrayList != null) {
                    patternsLoader.getClass();
                    ArrayList arrayList2 = Theme.currentTheme.themeAccents;
                    if (arrayList2 != null && !arrayList2.isEmpty() && arrayList.contains(Theme.currentTheme.getAccent(false))) {
                        Theme.reloadWallpaper(true);
                    }
                }
                int i = patternsLoader.account;
                if (!this.f$1) {
                    HashMap map = patternsLoader.watingForLoad;
                    if (map == null || map.isEmpty()) {
                        NotificationCenter.getInstance(i).removeObserver(patternsLoader, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i).removeObserver(patternsLoader, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (patternsLoader.watingForLoad != null) {
                    NotificationCenter.getInstance(i).addObserver(patternsLoader, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i).addObserver(patternsLoader, NotificationCenter.fileLoadFailed);
                    Iterator it = patternsLoader.watingForLoad.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i).loadFile(ImageLocation.getForDocument(((Theme.PatternsLoader.LoadingPattern) ((Map.Entry) it.next()).getValue()).pattern.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 6:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$2;
                BusinessLinksController businessLinksController = (BusinessLinksController) this.f$0;
                businessLinksController.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList<TLRPC.User> arrayList4 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList5 = new ArrayList<>();
                SQLiteCursor sQLiteCursorQueryFinalized = null;
                try {
                    try {
                        sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            arrayList3.add(TL_account.TL_businessChatLink.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        ArrayList<Long> arrayList6 = new ArrayList<>();
                        ArrayList arrayList7 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList3.get(i2);
                            if (!tL_businessChatLink.entities.isEmpty()) {
                                for (int i3 = 0; i3 < tL_businessChatLink.entities.size(); i3++) {
                                    TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i3);
                                    if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                        arrayList6.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                                    } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        arrayList6.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                                    }
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList6, arrayList4);
                        }
                        if (!arrayList7.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList7), arrayList5);
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLiteCursorQueryFinalized != null) {
                    }
                    AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda112(businessLinksController, arrayList3, arrayList4, arrayList5, this.f$1, 9));
                    return;
                }
                sQLiteCursorQueryFinalized.dispose();
                AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda112(businessLinksController, arrayList3, arrayList4, arrayList5, this.f$1, 9));
                return;
            case 7:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.f$2;
                GroupCallMiniTextureView groupCallMiniTextureView2 = (GroupCallMiniTextureView) this.f$0;
                if (this.f$1) {
                    groupCallMiniTextureView2.parentContainer.removeView(groupCallMiniTextureView);
                } else {
                    groupCallMiniTextureView2.getClass();
                }
                groupCallMiniTextureView.setVisibility(8);
                groupCallMiniTextureView2.hideRunnable = null;
                return;
            case 8:
                ((Utilities.Callback2) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 9:
                ((BotBiometry$$ExternalSyntheticLambda10) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 10:
                ((StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 11:
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f$0;
                ArrayList arrayList8 = new ArrayList();
                SQLiteCursor sQLiteCursorQueryFinalized2 = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        if (database == null) {
                            return;
                        }
                        ArrayList arrayList9 = new ArrayList();
                        StringBuilder sb = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                        sb.append(this.f$1 ? "2" : "0 OR type = 1");
                        sb.append(" ORDER BY date DESC");
                        sQLiteCursorQueryFinalized2 = database.queryFinalized(sb.toString(), new Object[0]);
                        while (sQLiteCursorQueryFinalized2.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized2.longValue(0);
                            NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized2.byteBufferValue(1);
                            if (nativeByteBufferByteBufferValue2 != null) {
                                try {
                                    DraftsController.StoryDraft storyDraft = new DraftsController.StoryDraft(nativeByteBufferByteBufferValue2);
                                    storyDraft.id = jLongValue;
                                    arrayList8.add(storyDraft);
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                    arrayList9.add(Long.valueOf(jLongValue));
                                }
                                nativeByteBufferByteBufferValue2.reuse();
                                break;
                            }
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        if (arrayList9.size() > 0) {
                            for (int i4 = 0; i4 < arrayList9.size(); i4++) {
                                database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList9.get(i4)).stepThis().dispose();
                                break;
                            }
                        }
                        sQLiteCursorQueryFinalized2.dispose();
                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(18, (Utilities.Callback) this.f$2, arrayList8));
                        return;
                    } catch (Throwable th2) {
                        if (sQLiteCursorQueryFinalized2 != null) {
                            sQLiteCursorQueryFinalized2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    if (sQLiteCursorQueryFinalized2 != null) {
                    }
                    AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(18, (Utilities.Callback) this.f$2, arrayList8));
                    return;
                }
            case 12:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                TLObject tLObject = (TLObject) this.f$2;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    searchAdapter.lastOffset = messages_botresults.next_offset;
                    ArrayList arrayList10 = searchAdapter.results;
                    if (this.f$1) {
                        arrayList10.clear();
                    }
                    for (int i5 = 0; i5 < messages_botresults.results.size(); i5++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i5);
                        TLRPC.Document document = botInlineResult.document;
                        if (document != null) {
                            arrayList10.add(document);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList10.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList10.add(botInlineResult);
                            }
                        }
                    }
                    searchAdapter.loading = false;
                    searchAdapter.onLoadingUpdate(false);
                    searchAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            case 13:
                ((CommunityAddOptionsSheet) this.f$0).apply((Utilities.Callback) this.f$2, this.f$1, false);
                return;
            case 14:
                ((Utilities.Callback2) this.f$0).run((Bitmap) this.f$2, Boolean.valueOf(this.f$1));
                return;
            case 15:
                RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.getClass();
                boolean z = this.f$1;
                boolean z2 = !z;
                RichTableCell richTableCell = (RichTableCell) this.f$2;
                Iterator it2 = richTableCell.selectedCells.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    RichTableCellGrid richTableCellGrid = richTableCell.grid;
                    if (!zHasNext) {
                        richTableCellGrid.invalidate();
                        RichEditorListView.AnonymousClass12 anonymousClass12 = richTableCell.delegate;
                        if (anonymousClass12 != null && richTableCell.currentRow != null) {
                            anonymousClass12.onTextChanged();
                        }
                        richEditorListView.exitCellSelectionMode();
                        return;
                    }
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    RichTableCellHost richTableCellHostHostForAnchor = richTableCellGrid.hostForAnchor(pagetablecell);
                    boolean z3 = false;
                    if (richTableCellHostHostForAnchor == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : RichTextStyle.toSpannable(richText, null));
                        if (spannableStringBuilder.length() > 0 && (RichTextStyle.stylesFullyCovering(spannableStringBuilder, 0, spannableStringBuilder.length()) & 1) != 0) {
                            z3 = true;
                        }
                        if (pagetablecell != null) {
                            pagetablecell.header = z2;
                            pagetablecell.flags = !z ? 1 | pagetablecell.flags : pagetablecell.flags & (-2);
                        }
                        if (!z && spannableStringBuilder.length() > 0) {
                            RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z && z3) {
                            RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        TableModel.applyStyledText(pagetablecell, spannableStringBuilder);
                    } else if (richTableCellHostHostForAnchor.cell != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(richTableCellHostHostForAnchor.editText.getText());
                        if (spannableStringBuilder2.length() > 0 && (RichTextStyle.stylesFullyCovering(spannableStringBuilder2, 0, spannableStringBuilder2.length()) & 1) != 0) {
                            z3 = true;
                        }
                        TL_iv.pageTableCell pagetablecell2 = richTableCellHostHostForAnchor.cell;
                        if (pagetablecell2 != null) {
                            pagetablecell2.header = z2;
                            pagetablecell2.flags = !z ? 1 | pagetablecell2.flags : pagetablecell2.flags & (-2);
                        }
                        if (z) {
                            if (z3) {
                                RichTextStyle.setStyle(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                            }
                        } else if (spannableStringBuilder2.length() > 0) {
                            RichTextStyle.setStyle(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                        }
                        TableModel.applyStyledText(richTableCellHostHostForAnchor.cell, spannableStringBuilder2);
                        richTableCellHostHostForAnchor.bind(richTableCellHostHostForAnchor.cell);
                    }
                }
                break;
            case 16:
                RichEditorListView.InlineButtonEdit inlineButtonEdit = (RichEditorListView.InlineButtonEdit) this.f$2;
                RichEditorListView.this.hideTextSelectionUi(true);
                RichInlineButtonEditor.showUserPicker((BaseFragment) this.f$0, this.f$1, new RichInlineButtonEditor$$ExternalSyntheticLambda3(inlineButtonEdit, 2));
                return;
            case 17:
                String str = (String) this.f$2;
                AddressBarList addressBarList = (AddressBarList) this.f$0;
                ArrayList arrayList11 = addressBarList.suggestions;
                arrayList11.clear();
                SearchEngine.getCurrent().getClass();
                ArrayList arrayList12 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        arrayList12.add(jSONArray.getString(i6));
                    }
                } catch (Exception e4) {
                    FileLog.e((Throwable) e4, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                        for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                            arrayList12.add(jSONArray2.getJSONObject(i7).getString("key"));
                        }
                    } catch (Exception e5) {
                        FileLog.e((Throwable) e5, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str);
                            for (int i8 = 0; i8 < jSONArray3.length(); i8++) {
                                String string = jSONArray3.getJSONObject(i8).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList12.add(string);
                                }
                            }
                        } catch (Exception e6) {
                            FileLog.e((Throwable) e6, false);
                        }
                    }
                }
                arrayList11.addAll(arrayList12);
                AddressBarList.AnonymousClass1 anonymousClass1 = addressBarList.listView;
                anonymousClass1.adapter.update(true);
                if (this.f$1 != (!arrayList11.isEmpty())) {
                    anonymousClass1.layoutManager.scrollToPositionWithOffset(0, 0);
                    return;
                }
                return;
            default:
                ((BotWebViewContainer) this.f$0).lambda$evaluateJs$3(this.f$1, (String) this.f$2);
                return;
        }
    }

    public EglRenderer$$ExternalSyntheticLambda8(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }
}
