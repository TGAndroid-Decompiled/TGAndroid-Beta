package zh;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import bi.pb;
import bi.r9;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class h5 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final i5 M;
    public final boolean f48472b;
    public final r9 f48473c;
    public boolean d;
    public String e;
    public final String f48474f;
    public float h;
    public float f48475n;
    public float f48476r;
    public boolean f48477s;
    public boolean v;
    public int f48478w;
    public long f48480y;
    public long f48479x = -1;
    public final long f48471a = Utilities.random.nextLong();

    public h5(i5 i5Var, r9 r9Var) {
        this.M = i5Var;
        this.f48473c = r9Var;
        this.f48472b = r9Var.f3574g;
        File file = r9Var.N0;
        if (file != null) {
            this.f48474f = file.getAbsolutePath();
        }
        boolean z10 = r9Var.f3603w;
        this.H = z10;
        this.I = z10;
        long j3 = r9Var.J0;
        if (j3 != 0) {
            this.J = j3;
        } else if (r9Var.f3574g) {
            this.J = r9Var.e;
        } else {
            TLRPC.InputPeer inputPeer = r9Var.f3602v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = DialogObject.getPeerDialogId(inputPeer);
            } else {
                this.J = UserConfig.getInstance(i5Var.f48499a).clientUserId;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        r9 r9Var = this.f48473c;
        i5 i5Var = this.M;
        if (z10) {
            i5Var.f48517w.b(r9Var);
            ((ArrayList) i5Var.f48500b.f(this.J)).remove(this);
        }
        this.v = true;
        if (r9Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(i5Var.f48499a).cancelFileUpload(this.e, false);
        if (this.f48478w >= 0) {
            ConnectionsManager.getInstance(i5Var.f48499a).cancelRequest(this.f48478w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ai.g0 g0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ai.g0 g0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        i5 i5Var = this.M;
        int i10 = i5Var.f48499a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) i5Var.f48500b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) i5Var.f48501c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                i5Var.d = 0;
            } else {
                i5Var.d++;
            }
        }
        boolean z11 = this.f48472b;
        r9 r9Var = this.f48473c;
        if (z11 && (hashMap = (HashMap) i5Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(r9Var.f3572f));
        }
        if (this.L != null) {
            a5 A = i5Var.A(this.J, 4, -1, false);
            if (r9Var != null && r9Var.f3574g) {
                if (A instanceof s4) {
                    ((s4) A).G(r9Var.L0, this.L);
                }
                String str = r9Var.K0;
                TLRPC.InputMedia inputMedia = r9Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ai.g0.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    s4 s4Var = (s4) longSparseArray4.get(j3);
                    int i11 = s4Var.f48237c;
                    ArrayList arrayList3 = s4Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(s4Var.E, str)) {
                            s4Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            x4 x4Var = s4Var.f48248q;
                            AndroidUtilities.cancelRunOnUIThread(x4Var);
                            AndroidUtilities.runOnUIThread(x4Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ai.g0.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (g0Var2 = (ai.g0) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList4 = g0Var2.f445f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        s4 s4Var2 = (s4) arrayList4.get(i12);
                        if (s4Var2.f48237c == i10 && TextUtils.equals(s4Var2.E, str)) {
                            s4Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof s4) {
                    ((s4) A).I(this.L);
                }
                String str2 = r9Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ai.g0.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    s4 s4Var3 = (s4) longSparseArray2.get(j3);
                    int i13 = s4Var3.f48237c;
                    ArrayList arrayList5 = s4Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(s4Var3.E, str2)) {
                            s4Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            x4 x4Var2 = s4Var3.f48248q;
                            AndroidUtilities.cancelRunOnUIThread(x4Var2);
                            AndroidUtilities.runOnUIThread(x4Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ai.g0.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (g0Var = (ai.g0) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList6 = g0Var.f445f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        s4 s4Var4 = (s4) arrayList6.get(i14);
                        if (s4Var4.f48237c == i10 && TextUtils.equals(s4Var4.E, str2)) {
                            s4Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (r9Var != null && !r9Var.h && !this.d) {
            r9Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r20) {
        throw new UnsupportedOperationException("Method not decompiled: zh.h5.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        r9 r9Var = this.f48473c;
        if (r9Var.f3563b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.f48473c.f3566c0);
            c(tL_inputFileStoryDocument);
        } else if ((r9Var.f3574g || (r9Var.f3586n && r9Var.f3598t != null)) && !r9Var.f3579j && r9Var.f3589o0 == null) {
            c(null);
            return;
        }
        pb pbVar = this.f48473c.E0;
        if (pbVar != null && pbVar.f3415a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.f48499a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.f48473c.E();
        this.f48477s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f17216id = 1;
            String absolutePath = r9.x(this.M.f48499a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.f48499a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.f48473c.s(new g5(this, 1));
        } else {
            File w10 = r9.w(this.M.f48499a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new yg.q(20, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f48499a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        i5 i5Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f48475n = floatValue;
                this.h = (this.f48476r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(i5Var.f48499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.f48479x < 0 && this.f48475n * ((float) this.f48480y) >= 1000.0f) {
                    this.f48479x = longValue;
                }
                FileLoader.getInstance(i5Var.f48499a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f48475n));
                if (longValue2 > 0 && this.f48479x < 0) {
                    this.f48479x = longValue2;
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.f48472b) {
                    r9 r9Var = this.f48473c;
                    r9Var.f3603w = true;
                    r9Var.f3605x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = r9Var.f3605x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    i5Var.f48517w.d(r9Var);
                }
                b();
            }
        } else if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
                b();
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f48476r = min;
            this.h = (min * 0.7f) + (this.f48475n * 0.3f);
            NotificationCenter.getInstance(i5Var.f48499a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        r9 r9Var = this.f48473c;
        r9Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.f48499a);
        String str = this.e;
        boolean z10 = !r9Var.K;
        long j3 = 0;
        if (this.f48477s) {
            VideoEditedInfo videoEditedInfo = this.F;
            if (videoEditedInfo != null) {
                j3 = videoEditedInfo.estimatedSize;
            }
            j3 = Math.max(1, (int) j3);
        }
        if (r9Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        fileLoader.uploadFile(str, false, z10, j3, i10, true);
    }
}
