package th;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.y20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Stories.recorder.StoryUploadingService;
public final class d5 implements vs {
    public long D;
    public kj E;
    public y20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public kj K;
    public TL_bots.botPreviewMedia L;
    public final e5 M;
    public final boolean f48891b;
    public final vh.n5 f48892c;
    public boolean d;
    public String e;
    public final String f48893f;
    public float h;
    public float f48894n;
    public float f48895r;
    public boolean f48896s;
    public boolean f48897w;
    public int f48898x;
    public long f48899y = -1;
    public final long f48890a = Utilities.f14520b.nextLong();

    public d5(e5 e5Var, vh.n5 n5Var) {
        this.M = e5Var;
        this.f48892c = n5Var;
        this.f48891b = n5Var.f51544g;
        File file = n5Var.N0;
        if (file != null) {
            this.f48893f = file.getAbsolutePath();
        }
        boolean z10 = n5Var.f51573w;
        this.H = z10;
        this.I = z10;
        long j10 = n5Var.J0;
        if (j10 != 0) {
            this.J = j10;
        } else if (n5Var.f51544g) {
            this.J = n5Var.e;
        } else {
            TLRPC.InputPeer inputPeer = n5Var.f51572v0;
            if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                this.J = org.telegram.messenger.o5.n(inputPeer);
            } else {
                this.J = e20.i(e5Var.f48918a).f15524n;
            }
        }
    }

    public final void a() {
        boolean z10 = this.I;
        vh.n5 n5Var = this.f48892c;
        e5 e5Var = this.M;
        if (z10) {
            e5Var.f48936w.c(n5Var);
            ((ArrayList) e5Var.f48919b.f(this.J)).remove(this);
        }
        this.f48897w = true;
        if (n5Var.E()) {
            MediaController.B().i(this.E);
        }
        b8.G(e5Var.f48918a).b(this.e, false);
        if (this.f48898x >= 0) {
            ConnectionsManager.getInstance(e5Var.f48918a).cancelRequest(this.f48898x, true);
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
        int i10 = e5Var.f48918a;
        at.f(i10).n(this, at.U1);
        at.f(i10).n(this, at.V1);
        at.f(i10).n(this, at.W1);
        at.f(i10).n(this, at.f14688c2);
        at.f(i10).n(this, at.a2);
        at.f(i10).n(this, at.f14682b2);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) e5Var.f48919b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) e5Var.f48920c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                e5Var.d = 0;
            } else {
                e5Var.d++;
            }
        }
        boolean z11 = this.f48891b;
        vh.n5 n5Var = this.f48892c;
        if (z11 && (hashMap = (HashMap) e5Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(n5Var.f51542f));
        }
        if (this.L != null) {
            x4 A = e5Var.A(4, -1, this.J, false);
            if (n5Var != null && n5Var.f51544g) {
                if (A instanceof q4) {
                    ((q4) A).G(n5Var.L0, this.L);
                }
                String str = n5Var.K0;
                TLRPC.InputMedia inputMedia = n5Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = uh.m.F;
                if (longSparseArray5 != null && (longSparseArray4 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    q4 q4Var = (q4) longSparseArray4.get(j10);
                    int i11 = q4Var.f49647c;
                    ArrayList arrayList3 = q4Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(q4Var.E, str)) {
                            q4Var.G(inputMedia, botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            u4 u4Var = q4Var.f49658q;
                            org.telegram.messenger.i0.r(u4Var);
                            org.telegram.messenger.i0.g3(u4Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = uh.m.E;
                if (longSparseArray6 != null && (longSparseArray3 = (LongSparseArray) longSparseArray6.get(i10)) != null && (mVar2 = (uh.m) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList4 = mVar2.f50276f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        q4 q4Var2 = (q4) arrayList4.get(i12);
                        if (q4Var2.f49647c == i10 && TextUtils.equals(q4Var2.E, str)) {
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
                    int i13 = q4Var3.f49647c;
                    ArrayList arrayList5 = q4Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(q4Var3.E, str2)) {
                            q4Var3.I(botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            u4 u4Var2 = q4Var3.f49658q;
                            org.telegram.messenger.i0.r(u4Var2);
                            org.telegram.messenger.i0.g3(u4Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = uh.m.E;
                if (longSparseArray8 != null && (longSparseArray = (LongSparseArray) longSparseArray8.get(i10)) != null && (mVar = (uh.m) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList6 = mVar.f50276f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        q4 q4Var4 = (q4) arrayList6.get(i14);
                        if (q4Var4.f49647c == i10 && TextUtils.equals(q4Var4.E, str2)) {
                            q4Var4.I(botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        at.f(i10).k(at.f14805v5, new Object[0]);
        if (n5Var != null && !n5Var.h && !this.d) {
            n5Var.i(false);
            this.d = true;
        }
        at.e().k(at.B5, this.e);
    }

    public final void c(org.telegram.tgnet.TLRPC.InputFile r19) {
        throw new UnsupportedOperationException("Method not decompiled: th.d5.c(org.telegram.tgnet.TLRPC$InputFile):void");
    }

    public final void d() {
        boolean z10;
        vh.n5 n5Var = this.f48892c;
        if (n5Var.f51533b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.f48892c.f51536c0;
            int i10 = wp.D8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.f19806id = document.f19800id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((n5Var.f51544g || (n5Var.f51556n && n5Var.f51568t != null)) && !n5Var.f51549j && n5Var.f51559o0 == null) {
            c(null);
            return;
        }
        vh.u6 u6Var = this.f48892c.E0;
        if (u6Var != null && u6Var.f52024a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = z10;
        at.f(this.M.f48918a).b(this, at.U1);
        at.f(this.M.f48918a).b(this, at.V1);
        at.f(this.M.f48918a).b(this, at.W1);
        at.f(this.M.f48918a).b(this, at.f14688c2);
        at.f(this.M.f48918a).b(this, at.a2);
        at.f(this.M.f48918a).b(this, at.f14682b2);
        boolean E = this.f48892c.E();
        this.f48896s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19815id = 1;
            String absolutePath = vh.n5.x(this.M.f48918a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new kj(this.M.f48918a, tL_message, null, false, false);
            this.f48892c.s(new c5(this, 1));
        } else {
            File w9 = vh.n5.w(this.M.f48918a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.f14524i.c(new o0(13, this, w9));
        }
        Intent intent = new Intent(org.telegram.messenger.w0.f18945b, StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.f48918a);
        try {
            org.telegram.messenger.w0.f18945b.startService(intent);
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var = this.M;
        int i12 = e5Var.f48918a;
        if (i10 == at.a2) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i13 = at.f14682b2;
        int i14 = at.A5;
        if (i10 == i13) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.f48894n = floatValue;
                this.h = (this.f48895r * 0.7f) + (floatValue * 0.3f);
                at.f(i12).k(i14, this.e, Float.valueOf(this.h));
                if (this.f48899y < 0 && this.f48894n * ((float) this.D) >= 1000.0f) {
                    this.f48899y = longValue;
                }
                b8.G(i12).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.f48894n));
                if (longValue2 > 0 && this.f48899y < 0) {
                    this.f48899y = longValue2;
                }
            }
        } else if (i10 == at.f14688c2) {
            if (objArr[0] == this.E) {
                if (!this.f48891b) {
                    vh.n5 n5Var = this.f48892c;
                    n5Var.f51573w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    n5Var.f51575x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    e5Var.f48936w.d(n5Var);
                }
                b();
            }
        } else if (i10 == at.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 != null && str2.equals(str3)) {
                c((TLRPC.InputFile) objArr[1]);
            }
        } else if (i10 == at.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 != null && str4.equals(str5)) {
                at.e().k(at.P4, 1, dd.L0(2131744478, null));
                b();
            }
        } else if (i10 == at.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
            this.f48895r = min;
            this.h = (min * 0.7f) + (this.f48894n * 0.3f);
            at.f(i12).k(i14, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        int i10;
        vh.n5 n5Var = this.f48892c;
        n5Var.getClass();
        b8 G = b8.G(this.M.f48918a);
        String str = this.e;
        boolean z10 = !n5Var.K;
        long j10 = 0;
        if (this.f48896s) {
            y20 y20Var = this.F;
            if (y20Var != null) {
                j10 = y20Var.f19541q;
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
