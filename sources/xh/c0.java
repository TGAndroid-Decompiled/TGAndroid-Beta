package xh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import w7.b6;
public final class c0 extends ta {
    public final p6 f53731a;
    public final a0 f53732b;
    public final b0 f53733c;
    public final TextView d;
    public final TextView e;
    public e0 f53734f;
    public int h;

    public c0(Context context, p6 p6Var) {
        super(context, p6Var);
        this.h = 0;
        this.f53731a = p6Var;
        a0 a0Var = new a0(org.telegram.messenger.i0.L(10.0f));
        a0Var.f53697a.setColor(t6.w0(t6.tj, p6Var));
        this.f53732b = a0Var;
        setBackground(a0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        b0 b0Var = new b0(context, imageView);
        this.f53733c = b0Var;
        imageView.setImageDrawable(b0Var);
        addView(imageView, b6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = t6.vj;
        a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView f7 = a30.f(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f7;
        f7.setTextSize(1, 13.0f);
        a7.V(f7, i10, p6Var);
        linearLayout.addView(f7, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((sa) null);
                return;
            }
            p6 p6Var = this.f53731a;
            if (i10 == 1) {
                ub ubVar = new ub(getContext(), p6Var, true);
                ubVar.e(dd.L0(2131753074, null));
                ubVar.f30924b = new Runnable(this) {
                    public final c0 f54137b;

                    {
                        this.f54137b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                c0 c0Var = this.f54137b;
                                wb bulletin = c0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32201j = 2750;
                                    bulletin.i(true);
                                }
                                e0 e0Var = c0Var.f53734f;
                                if (e0Var != null) {
                                    e0Var.a();
                                    return;
                                }
                                return;
                            default:
                                c0 c0Var2 = this.f54137b;
                                wb bulletin2 = c0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                e0 e0Var2 = c0Var2.f53734f;
                                if (e0Var2 != null && (file = e0Var2.d) != null && file.exists()) {
                                    File file2 = e0Var2.d;
                                    org.telegram.messenger.i0.t2(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ubVar.d = getBulletin();
                }
                setButton(ubVar);
            } else if (i10 == 2) {
                ub ubVar2 = new ub(getContext(), p6Var, true);
                ubVar2.e(dd.L0(2131753073, null));
                ubVar2.f30924b = new Runnable(this) {
                    public final c0 f54137b;

                    {
                        this.f54137b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                c0 c0Var = this.f54137b;
                                wb bulletin = c0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f32201j = 2750;
                                    bulletin.i(true);
                                }
                                e0 e0Var = c0Var.f53734f;
                                if (e0Var != null) {
                                    e0Var.a();
                                    return;
                                }
                                return;
                            default:
                                c0 c0Var2 = this.f54137b;
                                wb bulletin2 = c0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                e0 e0Var2 = c0Var2.f53734f;
                                if (e0Var2 != null && (file = e0Var2.d) != null && file.exists()) {
                                    File file2 = e0Var2.d;
                                    org.telegram.messenger.i0.t2(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ubVar2.d = getBulletin();
                }
                setButton(ubVar2);
            }
        }
    }

    public final boolean c(e0 e0Var) {
        boolean z10;
        e0 e0Var2 = this.f53734f;
        b0 b0Var = this.f53733c;
        if (e0Var2 != e0Var) {
            t5 t5Var = b0Var.f53721k;
            b0Var.h = false;
            t5Var.getClass();
            t5Var.e(true, 0.0f);
            ci0 ci0Var = b0Var.f53722l;
            if (ci0Var != null) {
                ci0Var.C(true);
                b0Var.f53722l = null;
            }
            t5 t5Var2 = b0Var.f53719i;
            b0Var.f53717f = false;
            t5Var2.getClass();
            t5Var2.e(true, 0.0f);
        }
        this.f53734f = e0Var;
        this.d.setText(e0Var.f53751c);
        boolean c10 = e0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = e0Var.b();
            b0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0Var.f53717f = z10;
            if (z10) {
                b0Var.f53718g = Utilities.i(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            b0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(dd.L0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.i0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.i0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        } else if (e0Var.f53754i) {
            wb bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (e0Var.h) {
                textView.setText(dd.L0(2131753072, null));
                setButton(2);
                if (!b0Var.h) {
                    b0Var.h = true;
                    ci0 ci0Var2 = new ci0(2131623989, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
                    b0Var.f53722l = ci0Var2;
                    ci0Var2.R(b0Var.f53714a);
                    b0Var.f53722l.J(true);
                    b0Var.f53722l.start();
                    b0Var.f53718g = 1.0f;
                }
                wb bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f32201j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(68.0f), 1073741824));
    }

    public void setArrow(int i10) {
        boolean z10;
        a0 a0Var = this.f53732b;
        a0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a0Var.e = z10;
        if (z10) {
            a0Var.f53700f = i10;
        }
        a0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        a0 a0Var = this.f53732b;
        if (a0Var != null) {
            try {
                a0Var.f53697a.setColor(t6.w0(t6.tj, this.f53731a));
                a0Var.invalidateSelf();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
