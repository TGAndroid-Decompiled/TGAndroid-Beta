package th;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class d5 implements us {
    public long D;
    public jj E;
    public x20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public jj K;
    public TL_bots.botPreviewMedia L;
    public final e5 M;
    public final boolean f48877b;
    public final vh.n5 f48878c;
    public boolean d;
    public String e;
    public final String f48879f;
    public float h;
    public float f48880n;
    public float f48881r;
    public boolean f48882s;
    public boolean f48883w;
    public int f48884x;
    public long f48885y = -1;
    public final long f48876a = Utilities.f14519b.nextLong();

    public d5(e5 e5Var, vh.n5 n5Var) {
        this.M = e5Var;
        this.f48878c = n5Var;
        this.f48877b = n5Var.f51529g;
        File file = n5Var.N0;
        if (file != null) {
            this.f48879f = file.getAbsolutePath();
        }
        boolean z10 = n5Var.f51558w;
        this.H = z10;
        this.I = z10;
        long j10 = n5Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (n5Var.f51529g) {
            this.J = n5Var.e;
        } else {
            TLRPC.InputPeer inputPeer = n5Var.f51557v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = org.telegram.messenger.o5.n(inputPeer);
            } else {
                this.J = d20.i(e5Var.f48904a).f15165n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        vh.n5 n5Var = this.f48878c;
        e5 e5Var = this.M;
        if (z10) {
            e5Var.f48922w.c(n5Var);
            ((ArrayList) e5Var.f48905b.f(this.J)).remove(this);
        }
        this.f48883w = true;
        if (n5Var.E()) {
            MediaController.B().i(this.E);
        }
        b8.G(e5Var.f48904a).b(this.e, false);
        if (this.f48884x >= 0) {
            ConnectionsManager.getInstance(e5Var.f48904a).cancelRequest(this.f48884x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        uh.m mVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        uh.m mVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        e5 e5Var = this.M;
        int i10 = e5Var.f48904a;
        zs.f(i10).n(this, zs.U1);
        zs.f(i10).n(this, zs.V1);
        zs.f(i10).n(this, zs.W1);
        zs.f(i10).n(this, zs.f19592c2);
        zs.f(i10).n(this, zs.a2);
        zs.f(i10).n(this, zs.f19586b2);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) e5Var.f48905b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) e5Var.f48906c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                e5Var.d = 0;
            } else {
                e5Var.d++;
            }
        }
        boolean z11 = this.f48877b;
        vh.n5 n5Var = this.f48878c;
        if (z11 && (hashMap = (HashMap) e5Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(n5Var.f51527f));
        }
        if (this.L != null) {
            x4 A = e5Var.A(4, -1, this.J, false);
            if (n5Var != null && n5Var.f51529g) {
                if (A instanceof q4) {
                    ((q4) A).G(n5Var.L0, this.L);
                }
                String str = n5Var.K0;
                TLRPC.InputMedia inputMedia = n5Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = uh.m.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    q4 q4Var = (q4) longSparseArray4.get(j10);
                    int i11 = q4Var.f49633c;
                    ArrayList arrayList3 = q4Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(q4Var.E, str)) {
                            q4Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            u4 u4Var = q4Var.f49644q;
                            org.telegram.messenger.i0.r(u4Var);
                            org.telegram.messenger.i0.g3(u4Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = uh.m.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (mVar2 = (uh.m) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = mVar2.f50262f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        q4 q4Var2 = (q4) arrayList4.get(i12);
                        if (q4Var2.f49633c == i10 && TextUtils.equals(q4Var2.E, str)) {
                            q4Var2.G(inputMedia, botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof q4) {
                    ((q4) A).I(this.L);
                }
                String str2 = n5Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = uh.m.F;
                if (longSparseArray7 != null && (longSparseArray2 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    q4 q4Var3 = (q4) longSparseArray2.get(j10);
                    int i13 = q4Var3.f49633c;
                    ArrayList arrayList5 = q4Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(q4Var3.E, str2)) {
                            q4Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            u4 u4Var2 = q4Var3.f49644q;
                            org.telegram.messenger.i0.r(u4Var2);
                            org.telegram.messenger.i0.g3(u4Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = uh.m.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (mVar = (uh.m) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = mVar.f50262f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        q4 q4Var4 = (q4) arrayList6.get(i14);
                        if (q4Var4.f49633c == i10 && TextUtils.equals(q4Var4.E, str2)) {
                            q4Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        zs.f(i10).k(zs.f19709v5, new Object[0]);
        if (n5Var != null && !n5Var.h && !this.d) {
            n5Var.i(false);
            this.d = true;
        }
        zs.e().k(zs.B5, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: th.d5.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        vh.n5 n5Var = this.f48878c;
        if (n5Var.f51518b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f48878c.f51521c0;
            int i10 = vp.D8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f19805id = document.f19799id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((n5Var.f51529g || (n5Var.f51541n && n5Var.f51553t != null)) && !n5Var.f51534j && n5Var.f51544o0 == null) {
            c(null);
            return;
        }
        vh.u6 u6Var = this.f48878c.E0;
        if (u6Var != null && u6Var.f52017a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        zs.f(this.M.f48904a).b(this, zs.U1);
        zs.f(this.M.f48904a).b(this, zs.V1);
        zs.f(this.M.f48904a).b(this, zs.W1);
        zs.f(this.M.f48904a).b(this, zs.f19592c2);
        zs.f(this.M.f48904a).b(this, zs.a2);
        zs.f(this.M.f48904a).b(this, zs.f19586b2);
        boolean E = this.f48878c.E();
        this.f48882s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19814id = 1;
            String absolutePath = vh.n5.x(this.M.f48904a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new jj(this.M.f48904a, tL_message, null, false, false);
            this.f48878c.s(new c5(this, 1));
        } else {
            File w9 = vh.n5.w(this.M.f48904a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.f14523i.c(new o0(12, this, w9));
        }
        Intent intent = new Intent(org.telegram.messenger.w0.f19025b, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f48904a);
        try {
            org.telegram.messenger.w0.f19025b.startService(intent);
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var = this.M;
        int i12 = e5Var.f48904a;
        if (i10 == zs.a2) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i13 = zs.f19586b2;
        int i14 = zs.A5;
        if (i10 == i13) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f48880n = floatValue;
                this.h = (this.f48881r * 0.7f) + (floatValue * 0.3f);
                zs.f(i12).k(i14, this.e, Float.valueOf(this.h));
                if (this.f48885y < 0 && this.f48880n * ((float) this.D) >= 1000.0f) {
                    this.f48885y = longValue;
                }
                b8.G(i12).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f48880n));
                if (longValue2 > 0 && this.f48885y < 0) {
                    this.f48885y = longValue2;
                }
            }
        } else if (i10 == zs.f19592c2) {
            if (objArr[0] == this.E) {
                if (!this.f48877b) {
                    vh.n5 n5Var = this.f48878c;
                    n5Var.f51558w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    n5Var.f51560x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    e5Var.f48922w.d(n5Var);
                }
                b();
            }
        } else if (i10 == zs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == zs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                zs.e().k(zs.P4, 1, cd.L0(2131744478, null));
                b();
            }
        } else if (i10 == zs.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f48881r = min;
            this.h = (min * 0.7f) + (this.f48880n * 0.3f);
            zs.f(i12).k(i14, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        vh.n5 n5Var = this.f48878c;
        n5Var.getClass();
        b8 G = b8.G(this.M.f48904a);
        String str = this.e;
        boolean z10 = !n5Var.K;
        long j10 = 0;
        if (this.f48882s) {
            x20 x20Var = this.F;
            if (x20Var != null) {
                j10 = x20Var.f19198q;
            }
            j10 = Math.max(1, (int) j10);
        }
        if (n5Var.K) {
            i10 = 33554432;
        } else {
            i10 = 16777216;
        }
        G.h0(str, false, z10, j10, i10, true);
    }
}
