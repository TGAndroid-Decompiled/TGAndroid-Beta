package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class tk implements org.telegram.ui.Components.si {
    public final bn f52346a;

    public tk(bn bnVar) {
        this.f52346a = bnVar;
    }

    @Override
    public final void K0() {
        this.f52346a.f45950a0.U();
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Components.gh ghVar) {
        this.f52346a.y8(ghVar);
    }

    @Override
    public final boolean g0() {
        return this.f52346a.sa();
    }

    @Override
    public final void h1(TLRPC.User user) {
        String o4 = org.telegram.messenger.p10.o(user);
        bn bnVar = this.f52346a;
        if (bnVar.f45950a0 != null && user != null && !TextUtils.isEmpty(o4)) {
            rj rjVar = bnVar.f45950a0;
            rjVar.setFieldText("@" + o4 + " ");
            bnVar.f45950a0.i1();
        }
    }

    @Override
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var;
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
        bn bnVar = this.f52346a;
        if (bnVar.getParentActivity() != null && (n2Var = bnVar.Y1) != null) {
            boolean z19 = n2Var.B1;
            org.telegram.messenger.gj gjVar = n2Var.F3;
            bnVar.H5 = gjVar;
            if (gjVar != null && (message = gjVar.f24213k) != null) {
                message.invert_media = z12;
            }
            if (i7 != 8 && i7 != 7 && (i7 != 4 || n2Var.f40378e2.getSelectedPhotos().isEmpty())) {
                fi.n2 n2Var2 = bnVar.Y1;
                if (n2Var2 != null) {
                    n2Var2.M(i7);
                }
                bnVar.cb(i7);
                return;
            }
            fi.n2 n2Var3 = bnVar.Y1;
            if (n2Var3 != null && i7 != 8) {
                n2Var3.a(true);
            }
            HashMap<Object, Object> selectedPhotos = bnVar.Y1.f40378e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = bnVar.Y1.f40378e2.getSelectedPhotosOrder();
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
                            obj.f28406b = ffVar.h;
                            boolean d = ffVar.d();
                            obj.f28418p = d;
                            boolean z20 = ffVar.f28059b;
                            if (z19 && d) {
                                obj.f28418p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = ffVar.h) != null) {
                                obj.f28407c = str2;
                                if (!z19 && ffVar.c()) {
                                    obj.f28426y = ffVar.clone();
                                }
                            } else {
                                String str3 = ffVar.I;
                                if (str3 != null) {
                                    obj.f28407c = str3;
                                }
                            }
                            obj.f28408e = ffVar.f28060c;
                            obj.f28409f = ffVar.f28063g;
                            obj.f28410g = ffVar.f28061e;
                            obj.f28417o = z20;
                            obj.f28419q = ffVar.j();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f28427z = ffVar.f28068m;
                            obj.A = ffVar.P;
                            CharSequence charSequence = ffVar.f28058a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f28411i = ffVar.f28069n;
                            obj.f28412j = ffVar.f28073r;
                            obj.h = ffVar.f28078x;
                            obj.f28413k = ffVar.f28074s;
                            obj.f28420r = ffVar.L;
                            obj.f28422t = org.telegram.messenger.az.h(ffVar.f28058a);
                            obj.f28423u = ffVar.M;
                            obj.f28424w = ffVar.N;
                            if (!z17 && ffVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f28425x = z18;
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
                        bnVar.D8(((org.telegram.messenger.zy) arrayList2.get(0)).d, ((org.telegram.messenger.zy) arrayList2.get(0)).f28411i);
                        z14 = ((org.telegram.messenger.zy) arrayList2.get(0)).f28422t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.gj gjVar2 = bnVar.H5;
                    if (gjVar2 != null && gjVar2.p5()) {
                        org.telegram.messenger.lj ljVar = bnVar.f46268y5;
                        if (ljVar == null) {
                            ljVar = org.telegram.messenger.lj.b(bnVar.H5.f24213k.suggested_post);
                        }
                        org.telegram.messenger.lj ljVar2 = ljVar;
                        org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                        int i18 = ceil;
                        long j11 = bnVar.f46103l6;
                        org.telegram.messenger.gj gjVar3 = bnVar.H5;
                        int i19 = i14;
                        org.telegram.messenger.gj gjVar4 = bnVar.f46114m4;
                        rm rmVar = bnVar.D5;
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
                        org.telegram.messenger.az.X(accountInstance, arrayList, j11, gjVar3, gjVar4, null, rmVar, z16, z10, null, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), ljVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = bnVar.getAccountInstance();
                        long j12 = bnVar.f46103l6;
                        org.telegram.messenger.gj gjVar5 = bnVar.F5;
                        org.telegram.messenger.gj gjVar6 = bnVar.f46114m4;
                        rm rmVar2 = bnVar.D5;
                        if (i7 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.az.X(accountInstance2, arrayList2, j12, gjVar5, gjVar6, null, rmVar2, z15, z10, bnVar.H5, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), bnVar.f46268y5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                bnVar.L6();
                bnVar.f45950a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (bnVar.f46050h4 == -1) {
                    bnVar.f46050h4 = 0;
                }
                bnVar.f46050h4 += hashMap.size();
                bnVar.md(true);
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
