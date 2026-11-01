package th;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o3 extends k.a {
    public final p3 f49290c;

    public o3(p3 p3Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f49290c = p3Var;
    }

    @Override
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.b.f(0.18f, -16777216, -1));
        p3 p3Var = this.f49290c;
        y3 y3Var = p3Var.f49381y;
        x3 x3Var = y3Var.E;
        if (x3Var != null && x3Var.f49632f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 2131231921;
        } else if (y3Var.O.f49181a) {
            i10 = 2131231916;
        } else {
            i10 = 2131231915;
        }
        int i14 = i10;
        if (z10) {
            i11 = 2131745307;
        } else {
            i11 = 2131745308;
        }
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, dd.L0(i11, null), false, y3Var.f49690s);
        if (!y3Var.O.f49181a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f49269b;

            {
                this.f49269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y3 y3Var2 = this.f49269b.f49290c.f49381y;
                        l3 l3Var = y3Var2.O;
                        if (!l3Var.f49181a) {
                            l3 l3Var2 = y3Var2.M;
                            if (l3Var2 != null) {
                                l3Var.f49181a = true;
                                l3Var2.f49181a = true;
                            } else {
                                l3Var.f49181a = true;
                            }
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            y3Var2.N.a(y3Var2);
                        }
                        o3 o3Var = y3Var2.f49687f;
                        if (o3Var != null) {
                            o3Var.a();
                            return;
                        }
                        return;
                    default:
                        y3 y3Var3 = this.f49269b.f49290c.f49381y;
                        l3 l3Var3 = y3Var3.O;
                        if (l3Var3.f49181a) {
                            l3 l3Var4 = y3Var3.M;
                            if (l3Var4 != null) {
                                l3Var3.f49181a = false;
                                l3Var4.f49181a = false;
                            } else {
                                l3Var3.f49181a = false;
                            }
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            y3Var3.N.a(y3Var3);
                        }
                        o3 o3Var2 = y3Var3.f49687f;
                        if (o3Var2 != null) {
                            o3Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!y3Var.O.f49181a) {
            i12 = 2131231919;
        } else {
            i12 = 2131231918;
        }
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, dd.L0(2131745306, null), false, y3Var.f49690s);
        if (y3Var.O.f49181a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f49269b;

            {
                this.f49269b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y3 y3Var2 = this.f49269b.f49290c.f49381y;
                        l3 l3Var = y3Var2.O;
                        if (!l3Var.f49181a) {
                            l3 l3Var2 = y3Var2.M;
                            if (l3Var2 != null) {
                                l3Var.f49181a = true;
                                l3Var2.f49181a = true;
                            } else {
                                l3Var.f49181a = true;
                            }
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            y3Var2.N.a(y3Var2);
                        }
                        o3 o3Var = y3Var2.f49687f;
                        if (o3Var != null) {
                            o3Var.a();
                            return;
                        }
                        return;
                    default:
                        y3 y3Var3 = this.f49269b.f49290c.f49381y;
                        l3 l3Var3 = y3Var3.O;
                        if (l3Var3.f49181a) {
                            l3 l3Var4 = y3Var3.M;
                            if (l3Var4 != null) {
                                l3Var3.f49181a = false;
                                l3Var4.f49181a = false;
                            } else {
                                l3Var3.f49181a = false;
                            }
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            y3Var3.N.a(y3Var3);
                        }
                        o3 o3Var2 = y3Var3.f49687f;
                        if (o3Var2 != null) {
                            o3Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View h1Var = new org.telegram.ui.ActionBar.h1(org.telegram.ui.ActionBar.t6.H8, p3Var.getContext(), y3Var.f49690s);
        h1Var.setTag(2131296437, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(h1Var, w7.b6.o(-1, 8));
        if (z10) {
            i13 = 2131744528;
        } else {
            i13 = 2131744471;
        }
        String L0 = dd.L0(i13, null);
        b bVar = y3Var.f49690s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, bVar);
        textView.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        textView.setText(L0);
        textView.setTag(2131296437, 1);
        textView.setMaxWidth(org.telegram.messenger.i0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.b6.o(-1, -2));
    }

    @Override
    public final void k() {
    }
}
