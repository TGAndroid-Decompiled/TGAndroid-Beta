package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class sk implements org.telegram.ui.Components.ii {
    public final an f51238a;

    public sk(an anVar) {
        this.f51238a = anVar;
    }

    @Override
    public final void K0() {
        this.f51238a.f45118a0.S();
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void d0(org.telegram.ui.Components.vg vgVar) {
        this.f51238a.y8(vgVar);
    }

    @Override
    public final boolean g0() {
        return this.f51238a.sa();
    }

    @Override
    public final void h1(TLRPC.User user) {
        String n10 = org.telegram.messenger.q10.n(user);
        an anVar = this.f51238a;
        if (anVar.f45118a0 != null && user != null && !TextUtils.isEmpty(n10)) {
            qj qjVar = anVar.f45118a0;
            qjVar.setFieldText("@" + n10 + " ");
            anVar.f45118a0.W0();
        }
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.p2 p2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        char c10;
        boolean z15;
        char c11;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        boolean z18;
        String str2;
        TLRPC.Message message;
        an anVar = this.f51238a;
        if (anVar.getParentActivity() != null && (p2Var = anVar.Y1) != null) {
            boolean z19 = p2Var.B1;
            org.telegram.messenger.gj gjVar = p2Var.F3;
            anVar.G5 = gjVar;
            if (gjVar != null && (message = gjVar.f23817k) != null) {
                message.invert_media = z12;
            }
            if (i7 != 8 && i7 != 7 && (i7 != 4 || p2Var.f36447e2.getSelectedPhotos().isEmpty())) {
                fi.p2 p2Var2 = anVar.Y1;
                if (p2Var2 != null) {
                    p2Var2.M(i7);
                }
                anVar.cb(i7);
                return;
            }
            fi.p2 p2Var3 = anVar.Y1;
            if (p2Var3 != null && i7 != 8) {
                p2Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = anVar.Y1.f36447e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = anVar.Y1.f36447e2.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                int i14 = 0;
                while (i14 < ceil) {
                    int i15 = i14 * 10;
                    int min = Math.min(10, selectedPhotos.size() - i15);
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (i16 < min) {
                        int i17 = i15 + i16;
                        if (i17 >= selectedPhotosOrder.size()) {
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                        } else {
                            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            obj.f23188b = ffVar.h;
                            boolean d = ffVar.d();
                            obj.f23200p = d;
                            boolean z20 = ffVar.f27708b;
                            if (z19 && d) {
                                obj.f23200p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = ffVar.h) != null) {
                                obj.f23189c = str2;
                                if (!z19 && ffVar.c()) {
                                    obj.f23208y = ffVar.clone();
                                }
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f23189c = str3;
                                }
                            }
                            obj.f23190e = ffVar.f27709c;
                            obj.f23191f = ffVar.f27712g;
                            obj.f23192g = ffVar.f27710e;
                            obj.f23199o = z20;
                            obj.f23201q = ffVar.j();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f23209z = ffVar.f27717m;
                            obj.A = ffVar.P;
                            CharSequence charSequence = ffVar.f27707a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f23193i = ffVar.f27718n;
                            obj.f23194j = ffVar.f27722r;
                            obj.h = ffVar.f27727x;
                            obj.f23195k = ffVar.f27723s;
                            obj.f23202r = ffVar.L;
                            obj.f23204t = org.telegram.messenger.ez.h(ffVar.f27707a);
                            obj.f23205u = ffVar.M;
                            obj.f23206w = ffVar.N;
                            if (!z17 && ffVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f23207x = z18;
                            arrayList2.add(obj);
                            ffVar.e();
                        }
                        i16++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i14 == 0) {
                        anVar.D8(((org.telegram.messenger.dz) arrayList2.get(0)).d, ((org.telegram.messenger.dz) arrayList2.get(0)).f23193i);
                        z14 = ((org.telegram.messenger.dz) arrayList2.get(0)).f23204t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.gj gjVar2 = anVar.G5;
                    if (gjVar2 != null && gjVar2.p5()) {
                        org.telegram.messenger.lj ljVar = anVar.f45422x5;
                        if (ljVar == null) {
                            ljVar = org.telegram.messenger.lj.b(anVar.G5.f23817k.suggested_post);
                        }
                        org.telegram.messenger.lj ljVar2 = ljVar;
                        org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                        int i18 = ceil;
                        long j11 = anVar.f45259k6;
                        org.telegram.messenger.gj gjVar3 = anVar.G5;
                        int i19 = i14;
                        org.telegram.messenger.gj gjVar4 = anVar.f45281m4;
                        qm qmVar = anVar.C5;
                        if (i7 != 4 && !z13) {
                            c11 = 4;
                            arrayList = arrayList2;
                            z16 = false;
                        } else {
                            c11 = 4;
                            arrayList = arrayList2;
                            z16 = true;
                        }
                        i13 = i19;
                        i12 = i18;
                        c10 = c11;
                        org.telegram.messenger.ez.X(accountInstance, arrayList, j11, gjVar3, gjVar4, null, qmVar, z16, z10, null, null, z11, i10, i11, z14, null, anVar.Y8(), j3, z12, j10, anVar.j9(), ljVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = anVar.getAccountInstance();
                        long j12 = anVar.f45259k6;
                        org.telegram.messenger.gj gjVar5 = anVar.E5;
                        org.telegram.messenger.gj gjVar6 = anVar.f45281m4;
                        qm qmVar2 = anVar.C5;
                        if (i7 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.ez.X(accountInstance2, arrayList2, j12, gjVar5, gjVar6, null, qmVar2, z15, z10, anVar.G5, null, z11, i10, i11, z14, null, anVar.Y8(), j3, z12, j10, anVar.j9(), anVar.f45422x5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                anVar.L6();
                anVar.f45118a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (anVar.f45218h4 == -1) {
                    anVar.f45218h4 = 0;
                }
                anVar.f45218h4 += hashMap.size();
                anVar.md(true);
            }
        }
    }

    @Override
    public final void R0(Object obj) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
