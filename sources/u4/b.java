package u4;

import android.graphics.Bitmap;
import d5.g0;
import d5.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import m5.o;
import r4.c;
import r4.f;
import r4.g;

public final class b extends f {

    public final z f48393b;

    public final z f48394c;
    public final a d;

    public Inflater f48395e;

    public b() {
        super("PgsDecoder");
        this.f48393b = new z();
        this.f48394c = new z();
        this.d = new a();
    }

    @Override
    public final g c(int i10, boolean z10, byte[] bArr) {
        c cVar;
        int i11;
        int iR;
        int i12;
        int i13;
        int iT;
        z zVar = this.f48393b;
        zVar.A(i10, bArr);
        int i14 = 0;
        int i15 = 2;
        if (zVar.a() > 0 && (zVar.f4858a[zVar.f4859b] & 255) == 120) {
            if (this.f48395e == null) {
                this.f48395e = new Inflater();
            }
            Inflater inflater = this.f48395e;
            int i16 = g0.f4795a;
            if (zVar.a() > 0) {
                z zVar2 = this.f48394c;
                if (zVar2.f4858a.length < zVar.a()) {
                    zVar2.b(zVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(zVar.f4858a, zVar.f4859b, zVar.a());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr2 = zVar2.f4858a;
                        iInflate += inflater.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (!inflater.finished()) {
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                byte[] bArr3 = zVar2.f4858a;
                                if (iInflate == bArr3.length) {
                                    zVar2.b(bArr3.length * 2);
                                }
                            }
                            inflater.reset();
                            break;
                        }
                        zVar2.B(iInflate);
                        inflater.reset();
                        zVar.A(zVar2.f4860c, zVar2.f4858a);
                        break;
                    } catch (DataFormatException unused) {
                    } catch (Throwable th) {
                        inflater.reset();
                        throw th;
                    }
                }
            }
        }
        a aVar = this.d;
        aVar.d = 0;
        int[] iArr = aVar.f48387b;
        z zVar3 = aVar.f48386a;
        aVar.f48389e = 0;
        aVar.f48390f = 0;
        aVar.f48391g = 0;
        aVar.h = 0;
        aVar.f48392i = 0;
        zVar3.z(0);
        aVar.f48388c = false;
        ArrayList arrayList = new ArrayList();
        while (zVar.a() >= 3) {
            int i17 = zVar.f4860c;
            int iR2 = zVar.r();
            int iW = zVar.w();
            int i18 = zVar.f4859b + iW;
            if (i18 > i17) {
                zVar.C(i17);
                cVar = null;
            } else {
                if (iR2 != 128) {
                    switch (iR2) {
                        case 20:
                            if (iW % 5 == i15) {
                                zVar.D(i15);
                                Arrays.fill(iArr, i14);
                                int i19 = iW / 5;
                                for (int i20 = 0; i20 < i19; i20++) {
                                    int iR3 = zVar.r();
                                    double dR = zVar.r();
                                    double dR2 = zVar.r() - 128;
                                    double dR3 = zVar.r() - 128;
                                    iArr[iR3] = (g0.h((int) ((1.402d * dR2) + dR), 0, 255) << 16) | (zVar.r() << 24) | (g0.h((int) ((dR - (0.34414d * dR3)) - (dR2 * 0.71414d)), 0, 255) << 8) | g0.h((int) ((1.772d * dR3) + dR), 0, 255);
                                }
                                aVar.f48388c = true;
                            }
                            break;
                        case 21:
                            if (iW >= 4) {
                                zVar.D(3);
                                int i21 = iW - 4;
                                if (!((128 & zVar.r()) != 0)) {
                                    i12 = zVar3.f4859b;
                                    i13 = zVar3.f4860c;
                                    if (i12 < i13 && i21 > 0) {
                                        int iMin = Math.min(i21, i13 - i12);
                                        zVar.c(i12, iMin, zVar3.f4858a);
                                        zVar3.C(i12 + iMin);
                                    }
                                } else if (i21 >= 7 && (iT = zVar.t()) >= 4) {
                                    aVar.h = zVar.w();
                                    aVar.f48392i = zVar.w();
                                    zVar3.z(iT - 4);
                                    i21 = iW - 11;
                                    i12 = zVar3.f4859b;
                                    i13 = zVar3.f4860c;
                                    if (i12 < i13) {
                                        int iMin2 = Math.min(i21, i13 - i12);
                                        zVar.c(i12, iMin2, zVar3.f4858a);
                                        zVar3.C(i12 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iW >= 19) {
                                aVar.d = zVar.w();
                                aVar.f48389e = zVar.w();
                                zVar.D(11);
                                aVar.f48390f = zVar.w();
                                aVar.f48391g = zVar.w();
                            }
                            break;
                        default:
                            break;
                    }
                    cVar = null;
                } else {
                    if (aVar.d == 0 || aVar.f48389e == 0 || aVar.h == 0 || aVar.f48392i == 0 || (i11 = zVar3.f4860c) == 0 || zVar3.f4859b != i11 || !aVar.f48388c) {
                        cVar = null;
                    } else {
                        zVar3.C(0);
                        int i22 = aVar.h * aVar.f48392i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int iR4 = zVar3.r();
                            if (iR4 != 0) {
                                iR = i23 + 1;
                                iArr2[i23] = iArr[iR4];
                            } else {
                                int iR5 = zVar3.r();
                                if (iR5 != 0) {
                                    iR = ((iR5 & 64) == 0 ? iR5 & 63 : ((iR5 & 63) << 8) | zVar3.r()) + i23;
                                    Arrays.fill(iArr2, i23, iR, (iR5 & 128) == 0 ? 0 : iArr[zVar3.r()]);
                                }
                            }
                            i23 = iR;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f48392i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f48390f;
                        float f11 = aVar.d;
                        float f12 = f10 / f11;
                        float f13 = aVar.f48391g;
                        float f14 = aVar.f48389e;
                        cVar = new c(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f11, aVar.f48392i / f14, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    aVar.d = 0;
                    aVar.f48389e = 0;
                    aVar.f48390f = 0;
                    aVar.f48391g = 0;
                    aVar.h = 0;
                    aVar.f48392i = 0;
                    zVar3.z(0);
                    aVar.f48388c = false;
                }
                zVar.C(i18);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            i14 = 0;
            i15 = 2;
        }
        return new o(DesugarCollections.unmodifiableList(arrayList), 24);
    }
}
