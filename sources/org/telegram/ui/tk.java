package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class tk implements org.telegram.ui.Components.ri {
    public final bn f52420a;

    public tk(bn bnVar) {
        this.f52420a = bnVar;
    }

    @Override
    public final void B0() {
        this.f52420a.f46118a0.U();
    }

    @Override
    public final void S(org.telegram.ui.Components.fh fhVar) {
        this.f52420a.y8(fhVar);
    }

    @Override
    public final boolean T() {
        return this.f52420a.sa();
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final void h1(TLRPC.User user) {
        String o4 = org.telegram.messenger.n10.o(user);
        bn bnVar = this.f52420a;
        if (bnVar.f46118a0 != null && user != null && !TextUtils.isEmpty(o4)) {
            rj rjVar = bnVar.f46118a0;
            rjVar.setFieldText("@" + o4 + " ");
            bnVar.f46118a0.j1();
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
        bn bnVar = this.f52420a;
        if (bnVar.getParentActivity() != null && (n2Var = bnVar.Y1) != null) {
            boolean z19 = n2Var.B1;
            org.telegram.messenger.fj fjVar = n2Var.F3;
            bnVar.H5 = fjVar;
            if (fjVar != null && (message = fjVar.f24073k) != null) {
                message.invert_media = z12;
            }
            if (i7 != 8 && i7 != 7 && (i7 != 4 || n2Var.f39967e2.getSelectedPhotos().isEmpty())) {
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
            HashMap<Object, Object> selectedPhotos = bnVar.Y1.f39967e2.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = bnVar.Y1.f39967e2.getSelectedPhotosOrder();
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
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i17));
                            ?? obj = new Object();
                            obj.f28310b = efVar.h;
                            boolean d = efVar.d();
                            obj.f28322p = d;
                            boolean z20 = efVar.f27963b;
                            if (z19 && d) {
                                obj.f28322p = false;
                                z20 = false;
                            }
                            if (!z20 && (str2 = efVar.h) != null) {
                                obj.f28311c = str2;
                                if (!z19 && efVar.c()) {
                                    obj.f28330y = efVar.clone();
                                }
                            } else {
                                String str3 = efVar.I;
                                if (str3 != null) {
                                    obj.f28311c = str3;
                                }
                            }
                            obj.f28312e = efVar.f27964c;
                            obj.f28313f = efVar.f27967g;
                            obj.f28314g = efVar.f27965e;
                            obj.f28321o = z20;
                            obj.f28323q = efVar.j();
                            hashMap2 = selectedPhotos;
                            z17 = z19;
                            obj.f28331z = efVar.f27972m;
                            obj.A = efVar.P;
                            CharSequence charSequence = efVar.f27962a;
                            if (charSequence != null) {
                                str = charSequence.toString();
                            } else {
                                str = null;
                            }
                            obj.d = str;
                            obj.f28315i = efVar.f27973n;
                            obj.f28316j = efVar.f27977r;
                            obj.h = efVar.f27982x;
                            obj.f28317k = efVar.f27978s;
                            obj.f28324r = efVar.L;
                            obj.f28326t = org.telegram.messenger.zy.h(efVar.f27962a);
                            obj.f28327u = efVar.M;
                            obj.f28328w = efVar.N;
                            if (!z17 && efVar.c()) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            obj.f28329x = z18;
                            arrayList2.add(obj);
                            efVar.e();
                        }
                        i16++;
                        z19 = z17;
                        selectedPhotos = hashMap2;
                    }
                    HashMap<Object, Object> hashMap3 = selectedPhotos;
                    boolean z21 = z19;
                    if (i14 == 0) {
                        bnVar.D8(((org.telegram.messenger.yy) arrayList2.get(0)).d, ((org.telegram.messenger.yy) arrayList2.get(0)).f28315i);
                        z14 = ((org.telegram.messenger.yy) arrayList2.get(0)).f28326t;
                    } else {
                        z14 = false;
                    }
                    org.telegram.messenger.fj fjVar2 = bnVar.H5;
                    if (fjVar2 != null && fjVar2.p5()) {
                        org.telegram.messenger.kj kjVar = bnVar.f46436y5;
                        if (kjVar == null) {
                            kjVar = org.telegram.messenger.kj.b(bnVar.H5.f24073k.suggested_post);
                        }
                        org.telegram.messenger.kj kjVar2 = kjVar;
                        org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                        int i18 = ceil;
                        long j11 = bnVar.f46271l6;
                        org.telegram.messenger.fj fjVar3 = bnVar.H5;
                        int i19 = i14;
                        org.telegram.messenger.fj fjVar4 = bnVar.f46282m4;
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
                        org.telegram.messenger.zy.X(accountInstance, arrayList, j11, fjVar3, fjVar4, null, rmVar, z16, z10, null, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), kjVar2, null, false);
                    } else {
                        i12 = ceil;
                        i13 = i14;
                        c10 = 4;
                        org.telegram.messenger.c accountInstance2 = bnVar.getAccountInstance();
                        long j12 = bnVar.f46271l6;
                        org.telegram.messenger.fj fjVar5 = bnVar.F5;
                        org.telegram.messenger.fj fjVar6 = bnVar.f46282m4;
                        rm rmVar2 = bnVar.D5;
                        if (i7 != 4 && !z13) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        org.telegram.messenger.zy.X(accountInstance2, arrayList2, j12, fjVar5, fjVar6, null, rmVar2, z15, z10, bnVar.H5, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), bnVar.f46436y5, null, false);
                    }
                    i14 = i13 + 1;
                    ceil = i12;
                    selectedPhotos = hashMap3;
                    z19 = z21;
                }
                hashMap = selectedPhotos;
                bnVar.L6();
                bnVar.f46118a0.setFieldText("");
            } else {
                hashMap = selectedPhotos;
            }
            if (i10 != 0) {
                if (bnVar.f46218h4 == -1) {
                    bnVar.f46218h4 = 0;
                }
                bnVar.f46218h4 += hashMap.size();
                bnVar.md(true);
            }
        }
    }

    @Override
    public final void O0(Object obj) {
    }

    @Override
    public final void l0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
