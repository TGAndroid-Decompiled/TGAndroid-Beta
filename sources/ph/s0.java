package ph;

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
    public long f42263a;
    public final long f42264a0;
    public final long f42265b;
    public final float f42266b0;
    public final String f42267c;
    public final float f42268c0;
    public final String d;
    public final float f42269d0;
    public final boolean e;
    public final float f42270e0;
    public final String f42271f;
    public final TLRPC.InputPeer f42272f0;
    public final boolean f42273g;
    public final long f42274g0;
    public final boolean h;
    public final String f42275h0;
    public final long f42276i;
    public final TLRPC.InputMedia f42277i0;
    public final long f42278j;
    public final r f42279j0;
    public final int f42280k;
    public final ArrayList f42281k0;
    public final int f42282l;
    public final int f42283m;
    public final int f42284n;
    public final MediaController.CropState f42285o;
    public final int f42286p;
    public final int f42287q;
    public final long f42288r;
    public final float[] f42289s;
    public final int f42290t;
    public final int f42291u;
    public final String v;
    public final ArrayList f42292w;
    public final ArrayList f42293x;
    public final String f42294y;
    public final String f42295z;

    public s0(u6 u6Var) {
        float[] fArr = new float[9];
        this.f42289s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f42293x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f42269d0 = 1.0f;
        this.f42270e0 = 1.0f;
        this.f42263a = u6Var.f42401b;
        this.f42265b = u6Var.d;
        File file = u6Var.O0;
        this.f42267c = file == null ? "" : file.toString();
        File file2 = u6Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = u6Var.K;
        File file3 = u6Var.L;
        this.f42271f = file3 == null ? "" : file3.toString();
        this.f42273g = u6Var.M;
        this.h = u6Var.Y;
        float f10 = u6Var.Z;
        long j10 = u6Var.f42415h0;
        this.f42276i = f10 * ((float) j10);
        this.f42278j = u6Var.f42399a0 * ((float) j10);
        this.f42280k = u6Var.Q;
        this.f42282l = u6Var.R;
        this.f42283m = u6Var.f42421k0;
        this.f42284n = u6Var.f42423l0;
        this.f42285o = u6Var.m0;
        this.f42286p = u6Var.f42417i0;
        this.f42287q = u6Var.f42419j0;
        this.f42288r = j10;
        u6Var.f42426n0.getValues(fArr);
        this.f42290t = u6Var.A0;
        this.f42291u = u6Var.B0;
        CharSequence[] charSequenceArr = {u6Var.C0};
        this.f42292w = u6Var.D0 ? MediaDataController.getInstance(u6Var.f42398a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(u6Var.F0);
        File file4 = u6Var.P0;
        this.f42294y = file4 == null ? "" : file4.toString();
        File file5 = u6Var.R0;
        this.f42295z = file5 == null ? "" : file5.toString();
        this.A = u6Var.S0;
        this.B = u6Var.T0;
        this.C = u6Var.U0;
        File file6 = u6Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = u6Var.f42400a1;
        this.F = u6Var.I0;
        this.M = u6Var.f42442w;
        this.N = u6Var.f42444x;
        this.O = u6Var.f42446y;
        this.P = u6Var.f42448z;
        this.Q = u6Var.A;
        this.R = u6Var.B;
        this.S = u6Var.C;
        this.T = u6Var.D;
        this.U = u6Var.E;
        this.V = u6Var.F;
        this.W = u6Var.G;
        File file7 = u6Var.f42428o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = u6Var.f42430p0;
        this.Z = u6Var.f42432q0;
        this.f42264a0 = u6Var.f42434r0;
        this.f42266b0 = u6Var.f42436s0;
        this.f42268c0 = u6Var.f42438t0;
        this.f42269d0 = u6Var.f42440u0;
        this.f42270e0 = u6Var.P;
        this.f42272f0 = u6Var.f42441v0;
        this.f42274g0 = u6Var.J0;
        this.f42275h0 = u6Var.K0;
        this.f42277i0 = u6Var.L0;
        this.f42279j0 = u6Var.S;
        this.f42281k0 = VideoEditedInfo.Part.toParts(u6Var);
    }

    public final u6 a() {
        u6 u6Var = new u6();
        u6Var.f42401b = this.f42263a;
        u6Var.f42404c = true;
        u6Var.d = this.f42265b;
        String str = this.f42267c;
        if (!TextUtils.isEmpty(str)) {
            u6Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            u6Var.N0 = new File(str2);
        }
        u6Var.K = this.e;
        String str3 = this.f42271f;
        if (str3 != null) {
            u6Var.L = new File(str3);
        }
        u6Var.M = this.f42273g;
        u6Var.Y = this.h;
        long j10 = this.f42288r;
        u6Var.f42415h0 = j10;
        if (j10 > 0) {
            u6Var.Z = ((float) this.f42276i) / ((float) j10);
            u6Var.f42399a0 = ((float) this.f42278j) / ((float) j10);
        } else {
            u6Var.Z = 0.0f;
            u6Var.f42399a0 = 1.0f;
        }
        u6Var.Q = this.f42280k;
        u6Var.R = this.f42282l;
        u6Var.f42421k0 = this.f42283m;
        u6Var.f42423l0 = this.f42284n;
        u6Var.m0 = this.f42285o;
        u6Var.f42417i0 = this.f42286p;
        u6Var.f42419j0 = this.f42287q;
        u6Var.f42426n0.setValues(this.f42289s);
        u6Var.A0 = this.f42290t;
        u6Var.B0 = this.f42291u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.j6.f20099o2 == null) {
                org.telegram.ui.ActionBar.j6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.j6.f20099o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f42292w, true, false, true, false);
            u6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f42292w, org.telegram.ui.ActionBar.j6.f20099o2.getFontMetricsInt());
        } else {
            u6Var.C0 = "";
        }
        ArrayList arrayList = u6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f42293x);
        String str5 = this.f42294y;
        if (str5 != null) {
            u6Var.P0 = new File(str5);
        }
        String str6 = this.f42295z;
        if (str6 != null) {
            u6Var.R0 = new File(str6);
        }
        u6Var.S0 = this.A;
        u6Var.T0 = this.B;
        u6Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            u6Var.Z0 = new File(str7);
        }
        u6Var.f42400a1 = this.E;
        u6Var.I0 = this.F;
        u6Var.f42413g = this.G;
        u6Var.f42411f = this.H;
        u6Var.e = this.I;
        u6Var.J = this.L;
        u6Var.I = this.K;
        u6Var.H = this.J;
        u6Var.f42442w = this.M;
        u6Var.f42444x = this.N;
        u6Var.f42446y = this.O;
        u6Var.f42448z = this.P;
        u6Var.A = this.Q;
        u6Var.B = this.R;
        u6Var.C = this.S;
        u6Var.D = this.T;
        u6Var.E = this.U;
        u6Var.F = this.V;
        u6Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            u6Var.f42428o0 = new File(str8);
        }
        u6Var.f42430p0 = this.Y;
        u6Var.f42432q0 = this.Z;
        u6Var.f42434r0 = this.f42264a0;
        u6Var.f42436s0 = this.f42266b0;
        u6Var.f42438t0 = this.f42268c0;
        u6Var.f42440u0 = this.f42269d0;
        u6Var.P = this.f42270e0;
        u6Var.f42441v0 = this.f42272f0;
        u6Var.J0 = this.f42274g0;
        u6Var.K0 = this.f42275h0;
        u6Var.L0 = this.f42277i0;
        u6Var.S = this.f42279j0;
        u6Var.T = VideoEditedInfo.Part.toStoryEntries(this.f42281k0);
        return u6Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f42265b);
        nativeByteBuffer.writeString(this.f42267c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f42271f);
        nativeByteBuffer.writeBool(this.f42273g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f42276i);
        nativeByteBuffer.writeInt64(this.f42278j);
        nativeByteBuffer.writeInt32(this.f42280k);
        nativeByteBuffer.writeInt32(this.f42282l);
        nativeByteBuffer.writeInt32(this.f42283m);
        nativeByteBuffer.writeInt32(this.f42284n);
        nativeByteBuffer.writeInt32(this.f42286p);
        nativeByteBuffer.writeInt32(this.f42287q);
        nativeByteBuffer.writeInt64(this.f42288r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f42289s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f42290t);
        nativeByteBuffer.writeInt32(this.f42291u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f42292w;
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
        ArrayList arrayList3 = this.f42293x;
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
        nativeByteBuffer.writeString(this.f42294y);
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
        nativeByteBuffer.writeString(this.f42295z);
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
        TLRPC.InputPeer inputPeer = this.f42272f0;
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
            nativeByteBuffer.writeInt64(this.f42264a0);
            nativeByteBuffer.writeFloat(this.f42266b0);
            nativeByteBuffer.writeFloat(this.f42268c0);
            nativeByteBuffer.writeFloat(this.f42269d0);
        }
        nativeByteBuffer.writeFloat(this.f42270e0);
        nativeByteBuffer.writeInt64(this.f42274g0);
        String str7 = this.f42275h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f42277i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f42279j0;
        if (rVar != null && rVar.e.size() > 1 && (arrayList = this.f42281k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f42230a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f42285o;
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
        this.f42289s = new float[9];
        this.f42293x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f42269d0 = 1.0f;
        this.f42270e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f42265b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f42267c = readString;
            if (readString != null && readString.length() == 0) {
                this.f42267c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f42271f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f42271f = null;
            }
            this.f42273g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f42276i = nativeByteBuffer.readInt64(true);
            this.f42278j = nativeByteBuffer.readInt64(true);
            this.f42280k = nativeByteBuffer.readInt32(true);
            this.f42282l = nativeByteBuffer.readInt32(true);
            this.f42283m = nativeByteBuffer.readInt32(true);
            this.f42284n = nativeByteBuffer.readInt32(true);
            this.f42286p = nativeByteBuffer.readInt32(true);
            this.f42287q = nativeByteBuffer.readInt32(true);
            this.f42288r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f42289s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f42290t = nativeByteBuffer.readInt32(true);
            this.f42291u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f42292w == null) {
                        this.f42292w = new ArrayList();
                    }
                    this.f42292w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f42293x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f42293x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f42294y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f42294y = null;
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
                                this.f42295z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f42295z = null;
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
                                this.f42272f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f42264a0 = nativeByteBuffer.readInt64(true);
                                this.f42266b0 = nativeByteBuffer.readFloat(true);
                                this.f42268c0 = nativeByteBuffer.readFloat(true);
                                this.f42269d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f42270e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f42274g0 = nativeByteBuffer.readInt64(true);
                                this.f42275h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f42277i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f42279j0 = new r(nativeByteBuffer.readString(true));
                                this.f42281k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f42279j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (q) this.f42279j0.e.get(i15);
                                    this.f42281k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f42285o = cropState;
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
