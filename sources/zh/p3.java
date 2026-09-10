package zh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ds;
public final class p3 extends ds {
    public final q3 f48773c;

    public p3(q3 q3Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f48773c = q3Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        q3 q3Var = this.f48773c;
        z3 z3Var = q3Var.f48815x;
        y3 y3Var = z3Var.E;
        if (y3Var != null && y3Var.f49094f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (z3Var.O.f48683a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z10) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, z3Var.f49143s);
        if (!z3Var.O.f48683a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f48740b;

            {
                this.f48740b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z3 z3Var2 = this.f48740b.f48773c.f48815x;
                        m3 m3Var = z3Var2.O;
                        if (!m3Var.f48683a) {
                            m3 m3Var2 = z3Var2.M;
                            if (m3Var2 != null) {
                                m3Var.f48683a = true;
                                m3Var2.f48683a = true;
                            } else {
                                m3Var.f48683a = true;
                            }
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            z3Var2.N.accept(z3Var2);
                        }
                        p3 p3Var = z3Var2.f49140f;
                        if (p3Var != null) {
                            p3Var.a();
                            return;
                        }
                        return;
                    default:
                        z3 z3Var3 = this.f48740b.f48773c.f48815x;
                        m3 m3Var3 = z3Var3.O;
                        if (m3Var3.f48683a) {
                            m3 m3Var4 = z3Var3.M;
                            if (m3Var4 != null) {
                                m3Var3.f48683a = false;
                                m3Var4.f48683a = false;
                            } else {
                                m3Var3.f48683a = false;
                            }
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            z3Var3.N.accept(z3Var3);
                        }
                        p3 p3Var2 = z3Var3.f49140f;
                        if (p3Var2 != null) {
                            p3Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!z3Var.O.f48683a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, z3Var.f49143s);
        if (z3Var.O.f48683a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f48740b;

            {
                this.f48740b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z3 z3Var2 = this.f48740b.f48773c.f48815x;
                        m3 m3Var = z3Var2.O;
                        if (!m3Var.f48683a) {
                            m3 m3Var2 = z3Var2.M;
                            if (m3Var2 != null) {
                                m3Var.f48683a = true;
                                m3Var2.f48683a = true;
                            } else {
                                m3Var.f48683a = true;
                            }
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            z3Var2.N.accept(z3Var2);
                        }
                        p3 p3Var = z3Var2.f49140f;
                        if (p3Var != null) {
                            p3Var.a();
                            return;
                        }
                        return;
                    default:
                        z3 z3Var3 = this.f48740b.f48773c.f48815x;
                        m3 m3Var3 = z3Var3.O;
                        if (m3Var3.f48683a) {
                            m3 m3Var4 = z3Var3.M;
                            if (m3Var4 != null) {
                                m3Var3.f48683a = false;
                                m3Var4.f48683a = false;
                            } else {
                                m3Var3.f48683a = false;
                            }
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            z3Var3.N.accept(z3Var3);
                        }
                        p3 p3Var2 = z3Var3.f49140f;
                        if (p3Var2 != null) {
                            p3Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(q3Var.getContext(), org.telegram.ui.ActionBar.j6.H8, z3Var.f49143s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, w7.a6.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = z3Var.f49143s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.a6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
