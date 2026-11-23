package xg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nv0;
import ug.z;
import v4.e1;
import v4.p0;
import wg.a1;
import wg.r;
import wg.y0;
public final class h extends rg.b {
    public final h6 d;
    public final Context f60512e;
    public ek0 f60513f;
    public ArrayList f60514n;
    public boolean f60516s;
    public y3 f60517w;
    public final boolean f60518x;
    public boolean f60519y;
    public final HashMap f60515r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, h6 h6Var, boolean z10) {
        this.f60512e = context;
        this.f60518x = z10;
        this.d = h6Var;
        z zVar = new z(this, 8);
        ur a02 = ur.a0(k10.f24932t0);
        a02.f27214a.c(new r(0, a02, zVar));
    }

    @Override
    public final boolean D(e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = np.u1(k10.f24932t0).P0(chat.f28398id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f60515r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28398id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f60514n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f60514n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f60514n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f60514n;
        if (arrayList != null && i7 >= 0) {
            return ((g) arrayList.get(i7)).f56599a;
        }
        return -1;
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.f60514n;
        if (arrayList != null && i7 >= 0) {
            g gVar = (g) arrayList.get(i7);
            int i12 = e1Var.f59115f;
            View view = e1Var.f59111a;
            int i13 = 8;
            boolean z12 = true;
            if (i12 == 3) {
                ah.r rVar = (ah.r) view;
                gVar.getClass();
                TLRPC.User user = gVar.f60500c;
                if (user != null) {
                    rVar.setUser(user);
                    String str = gVar.f60503g;
                    if (str != null) {
                        rVar.setSubtitle(str);
                        t6.X(rVar.f61224e, m6.f29605r5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(k10.i(k10.f24932t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(np.u1(k10.f24932t0).c2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat O0 = np.u1(k10.f24932t0).O0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(O0), O0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat O02 = np.u1(k10.f24932t0).O0(Long.valueOf(inputPeer.channel_id));
                            rVar.h(F(O02), O02);
                        }
                    }
                }
                rVar.c(gVar.f60505j, false);
                rVar.i(false, 1.0f);
                int i14 = i7 + 1;
                if (i14 < this.f60514n.size() && ((g) this.f60514n.get(i14)).f56599a != i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                rVar.setDivider(z10);
                if (i14 < this.f60514n.size() && ((g) this.f60514n.get(i14)).f56599a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(gVar.f60508m);
                a1 a1Var = gVar.f60509n;
                a1 a1Var2 = gVar.f60510o;
                ImageView imageView = rVar.G;
                ImageView imageView2 = rVar.E;
                if (a1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rVar.f1110y = z11;
                if (z11 && rVar.H) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(a1Var);
                if (a1Var2 == null) {
                    z12 = false;
                }
                rVar.F = z12;
                if (z12 && rVar.H) {
                    i13 = 0;
                }
                imageView.setVisibility(i13);
                imageView.setOnClickListener(a1Var2);
                rVar.g(this.E, false);
            } else if (i12 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f60514n.size() - 1 || (i10 = i7 + 1) >= this.f60514n.size() - 1 || ((g) this.f60514n.get(i10)).f56599a == 7) {
                    z12 = false;
                }
                cVar.f1059w = gVar.f60501e;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(gVar.f60505j, false);
            } else if (i12 == -1) {
                int i15 = gVar.f60506k;
                if (i15 < 0) {
                    i15 = (int) (g0.f24010q.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i15));
            } else if (i12 == 7) {
                ((ah.f) view).setLetter(gVar.f60502f);
            } else if (i12 == 5) {
                try {
                    ((nv0) view).f37960b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i12 == 8) {
                y3 y3Var = (y3) view;
                if (TextUtils.equals(y3Var.getText(), gVar.f60502f)) {
                    String str2 = gVar.f60503g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    y3Var.a(str2, gVar.f60507l);
                } else {
                    y3Var.setText(j6.p(gVar.f60502f, y3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(gVar.f60503g)) {
                        String str3 = gVar.f60503g;
                        y0 y0Var = gVar.f60507l;
                        x3 x3Var = y3Var.f32453b;
                        x3Var.c(str3, false, true);
                        x3Var.setOnClickListener(y0Var);
                        x3Var.setVisibility(0);
                    }
                }
                this.f60517w = y3Var;
            } else if (i12 == 9) {
                n8 n8Var = (n8) view;
                n8Var.g(m6.f29682v6, m6.f29663u6);
                n8Var.o(gVar.f60504i, gVar.f60502f, false);
            } else if (i12 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f60511p) {
                    g0.E2(gVar.f60511p);
                    frameLayout.addView(gVar.f60511p, na.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        ah.r rVar;
        Context context = this.f60512e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new ah.r(this.f60512e, this.f60518x, this.f60519y, this.d, this.f60516s);
        } else {
            h6 h6Var = this.d;
            if (i7 == 5) {
                nv0 nv0Var = new nv0(context, null, 1, h6Var);
                nv0Var.d.setText(hd.N0(2131747974, null));
                nv0Var.f37962e.setText(hd.N0(2131745611, null));
                nv0Var.f37959a.setTranslationY(g0.L(24.0f));
                rVar = nv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, h6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, h6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    y3 y3Var = new y3(context, h6Var);
                    y3Var.setTag(-33024);
                    rVar = y3Var;
                    if (z10) {
                        y3Var.setBackground(null);
                        rVar = y3Var;
                    }
                } else if (i7 == 9) {
                    n8 n8Var = new n8(context, h6Var);
                    n8Var.f31136n = 16;
                    n8Var.f31140x = 19;
                    rVar = n8Var;
                } else if (i7 == 10) {
                    rVar = new FrameLayout(context);
                } else {
                    rVar = new View(context);
                }
            }
        }
        return new e1(rVar);
    }

    @Override
    public final void y(e1 e1Var) {
        View view = e1Var.f59111a;
        if (view instanceof ah.r) {
            ((ah.r) view).g(this.E, false);
        }
    }
}
