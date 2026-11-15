package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ja;
import fi.w3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.sc1;
public final class g extends c implements z5 {
    public int E;
    public final ImageView f60665s;
    public f f60666w;
    public TLRPC.Chat f60667x;
    public boolean f60668y;

    public g(Context context, e6 e6Var) {
        super(context, e6Var);
        int i7;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f60665s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = j6.x0(null, j6.Mi, false);
        this.E = x02;
        imageView.setBackground(j6.h0(x02, 1, -1));
        imageView.setImageResource(2131232562);
        q6.s(imageView, j6.f29014m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(hd.M0(2131751598, null));
        boolean z10 = hd.f24101a0;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i10 = i7 | 17;
        if (z10) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, ja.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
        w3 w3Var = this.d;
        if (hd.f24101a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        w3Var.setPadding(g0.L(f12), 0, g0.L(hd.f24101a0 ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z10, int i10) {
        String str;
        int i11;
        String M0;
        String str2;
        this.f60668y = z10;
        this.f60667x = chat;
        t8 t8Var = this.f60644b;
        t8Var.q(chat);
        int L = g0.L(20.0f);
        i9 i9Var = this.f60645c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str3 = chat.title;
        w3 w3Var = this.d;
        w3Var.k(org.telegram.messenger.j6.m(str3, w3Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = hd.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i11 = 2131751390;
                } else {
                    i11 = 2131754876;
                }
                M0 = hd.M0(i11, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(hd.G(i7, str, new Object[0]));
        }
        q6.X(this.f60646e, j6.f29107r5, this.f60643a);
        setDivider(true);
        ImageView imageView = this.f60665s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new sc1(10, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f60667x;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f60665s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f60666w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = j6.x0(null, j6.Mi, false);
            ImageView imageView = this.f60665s;
            if (imageView != null && x02 != this.E) {
                this.E = x02;
                j6.H1(imageView.getBackground(), x02, true);
                imageView.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
