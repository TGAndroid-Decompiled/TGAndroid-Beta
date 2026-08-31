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
    public long f45993a;
    public final long f45994a0;
    public final long f45995b;
    public final float f45996b0;
    public final String f45997c;
    public final float f45998c0;
    public final String d;
    public final float f45999d0;
    public final boolean f46000e;
    public final float f46001e0;
    public final String f46002f;
    public final TLRPC.InputPeer f46003f0;
    public final boolean f46004g;
    public final long f46005g0;
    public final boolean h;
    public final String f46006h0;
    public final long f46007i;
    public final TLRPC.InputMedia f46008i0;
    public final long f46009j;
    public final r f46010j0;
    public final int f46011k;
    public final ArrayList f46012k0;
    public final int f46013l;
    public final int f46014m;
    public final int f46015n;
    public final MediaController.CropState f46016o;
    public final int f46017p;
    public final int f46018q;
    public final long f46019r;
    public final float[] f46020s;
    public final int f46021t;
    public final int f46022u;
    public final String v;
    public final ArrayList f46023w;
    public final ArrayList f46024x;
    public final String f46025y;
    public final String f46026z;

    public s0(s6 s6Var) {
        float[] fArr = new float[9];
        this.f46020s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f46024x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f45999d0 = 1.0f;
        this.f46001e0 = 1.0f;
        this.f45993a = s6Var.f46044b;
        this.f45995b = s6Var.d;
        File file = s6Var.O0;
        this.f45997c = file == null ? "" : file.toString();
        File file2 = s6Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.f46000e = s6Var.K;
        File file3 = s6Var.L;
        this.f46002f = file3 == null ? "" : file3.toString();
        this.f46004g = s6Var.M;
        this.h = s6Var.Y;
        float f10 = s6Var.Z;
        long j10 = s6Var.f46059h0;
        this.f46007i = f10 * ((float) j10);
        this.f46009j = s6Var.f46042a0 * ((float) j10);
        this.f46011k = s6Var.Q;
        this.f46013l = s6Var.R;
        this.f46014m = s6Var.f46065k0;
        this.f46015n = s6Var.f46067l0;
        this.f46016o = s6Var.m0;
        this.f46017p = s6Var.f46061i0;
        this.f46018q = s6Var.f46063j0;
        this.f46019r = j10;
        s6Var.f46070n0.getValues(fArr);
        this.f46021t = s6Var.A0;
        this.f46022u = s6Var.B0;
        CharSequence[] charSequenceArr = {s6Var.C0};
        this.f46023w = s6Var.D0 ? MediaDataController.getInstance(s6Var.f46041a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(s6Var.F0);
        File file4 = s6Var.P0;
        this.f46025y = file4 == null ? "" : file4.toString();
        File file5 = s6Var.R0;
        this.f46026z = file5 == null ? "" : file5.toString();
        this.A = s6Var.S0;
        this.B = s6Var.T0;
        this.C = s6Var.U0;
        File file6 = s6Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = s6Var.f46043a1;
        this.F = s6Var.I0;
        this.M = s6Var.f46086w;
        this.N = s6Var.f46088x;
        this.O = s6Var.f46090y;
        this.P = s6Var.f46092z;
        this.Q = s6Var.A;
        this.R = s6Var.B;
        this.S = s6Var.C;
        this.T = s6Var.D;
        this.U = s6Var.E;
        this.V = s6Var.F;
        this.W = s6Var.G;
        File file7 = s6Var.f46072o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = s6Var.f46074p0;
        this.Z = s6Var.f46076q0;
        this.f45994a0 = s6Var.f46078r0;
        this.f45996b0 = s6Var.f46080s0;
        this.f45998c0 = s6Var.f46082t0;
        this.f45999d0 = s6Var.f46084u0;
        this.f46001e0 = s6Var.P;
        this.f46003f0 = s6Var.f46085v0;
        this.f46005g0 = s6Var.J0;
        this.f46006h0 = s6Var.K0;
        this.f46008i0 = s6Var.L0;
        this.f46010j0 = s6Var.S;
        this.f46012k0 = VideoEditedInfo.Part.toParts(s6Var);
    }

    public final s6 a() {
        s6 s6Var = new s6();
        s6Var.f46044b = this.f45993a;
        s6Var.f46047c = true;
        s6Var.d = this.f45995b;
        String str = this.f45997c;
        if (!TextUtils.isEmpty(str)) {
            s6Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            s6Var.N0 = new File(str2);
        }
        s6Var.K = this.f46000e;
        String str3 = this.f46002f;
        if (str3 != null) {
            s6Var.L = new File(str3);
        }
        s6Var.M = this.f46004g;
        s6Var.Y = this.h;
        long j10 = this.f46019r;
        s6Var.f46059h0 = j10;
        if (j10 > 0) {
            s6Var.Z = ((float) this.f46007i) / ((float) j10);
            s6Var.f46042a0 = ((float) this.f46009j) / ((float) j10);
        } else {
            s6Var.Z = 0.0f;
            s6Var.f46042a0 = 1.0f;
        }
        s6Var.Q = this.f46011k;
        s6Var.R = this.f46013l;
        s6Var.f46065k0 = this.f46014m;
        s6Var.f46067l0 = this.f46015n;
        s6Var.m0 = this.f46016o;
        s6Var.f46061i0 = this.f46017p;
        s6Var.f46063j0 = this.f46018q;
        s6Var.f46070n0.setValues(this.f46020s);
        s6Var.A0 = this.f46021t;
        s6Var.B0 = this.f46022u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.k6.f21853o2 == null) {
                org.telegram.ui.ActionBar.k6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f46023w, true, false, true, false);
            s6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f46023w, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt());
        } else {
            s6Var.C0 = "";
        }
        ArrayList arrayList = s6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f46024x);
        String str5 = this.f46025y;
        if (str5 != null) {
            s6Var.P0 = new File(str5);
        }
        String str6 = this.f46026z;
        if (str6 != null) {
            s6Var.R0 = new File(str6);
        }
        s6Var.S0 = this.A;
        s6Var.T0 = this.B;
        s6Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            s6Var.Z0 = new File(str7);
        }
        s6Var.f46043a1 = this.E;
        s6Var.I0 = this.F;
        s6Var.f46057g = this.G;
        s6Var.f46055f = this.H;
        s6Var.f46052e = this.I;
        s6Var.J = this.L;
        s6Var.I = this.K;
        s6Var.H = this.J;
        s6Var.f46086w = this.M;
        s6Var.f46088x = this.N;
        s6Var.f46090y = this.O;
        s6Var.f46092z = this.P;
        s6Var.A = this.Q;
        s6Var.B = this.R;
        s6Var.C = this.S;
        s6Var.D = this.T;
        s6Var.E = this.U;
        s6Var.F = this.V;
        s6Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            s6Var.f46072o0 = new File(str8);
        }
        s6Var.f46074p0 = this.Y;
        s6Var.f46076q0 = this.Z;
        s6Var.f46078r0 = this.f45994a0;
        s6Var.f46080s0 = this.f45996b0;
        s6Var.f46082t0 = this.f45998c0;
        s6Var.f46084u0 = this.f45999d0;
        s6Var.P = this.f46001e0;
        s6Var.f46085v0 = this.f46003f0;
        s6Var.J0 = this.f46005g0;
        s6Var.K0 = this.f46006h0;
        s6Var.L0 = this.f46008i0;
        s6Var.S = this.f46010j0;
        s6Var.T = VideoEditedInfo.Part.toStoryEntries(this.f46012k0);
        return s6Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f45995b);
        nativeByteBuffer.writeString(this.f45997c);
        nativeByteBuffer.writeBool(this.f46000e);
        nativeByteBuffer.writeString(this.f46002f);
        nativeByteBuffer.writeBool(this.f46004g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f46007i);
        nativeByteBuffer.writeInt64(this.f46009j);
        nativeByteBuffer.writeInt32(this.f46011k);
        nativeByteBuffer.writeInt32(this.f46013l);
        nativeByteBuffer.writeInt32(this.f46014m);
        nativeByteBuffer.writeInt32(this.f46015n);
        nativeByteBuffer.writeInt32(this.f46017p);
        nativeByteBuffer.writeInt32(this.f46018q);
        nativeByteBuffer.writeInt64(this.f46019r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f46020s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f46021t);
        nativeByteBuffer.writeInt32(this.f46022u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f46023w;
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
        ArrayList arrayList3 = this.f46024x;
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
        nativeByteBuffer.writeString(this.f46025y);
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
        nativeByteBuffer.writeString(this.f46026z);
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
        TLRPC.InputPeer inputPeer = this.f46003f0;
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
            nativeByteBuffer.writeInt64(this.f45994a0);
            nativeByteBuffer.writeFloat(this.f45996b0);
            nativeByteBuffer.writeFloat(this.f45998c0);
            nativeByteBuffer.writeFloat(this.f45999d0);
        }
        nativeByteBuffer.writeFloat(this.f46001e0);
        nativeByteBuffer.writeInt64(this.f46005g0);
        String str7 = this.f46006h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f46008i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f46010j0;
        if (rVar != null && rVar.f45927e.size() > 1 && (arrayList = this.f46012k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f45924a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f46016o;
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
        this.f46020s = new float[9];
        this.f46024x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f45999d0 = 1.0f;
        this.f46001e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f45995b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f45997c = readString;
            if (readString != null && readString.length() == 0) {
                this.f45997c = null;
            }
            this.f46000e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f46002f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f46002f = null;
            }
            this.f46004g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f46007i = nativeByteBuffer.readInt64(true);
            this.f46009j = nativeByteBuffer.readInt64(true);
            this.f46011k = nativeByteBuffer.readInt32(true);
            this.f46013l = nativeByteBuffer.readInt32(true);
            this.f46014m = nativeByteBuffer.readInt32(true);
            this.f46015n = nativeByteBuffer.readInt32(true);
            this.f46017p = nativeByteBuffer.readInt32(true);
            this.f46018q = nativeByteBuffer.readInt32(true);
            this.f46019r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f46020s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f46021t = nativeByteBuffer.readInt32(true);
            this.f46022u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f46023w == null) {
                        this.f46023w = new ArrayList();
                    }
                    this.f46023w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f46024x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f46024x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f46025y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f46025y = null;
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
                                this.f46026z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f46026z = null;
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
                                this.f46003f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f45994a0 = nativeByteBuffer.readInt64(true);
                                this.f45996b0 = nativeByteBuffer.readFloat(true);
                                this.f45998c0 = nativeByteBuffer.readFloat(true);
                                this.f45999d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f46001e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f46005g0 = nativeByteBuffer.readInt64(true);
                                this.f46006h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f46008i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f46010j0 = new r(nativeByteBuffer.readString(true));
                                this.f46012k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f46010j0.f45927e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (q) this.f46010j0.f45927e.get(i15);
                                    this.f46012k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f46016o = cropState;
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
