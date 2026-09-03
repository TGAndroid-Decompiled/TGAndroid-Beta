package rh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
public final class f0 extends eb {
    public final f6 f43574a;
    public final d0 f43575b;
    public final e0 f43576c;
    public final TextView d;
    public final TextView e;
    public g0 f43577f;
    public int h;

    public f0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.f43574a = f6Var;
        d0 d0Var = new d0(AndroidUtilities.dp(10.0f));
        d0Var.f43548a.setColor(j6.v0(j6.Fi, f6Var));
        this.f43575b = d0Var;
        setBackground(d0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e0 e0Var = new e0(context, imageView);
        this.f43576c = e0Var;
        imageView.setImageDrawable(e0Var);
        addView(imageView, b6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.Hi;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = ai.i(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(i11, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((db) null);
                return;
            }
            f6 f6Var = this.f43574a;
            if (i10 == 1) {
                gc gcVar = new gc(getContext(), f6Var, true);
                gcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                gcVar.f25112a = new Runnable(this) {
                    public final f0 f43542b;

                    {
                        this.f43542b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f43542b;
                                ic bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f25671j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f43577f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f43542b;
                                ic bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f43577f;
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
                    gcVar.f25114c = getBulletin();
                }
                setButton(gcVar);
            } else if (i10 == 2) {
                gc gcVar2 = new gc(getContext(), f6Var, true);
                gcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                gcVar2.f25112a = new Runnable(this) {
                    public final f0 f43542b;

                    {
                        this.f43542b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                f0 f0Var = this.f43542b;
                                ic bulletin = f0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f25671j = 2750;
                                    bulletin.i(true);
                                }
                                g0 g0Var = f0Var.f43577f;
                                if (g0Var != null) {
                                    g0Var.a();
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var2 = this.f43542b;
                                ic bulletin2 = f0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                g0 g0Var2 = f0Var2.f43577f;
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
                    gcVar2.f25114c = getBulletin();
                }
                setButton(gcVar2);
            }
        }
    }

    public final boolean c(g0 g0Var) {
        boolean z4;
        g0 g0Var2 = this.f43577f;
        e0 e0Var = this.f43576c;
        if (g0Var2 != g0Var) {
            z5 z5Var = e0Var.f43564k;
            e0Var.h = false;
            z5Var.getClass();
            z5Var.d(0.0f, true);
            gj0 gj0Var = e0Var.f43565l;
            if (gj0Var != null) {
                gj0Var.A(true);
                e0Var.f43565l = null;
            }
            z5 z5Var2 = e0Var.f43562i;
            e0Var.f43560f = false;
            z5Var2.getClass();
            z5Var2.d(0.0f, true);
        }
        this.f43577f = g0Var;
        this.d.setText(g0Var.f43591c);
        boolean c3 = g0Var.c();
        TextView textView = this.e;
        if (c3) {
            Pair b10 = g0Var.b();
            e0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            e0Var.f43560f = z4;
            if (z4) {
                e0Var.f43561g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (g0Var.f43594i) {
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
                    gj0 gj0Var2 = new gj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    e0Var.f43565l = gj0Var2;
                    gj0Var2.f25176s0 = e0Var.f43557a;
                    gj0Var2.H(true);
                    e0Var.f43565l.start();
                    e0Var.f43561g = 1.0f;
                }
                ic bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f25671j = 5000;
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
        d0 d0Var = this.f43575b;
        d0Var.getClass();
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        d0Var.e = z4;
        if (z4) {
            d0Var.f43551f = i10;
        }
        d0Var.invalidateSelf();
    }
}
