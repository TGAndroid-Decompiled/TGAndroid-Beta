package xg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kv0;
import ug.a0;
import ug.z;
import v4.f1;
import v4.q0;
import wg.r;
import wg.z0;
public final class h extends rg.b {
    public final i6 d;
    public final Context f60501e;
    public ck0 f60502f;
    public ArrayList f60503n;
    public boolean f60505s;
    public x3 f60506w;
    public final boolean f60507x;
    public boolean f60508y;
    public final HashMap f60504r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, i6 i6Var, boolean z10) {
        this.f60501e = context;
        this.f60507x = z10;
        this.d = i6Var;
        z zVar = new z(this, 8);
        tr a02 = tr.a0(j10.f24773t0);
        a02.f27054a.c(new r(0, a02, zVar));
    }

    @Override
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = mp.u1(j10.f24773t0).P0(chat.f28405id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f60504r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f28405id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f60503n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f60503n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f60503n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f60503n;
        if (arrayList != null && i7 >= 0) {
            return ((g) arrayList.get(i7)).f56589a;
        }
        return -1;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList = this.f60503n;
        if (arrayList != null && i7 >= 0) {
            g gVar = (g) arrayList.get(i7);
            int i12 = f1Var.f59126f;
            View view = f1Var.f59122a;
            int i13 = 8;
            boolean z12 = true;
            if (i12 == 3) {
                ah.r rVar = (ah.r) view;
                gVar.getClass();
                TLRPC.User user = gVar.f60489c;
                if (user != null) {
                    rVar.setUser(user);
                    String str = gVar.f60492g;
                    if (str != null) {
                        rVar.setSubtitle(str);
                        u6.X(rVar.f61213e, n6.f29654r5, this.d);
                    }
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(j10.i(j10.f24773t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(mp.u1(j10.f24773t0).c2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat O0 = mp.u1(j10.f24773t0).O0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(O0), O0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat O02 = mp.u1(j10.f24773t0).O0(Long.valueOf(inputPeer.channel_id));
                            rVar.h(F(O02), O02);
                        }
                    }
                }
                rVar.c(gVar.f60494j, false);
                rVar.i(false, 1.0f);
                int i14 = i7 + 1;
                if (i14 < this.f60503n.size() && ((g) this.f60503n.get(i14)).f56589a != i12) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                rVar.setDivider(z10);
                if (i14 < this.f60503n.size() && ((g) this.f60503n.get(i14)).f56589a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(gVar.f60497m);
                z0 z0Var = gVar.f60498n;
                z0 z0Var2 = gVar.f60499o;
                ImageView imageView = rVar.G;
                ImageView imageView2 = rVar.E;
                if (z0Var != null) {
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
                imageView2.setOnClickListener(z0Var);
                if (z0Var2 == null) {
                    z12 = false;
                }
                rVar.F = z12;
                if (z12 && rVar.H) {
                    i13 = 0;
                }
                imageView.setVisibility(i13);
                imageView.setOnClickListener(z0Var2);
                rVar.g(this.E, false);
            } else if (i12 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f60503n.size() - 1 || (i10 = i7 + 1) >= this.f60503n.size() - 1 || ((g) this.f60503n.get(i10)).f56589a == 7) {
                    z12 = false;
                }
                cVar.f1059w = gVar.f60490e;
                cVar.f();
                cVar.setDivider(z12);
                cVar.c(gVar.f60494j, false);
            } else if (i12 == -1) {
                int i15 = gVar.f60495k;
                if (i15 < 0) {
                    i15 = (int) (g0.f24121q.y * 0.3f);
                }
                view.setLayoutParams(new q0(-1, i15));
            } else if (i12 == 7) {
                ((ah.f) view).setLetter(gVar.f60491f);
            } else if (i12 == 5) {
                try {
                    ((kv0) view).f36894b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i12 == 8) {
                x3 x3Var = (x3) view;
                if (TextUtils.equals(x3Var.getText(), gVar.f60491f)) {
                    String str2 = gVar.f60492g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    x3Var.a(str2, gVar.f60496l);
                } else {
                    x3Var.setText(j6.p(gVar.f60491f, x3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(gVar.f60492g)) {
                        String str3 = gVar.f60492g;
                        a0 a0Var = gVar.f60496l;
                        w3 w3Var = x3Var.f32409b;
                        w3Var.c(str3, false, true);
                        w3Var.setOnClickListener(a0Var);
                        w3Var.setVisibility(0);
                    }
                }
                this.f60506w = x3Var;
            } else if (i12 == 9) {
                m8 m8Var = (m8) view;
                m8Var.g(n6.f29731v6, n6.f29712u6);
                m8Var.o(gVar.f60493i, gVar.f60491f, false);
            } else if (i12 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f60500p) {
                    g0.E2(gVar.f60500p);
                    frameLayout.addView(gVar.f60500p, ma.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        ah.r rVar;
        Context context = this.f60501e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new ah.r(this.f60501e, this.f60507x, this.f60508y, this.d, this.f60505s);
        } else {
            i6 i6Var = this.d;
            if (i7 == 5) {
                kv0 kv0Var = new kv0(context, null, 1, i6Var);
                kv0Var.d.setText(gd.M0(2131747975, null));
                kv0Var.f36896e.setText(gd.M0(2131745612, null));
                kv0Var.f36893a.setTranslationY(g0.L(24.0f));
                rVar = kv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, i6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, i6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    x3 x3Var = new x3(context, i6Var);
                    x3Var.setTag(-33024);
                    rVar = x3Var;
                    if (z10) {
                        x3Var.setBackground(null);
                        rVar = x3Var;
                    }
                } else if (i7 == 9) {
                    m8 m8Var = new m8(context, i6Var);
                    m8Var.f31084n = 16;
                    m8Var.f31088x = 19;
                    rVar = m8Var;
                } else if (i7 == 10) {
                    rVar = new FrameLayout(context);
                } else {
                    rVar = new View(context);
                }
            }
        }
        return new f1(rVar);
    }

    @Override
    public final void y(f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof ah.r) {
            ((ah.r) view).g(this.E, false);
        }
    }
}
