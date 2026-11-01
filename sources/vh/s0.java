package vh;

import android.graphics.PointF;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gf;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.messenger.w20;
import org.telegram.messenger.x20;
import org.telegram.messenger.ze;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.me0;
public final class s0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final gf E;
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
    public long f51886a;
    public final long f51887a0;
    public final long f51888b;
    public final float f51889b0;
    public final String f51890c;
    public final float f51891c0;
    public final String d;
    public final float f51892d0;
    public final boolean e;
    public final float f51893e0;
    public final String f51894f;
    public final TLRPC.InputPeer f51895f0;
    public final boolean f51896g;
    public final long f51897g0;
    public final boolean h;
    public final String f51898h0;
    public final long f51899i;
    public final TLRPC.InputMedia f51900i0;
    public final long f51901j;
    public final r f51902j0;
    public final int f51903k;
    public final ArrayList f51904k0;
    public final int f51905l;
    public final int f51906m;
    public final int f51907n;
    public final ze f51908o;
    public final int f51909p;
    public final int f51910q;
    public final long f51911r;
    public final float[] f51912s;
    public final int f51913t;
    public final int f51914u;
    public final String v;
    public final ArrayList f51915w;
    public final ArrayList f51916x;
    public final String f51917y;
    public final String f51918z;

    public s0(n5 n5Var) {
        float[] fArr = new float[9];
        this.f51912s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f51916x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f51892d0 = 1.0f;
        this.f51893e0 = 1.0f;
        this.f51886a = n5Var.f51532b;
        this.f51888b = n5Var.d;
        File file = n5Var.O0;
        this.f51890c = file == null ? "" : file.toString();
        File file2 = n5Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = n5Var.K;
        File file3 = n5Var.L;
        this.f51894f = file3 == null ? "" : file3.toString();
        this.f51896g = n5Var.M;
        this.h = n5Var.Y;
        float f7 = n5Var.Z;
        long j10 = n5Var.f51546h0;
        this.f51899i = f7 * ((float) j10);
        this.f51901j = n5Var.f51530a0 * ((float) j10);
        this.f51903k = n5Var.Q;
        this.f51905l = n5Var.R;
        this.f51906m = n5Var.f51552k0;
        this.f51907n = n5Var.f51554l0;
        this.f51908o = n5Var.m0;
        this.f51909p = n5Var.f51548i0;
        this.f51910q = n5Var.f51550j0;
        this.f51911r = j10;
        n5Var.f51557n0.getValues(fArr);
        this.f51913t = n5Var.A0;
        this.f51914u = n5Var.B0;
        CharSequence[] charSequenceArr = {n5Var.C0};
        this.f51915w = n5Var.D0 ? vi.b0(n5Var.f51529a).W(charSequenceArr, true, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(n5Var.F0);
        File file4 = n5Var.P0;
        this.f51917y = file4 == null ? "" : file4.toString();
        File file5 = n5Var.R0;
        this.f51918z = file5 == null ? "" : file5.toString();
        this.A = n5Var.S0;
        this.B = n5Var.T0;
        this.C = n5Var.U0;
        File file6 = n5Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = n5Var.f51531a1;
        this.F = n5Var.I0;
        this.M = n5Var.f51573w;
        this.N = n5Var.f51575x;
        this.O = n5Var.f51577y;
        this.P = n5Var.f51579z;
        this.Q = n5Var.A;
        this.R = n5Var.B;
        this.S = n5Var.C;
        this.T = n5Var.D;
        this.U = n5Var.E;
        this.V = n5Var.F;
        this.W = n5Var.G;
        File file7 = n5Var.f51559o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = n5Var.f51561p0;
        this.Z = n5Var.f51563q0;
        this.f51887a0 = n5Var.f51565r0;
        this.f51889b0 = n5Var.f51567s0;
        this.f51891c0 = n5Var.f51569t0;
        this.f51892d0 = n5Var.f51571u0;
        this.f51893e0 = n5Var.P;
        this.f51895f0 = n5Var.f51572v0;
        this.f51897g0 = n5Var.J0;
        this.f51898h0 = n5Var.K0;
        this.f51900i0 = n5Var.L0;
        this.f51902j0 = n5Var.S;
        this.f51904k0 = x20.a(n5Var);
    }

    public final n5 a() {
        n5 n5Var = new n5();
        n5Var.f51532b = this.f51886a;
        n5Var.f51535c = true;
        n5Var.d = this.f51888b;
        String str = this.f51890c;
        if (!TextUtils.isEmpty(str)) {
            n5Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            n5Var.N0 = new File(str2);
        }
        n5Var.K = this.e;
        String str3 = this.f51894f;
        if (str3 != null) {
            n5Var.L = new File(str3);
        }
        n5Var.M = this.f51896g;
        n5Var.Y = this.h;
        long j10 = this.f51911r;
        n5Var.f51546h0 = j10;
        if (j10 > 0) {
            n5Var.Z = ((float) this.f51899i) / ((float) j10);
            n5Var.f51530a0 = ((float) this.f51901j) / ((float) j10);
        } else {
            n5Var.Z = 0.0f;
            n5Var.f51530a0 = 1.0f;
        }
        n5Var.Q = this.f51903k;
        n5Var.R = this.f51905l;
        n5Var.f51552k0 = this.f51906m;
        n5Var.f51554l0 = this.f51907n;
        n5Var.m0 = this.f51908o;
        n5Var.f51548i0 = this.f51909p;
        n5Var.f51550j0 = this.f51910q;
        n5Var.f51557n0.setValues(this.f51912s);
        n5Var.A0 = this.f51913t;
        n5Var.B0 = this.f51914u;
        ArrayList arrayList = null;
        String str4 = this.v;
        int i10 = 0;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.t6.f21131o2 == null) {
                org.telegram.ui.ActionBar.t6.Q();
            }
            CharSequence m10 = org.telegram.messenger.k6.m(spannableString, org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), true, null, 0);
            kj.b(m10, this.f51915w, true, false, true, false, 0);
            n5Var.C0 = kj.A5(m10, this.f51915w, org.telegram.ui.ActionBar.t6.f21131o2.getFontMetricsInt(), false);
        } else {
            n5Var.C0 = "";
        }
        ArrayList arrayList2 = n5Var.F0;
        arrayList2.clear();
        arrayList2.addAll(this.f51916x);
        String str5 = this.f51917y;
        if (str5 != null) {
            n5Var.P0 = new File(str5);
        }
        String str6 = this.f51918z;
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
        n5Var.f51531a1 = this.E;
        n5Var.I0 = this.F;
        n5Var.f51544g = this.G;
        n5Var.f51542f = this.H;
        n5Var.e = this.I;
        n5Var.J = this.L;
        n5Var.I = this.K;
        n5Var.H = this.J;
        n5Var.f51573w = this.M;
        n5Var.f51575x = this.N;
        n5Var.f51577y = this.O;
        n5Var.f51579z = this.P;
        n5Var.A = this.Q;
        n5Var.B = this.R;
        n5Var.C = this.S;
        n5Var.D = this.T;
        n5Var.E = this.U;
        n5Var.F = this.V;
        n5Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            n5Var.f51559o0 = new File(str8);
        }
        n5Var.f51561p0 = this.Y;
        n5Var.f51563q0 = this.Z;
        n5Var.f51565r0 = this.f51887a0;
        n5Var.f51567s0 = this.f51889b0;
        n5Var.f51569t0 = this.f51891c0;
        n5Var.f51571u0 = this.f51892d0;
        n5Var.P = this.f51893e0;
        n5Var.f51572v0 = this.f51895f0;
        n5Var.J0 = this.f51897g0;
        n5Var.K0 = this.f51898h0;
        n5Var.L0 = this.f51900i0;
        n5Var.S = this.f51902j0;
        int i11 = x20.C;
        ArrayList arrayList3 = this.f51904k0;
        if (arrayList3 != null) {
            arrayList = new ArrayList();
            int size = arrayList3.size();
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                x20 x20Var = (x20) obj;
                n5 n5Var2 = new n5();
                n5Var2.K = x20Var.f19381b;
                n5Var2.Y = x20Var.f19382c;
                n5Var2.L = new File(x20Var.d);
                n5Var2.P = x20Var.e;
                n5Var2.U = x20Var.f19384i;
                n5Var2.X = x20Var.f19383f;
                n5Var2.V = x20Var.f19385j;
                n5Var2.W = x20Var.f19386k;
                n5Var2.f51552k0 = x20Var.f19387l;
                n5Var2.f51554l0 = x20Var.f19388m;
                n5Var2.f51546h0 = x20Var.f19389o;
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
        nativeByteBuffer.writeInt64(this.f51888b);
        nativeByteBuffer.writeString(this.f51890c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f51894f);
        nativeByteBuffer.writeBool(this.f51896g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f51899i);
        nativeByteBuffer.writeInt64(this.f51901j);
        nativeByteBuffer.writeInt32(this.f51903k);
        nativeByteBuffer.writeInt32(this.f51905l);
        nativeByteBuffer.writeInt32(this.f51906m);
        nativeByteBuffer.writeInt32(this.f51907n);
        nativeByteBuffer.writeInt32(this.f51909p);
        nativeByteBuffer.writeInt32(this.f51910q);
        nativeByteBuffer.writeInt64(this.f51911r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f51912s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f51913t);
        nativeByteBuffer.writeInt32(this.f51914u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f51915w;
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
        ArrayList arrayList3 = this.f51916x;
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
        nativeByteBuffer.writeString(this.f51917y);
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
                ((w20) arrayList4.get(i14)).b(nativeByteBuffer, true);
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
        gf gfVar = this.E;
        if (gfVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            nativeByteBuffer.writeFloat(gfVar.f15886a);
            nativeByteBuffer.writeFloat(gfVar.f15887b);
            nativeByteBuffer.writeFloat(gfVar.f15888c);
            nativeByteBuffer.writeFloat(gfVar.d);
            nativeByteBuffer.writeFloat(gfVar.e);
            nativeByteBuffer.writeFloat(gfVar.f15889f);
            nativeByteBuffer.writeFloat(gfVar.f15890g);
            nativeByteBuffer.writeInt32(gfVar.h);
            nativeByteBuffer.writeInt32(gfVar.f15891i);
            nativeByteBuffer.writeFloat(gfVar.f15892j);
            nativeByteBuffer.writeFloat(gfVar.f15893k);
            nativeByteBuffer.writeFloat(gfVar.f15894l);
            nativeByteBuffer.writeFloat(gfVar.f15895m);
            nativeByteBuffer.writeInt32(gfVar.f15896n);
            nativeByteBuffer.writeFloat(gfVar.f15897o);
            e2.c cVar = gfVar.f15898p;
            ((me0) cVar.f6117b).d(nativeByteBuffer);
            ((me0) cVar.f6118c).d(nativeByteBuffer);
            ((me0) cVar.d).d(nativeByteBuffer);
            ((me0) cVar.e).d(nativeByteBuffer);
            nativeByteBuffer.writeFloat(gfVar.f15899q);
            if (gfVar.f15900r == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-559038737);
                nativeByteBuffer.writeFloat(gfVar.f15900r.x);
                nativeByteBuffer.writeFloat(gfVar.f15900r.y);
            }
            nativeByteBuffer.writeFloat(gfVar.f15901s);
            nativeByteBuffer.writeFloat(gfVar.f15902t);
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
        nativeByteBuffer.writeString(this.f51918z);
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
        TLRPC.InputPeer inputPeer = this.f51895f0;
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
            nativeByteBuffer.writeInt64(this.f51887a0);
            nativeByteBuffer.writeFloat(this.f51889b0);
            nativeByteBuffer.writeFloat(this.f51891c0);
            nativeByteBuffer.writeFloat(this.f51892d0);
        }
        nativeByteBuffer.writeFloat(this.f51893e0);
        nativeByteBuffer.writeInt64(this.f51897g0);
        String str7 = this.f51898h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f51900i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f51902j0;
        if (rVar != null && rVar.e.size() > 1 && (arrayList = this.f51904k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f51811a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((x20) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        ze zeVar = this.f51908o;
        if (zeVar == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            zeVar.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public s0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f51912s = new float[9];
        this.f51916x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f51892d0 = 1.0f;
        this.f51893e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f51888b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f51890c = readString;
            if (readString != null && readString.length() == 0) {
                this.f51890c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f51894f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f51894f = null;
            }
            this.f51896g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f51899i = nativeByteBuffer.readInt64(true);
            this.f51901j = nativeByteBuffer.readInt64(true);
            this.f51903k = nativeByteBuffer.readInt32(true);
            this.f51905l = nativeByteBuffer.readInt32(true);
            this.f51906m = nativeByteBuffer.readInt32(true);
            this.f51907n = nativeByteBuffer.readInt32(true);
            this.f51909p = nativeByteBuffer.readInt32(true);
            this.f51910q = nativeByteBuffer.readInt32(true);
            this.f51911r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f51912s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f51913t = nativeByteBuffer.readInt32(true);
            this.f51914u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f51915w == null) {
                        this.f51915w = new ArrayList();
                    }
                    this.f51915w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f51916x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f51916x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f51917y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f51917y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new w20(nativeByteBuffer, true, true));
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
                                gf gfVar = new gf();
                                this.E = gfVar;
                                gfVar.f15886a = nativeByteBuffer.readFloat(true);
                                gfVar.f15887b = nativeByteBuffer.readFloat(true);
                                gfVar.f15888c = nativeByteBuffer.readFloat(true);
                                gfVar.d = nativeByteBuffer.readFloat(true);
                                gfVar.e = nativeByteBuffer.readFloat(true);
                                gfVar.f15889f = nativeByteBuffer.readFloat(true);
                                gfVar.f15890g = nativeByteBuffer.readFloat(true);
                                gfVar.h = nativeByteBuffer.readInt32(true);
                                gfVar.f15891i = nativeByteBuffer.readInt32(true);
                                gfVar.f15892j = nativeByteBuffer.readFloat(true);
                                gfVar.f15893k = nativeByteBuffer.readFloat(true);
                                gfVar.f15894l = nativeByteBuffer.readFloat(true);
                                gfVar.f15895m = nativeByteBuffer.readFloat(true);
                                gfVar.f15896n = nativeByteBuffer.readInt32(true);
                                gfVar.f15897o = nativeByteBuffer.readFloat(true);
                                e2.c cVar = gfVar.f15898p;
                                ((me0) cVar.f6117b).c(nativeByteBuffer);
                                ((me0) cVar.f6118c).c(nativeByteBuffer);
                                ((me0) cVar.d).c(nativeByteBuffer);
                                ((me0) cVar.e).c(nativeByteBuffer);
                                gfVar.f15899q = nativeByteBuffer.readFloat(true);
                                if (nativeByteBuffer.readInt32(true) == 1450380236) {
                                    gfVar.f15900r = null;
                                } else {
                                    if (gfVar.f15900r == null) {
                                        gfVar.f15900r = new PointF();
                                    }
                                    gfVar.f15900r.x = nativeByteBuffer.readFloat(true);
                                    gfVar.f15900r.y = nativeByteBuffer.readFloat(true);
                                }
                                gfVar.f15901s = nativeByteBuffer.readFloat(true);
                                gfVar.f15902t = nativeByteBuffer.readFloat(true);
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
                                this.f51918z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f51918z = null;
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
                                this.f51895f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f51887a0 = nativeByteBuffer.readInt64(true);
                                this.f51889b0 = nativeByteBuffer.readFloat(true);
                                this.f51891c0 = nativeByteBuffer.readFloat(true);
                                this.f51892d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f51893e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f51897g0 = nativeByteBuffer.readInt64(true);
                                this.f51898h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f51900i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f51902j0 = new r(nativeByteBuffer.readString(true));
                                this.f51904k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f51902j0.e.size(); i15++) {
                                    x20 x20Var = new x20();
                                    x20Var.readParams(nativeByteBuffer, true);
                                    x20Var.f19390r = (q) this.f51902j0.e.get(i15);
                                    this.f51904k0.add(x20Var);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                ze zeVar = new ze();
                                this.f51908o = zeVar;
                                zeVar.readParams(nativeByteBuffer, true);
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
