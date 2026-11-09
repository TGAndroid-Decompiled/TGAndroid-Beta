package xg;

import ah.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import di.e4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.wo;
import v4.d1;
import v4.o0;
import wg.a1;
import wg.z0;
public final class i extends rg.b {
    public final g6 d;
    public final Context f58754e;
    public qj0 f58755f;
    public ArrayList f58756n;
    public boolean f58758s;
    public x3 f58759w;
    public final boolean f58760x;
    public boolean f58761y;
    public final HashMap f58757r = new HashMap();
    public boolean D = true;
    public final boolean h = true;

    public i(Context context, g6 g6Var, boolean z9) {
        this.f58754e = context;
        this.f58760x = z9;
        this.d = g6Var;
        a aVar = new a(this, 2);
        yr a02 = yr.a0(p10.f24470s0);
        a02.f26719a.c(new u9.f(18, a02, aVar));
    }

    @Override
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 6 && i7 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.f24470s0).N0(chat.f26956id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
            return i7;
        }
        HashMap hashMap = this.f58757r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f26956id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f58756n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f58756n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f58756n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.f58756n;
        if (arrayList != null && i7 >= 0) {
            return ((h) arrayList.get(i7)).f54544a;
        }
        return -1;
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        ArrayList arrayList = this.f58756n;
        if (arrayList != null && i7 >= 0) {
            h hVar = (h) arrayList.get(i7);
            int i13 = d1Var.f57060f;
            View view = d1Var.f57056a;
            int i14 = 8;
            boolean z11 = true;
            if (i13 == 3) {
                r rVar = (r) view;
                Drawable drawable = hVar.f58753r;
                if (drawable != null) {
                    CharSequence charSequence = hVar.f58743g;
                    CharSequence charSequence2 = hVar.h;
                    rVar.f1112x.setVisibility(8);
                    rVar.H = null;
                    rVar.I = null;
                    l9 l9Var = rVar.f59443c;
                    l9Var.setRoundRadius(g0.L(20.0f));
                    l9Var.setImageDrawable(drawable);
                    e4 e4Var = rVar.d;
                    e4Var.k(charSequence);
                    boolean[] zArr = rVar.f1110s;
                    zArr[0] = false;
                    rVar.setSubtitle(charSequence2);
                    l5 l5Var = rVar.f59444e;
                    if (zArr[0]) {
                        i12 = l6.f28046n5;
                    } else {
                        i12 = l6.f28123r5;
                    }
                    s6.X(l5Var, i12, rVar.f59441a);
                    wo woVar = rVar.f1111w;
                    if (woVar != null) {
                        woVar.setAlpha(1.0f);
                    }
                    e4Var.i(null);
                } else {
                    TLRPC.User user = hVar.f58740c;
                    if (user != null) {
                        rVar.setUser(user);
                        CharSequence charSequence3 = hVar.h;
                        if (charSequence3 != null) {
                            rVar.setSubtitle(charSequence3);
                            s6.X(rVar.f59444e, l6.f28123r5, this.d);
                        }
                    } else {
                        TLRPC.Chat chat = hVar.f58741e;
                        if (chat != null) {
                            rVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = hVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    rVar.setUser(p10.i(p10.f24470s0).f());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    rVar.setUser(qp.s1(p10.f24470s0).a2(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(inputPeer.chat_id));
                                    rVar.h(F(M0), M0);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat M02 = qp.s1(p10.f24470s0).M0(Long.valueOf(inputPeer.channel_id));
                                    rVar.h(F(M02), M02);
                                }
                            }
                        }
                    }
                }
                rVar.c(hVar.f58746k, false);
                rVar.i(false, 1.0f);
                int i15 = i7 + 1;
                if (i15 < this.f58756n.size() && ((h) this.f58756n.get(i15)).f54544a != i13) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                rVar.setDivider(z9);
                if (i15 < this.f58756n.size() && ((h) this.f58756n.get(i15)).f54544a == 7) {
                    rVar.setDivider(false);
                }
                rVar.setOptions(hVar.f58749n);
                a1 a1Var = hVar.f58750o;
                a1 a1Var2 = hVar.f58751p;
                ImageView imageView = rVar.F;
                ImageView imageView2 = rVar.D;
                if (a1Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rVar.f1113y = z10;
                if (z10 && rVar.G) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(a1Var);
                if (a1Var2 == null) {
                    z11 = false;
                }
                rVar.E = z11;
                if (z11 && rVar.G) {
                    i14 = 0;
                }
                imageView.setVisibility(i14);
                imageView.setOnClickListener(a1Var2);
                rVar.g(this.D, false);
            } else if (i13 == 6) {
                ah.c cVar = (ah.c) view;
                if (i7 >= this.f58756n.size() - 1 || (i10 = i7 + 1) >= this.f58756n.size() - 1 || ((h) this.f58756n.get(i10)).f54544a == 7) {
                    z11 = false;
                }
                cVar.f1062w = hVar.f58742f;
                cVar.f();
                cVar.setDivider(z11);
                cVar.c(hVar.f58746k, false);
            } else if (i13 == -1) {
                int i16 = hVar.f58747l;
                if (i16 < 0) {
                    i16 = (int) (g0.f22563q.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i16));
            } else if (i13 == 7) {
                ((ah.f) view).setLetter(hVar.f58743g);
            } else if (i13 == 5) {
                try {
                    ((cv0) view).f32766b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i13 == 8) {
                x3 x3Var = (x3) view;
                if (TextUtils.equals(x3Var.getText(), hVar.f58743g)) {
                    CharSequence charSequence4 = hVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    x3Var.a(charSequence4, hVar.f58748m);
                } else {
                    x3Var.setText(i6.p(hVar.f58743g, x3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(hVar.h)) {
                        CharSequence charSequence5 = hVar.h;
                        z0 z0Var = hVar.f58748m;
                        w3 w3Var = x3Var.f30881b;
                        w3Var.c(charSequence5, false, true);
                        w3Var.setOnClickListener(z0Var);
                        w3Var.setVisibility(0);
                    }
                }
                this.f58759w = x3Var;
            } else if (i13 == 9) {
                m8 m8Var = (m8) view;
                m8Var.g(l6.f28200v6, l6.f28181u6);
                m8Var.o(hVar.f58745j, hVar.f58743g, false);
            } else if (i13 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != hVar.f58752q) {
                    g0.E2(hVar.f58752q);
                    frameLayout.addView(hVar.f58752q, ha.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        r rVar;
        Context context = this.f58754e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.f58754e, this.f58760x, this.f58761y, this.d, this.f58758s);
        } else {
            g6 g6Var = this.d;
            if (i7 == 5) {
                cv0 cv0Var = new cv0(context, null, 1, g6Var);
                cv0Var.d.setText(id.M0(2131748167, null));
                cv0Var.f32768e.setText(id.M0(2131745807, null));
                cv0Var.f32765a.setTranslationY(g0.L(24.0f));
                rVar = cv0Var;
            } else {
                boolean z9 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, g6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z9) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, g6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z9) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    x3 x3Var = new x3(context, g6Var);
                    x3Var.setTag(-33024);
                    rVar = x3Var;
                    if (z9) {
                        x3Var.setBackground(null);
                        rVar = x3Var;
                    }
                } else if (i7 == 9) {
                    m8 m8Var = new m8(context, g6Var);
                    m8Var.f29576n = 16;
                    m8Var.f29580x = 19;
                    rVar = m8Var;
                } else if (i7 == 10) {
                    rVar = new FrameLayout(context);
                } else {
                    rVar = new View(context);
                }
            }
        }
        return new d1(rVar);
    }

    @Override
    public final void y(d1 d1Var) {
        View view = d1Var.f57056a;
        if (view instanceof r) {
            ((r) view).g(this.D, false);
        }
    }
}
