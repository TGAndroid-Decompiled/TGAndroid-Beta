package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t50 extends org.telegram.ui.Components.ak0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final v50 I;
    public final Context f41730c;
    public final zf.m1 f41731f;
    public Runnable h;
    public boolean f41732n;
    public int f41734s;
    public int f41735w;
    public int f41736x;
    public int f41737y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f41733r = new ArrayList();

    public t50(v50 v50Var, Context context) {
        TLRPC.Chat L0;
        String substring;
        String substring2;
        TLRPC.User Z1;
        this.I = v50Var;
        this.f41730c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.i5 contactsController = v50Var.getContactsController();
        boolean z10 = v50Var.Q;
        ArrayList arrayList = contactsController.f16065e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User Z12 = v50Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (Z12 != null && !Z12.self && !Z12.deleted) {
                this.f41733r.add(Z12);
                hashSet.add(Long.valueOf(Z12.f19942id));
            }
        }
        if (v50Var.P || v50Var.O || z10) {
            ArrayList arrayList2 = v50Var.getMessagesController().f18950y;
            if (z10) {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.o5.E(dialog.f19797id) && !hashSet.contains(Long.valueOf(dialog.f19797id)) && (Z1 = v50Var.getMessagesController().Z1(Long.valueOf(dialog.f19797id))) != null && !org.telegram.messenger.h20.x(Z1) && !org.telegram.messenger.h20.B(Z1) && !org.telegram.messenger.h20.t(Z1) && !org.telegram.messenger.h20.A(dialog.f19797id) && !org.telegram.messenger.vp.E2(Z1)) {
                        this.f41733r.add(Z1);
                        hashSet.add(Long.valueOf(Z1.f19942id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i12);
                    if (org.telegram.messenger.o5.z(dialog2.f19797id) && (L0 = v50Var.getMessagesController().L0(Long.valueOf(-dialog2.f19797id))) != null && L0.migrated_to == null && (!org.telegram.messenger.w3.T(L0) || L0.megagroup)) {
                        this.f41733r.add(L0);
                    }
                }
            }
            Collections.sort(this.f41733r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f41733r.size()) {
                TLObject tLObject2 = (TLObject) this.f41733r.get(i13);
                if (tLObject != null) {
                    String a2 = p50.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = p50.a(tLObject2);
                    if (TextUtils.isEmpty(a10)) {
                        substring2 = "";
                    } else {
                        substring2 = a10.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.f41733r;
                String a11 = p50.a(tLObject2);
                arrayList3.add(i13, new u50(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        zf.m1 m1Var = new zf.m1(false);
        this.f41731f = m1Var;
        m1Var.f55575a = new tt(this, 12);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).f22074a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 0) {
            v50 v50Var = this.I;
            if (v50Var.J != null) {
                View view = c1Var.f47898a;
                if (view instanceof org.telegram.ui.Cells.j4) {
                    Object object = ((org.telegram.ui.Cells.j4) view).getObject();
                    if ((object instanceof TLRPC.User) && v50Var.J.h(((TLRPC.User) object).f19942id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        String str;
        String str2;
        if (!this.f41732n && i10 >= this.E) {
            ArrayList arrayList = this.f41733r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof u50) {
                    return ((u50) tLObject).f42012a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.cd.Y == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.f14522g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f41731f.f(null, null);
        zf.m1 m1Var = this.f41731f;
        v50 v50Var = this.I;
        if (!v50Var.O && !v50Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        m1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.r5 r5Var = Utilities.f14522g;
            s50 s50Var = new s50(this, str, 0);
            this.h = s50Var;
            r5Var.d(s50Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i10;
        int i11;
        v50 v50Var = this.I;
        long j10 = v50Var.H;
        long j11 = v50Var.G;
        this.G = -1;
        this.f41734s = -1;
        this.f41736x = -1;
        this.f41735w = -1;
        this.f41737y = -1;
        this.D = -1;
        if (this.f41732n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f41731f;
            int size2 = m1Var.d.size();
            int size3 = m1Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (v50Var.Q) {
            this.f41736x = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (v50Var.V) {
            int i13 = i10 + 1;
            this.f41735w = i10;
            this.f41734s = i10;
            i10 += 2;
            this.f41737y = i13;
        } else if (v50Var.W) {
            int i14 = i10 + 1;
            this.f41735w = i10;
            this.f41734s = i10;
            i10 += 2;
            this.D = i14;
        } else {
            this.f41735w = i10;
        }
        this.E = i10;
        int size4 = this.f41733r.size() + i10;
        if (v50Var.R) {
            if (j11 != 0) {
                this.F = org.telegram.messenger.w3.y(3, v50Var.getMessagesController().L0(Long.valueOf(j11))) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat L0 = v50Var.getMessagesController().L0(Long.valueOf(j10));
                if (org.telegram.messenger.w3.y(3, L0) && !org.telegram.messenger.w3.t0(L0)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.F = i11;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override
    public final int d(int i10) {
        if (this.f41732n) {
            if (i10 == this.f41731f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f41736x) {
            if (i10 != this.f41734s) {
                if (i10 != this.f41737y && i10 != this.D) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f41733r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof u50)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void f() {
        super.f();
        this.I.v0();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String L0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String K;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        ArrayList arrayList = this.f41733r;
        v50 v50Var = this.I;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (i10 == this.f41736x) {
                        p8Var.o(2131231840, org.telegram.messenger.cd.L0(2131749494, null), false);
                        p8Var.g(org.telegram.ui.ActionBar.t6.f21259v6, org.telegram.ui.ActionBar.t6.f21242u6);
                        return;
                    } else if (this.F == 2) {
                        p8Var.o(2131232203, org.telegram.messenger.cd.L0(2131752402, null), false);
                        p8Var.g(org.telegram.ui.ActionBar.t6.f21095m6, org.telegram.ui.ActionBar.t6.G6);
                        return;
                    } else {
                        p8Var.o(2131232203, org.telegram.messenger.cd.L0(2131749120, null), false);
                        p8Var.g(org.telegram.ui.ActionBar.t6.f21095m6, org.telegram.ui.ActionBar.t6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (this.f41732n) {
                int size = this.d.size();
                zf.m1 m1Var = this.f41731f;
                ArrayList arrayList2 = m1Var.e;
                ArrayList arrayList3 = m1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) m1Var.e.get(((i10 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.w3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i10 < size) {
                        charSequence = (CharSequence) this.e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(K)) {
                        String str = m1Var.f55577c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) K);
                            int A1 = org.telegram.messenger.i0.A1(K, str);
                            if (A1 != -1) {
                                int length = str.length();
                                if (A1 == 0) {
                                    length++;
                                } else {
                                    A1++;
                                }
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), A1, length + A1, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = K;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i10 == this.f41737y) {
                j4Var.f22079r = true;
                j4Var.f22077f = "premium";
                j4Var.f22074a.setImageDrawable(org.telegram.ui.Cells.j4.b(j4Var.getContext(), false));
                j4Var.f22075b.l(org.telegram.messenger.cd.L0(2131746795, null), false);
                org.telegram.ui.ActionBar.u5 u5Var = j4Var.f22076c;
                int i12 = org.telegram.ui.ActionBar.t6.f21311y6;
                u5Var.setTag(Integer.valueOf(i12));
                if (j4Var.K) {
                    i12 = org.telegram.ui.ActionBar.t6.f20921ch;
                }
                org.telegram.ui.ActionBar.a7.Y(u5Var, i12, j4Var.M);
                u5Var.setEmojiColor(u5Var.getTextColor());
                u5Var.l(org.telegram.messenger.cd.L0(2131746793, null), false);
                if (v50Var.X == null) {
                    z11 = false;
                }
                j4Var.c(z11, false);
                return;
            } else if (i10 == this.D) {
                j4Var.f22080s = true;
                j4Var.f22077f = "miniapps";
                org.telegram.ui.Components.g9 g9Var = j4Var.f22074a;
                j4Var.getContext();
                g9Var.setImageDrawable(org.telegram.ui.Cells.j4.a(false));
                j4Var.f22075b.l(org.telegram.messenger.cd.L0(2131746821, null), false);
                org.telegram.ui.ActionBar.u5 u5Var2 = j4Var.f22076c;
                int i13 = org.telegram.ui.ActionBar.t6.f21311y6;
                u5Var2.setTag(Integer.valueOf(i13));
                if (j4Var.K) {
                    i13 = org.telegram.ui.ActionBar.t6.f20921ch;
                }
                org.telegram.ui.ActionBar.a7.Y(u5Var2, i13, j4Var.M);
                u5Var2.setEmojiColor(u5Var2.getTextColor());
                u5Var2.l(org.telegram.messenger.cd.L0(2131746820, null), false);
                if (v50Var.Y == null) {
                    z11 = false;
                }
                j4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            j4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f19942id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f19793id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = v50Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    j4Var.c(true, false);
                    j4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (v50Var.Z.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.c(z10, false);
                j4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (this.f41732n) {
            z3Var.setText(org.telegram.messenger.cd.L0(2131749544, null));
        } else if (i10 == this.f41734s) {
            z3Var.setText(org.telegram.messenger.cd.L0(2131746783, null));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof u50) {
                    z3Var.setText(((u50) tLObject2).f42012a.toUpperCase());
                }
            }
        }
        if (i10 == this.f41735w) {
            if (v50Var.X == null && v50Var.Z.i()) {
                L0 = "";
            } else {
                L0 = org.telegram.messenger.cd.L0(2131751458, null);
            }
            z3Var.a(L0, new f50(this, 1));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View z3Var;
        Context context = this.f41730c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    z3Var = new org.telegram.ui.Cells.p8(context);
                } else {
                    org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(context, null, 0, null, 1);
                    f60Var.setLayoutParams(new s4.o0(-1, -1));
                    f60Var.e.setVisibility(8);
                    f60Var.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
                    f60Var.setAnimateLayoutChange(true);
                    z3Var = f60Var;
                }
            } else {
                z3Var = new org.telegram.ui.Cells.j4(context, 1, 0, false);
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return new s4.c1(z3Var);
    }
}
