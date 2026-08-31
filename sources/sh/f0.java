package sh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class f0 extends eb {
    public final g6 f47410a;
    public final d0 f47411b;
    public final e0 f47412c;
    public final TextView d;
    public final TextView f47413e;
    public g0 f47414f;
    public int h;

    public f0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.h = 0;
        this.f47410a = g6Var;
        d0 d0Var = new d0(AndroidUtilities.dp(10.0f));
        d0Var.f47380a.setColor(k6.v0(k6.Fi, g6Var));
        this.f47411b = d0Var;
        setBackground(d0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e0 e0Var = new e0(context, imageView);
        this.f47412c = e0Var;
        imageView.setImageDrawable(e0Var);
        addView(imageView, c6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = k6.Hi;
        textView.setTextColor(k6.v0(i10, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = yh.i(linearLayout, textView, c6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f47413e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(k6.v0(i10, g6Var));
        linearLayout.addView(i11, c6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((db) null);
                return;
            }
            g6 g6Var = this.f47410a;
            if (i10 == 1) {
                gc gcVar = new gc(getContext(), g6Var, true);
                gcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                gcVar.f27161a = new Runnable(this) {
                    public final f0 f47374b;

                    {
                        this.f47374b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f47374b;
                                ic bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f27745j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f47414f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f47374b;
                                ic bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f47414f;
                                if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                    File file2 = g0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    gcVar.f27163c = getBulletin();
                }
                setButton(gcVar);
            } else if (i10 == 2) {
                gc gcVar2 = new gc(getContext(), g6Var, true);
                gcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                gcVar2.f27161a = new Runnable(this) {
                    public final f0 f47374b;

                    {
                        this.f47374b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f47374b;
                                ic bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f27745j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f47414f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f47374b;
                                ic bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f47414f;
                                if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                    File file2 = g0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    gcVar2.f27163c = getBulletin();
                }
                setButton(gcVar2);
            }
        }
    }

    public final boolean c(g0 g0Var) {
        boolean z4;
        g0 g0Var2 = this.f47414f;
        e0 e0Var = this.f47412c;
        if (g0Var2 != g0Var) {
            z5 z5Var = e0Var.f47399k;
            e0Var.h = false;
            z5Var.getClass();
            z5Var.d(0.0f, true);
            ij0 ij0Var = e0Var.f47400l;
            if (ij0Var != null) {
                ij0Var.A(true);
                e0Var.f47400l = null;
            }
            z5 z5Var2 = e0Var.f47397i;
            e0Var.f47395f = false;
            z5Var2.getClass();
            z5Var2.d(0.0f, true);
        }
        this.f47414f = g0Var;
        this.d.setText(g0Var.f47429c);
        boolean c3 = g0Var.c();
        TextView textView = this.f47413e;
        if (c3) {
            Pair b10 = g0Var.b();
            e0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            e0Var.f47395f = z4;
            if (z4) {
                e0Var.f47396g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            e0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (g0Var.f47433i) {
            ic bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (g0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!e0Var.h) {
                    e0Var.h = true;
                    ij0 ij0Var2 = new ij0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                    e0Var.f47400l = ij0Var2;
                    ij0Var2.f27835s0 = e0Var.f47391a;
                    ij0Var2.H(true);
                    e0Var.f47400l.start();
                    e0Var.f47396g = 1.0f;
                }
                ic bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f27745j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
    }

    public void setArrow(int i10) {
        boolean z4;
        d0 d0Var = this.f47411b;
        d0Var.getClass();
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        d0Var.f47383e = z4;
        if (z4) {
            d0Var.f47384f = i10;
        }
        d0Var.invalidateSelf();
    }
}
