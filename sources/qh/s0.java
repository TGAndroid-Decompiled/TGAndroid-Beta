package qh;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class s0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final MediaController.SavedFilterState E;
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
    public long f46054a;
    public final long f46055a0;
    public final long f46056b;
    public final float f46057b0;
    public final String f46058c;
    public final float f46059c0;
    public final String d;
    public final float f46060d0;
    public final boolean f46061e;
    public final float f46062e0;
    public final String f46063f;
    public final TLRPC.InputPeer f46064f0;
    public final boolean f46065g;
    public final long f46066g0;
    public final boolean h;
    public final String f46067h0;
    public final long f46068i;
    public final TLRPC.InputMedia f46069i0;
    public final long f46070j;
    public final r f46071j0;
    public final int f46072k;
    public final ArrayList f46073k0;
    public final int f46074l;
    public final int f46075m;
    public final int f46076n;
    public final MediaController.CropState f46077o;
    public final int f46078p;
    public final int f46079q;
    public final long f46080r;
    public final float[] f46081s;
    public final int f46082t;
    public final int f46083u;
    public final String v;
    public final ArrayList f46084w;
    public final ArrayList f46085x;
    public final String f46086y;
    public final String f46087z;

    public s0(r6 r6Var) {
        float[] fArr = new float[9];
        this.f46081s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f46085x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f46060d0 = 1.0f;
        this.f46062e0 = 1.0f;
        this.f46054a = r6Var.f45995b;
        this.f46056b = r6Var.d;
        File file = r6Var.O0;
        this.f46058c = file == null ? "" : file.toString();
        File file2 = r6Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f46061e = r6Var.K;
        File file3 = r6Var.L;
        this.f46063f = file3 == null ? "" : file3.toString();
        this.f46065g = r6Var.M;
        this.h = r6Var.Y;
        float f10 = r6Var.Z;
        long j10 = r6Var.f46010h0;
        this.f46068i = f10 * ((float) j10);
        this.f46070j = r6Var.f45993a0 * ((float) j10);
        this.f46072k = r6Var.Q;
        this.f46074l = r6Var.R;
        this.f46075m = r6Var.f46016k0;
        this.f46076n = r6Var.f46018l0;
        this.f46077o = r6Var.m0;
        this.f46078p = r6Var.f46012i0;
        this.f46079q = r6Var.f46014j0;
        this.f46080r = j10;
        r6Var.f46021n0.getValues(fArr);
        this.f46082t = r6Var.A0;
        this.f46083u = r6Var.B0;
        CharSequence[] charSequenceArr = {r6Var.C0};
        this.f46084w = r6Var.D0 ? MediaDataController.getInstance(r6Var.f45992a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(r6Var.F0);
        File file4 = r6Var.P0;
        this.f46086y = file4 == null ? "" : file4.toString();
        File file5 = r6Var.R0;
        this.f46087z = file5 == null ? "" : file5.toString();
        this.A = r6Var.S0;
        this.B = r6Var.T0;
        this.C = r6Var.U0;
        File file6 = r6Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = r6Var.f45994a1;
        this.F = r6Var.I0;
        this.M = r6Var.f46037w;
        this.N = r6Var.f46039x;
        this.O = r6Var.f46041y;
        this.P = r6Var.f46043z;
        this.Q = r6Var.A;
        this.R = r6Var.B;
        this.S = r6Var.C;
        this.T = r6Var.D;
        this.U = r6Var.E;
        this.V = r6Var.F;
        this.W = r6Var.G;
        File file7 = r6Var.f46023o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = r6Var.f46025p0;
        this.Z = r6Var.f46027q0;
        this.f46055a0 = r6Var.f46029r0;
        this.f46057b0 = r6Var.f46031s0;
        this.f46059c0 = r6Var.f46033t0;
        this.f46060d0 = r6Var.f46035u0;
        this.f46062e0 = r6Var.P;
        this.f46064f0 = r6Var.f46036v0;
        this.f46066g0 = r6Var.J0;
        this.f46067h0 = r6Var.K0;
        this.f46069i0 = r6Var.L0;
        this.f46071j0 = r6Var.S;
        this.f46073k0 = VideoEditedInfo.Part.toParts(r6Var);
    }

    public final r6 a() {
        r6 r6Var = new r6();
        r6Var.f45995b = this.f46054a;
        r6Var.f45998c = true;
        r6Var.d = this.f46056b;
        String str = this.f46058c;
        if (!TextUtils.isEmpty(str)) {
            r6Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            r6Var.N0 = new File(str2);
        }
        r6Var.K = this.f46061e;
        String str3 = this.f46063f;
        if (str3 != null) {
            r6Var.L = new File(str3);
        }
        r6Var.M = this.f46065g;
        r6Var.Y = this.h;
        long j10 = this.f46080r;
        r6Var.f46010h0 = j10;
        if (j10 > 0) {
            r6Var.Z = ((float) this.f46068i) / ((float) j10);
            r6Var.f45993a0 = ((float) this.f46070j) / ((float) j10);
        } else {
            r6Var.Z = 0.0f;
            r6Var.f45993a0 = 1.0f;
        }
        r6Var.Q = this.f46072k;
        r6Var.R = this.f46074l;
        r6Var.f46016k0 = this.f46075m;
        r6Var.f46018l0 = this.f46076n;
        r6Var.m0 = this.f46077o;
        r6Var.f46012i0 = this.f46078p;
        r6Var.f46014j0 = this.f46079q;
        r6Var.f46021n0.setValues(this.f46081s);
        r6Var.A0 = this.f46082t;
        r6Var.B0 = this.f46083u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.k6.f21855o2 == null) {
                org.telegram.ui.ActionBar.k6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.k6.f21855o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f46084w, true, false, true, false);
            r6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f46084w, org.telegram.ui.ActionBar.k6.f21855o2.getFontMetricsInt());
        } else {
            r6Var.C0 = "";
        }
        ArrayList arrayList = r6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f46085x);
        String str5 = this.f46086y;
        if (str5 != null) {
            r6Var.P0 = new File(str5);
        }
        String str6 = this.f46087z;
        if (str6 != null) {
            r6Var.R0 = new File(str6);
        }
        r6Var.S0 = this.A;
        r6Var.T0 = this.B;
        r6Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            r6Var.Z0 = new File(str7);
        }
        r6Var.f45994a1 = this.E;
        r6Var.I0 = this.F;
        r6Var.f46008g = this.G;
        r6Var.f46006f = this.H;
        r6Var.f46003e = this.I;
        r6Var.J = this.L;
        r6Var.I = this.K;
        r6Var.H = this.J;
        r6Var.f46037w = this.M;
        r6Var.f46039x = this.N;
        r6Var.f46041y = this.O;
        r6Var.f46043z = this.P;
        r6Var.A = this.Q;
        r6Var.B = this.R;
        r6Var.C = this.S;
        r6Var.D = this.T;
        r6Var.E = this.U;
        r6Var.F = this.V;
        r6Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            r6Var.f46023o0 = new File(str8);
        }
        r6Var.f46025p0 = this.Y;
        r6Var.f46027q0 = this.Z;
        r6Var.f46029r0 = this.f46055a0;
        r6Var.f46031s0 = this.f46057b0;
        r6Var.f46033t0 = this.f46059c0;
        r6Var.f46035u0 = this.f46060d0;
        r6Var.P = this.f46062e0;
        r6Var.f46036v0 = this.f46064f0;
        r6Var.J0 = this.f46066g0;
        r6Var.K0 = this.f46067h0;
        r6Var.L0 = this.f46069i0;
        r6Var.S = this.f46071j0;
        r6Var.T = VideoEditedInfo.Part.toStoryEntries(this.f46073k0);
        return r6Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f46056b);
        nativeByteBuffer.writeString(this.f46058c);
        nativeByteBuffer.writeBool(this.f46061e);
        nativeByteBuffer.writeString(this.f46063f);
        nativeByteBuffer.writeBool(this.f46065g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f46068i);
        nativeByteBuffer.writeInt64(this.f46070j);
        nativeByteBuffer.writeInt32(this.f46072k);
        nativeByteBuffer.writeInt32(this.f46074l);
        nativeByteBuffer.writeInt32(this.f46075m);
        nativeByteBuffer.writeInt32(this.f46076n);
        nativeByteBuffer.writeInt32(this.f46078p);
        nativeByteBuffer.writeInt32(this.f46079q);
        nativeByteBuffer.writeInt64(this.f46080r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f46081s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f46082t);
        nativeByteBuffer.writeInt32(this.f46083u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f46084w;
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
        ArrayList arrayList3 = this.f46085x;
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
        nativeByteBuffer.writeString(this.f46086y);
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
                ((VideoEditedInfo.MediaEntity) arrayList4.get(i14)).serializeTo(nativeByteBuffer, true);
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
        MediaController.SavedFilterState savedFilterState = this.E;
        if (savedFilterState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            savedFilterState.serializeToStream(nativeByteBuffer);
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
        nativeByteBuffer.writeString(this.f46087z);
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
        TLRPC.InputPeer inputPeer = this.f46064f0;
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
            nativeByteBuffer.writeInt64(this.f46055a0);
            nativeByteBuffer.writeFloat(this.f46057b0);
            nativeByteBuffer.writeFloat(this.f46059c0);
            nativeByteBuffer.writeFloat(this.f46060d0);
        }
        nativeByteBuffer.writeFloat(this.f46062e0);
        nativeByteBuffer.writeInt64(this.f46066g0);
        String str7 = this.f46067h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f46069i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f46071j0;
        if (rVar != null && rVar.f45974e.size() > 1 && (arrayList = this.f46073k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f45971a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f46077o;
        if (cropState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            cropState.serializeToStream(nativeByteBuffer);
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
        this.f46081s = new float[9];
        this.f46085x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f46060d0 = 1.0f;
        this.f46062e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f46056b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f46058c = readString;
            if (readString != null && readString.length() == 0) {
                this.f46058c = null;
            }
            this.f46061e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f46063f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f46063f = null;
            }
            this.f46065g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f46068i = nativeByteBuffer.readInt64(true);
            this.f46070j = nativeByteBuffer.readInt64(true);
            this.f46072k = nativeByteBuffer.readInt32(true);
            this.f46074l = nativeByteBuffer.readInt32(true);
            this.f46075m = nativeByteBuffer.readInt32(true);
            this.f46076n = nativeByteBuffer.readInt32(true);
            this.f46078p = nativeByteBuffer.readInt32(true);
            this.f46079q = nativeByteBuffer.readInt32(true);
            this.f46080r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f46081s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f46082t = nativeByteBuffer.readInt32(true);
            this.f46083u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f46084w == null) {
                        this.f46084w = new ArrayList();
                    }
                    this.f46084w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f46085x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f46085x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f46086y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f46086y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
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
                                MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                                this.E = savedFilterState;
                                savedFilterState.readParams(nativeByteBuffer, true);
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
                                this.f46087z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f46087z = null;
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
                                this.f46064f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f46055a0 = nativeByteBuffer.readInt64(true);
                                this.f46057b0 = nativeByteBuffer.readFloat(true);
                                this.f46059c0 = nativeByteBuffer.readFloat(true);
                                this.f46060d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f46062e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f46066g0 = nativeByteBuffer.readInt64(true);
                                this.f46067h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f46069i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f46071j0 = new r(nativeByteBuffer.readString(true));
                                this.f46073k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f46071j0.f45974e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (q) this.f46071j0.f45974e.get(i15);
                                    this.f46073k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f46077o = cropState;
                                cropState.readParams(nativeByteBuffer, true);
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
