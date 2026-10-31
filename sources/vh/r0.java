package vh;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ff;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.v20;
import org.telegram.messenger.w20;
import org.telegram.messenger.ye;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;
public final class r0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final ff E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long f51799a;
    public final long f51800a0;
    public final long f51801b;
    public final float f51802b0;
    public final String f51803c;
    public final float f51804c0;
    public final String d;
    public final float f51805d0;
    public final boolean e;
    public final float f51806e0;
    public final String f51807f;
    public final TLRPC.InputPeer f51808f0;
    public final boolean f51809g;
    public final long f51810g0;
    public final boolean h;
    public final String f51811h0;
    public final long f51812i;
    public final TLRPC.InputMedia f51813i0;
    public final long f51814j;
    public final r f51815j0;
    public final int f51816k;
    public final ArrayList f51817k0;
    public final int f51818l;
    public final int f51819m;
    public final int f51820n;
    public final ye f51821o;
    public final int f51822p;
    public final int f51823q;
    public final long f51824r;
    public final float[] f51825s;
    public final int f51826t;
    public final int f51827u;
    public final String v;
    public final ArrayList f51828w;
    public final ArrayList f51829x;
    public final String f51830y;
    public final String f51831z;

    public r0(n5 n5Var) {
        float[] fArr = new float[9];
        this.f51825s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f51829x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f51805d0 = 1.0f;
        this.f51806e0 = 1.0f;
        this.f51799a = n5Var.f51517b;
        this.f51801b = n5Var.d;
        File file = n5Var.O0;
        this.f51803c = file == null ? "" : file.toString();
        File file2 = n5Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = n5Var.K;
        File file3 = n5Var.L;
        this.f51807f = file3 == null ? "" : file3.toString();
        this.f51809g = n5Var.M;
        this.h = n5Var.Y;
        float f7 = n5Var.Z;
        long j10 = n5Var.f51531h0;
        this.f51812i = f7 * ((float) j10);
        this.f51814j = n5Var.f51515a0 * ((float) j10);
        this.f51816k = n5Var.Q;
        this.f51818l = n5Var.R;
        this.f51819m = n5Var.f51537k0;
        this.f51820n = n5Var.f51539l0;
        this.f51821o = n5Var.m0;
        this.f51822p = n5Var.f51533i0;
        this.f51823q = n5Var.f51535j0;
        this.f51824r = j10;
        n5Var.f51542n0.getValues(fArr);
        this.f51826t = n5Var.A0;
        this.f51827u = n5Var.B0;
        CharSequence[] charSequenceArr = {n5Var.C0};
        this.f51828w = n5Var.D0 ? ui.b0(n5Var.f51514a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(n5Var.F0);
        File file4 = n5Var.P0;
        this.f51830y = file4 == null ? "" : file4.toString();
        File file5 = n5Var.R0;
        this.f51831z = file5 == null ? "" : file5.toString();
        this.A = n5Var.S0;
        this.B = n5Var.T0;
        this.C = n5Var.U0;
        File file6 = n5Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = n5Var.f51516a1;
        this.F = n5Var.I0;
        this.M = n5Var.f51558w;
        this.N = n5Var.f51560x;
        this.O = n5Var.f51562y;
        this.P = n5Var.f51564z;
        this.Q = n5Var.A;
        this.R = n5Var.B;
        this.S = n5Var.C;
        this.T = n5Var.D;
        this.U = n5Var.E;
        this.V = n5Var.F;
        this.W = n5Var.G;
        File file7 = n5Var.f51544o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = n5Var.f51546p0;
        this.Z = n5Var.f51548q0;
        this.f51800a0 = n5Var.f51550r0;
        this.f51802b0 = n5Var.f51552s0;
        this.f51804c0 = n5Var.f51554t0;
        this.f51805d0 = n5Var.f51556u0;
        this.f51806e0 = n5Var.P;
        this.f51808f0 = n5Var.f51557v0;
        this.f51810g0 = n5Var.J0;
        this.f51811h0 = n5Var.K0;
        this.f51813i0 = n5Var.L0;
        this.f51815j0 = n5Var.S;
        this.f51817k0 = w20.a(n5Var);
    }

    public final n5 a() {
        n5 n5Var = new n5();
        n5Var.f51517b = this.f51799a;
        n5Var.f51520c = true;
        n5Var.d = this.f51801b;
        String str = this.f51803c;
        if (!TextUtils.isEmpty(str)) {
            n5Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            n5Var.N0 = new File(str2);
        }
        n5Var.K = this.e;
        String str3 = this.f51807f;
        if (str3 != null) {
            n5Var.L = new File(str3);
        }
        n5Var.M = this.f51809g;
        n5Var.Y = this.h;
        long j10 = this.f51824r;
        n5Var.f51531h0 = j10;
        if (j10 > 0) {
            n5Var.Z = ((float) this.f51812i) / ((float) j10);
            n5Var.f51515a0 = ((float) this.f51814j) / ((float) j10);
        } else {
            n5Var.Z = 0.0f;
            n5Var.f51515a0 = 1.0f;
        }
        n5Var.Q = this.f51816k;
        n5Var.R = this.f51818l;
        n5Var.f51537k0 = this.f51819m;
        n5Var.f51539l0 = this.f51820n;
        n5Var.m0 = this.f51821o;
        n5Var.f51533i0 = this.f51822p;
        n5Var.f51535j0 = this.f51823q;
        n5Var.f51542n0.setValues(this.f51825s);
        n5Var.A0 = this.f51826t;
        n5Var.B0 = this.f51827u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i10 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.t6.f21130o2 == null) {
                org.telegram.ui.ActionBar.t6.Q();
            }
            CharSequence m10 = org.telegram.messenger.k6.m(spannableString, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), true, null, 0);
            jj.b(m10, this.f51828w, true, false, true, false, 0);
            n5Var.C0 = jj.A5(m10, this.f51828w, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false);
        } else {
            n5Var.C0 = "";
        }
        ArrayList arrayList2 = n5Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f51829x);
        String str5 = this.f51830y;
        if (str5 != null) {
            n5Var.P0 = new File(str5);
        }
        String str6 = this.f51831z;
        if (str6 != null) {
            n5Var.R0 = new File(str6);
        }
        n5Var.S0 = this.A;
        n5Var.T0 = this.B;
        n5Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            n5Var.Z0 = new File(str7);
        }
        n5Var.f51516a1 = this.E;
        n5Var.I0 = this.F;
        n5Var.f51529g = this.G;
        n5Var.f51527f = this.H;
        n5Var.e = this.I;
        n5Var.J = this.L;
        n5Var.I = this.K;
        n5Var.H = this.J;
        n5Var.f51558w = this.M;
        n5Var.f51560x = this.N;
        n5Var.f51562y = this.O;
        n5Var.f51564z = this.P;
        n5Var.A = this.Q;
        n5Var.B = this.R;
        n5Var.C = this.S;
        n5Var.D = this.T;
        n5Var.E = this.U;
        n5Var.F = this.V;
        n5Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            n5Var.f51544o0 = new File(str8);
        }
        n5Var.f51546p0 = this.Y;
        n5Var.f51548q0 = this.Z;
        n5Var.f51550r0 = this.f51800a0;
        n5Var.f51552s0 = this.f51802b0;
        n5Var.f51554t0 = this.f51804c0;
        n5Var.f51556u0 = this.f51805d0;
        n5Var.P = this.f51806e0;
        n5Var.f51557v0 = this.f51808f0;
        n5Var.J0 = this.f51810g0;
        n5Var.K0 = this.f51811h0;
        n5Var.L0 = this.f51813i0;
        n5Var.S = this.f51815j0;
        int i11 = w20.C;
        ArrayList arrayList3 = this.f51817k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                w20 w20Var = (w20) obj;
                n5 n5Var2 = new n5();
                n5Var2.K = w20Var.f19046b;
                n5Var2.Y = w20Var.f19047c;
                n5Var2.L = new File(w20Var.d);
                n5Var2.P = w20Var.e;
                n5Var2.U = w20Var.f19049i;
                n5Var2.X = w20Var.f19048f;
                n5Var2.V = w20Var.f19050j;
                n5Var2.W = w20Var.f19051k;
                n5Var2.f51537k0 = w20Var.f19052l;
                n5Var2.f51539l0 = w20Var.f19053m;
                n5Var2.f51531h0 = w20Var.f19054o;
                arrayList.add(n5Var2);
            }
        }
        n5Var.T = arrayList;
        return n5Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f51801b);
        nativeByteBuffer.writeString(this.f51803c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f51807f);
        nativeByteBuffer.writeBool(this.f51809g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f51812i);
        nativeByteBuffer.writeInt64(this.f51814j);
        nativeByteBuffer.writeInt32(this.f51816k);
        nativeByteBuffer.writeInt32(this.f51818l);
        nativeByteBuffer.writeInt32(this.f51819m);
        nativeByteBuffer.writeInt32(this.f51820n);
        nativeByteBuffer.writeInt32(this.f51822p);
        nativeByteBuffer.writeInt32(this.f51823q);
        nativeByteBuffer.writeInt64(this.f51824r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f51825s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f51826t);
        nativeByteBuffer.writeInt32(this.f51827u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f51828w;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        nativeByteBuffer.writeInt32(size);
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.MessageEntity) arrayList2.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.f51829x;
        if (arrayList3 == null) {
            size2 = 0;
        } else {
            size2 = arrayList3.size();
        }
        nativeByteBuffer.writeInt32(size2);
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i13)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.f51830y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList4 = this.B;
        if (arrayList4 == null) {
            size3 = 0;
        } else {
            size3 = arrayList4.size();
        }
        nativeByteBuffer.writeInt32(size3);
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((v20) arrayList4.get(i14)).b(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        List list = this.C;
        if (list == null) {
            size4 = 0;
        } else {
            size4 = list.size();
        }
        nativeByteBuffer.writeInt32(size4);
        if (list != null) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((TLRPC.InputDocument) list.get(i15)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = "";
        String str2 = this.D;
        if (str2 == null) {
            str2 = "";
        }
        nativeByteBuffer.writeString(str2);
        ff ffVar = this.E;
        if (ffVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(ffVar.f15545a);
            nativeByteBuffer.writeFloat(ffVar.f15546b);
            nativeByteBuffer.writeFloat(ffVar.f15547c);
            nativeByteBuffer.writeFloat(ffVar.d);
            nativeByteBuffer.writeFloat(ffVar.e);
            nativeByteBuffer.writeFloat(ffVar.f15548f);
            nativeByteBuffer.writeFloat(ffVar.f15549g);
            nativeByteBuffer.writeInt32(ffVar.h);
            nativeByteBuffer.writeInt32(ffVar.f15550i);
            nativeByteBuffer.writeFloat(ffVar.f15551j);
            nativeByteBuffer.writeFloat(ffVar.f15552k);
            nativeByteBuffer.writeFloat(ffVar.f15553l);
            nativeByteBuffer.writeFloat(ffVar.f15554m);
            nativeByteBuffer.writeInt32(ffVar.f15555n);
            nativeByteBuffer.writeFloat(ffVar.f15556o);
            e2.c cVar = ffVar.f15557p;
            ((me0) cVar.f6117b).d(nativeByteBuffer);
            ((me0) cVar.f6118c).d(nativeByteBuffer);
            ((me0) cVar.d).d(nativeByteBuffer);
            ((me0) cVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(ffVar.f15558q);
            if (ffVar.f15559r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(ffVar.f15559r.x);
                nativeByteBuffer.writeFloat(ffVar.f15559r.y);
            }
            nativeByteBuffer.writeFloat(ffVar.f15560s);
            nativeByteBuffer.writeFloat(ffVar.f15561t);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(481674261);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.f51831z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str3 = this.O;
        if (str3 == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1739392570);
            nativeByteBuffer.writeString(str3);
            String str4 = this.Q;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str4);
            }
            String str5 = this.R;
            if (str5 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str5);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f51808f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str6 = this.X;
        if (TextUtils.isEmpty(str6)) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(1137015880);
            nativeByteBuffer.writeString(str6);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.f51800a0);
            nativeByteBuffer.writeFloat(this.f51802b0);
            nativeByteBuffer.writeFloat(this.f51804c0);
            nativeByteBuffer.writeFloat(this.f51805d0);
        }
        nativeByteBuffer.writeFloat(this.f51806e0);
        nativeByteBuffer.writeInt64(this.f51810g0);
        String str7 = this.f51811h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f51813i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f51815j0;
        if (rVar != null && rVar.e.size() > 1 && (arrayList = this.f51817k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f51796a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((w20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        ye yeVar = this.f51821o;
        if (yeVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            yeVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public r0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f51825s = new float[9];
        this.f51829x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f51805d0 = 1.0f;
        this.f51806e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f51801b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f51803c = readString;
            if (readString != null && readString.length() == 0) {
                this.f51803c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f51807f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f51807f = null;
            }
            this.f51809g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f51812i = nativeByteBuffer.readInt64(true);
            this.f51814j = nativeByteBuffer.readInt64(true);
            this.f51816k = nativeByteBuffer.readInt32(true);
            this.f51818l = nativeByteBuffer.readInt32(true);
            this.f51819m = nativeByteBuffer.readInt32(true);
            this.f51820n = nativeByteBuffer.readInt32(true);
            this.f51822p = nativeByteBuffer.readInt32(true);
            this.f51823q = nativeByteBuffer.readInt32(true);
            this.f51824r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f51825s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f51826t = nativeByteBuffer.readInt32(true);
            this.f51827u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f51828w == null) {
                        this.f51828w = new ArrayList();
                    }
                    this.f51828w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f51829x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f51829x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f51830y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f51830y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new v20(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i14 = 0; i14 < readInt325; i14++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                ff ffVar = new ff();
                                this.E = ffVar;
                                ffVar.f15545a = nativeByteBuffer.readFloat(true);
                                ffVar.f15546b = nativeByteBuffer.readFloat(true);
                                ffVar.f15547c = nativeByteBuffer.readFloat(true);
                                ffVar.d = nativeByteBuffer.readFloat(true);
                                ffVar.e = nativeByteBuffer.readFloat(true);
                                ffVar.f15548f = nativeByteBuffer.readFloat(true);
                                ffVar.f15549g = nativeByteBuffer.readFloat(true);
                                ffVar.h = nativeByteBuffer.readInt32(true);
                                ffVar.f15550i = nativeByteBuffer.readInt32(true);
                                ffVar.f15551j = nativeByteBuffer.readFloat(true);
                                ffVar.f15552k = nativeByteBuffer.readFloat(true);
                                ffVar.f15553l = nativeByteBuffer.readFloat(true);
                                ffVar.f15554m = nativeByteBuffer.readFloat(true);
                                ffVar.f15555n = nativeByteBuffer.readInt32(true);
                                ffVar.f15556o = nativeByteBuffer.readFloat(true);
                                e2.c cVar = ffVar.f15557p;
                                ((me0) cVar.f6117b).c(nativeByteBuffer);
                                ((me0) cVar.f6118c).c(nativeByteBuffer);
                                ((me0) cVar.d).c(nativeByteBuffer);
                                ((me0) cVar.e).c(nativeByteBuffer);
                                ffVar.f15558q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    ffVar.f15559r = null;
                                } else {
                                    if (ffVar.f15559r == null) {
                                        ffVar.f15559r = new PointF();
                                    }
                                    ffVar.f15559r.x = nativeByteBuffer.readFloat(true);
                                    ffVar.f15559r.y = nativeByteBuffer.readFloat(true);
                                }
                                ffVar.f15560s = nativeByteBuffer.readFloat(true);
                                ffVar.f15561t = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.f51831z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f51831z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f51808f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f51800a0 = nativeByteBuffer.readInt64(true);
                                this.f51802b0 = nativeByteBuffer.readFloat(true);
                                this.f51804c0 = nativeByteBuffer.readFloat(true);
                                this.f51805d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f51806e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f51810g0 = nativeByteBuffer.readInt64(true);
                                this.f51811h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f51813i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f51815j0 = new r(nativeByteBuffer.readString(true));
                                this.f51817k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f51815j0.e.size(); i15++) {
                                    w20 w20Var = new w20();
                                    w20Var.readParams(nativeByteBuffer, true);
                                    w20Var.f19055r = (q) this.f51815j0.e.get(i15);
                                    this.f51817k0.add(w20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                ye yeVar = new ye();
                                this.f51821o = yeVar;
                                yeVar.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
