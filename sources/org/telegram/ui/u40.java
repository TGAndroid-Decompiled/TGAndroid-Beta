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
public final class u40 extends org.telegram.ui.Components.aj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final w40 J;
    public final Context f51734c;
    public final jg.z1 f51736f;
    public Runnable h;
    public boolean f51737n;
    public int f51739s;
    public int f51740w;
    public int f51741x;
    public int f51742y;
    public ArrayList d = new ArrayList();
    public ArrayList f51735e = new ArrayList();
    public final ArrayList f51738r = new ArrayList();

    public u40(w40 w40Var, Context context) {
        TLRPC.Chat M0;
        String substring;
        String substring2;
        TLRPC.User a22;
        this.J = w40Var;
        this.f51734c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = w40Var.getContactsController();
        boolean z10 = w40Var.R;
        ArrayList arrayList = contactsController.f23681f0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User a23 = w40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.f51738r.add(a23);
                hashSet.add(Long.valueOf(a23.f28200id));
            }
        }
        if (w40Var.Q || w40Var.P || z10) {
            ArrayList arrayList2 = w40Var.getMessagesController().f25443y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.f28055id) && !hashSet.contains(Long.valueOf(dialog.f28055id)) && (a22 = w40Var.getMessagesController().a2(Long.valueOf(dialog.f28055id))) != null && !org.telegram.messenger.q10.x(a22) && !org.telegram.messenger.q10.B(a22) && !org.telegram.messenger.q10.t(a22) && !org.telegram.messenger.q10.A(dialog.f28055id) && !org.telegram.messenger.np.F2(a22)) {
                        this.f51738r.add(a22);
                        hashSet.add(Long.valueOf(a22.f28200id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.f28055id) && (M0 = w40Var.getMessagesController().M0(Long.valueOf(-dialog2.f28055id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.f51738r.add(M0);
                    }
                }
            }
            Collections.sort(this.f51738r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f51738r.size()) {
                TLObject tLObject2 = (TLObject) this.f51738r.get(i12);
                if (tLObject != null) {
                    String a10 = q40.a(tLObject);
                    if (TextUtils.isEmpty(a10)) {
                        substring = "";
                    } else {
                        substring = a10.substring(0, 1);
                    }
                    String a11 = q40.a(tLObject2);
                    if (TextUtils.isEmpty(a11)) {
                        substring2 = "";
                    } else {
                        substring2 = a11.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.f51738r;
                String a12 = q40.a(tLObject2);
                arrayList3.add(i12, new v40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f51736f = z1Var;
        z1Var.f17344a = new zr(this, 13);
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f30385a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f != 0) {
            w40 w40Var = this.J;
            if (w40Var.K != null) {
                View view = e1Var.f58535a;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    Object object = ((org.telegram.ui.Cells.h4) view).getObject();
                    if ((object instanceof TLRPC.User) && w40Var.K.h(((TLRPC.User) object).f28200id) >= 0) {
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
    public final String F(int i7) {
        String str;
        String str2;
        if (!this.f51737n && i7 >= this.F) {
            ArrayList arrayList = this.f51738r;
            int size = arrayList.size();
            int i10 = this.F;
            if (i7 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
                if (tLObject instanceof v40) {
                    return ((v40) tLObject).f52113a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.hd.f24105b0 == 1) {
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
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.f22418g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f51735e.clear();
        this.f51736f.f(null, null);
        jg.z1 z1Var = this.f51736f;
        w40 w40Var = this.J;
        if (!w40Var.P && !w40Var.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        z1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f22418g;
            t40 t40Var = new t40(this, str, 0);
            this.h = t40Var;
            p5Var.d(t40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        w40 w40Var = this.J;
        long j3 = w40Var.I;
        long j10 = w40Var.H;
        this.H = -1;
        this.f51739s = -1;
        this.f51741x = -1;
        this.f51740w = -1;
        this.f51742y = -1;
        this.E = -1;
        if (this.f51737n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f51736f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.f17347e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.I = i11;
            return i11;
        }
        if (w40Var.R) {
            this.f51741x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (w40Var.W) {
            int i12 = i7 + 1;
            this.f51740w = i7;
            this.f51739s = i7;
            i7 += 2;
            this.f51742y = i12;
        } else if (w40Var.X) {
            int i13 = i7 + 1;
            this.f51740w = i7;
            this.f51739s = i7;
            i7 += 2;
            this.E = i13;
        } else {
            this.f51740w = i7;
        }
        this.F = i7;
        int size4 = this.f51738r.size() + i7;
        if (w40Var.S) {
            if (j10 != 0) {
                this.G = org.telegram.messenger.t3.y(3, w40Var.getMessagesController().M0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat M0 = w40Var.getMessagesController().M0(Long.valueOf(j3));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.G = i10;
            } else {
                this.G = 0;
            }
            if (this.G != 0) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override
    public final int d(int i7) {
        if (this.f51737n) {
            if (i7 == this.f51736f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i7 != this.f51741x) {
            if (i7 != this.f51739s) {
                if (i7 != this.f51742y && i7 != this.E) {
                    if (this.G != 0 && i7 == 0) {
                        return 2;
                    }
                    if (this.H == i7) {
                        return 3;
                    }
                    int i10 = i7 - this.F;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f51738r;
                        if (i10 < arrayList.size() && (arrayList.get(i7 - this.F) instanceof v40)) {
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
        this.J.w0();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String K;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        ArrayList arrayList = this.f51738r;
        w40 w40Var = this.J;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i7 == this.f51741x) {
                        l8Var.o(2131231841, org.telegram.messenger.hd.M0(2131749485, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                        return;
                    } else if (this.G == 2) {
                        l8Var.o(2131232205, org.telegram.messenger.hd.M0(2131752402, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.j6.f29014m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    } else {
                        l8Var.o(2131232205, org.telegram.messenger.hd.M0(2131749110, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.j6.f29014m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (this.f51737n) {
                int size = this.d.size();
                jg.z1 z1Var = this.f51736f;
                ArrayList arrayList2 = z1Var.f17347e;
                ArrayList arrayList3 = z1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i7 >= 0 && i7 < size) {
                    tLObject = (TLObject) this.d.get(i7);
                } else if (i7 >= size && i7 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i7 - size);
                } else if (i7 > size + size3 && i7 <= size2 + size + size3) {
                    tLObject = (TLObject) z1Var.f17347e.get(((i7 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i7 < size) {
                        charSequence = (CharSequence) this.f51735e.get(i7);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i7 > size && !TextUtils.isEmpty(K)) {
                        String str = z1Var.f17346c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) K);
                            int A1 = org.telegram.messenger.g0.A1(K, str);
                            if (A1 != -1) {
                                int length = str.length();
                                if (A1 == 0) {
                                    length++;
                                } else {
                                    A1++;
                                }
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.f29089q6, null), A1, length + A1, 33);
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
            } else if (i7 == this.f51742y) {
                h4Var.f30391r = true;
                h4Var.f30389f = "premium";
                h4Var.f30385a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.f30386b.l(org.telegram.messenger.hd.M0(2131746780, null), false);
                org.telegram.ui.ActionBar.j5 j5Var = h4Var.f30387c;
                int i11 = org.telegram.ui.ActionBar.j6.f29241y6;
                j5Var.setTag(Integer.valueOf(i11));
                if (h4Var.L) {
                    i11 = org.telegram.ui.ActionBar.j6.f28895fh;
                }
                org.telegram.ui.ActionBar.q6.X(j5Var, i11, h4Var.N);
                j5Var.setEmojiColor(j5Var.getTextColor());
                j5Var.l(org.telegram.messenger.hd.M0(2131746778, null), false);
                if (w40Var.Y == null) {
                    z11 = false;
                }
                h4Var.c(z11, false);
                return;
            } else if (i7 == this.E) {
                h4Var.f30392s = true;
                h4Var.f30389f = "miniapps";
                org.telegram.ui.Components.i9 i9Var = h4Var.f30385a;
                h4Var.getContext();
                i9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.f30386b.l(org.telegram.messenger.hd.M0(2131746806, null), false);
                org.telegram.ui.ActionBar.j5 j5Var2 = h4Var.f30387c;
                int i12 = org.telegram.ui.ActionBar.j6.f29241y6;
                j5Var2.setTag(Integer.valueOf(i12));
                if (h4Var.L) {
                    i12 = org.telegram.ui.ActionBar.j6.f28895fh;
                }
                org.telegram.ui.ActionBar.q6.X(j5Var2, i12, h4Var.N);
                j5Var2.setEmojiColor(j5Var2.getTextColor());
                j5Var2.l(org.telegram.messenger.hd.M0(2131746805, null), false);
                if (w40Var.Z == null) {
                    z11 = false;
                }
                h4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i7 - this.F);
                spannableStringBuilder = null;
            }
            h4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f28200id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f28051id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.h hVar = w40Var.K;
                if (hVar != null && hVar.h(j3) >= 0) {
                    h4Var.c(true, false);
                    h4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (w40Var.f52402a0.h(j3) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.c(z10, false);
                h4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (this.f51737n) {
            x3Var.setText(org.telegram.messenger.hd.M0(2131749535, null));
        } else if (i7 == this.f51739s) {
            x3Var.setText(org.telegram.messenger.hd.M0(2131746768, null));
        } else {
            int i13 = i7 - this.F;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.F);
                if (tLObject2 instanceof v40) {
                    x3Var.setText(((v40) tLObject2).f52113a.toUpperCase());
                }
            }
        }
        if (i7 == this.f51740w) {
            if (w40Var.Y == null && w40Var.f52402a0.i()) {
                M0 = "";
            } else {
                M0 = org.telegram.messenger.hd.M0(2131751457, null);
            }
            x3Var.a(M0, new g40(this, 1));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        Context context = this.f51734c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    x3Var = new org.telegram.ui.Cells.l8(context);
                } else {
                    org.telegram.ui.Components.s50 s50Var = new org.telegram.ui.Components.s50(context, null, 0, null, 1);
                    s50Var.setLayoutParams(new v4.p0(-1, -1));
                    s50Var.f33709e.setVisibility(8);
                    s50Var.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
                    s50Var.setAnimateLayoutChange(true);
                    x3Var = s50Var;
                }
            } else {
                x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return new v4.e1(x3Var);
    }
}
