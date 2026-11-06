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
public final class u40 extends org.telegram.ui.Components.vi0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final w40 I;
    public final Context f50212c;
    public final jg.z1 f50214f;
    public Runnable h;
    public boolean f50215n;
    public int f50217s;
    public int f50218w;
    public int f50219x;
    public int f50220y;
    public ArrayList d = new ArrayList();
    public ArrayList f50213e = new ArrayList();
    public final ArrayList f50216r = new ArrayList();

    public u40(w40 w40Var, Context context) {
        TLRPC.Chat M0;
        String substring;
        String substring2;
        TLRPC.User a22;
        this.I = w40Var;
        this.f50212c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = w40Var.getContactsController();
        boolean z9 = w40Var.Q;
        ArrayList arrayList = contactsController.f22589e0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User a23 = w40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.f50216r.add(a23);
                hashSet.add(Long.valueOf(a23.f27102id));
            }
        }
        if (w40Var.P || w40Var.O || z9) {
            ArrayList arrayList2 = w40Var.getMessagesController().f24937y;
            if (z9) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.f26957id) && !hashSet.contains(Long.valueOf(dialog.f26957id)) && (a22 = w40Var.getMessagesController().a2(Long.valueOf(dialog.f26957id))) != null && !org.telegram.messenger.t10.x(a22) && !org.telegram.messenger.t10.B(a22) && !org.telegram.messenger.t10.t(a22) && !org.telegram.messenger.t10.A(dialog.f26957id) && !org.telegram.messenger.qp.F2(a22)) {
                        this.f50216r.add(a22);
                        hashSet.add(Long.valueOf(a22.f27102id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.f26957id) && (M0 = w40Var.getMessagesController().M0(Long.valueOf(-dialog2.f26957id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.f50216r.add(M0);
                    }
                }
            }
            Collections.sort(this.f50216r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f50216r.size()) {
                TLObject tLObject2 = (TLObject) this.f50216r.get(i12);
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
                ArrayList arrayList3 = this.f50216r;
                String a12 = q40.a(tLObject2);
                arrayList3.add(i12, new v40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f50214f = z1Var;
        z1Var.f16989a = new wr(this, 13);
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f56951a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29259a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f != 0) {
            w40 w40Var = this.I;
            if (w40Var.J != null) {
                View view = d1Var.f56951a;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    Object object = ((org.telegram.ui.Cells.h4) view).getObject();
                    if ((object instanceof TLRPC.User) && w40Var.J.h(((TLRPC.User) object).f27102id) >= 0) {
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
        if (!this.f50215n && i7 >= this.E) {
            ArrayList arrayList = this.f50216r;
            int size = arrayList.size();
            int i10 = this.E;
            if (i7 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
                if (tLObject instanceof v40) {
                    return ((v40) tLObject).f50572a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.hd.f22879b0 == 1) {
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
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z9;
        if (this.h != null) {
            Utilities.f21335g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f50213e.clear();
        this.f50214f.f(null, null);
        jg.z1 z1Var = this.f50214f;
        w40 w40Var = this.I;
        if (!w40Var.O && !w40Var.P) {
            z9 = false;
        } else {
            z9 = true;
        }
        z1Var.g(null, true, z9, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21335g;
            t40 t40Var = new t40(this, str, 0);
            this.h = t40Var;
            p5Var.d(t40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i7;
        int i10;
        w40 w40Var = this.I;
        long j3 = w40Var.H;
        long j10 = w40Var.G;
        this.G = -1;
        this.f50217s = -1;
        this.f50219x = -1;
        this.f50218w = -1;
        this.f50220y = -1;
        this.D = -1;
        if (this.f50215n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f50214f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.f16992e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.H = i11;
            return i11;
        }
        if (w40Var.Q) {
            this.f50219x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (w40Var.V) {
            int i12 = i7 + 1;
            this.f50218w = i7;
            this.f50217s = i7;
            i7 += 2;
            this.f50220y = i12;
        } else if (w40Var.W) {
            int i13 = i7 + 1;
            this.f50218w = i7;
            this.f50217s = i7;
            i7 += 2;
            this.D = i13;
        } else {
            this.f50218w = i7;
        }
        this.E = i7;
        int size4 = this.f50216r.size() + i7;
        if (w40Var.R) {
            if (j10 != 0) {
                this.F = org.telegram.messenger.t3.y(3, w40Var.getMessagesController().M0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat M0 = w40Var.getMessagesController().M0(Long.valueOf(j3));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.F = i10;
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
    public final int d(int i7) {
        if (this.f50215n) {
            if (i7 == this.f50214f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i7 != this.f50219x) {
            if (i7 != this.f50217s) {
                if (i7 != this.f50220y && i7 != this.D) {
                    if (this.F != 0 && i7 == 0) {
                        return 2;
                    }
                    if (this.G == i7) {
                        return 3;
                    }
                    int i10 = i7 - this.E;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f50216r;
                        if (i10 < arrayList.size() && (arrayList.get(i7 - this.E) instanceof v40)) {
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
        this.I.w0();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z9;
        CharSequence charSequence;
        String K;
        int i10 = d1Var.f56955f;
        View view = d1Var.f56951a;
        ArrayList arrayList = this.f50216r;
        w40 w40Var = this.I;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i7 == this.f50219x) {
                        m8Var.o(2131231841, org.telegram.messenger.hd.M0(2131749484, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.k6.f28184v6, org.telegram.ui.ActionBar.k6.f28165u6);
                        return;
                    } else if (this.F == 2) {
                        m8Var.o(2131232204, org.telegram.messenger.hd.M0(2131752402, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.k6.f28014m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    } else {
                        m8Var.o(2131232204, org.telegram.messenger.hd.M0(2131749109, null), false);
                        m8Var.g(org.telegram.ui.ActionBar.k6.f28014m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (this.f50215n) {
                int size = this.d.size();
                jg.z1 z1Var = this.f50214f;
                ArrayList arrayList2 = z1Var.f16992e;
                ArrayList arrayList3 = z1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i7 >= 0 && i7 < size) {
                    tLObject = (TLObject) this.d.get(i7);
                } else if (i7 >= size && i7 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i7 - size);
                } else if (i7 > size + size3 && i7 <= size2 + size + size3) {
                    tLObject = (TLObject) z1Var.f16992e.get(((i7 - size) - size3) - 1);
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
                        charSequence = (CharSequence) this.f50213e.get(i7);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i7 > size && !TextUtils.isEmpty(K)) {
                        String str = z1Var.f16991c;
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
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.f28089q6, null), A1, length + A1, 33);
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
            } else if (i7 == this.f50220y) {
                h4Var.f29265r = true;
                h4Var.f29263f = "premium";
                h4Var.f29259a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.f29260b.l(org.telegram.messenger.hd.M0(2131746779, null), false);
                org.telegram.ui.ActionBar.k5 k5Var = h4Var.f29261c;
                int i11 = org.telegram.ui.ActionBar.k6.f28241y6;
                k5Var.setTag(Integer.valueOf(i11));
                if (h4Var.K) {
                    i11 = org.telegram.ui.ActionBar.k6.f27842ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var, i11, h4Var.M);
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(org.telegram.messenger.hd.M0(2131746777, null), false);
                if (w40Var.X == null) {
                    z10 = false;
                }
                h4Var.c(z10, false);
                return;
            } else if (i7 == this.D) {
                h4Var.f29266s = true;
                h4Var.f29263f = "miniapps";
                org.telegram.ui.Components.l9 l9Var = h4Var.f29259a;
                h4Var.getContext();
                l9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.f29260b.l(org.telegram.messenger.hd.M0(2131746805, null), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = h4Var.f29261c;
                int i12 = org.telegram.ui.ActionBar.k6.f28241y6;
                k5Var2.setTag(Integer.valueOf(i12));
                if (h4Var.K) {
                    i12 = org.telegram.ui.ActionBar.k6.f27842ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var2, i12, h4Var.M);
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(org.telegram.messenger.hd.M0(2131746804, null), false);
                if (w40Var.Y == null) {
                    z10 = false;
                }
                h4Var.c(z10, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i7 - this.E);
                spannableStringBuilder = null;
            }
            h4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j3 = ((TLRPC.User) tLObject).f27102id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f26953id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.h hVar = w40Var.J;
                if (hVar != null && hVar.h(j3) >= 0) {
                    h4Var.c(true, false);
                    h4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (w40Var.Z.h(j3) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                h4Var.c(z9, false);
                h4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (this.f50215n) {
            x3Var.setText(org.telegram.messenger.hd.M0(2131749534, null));
        } else if (i7 == this.f50217s) {
            x3Var.setText(org.telegram.messenger.hd.M0(2131746767, null));
        } else {
            int i13 = i7 - this.E;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.E);
                if (tLObject2 instanceof v40) {
                    x3Var.setText(((v40) tLObject2).f50572a.toUpperCase());
                }
            }
        }
        if (i7 == this.f50218w) {
            if (w40Var.X == null && w40Var.Z.i()) {
                M0 = "";
            } else {
                M0 = org.telegram.messenger.hd.M0(2131751458, null);
            }
            x3Var.a(M0, new g40(this, 1));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        Context context = this.f50212c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    x3Var = new org.telegram.ui.Cells.m8(context);
                } else {
                    org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, null, 0, null, 1);
                    p50Var.setLayoutParams(new v4.o0(-1, -1));
                    p50Var.f31925e.setVisibility(8);
                    p50Var.d.setText(org.telegram.messenger.hd.M0(2131748222, null));
                    p50Var.setAnimateLayoutChange(true);
                    x3Var = p50Var;
                }
            } else {
                x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return new v4.d1(x3Var);
    }
}
