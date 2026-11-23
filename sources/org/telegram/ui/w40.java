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
public final class w40 extends org.telegram.ui.Components.kj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final y40 J;
    public final Context f53110c;
    public final jg.z1 f53112f;
    public Runnable h;
    public boolean f53113n;
    public int f53115s;
    public int f53116w;
    public int f53117x;
    public int f53118y;
    public ArrayList d = new ArrayList();
    public ArrayList f53111e = new ArrayList();
    public final ArrayList f53114r = new ArrayList();

    public w40(y40 y40Var, Context context) {
        TLRPC.Chat O0;
        String substring;
        String substring2;
        TLRPC.User c22;
        this.J = y40Var;
        this.f53110c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.i5 contactsController = y40Var.getContactsController();
        boolean z10 = y40Var.R;
        ArrayList arrayList = contactsController.f24693f0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User c23 = y40Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (c23 != null && !c23.self && !c23.deleted) {
                this.f53114r.add(c23);
                hashSet.add(Long.valueOf(c23.f28641id));
            }
        }
        if (y40Var.Q || y40Var.P || z10) {
            ArrayList arrayList2 = y40Var.getMessagesController().f25904y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.n5.E(dialog.f28496id) && !hashSet.contains(Long.valueOf(dialog.f28496id)) && (c22 = y40Var.getMessagesController().c2(Long.valueOf(dialog.f28496id))) != null && !org.telegram.messenger.n10.y(c22) && !org.telegram.messenger.n10.C(c22) && !org.telegram.messenger.n10.u(c22) && !org.telegram.messenger.n10.B(dialog.f28496id) && !org.telegram.messenger.mp.L2(c22)) {
                        this.f53114r.add(c22);
                        hashSet.add(Long.valueOf(c22.f28641id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.n5.z(dialog2.f28496id) && (O0 = y40Var.getMessagesController().O0(Long.valueOf(-dialog2.f28496id))) != null && O0.migrated_to == null && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) {
                        this.f53114r.add(O0);
                    }
                }
            }
            Collections.sort(this.f53114r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f53114r.size()) {
                TLObject tLObject2 = (TLObject) this.f53114r.get(i12);
                if (tLObject != null) {
                    String a10 = s40.a(tLObject);
                    if (TextUtils.isEmpty(a10)) {
                        substring = "";
                    } else {
                        substring = a10.substring(0, 1);
                    }
                    String a11 = s40.a(tLObject2);
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
                ArrayList arrayList3 = this.f53114r;
                String a12 = s40.a(tLObject2);
                arrayList3.add(i12, new x40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f53112f = z1Var;
        z1Var.f17823a = new zr(this, 13);
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.i4) {
            ((org.telegram.ui.Cells.i4) view).f30897a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f != 0) {
            y40 y40Var = this.J;
            if (y40Var.K != null) {
                View view = f1Var.f59245a;
                if (view instanceof org.telegram.ui.Cells.i4) {
                    Object object = ((org.telegram.ui.Cells.i4) view).getObject();
                    if ((object instanceof TLRPC.User) && y40Var.K.h(((TLRPC.User) object).f28641id) >= 0) {
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
        if (!this.f53113n && i7 >= this.F) {
            ArrayList arrayList = this.f53114r;
            int size = arrayList.size();
            int i10 = this.F;
            if (i7 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
                if (tLObject instanceof x40) {
                    return ((x40) tLObject).f53841a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.gd.f24315b0 == 1) {
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
    public final void G(org.telegram.ui.Components.ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.f22879g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f53111e.clear();
        this.f53112f.f(null, null);
        jg.z1 z1Var = this.f53112f;
        y40 y40Var = this.J;
        if (!y40Var.P && !y40Var.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        z1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.q5 q5Var = Utilities.f22879g;
            v40 v40Var = new v40(this, str, 0);
            this.h = v40Var;
            q5Var.d(v40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        y40 y40Var = this.J;
        long j3 = y40Var.I;
        long j10 = y40Var.H;
        this.H = -1;
        this.f53115s = -1;
        this.f53117x = -1;
        this.f53116w = -1;
        this.f53118y = -1;
        this.E = -1;
        if (this.f53113n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f53112f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.f17826e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.I = i11;
            return i11;
        }
        if (y40Var.R) {
            this.f53117x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (y40Var.W) {
            int i12 = i7 + 1;
            this.f53116w = i7;
            this.f53115s = i7;
            i7 += 2;
            this.f53118y = i12;
        } else if (y40Var.X) {
            int i13 = i7 + 1;
            this.f53116w = i7;
            this.f53115s = i7;
            i7 += 2;
            this.E = i13;
        } else {
            this.f53116w = i7;
        }
        this.F = i7;
        int size4 = this.f53114r.size() + i7;
        if (y40Var.S) {
            if (j10 != 0) {
                this.G = org.telegram.messenger.v3.y(3, y40Var.getMessagesController().O0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat O0 = y40Var.getMessagesController().O0(Long.valueOf(j3));
                if (org.telegram.messenger.v3.y(3, O0) && !org.telegram.messenger.v3.t0(O0)) {
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
        if (this.f53113n) {
            if (i7 == this.f53112f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i7 != this.f53117x) {
            if (i7 != this.f53115s) {
                if (i7 != this.f53118y && i7 != this.E) {
                    if (this.G != 0 && i7 == 0) {
                        return 2;
                    }
                    if (this.H == i7) {
                        return 3;
                    }
                    int i10 = i7 - this.F;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f53114r;
                        if (i10 < arrayList.size() && (arrayList.get(i7 - this.F) instanceof x40)) {
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
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String K;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        ArrayList arrayList = this.f53114r;
        y40 y40Var = this.J;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i7 == this.f53117x) {
                        m8Var.o(2131231845, org.telegram.messenger.gd.N0(2131749292, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                        return;
                    } else if (this.G == 2) {
                        m8Var.o(2131232209, org.telegram.messenger.gd.N0(2131752390, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.n6.f29616m6, org.telegram.ui.ActionBar.n6.G6);
                        return;
                    } else {
                        m8Var.o(2131232209, org.telegram.messenger.gd.N0(2131748917, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.n6.f29616m6, org.telegram.ui.ActionBar.n6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (this.f53113n) {
                int size = this.d.size();
                jg.z1 z1Var = this.f53112f;
                ArrayList arrayList2 = z1Var.f17826e;
                ArrayList arrayList3 = z1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i7 >= 0 && i7 < size) {
                    tLObject = (TLObject) this.d.get(i7);
                } else if (i7 >= size && i7 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i7 - size);
                } else if (i7 > size + size3 && i7 <= size2 + size + size3) {
                    tLObject = (TLObject) z1Var.f17826e.get(((i7 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.v3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i7 < size) {
                        charSequence = (CharSequence) this.f53111e.get(i7);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i7 > size && !TextUtils.isEmpty(K)) {
                        String str = z1Var.f17825c;
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
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.f29691q6, null), A1, length + A1, 33);
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
            } else if (i7 == this.f53118y) {
                i4Var.f30903r = true;
                i4Var.f30901f = "premium";
                i4Var.f30897a.setImageDrawable(org.telegram.ui.Cells.i4.b(i4Var.getContext(), false));
                i4Var.f30898b.l(org.telegram.messenger.gd.N0(2131746586, null), false);
                org.telegram.ui.ActionBar.n5 n5Var = i4Var.f30899c;
                int i11 = org.telegram.ui.ActionBar.n6.f29843y6;
                n5Var.setTag(Integer.valueOf(i11));
                if (i4Var.L) {
                    i11 = org.telegram.ui.ActionBar.n6.f29497fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var, i11, i4Var.N);
                n5Var.setEmojiColor(n5Var.getTextColor());
                n5Var.l(org.telegram.messenger.gd.N0(2131746584, null), false);
                if (y40Var.Y == null) {
                    z11 = false;
                }
                i4Var.c(z11, false);
                return;
            } else if (i7 == this.E) {
                i4Var.f30904s = true;
                i4Var.f30901f = "miniapps";
                org.telegram.ui.Components.p9 p9Var = i4Var.f30897a;
                i4Var.getContext();
                p9Var.setImageDrawable(org.telegram.ui.Cells.i4.a(false));
                i4Var.f30898b.l(org.telegram.messenger.gd.N0(2131746612, null), false);
                org.telegram.ui.ActionBar.n5 n5Var2 = i4Var.f30899c;
                int i12 = org.telegram.ui.ActionBar.n6.f29843y6;
                n5Var2.setTag(Integer.valueOf(i12));
                if (i4Var.L) {
                    i12 = org.telegram.ui.ActionBar.n6.f29497fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var2, i12, i4Var.N);
                n5Var2.setEmojiColor(n5Var2.getTextColor());
                n5Var2.l(org.telegram.messenger.gd.N0(2131746611, null), false);
                if (y40Var.Z == null) {
                    z11 = false;
                }
                i4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i7 - this.F);
                spannableStringBuilder = null;
            }
            i4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f28641id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f28492id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.h hVar = y40Var.K;
                if (hVar != null && hVar.h(j3) >= 0) {
                    i4Var.c(true, false);
                    i4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (y40Var.f54191a0.h(j3) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i4Var.c(z10, false);
                i4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        if (this.f53113n) {
            y3Var.setText(org.telegram.messenger.gd.N0(2131749359, null));
        } else if (i7 == this.f53115s) {
            y3Var.setText(org.telegram.messenger.gd.N0(2131746574, null));
        } else {
            int i13 = i7 - this.F;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.F);
                if (tLObject2 instanceof x40) {
                    y3Var.setText(((x40) tLObject2).f53841a.toUpperCase());
                }
            }
        }
        if (i7 == this.f53116w) {
            if (y40Var.Y == null && y40Var.f54191a0.i()) {
                N0 = "";
            } else {
                N0 = org.telegram.messenger.gd.N0(2131751445, null);
            }
            y3Var.a(N0, new i40(this, 1));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View y3Var;
        Context context = this.f53110c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    y3Var = new org.telegram.ui.Cells.m8(context);
                } else {
                    org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, null, 0, null, 1);
                    a60Var.setLayoutParams(new v4.q0(-1, -1));
                    a60Var.f37553e.setVisibility(8);
                    a60Var.d.setText(org.telegram.messenger.gd.N0(2131748030, null));
                    a60Var.setAnimateLayoutChange(true);
                    y3Var = a60Var;
                }
            } else {
                y3Var = new org.telegram.ui.Cells.i4(context, 1, 0, false);
            }
        } else {
            y3Var = new org.telegram.ui.Cells.y3(context, null);
        }
        return new v4.f1(y3Var);
    }
}
