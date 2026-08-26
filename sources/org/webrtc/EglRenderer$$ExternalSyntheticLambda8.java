package org.webrtc;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.ProfileActionsView;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda12;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SearchAdsInfoBottomSheet;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.GalleryListView;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichInlineButtonEditor;
import org.telegram.ui.iv.RichInlineButtonEditor$$ExternalSyntheticLambda4;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCellGrid;
import org.telegram.ui.iv.RichTableCellHost;
import org.telegram.ui.iv.RichTextStyle;
import org.telegram.ui.iv.TableModel;
import org.telegram.ui.web.AddressBarList;
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
    public final void run() throws Throwable {
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream;
        int i;
        int i2;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        TL_iv.RichText richText;
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) this.f$0).lambda$releaseEglSurface$5(this.f$1, (Runnable) this.f$2);
                return;
            case 1:
                boolean z2 = this.f$1;
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                if (!z2 || profileActivity.joinRow != -1) {
                    profileActivity.updateRowsIds();
                    ProfileActivity.ListAdapter listAdapter = profileActivity.listAdapter;
                    if (listAdapter != null) {
                        listAdapter.mObservable.notifyChanged();
                        return;
                    }
                    return;
                }
                ProfileActionsView profileActionsView = profileActivity.actionsView;
                if (profileActionsView != null) {
                    ProfileActionsView.Action actionFind = ProfileActionsView.find(7, profileActionsView.actions);
                    if (actionFind != null && actionFind.isLoading) {
                        actionFind.isLoading = false;
                        profileActionsView.invalidate();
                    }
                    if (((boolean[]) this.f$2)[0]) {
                        ProfileActionsView profileActionsView2 = profileActivity.actionsView;
                        profileActionsView2.isApplying = true;
                        profileActionsView2.set(7, false);
                        profileActivity.actionsView.set(9, true);
                        ProfileActionsView profileActionsView3 = profileActivity.actionsView;
                        if (profileActionsView3.isApplying) {
                            profileActionsView3.isApplying = false;
                            profileActionsView3.applyVisibleActions();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Activity activity = (Activity) this.f$2;
                try {
                    File logsDir = AndroidUtilities.getLogsDir();
                    AlertDialog alertDialog = (AlertDialog) this.f$0;
                    if (logsDir == null) {
                        AndroidUtilities.runOnUIThread(new AlertDialog$$ExternalSyntheticLambda1(alertDialog, 0));
                        return;
                    }
                    File file = new File(logsDir, "logs.zip");
                    if (file.exists()) {
                        file.delete();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : logsDir.listFiles()) {
                        arrayList.add(file2);
                    }
                    File file3 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                    if (file3.exists() && file3.isDirectory()) {
                        for (File file4 : file3.listFiles()) {
                            arrayList.add(file4);
                        }
                    }
                    boolean[] zArr = new boolean[1];
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                        try {
                            byte[] bArr = new byte[65536];
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                File file5 = (File) arrayList.get(i3);
                                if (file5.getName().contains("cache4") || !(this.f$1 || file5.getName().contains("_mtproto"))) {
                                    if (file5.exists() && !file5.isDirectory()) {
                                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), 65536);
                                        try {
                                            try {
                                                zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                                while (true) {
                                                    i = bufferedInputStream.read(bArr, 0, 65536);
                                                    if (i != -1) {
                                                        zipOutputStream.write(bArr, 0, i);
                                                    } else {
                                                        bufferedInputStream.close();
                                                    }
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                e.printStackTrace();
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                if (zipOutputStream != null) {
                                                    zipOutputStream.close();
                                                }
                                                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(alertDialog, zArr, activity, file, 27));
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            if (zipOutputStream != null) {
                                                zipOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else if (jCurrentTimeMillis - file5.lastModified() <= 86400000) {
                                    if (file5.exists()) {
                                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file5), 65536);
                                        zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                        while (true) {
                                            i = bufferedInputStream.read(bArr, 0, 65536);
                                            if (i != -1) {
                                                zipOutputStream.write(bArr, 0, i);
                                            } else {
                                                bufferedInputStream.close();
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            zArr[0] = true;
                            zipOutputStream.close();
                        } catch (Exception e2) {
                            e = e2;
                            bufferedInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedInputStream = null;
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (zipOutputStream != null) {
                                zipOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = null;
                        zipOutputStream = null;
                    }
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda12(alertDialog, zArr, activity, file, 27));
                    return;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    return;
                }
            case 3:
                ((SearchAdsInfoBottomSheet) this.f$0).lambda$new$0(this.f$1, (ShareAlert$$ExternalSyntheticLambda29) this.f$2);
                return;
            case 4:
                ((Utilities.Callback2) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 5:
                ((JoinGroupAlert$$ExternalSyntheticLambda3) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 6:
                ((OAuthSheet$$ExternalSyntheticLambda18) this.f$0).run(Boolean.valueOf(this.f$1), (String) this.f$2);
                return;
            case 7:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$0;
                ArrayList arrayList2 = new ArrayList();
                SQLiteCursor sQLiteCursorQueryFinalized = null;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage.getDatabase();
                        if (database == null) {
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        StringBuilder sb = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                        sb.append(this.f$1 ? "2" : "0 OR type = 1");
                        sb.append(" ORDER BY date DESC");
                        sQLiteCursorQueryFinalized = database.queryFinalized(sb.toString(), new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                            if (nativeByteBufferByteBufferValue != null) {
                                try {
                                    DraftsController.StoryDraft storyDraft = new DraftsController.StoryDraft(nativeByteBufferByteBufferValue);
                                    storyDraft.id = jLongValue;
                                    arrayList2.add(storyDraft);
                                } catch (Exception e5) {
                                    FileLog.e(e5);
                                    arrayList3.add(Long.valueOf(jLongValue));
                                }
                                nativeByteBufferByteBufferValue.reuse();
                                break;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (arrayList3.size() > 0) {
                            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                                database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i4)).stepThis().dispose();
                                break;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(15, (Utilities.Callback) this.f$2, arrayList2));
                        return;
                    } catch (Throwable th4) {
                        if (sQLiteCursorQueryFinalized != null) {
                            sQLiteCursorQueryFinalized.dispose();
                        }
                        throw th4;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    if (sQLiteCursorQueryFinalized != null) {
                    }
                    AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(15, (Utilities.Callback) this.f$2, arrayList2));
                    return;
                }
            case 8:
                GalleryListView.SearchAdapter searchAdapter = (GalleryListView.SearchAdapter) this.f$0;
                searchAdapter.getClass();
                TLObject tLObject = (TLObject) this.f$2;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    searchAdapter.lastOffset = messages_botresults.next_offset;
                    ArrayList arrayList4 = searchAdapter.results;
                    if (this.f$1) {
                        arrayList4.clear();
                    }
                    for (int i5 = 0; i5 < messages_botresults.results.size(); i5++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i5);
                        TLRPC.Document document2 = botInlineResult.document;
                        if (document2 != null) {
                            arrayList4.add(document2);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList4.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList4.add(botInlineResult);
                            }
                        }
                    }
                    searchAdapter.loading = false;
                    searchAdapter.onLoadingUpdate(false);
                    searchAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            case 9:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$29((byte[]) this.f$2, this.f$1);
                return;
            case 10:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.f$0;
                wallpapersListActivity.getClass();
                TLObject tLObject2 = (TLObject) this.f$2;
                if (tLObject2 instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject2;
                    wallpapersListActivity.patterns.clear();
                    HashMap map = wallpapersListActivity.patternsDict;
                    map.clear();
                    HashMap map2 = wallpapersListActivity.allWallPapersDict;
                    ArrayList arrayList5 = wallpapersListActivity.wallPapers;
                    int i6 = 1;
                    int i7 = 2;
                    int i8 = wallpapersListActivity.currentType;
                    if (i8 != 1 && i8 != 2) {
                        arrayList5.clear();
                        map2.clear();
                        ArrayList arrayList6 = wallpapersListActivity.allWallPapers;
                        arrayList6.clear();
                        arrayList6.addAll(tL_wallPapers.wallpapers);
                        arrayList5.addAll(wallpapersListActivity.localWallPapers);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i9 = 0;
                    while (i9 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i9);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                map2.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !map.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.patterns.add(wallPaper);
                                    map.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (i8 != i6 && ((!(z = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i8 != i7 || z) && (Theme.currentTheme.isDark() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList5.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (Theme.currentTheme.isDark() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i10 = wallPaperSettings4.second_background_color;
                                WallpapersListActivity.ColorWallpaper colorWallpaper = (i10 == 0 || (i2 = wallPaperSettings4.third_background_color) == 0) ? new WallpapersListActivity.ColorWallpaper(wallPaperSettings4.background_color, i10, null, wallPaperSettings4.rotation) : new WallpapersListActivity.ColorWallpaper(null, wallPaperSettings4.background_color, i10, i2, wallPaperSettings4.fourth_background_color);
                                colorWallpaper.slug = wallPaper.slug;
                                colorWallpaper.intensity = wallPaperSettings4.intensity / 100.0f;
                                colorWallpaper.gradientRotation = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                                colorWallpaper.parentWallpaper = wallPaper;
                                arrayList5.add(colorWallpaper);
                            }
                        }
                        i9++;
                        i6 = 1;
                        i7 = 2;
                    }
                    wallpapersListActivity.fillWallpapersWithCustom();
                    wallpapersListActivity.getMessagesStorage().putWallpapers(tL_wallPapers.wallpapers, 1);
                }
                AlertDialog alertDialog2 = wallpapersListActivity.progressDialog;
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    if (this.f$1) {
                        return;
                    }
                    wallpapersListActivity.listView.smoothScrollToPosition(0);
                    return;
                }
                return;
            case 11:
                ((CommunityAddOptionsSheet) this.f$0).apply((Utilities.Callback) this.f$2, this.f$1, false);
                return;
            case 12:
                ((Utilities.Callback2) this.f$0).run((Bitmap) this.f$2, Boolean.valueOf(this.f$1));
                return;
            case 13:
                RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.getClass();
                boolean z3 = this.f$1;
                boolean z4 = !z3;
                RichTableCell richTableCell = (RichTableCell) this.f$2;
                Iterator it = richTableCell.selectedCells.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
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
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
                    RichTableCellHost richTableCellHostHostForAnchor = richTableCellGrid.hostForAnchor(pagetablecell);
                    boolean z5 = false;
                    if (richTableCellHostHostForAnchor == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : RichTextStyle.toSpannable(richText, null));
                        if (spannableStringBuilder.length() > 0 && (RichTextStyle.stylesFullyCovering(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) != 0) {
                            z5 = true;
                        }
                        if (pagetablecell != null) {
                            pagetablecell.header = z4;
                            pagetablecell.flags = !z3 ? 1 | pagetablecell.flags : pagetablecell.flags & (-2);
                        }
                        if (!z3 && spannableStringBuilder.length() > 0) {
                            RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        } else if (z3 && z5) {
                            RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                        }
                        TableModel.applyStyledText(pagetablecell, spannableStringBuilder);
                    } else if (richTableCellHostHostForAnchor.cell != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(richTableCellHostHostForAnchor.editText.getText());
                        if (spannableStringBuilder2.length() > 0 && (RichTextStyle.stylesFullyCovering(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) != 0) {
                            z5 = true;
                        }
                        TL_iv.pageTableCell pagetablecell2 = richTableCellHostHostForAnchor.cell;
                        if (pagetablecell2 != null) {
                            pagetablecell2.header = z4;
                            pagetablecell2.flags = !z3 ? 1 | pagetablecell2.flags : pagetablecell2.flags & (-2);
                        }
                        if (z3) {
                            if (z5) {
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
            case 14:
                RichEditorListView.InlineButtonEdit inlineButtonEdit = (RichEditorListView.InlineButtonEdit) this.f$2;
                RichEditorListView.this.hideTextSelectionUi(true);
                RichInlineButtonEditor.showUserPicker((BaseFragment) this.f$0, this.f$1, new RichInlineButtonEditor$$ExternalSyntheticLambda4(inlineButtonEdit, 2));
                return;
            default:
                String str = (String) this.f$2;
                AddressBarList addressBarList = (AddressBarList) this.f$0;
                ArrayList arrayList7 = addressBarList.suggestions;
                arrayList7.clear();
                SearchEngine.getCurrent().getClass();
                ArrayList arrayList8 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str).getJSONArray(1);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList8.add(jSONArray.getString(i11));
                    }
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                    try {
                        JSONArray jSONArray2 = new JSONObject(str).getJSONObject("gossip").getJSONArray("results");
                        for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                            arrayList8.add(jSONArray2.getJSONObject(i12).getString("key"));
                        }
                    } catch (Exception e8) {
                        FileLog.e((Throwable) e8, false);
                        try {
                            JSONArray jSONArray3 = new JSONArray(str);
                            for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
                                String string = jSONArray3.getJSONObject(i13).getString("phrase");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList8.add(string);
                                }
                            }
                        } catch (Exception e9) {
                            FileLog.e((Throwable) e9, false);
                        }
                    }
                }
                arrayList7.addAll(arrayList8);
                AddressBarList.AnonymousClass1 anonymousClass1 = addressBarList.listView;
                anonymousClass1.adapter.update(true);
                if (this.f$1 != (!arrayList7.isEmpty())) {
                    anonymousClass1.layoutManager.scrollToPositionWithOffset(0, 0);
                    return;
                }
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
