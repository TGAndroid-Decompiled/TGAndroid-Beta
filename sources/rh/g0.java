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
import org.telegram.ui.yh;
public final class g0 extends eb {
    public final f6 f43522a;
    public final e0 f43523b;
    public final f0 f43524c;
    public final TextView d;
    public final TextView e;
    public h0 f43525f;
    public int h;

    public g0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.f43522a = f6Var;
        e0 e0Var = new e0(AndroidUtilities.dp(10.0f));
        e0Var.f43496a.setColor(j6.v0(j6.Fi, f6Var));
        this.f43523b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.f43524c = f0Var;
        imageView.setImageDrawable(f0Var);
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
        TextView j10 = yh.j(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = j10;
        j10.setTextSize(1, 13.0f);
        j10.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(j10, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((db) null);
                return;
            }
            f6 f6Var = this.f43522a;
            if (i10 == 1) {
                gc gcVar = new gc(getContext(), f6Var, true);
                gcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                gcVar.f25097a = new Runnable(this) {
                    public final g0 f43490b;

                    {
                        this.f43490b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f43490b;
                                ic bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f25672j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f43525f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f43490b;
                                ic bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f43525f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    gcVar.f25099c = getBulletin();
                }
                setButton(gcVar);
            } else if (i10 == 2) {
                gc gcVar2 = new gc(getContext(), f6Var, true);
                gcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                gcVar2.f25097a = new Runnable(this) {
                    public final g0 f43490b;

                    {
                        this.f43490b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                g0 g0Var = this.f43490b;
                                ic bulletin = g0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f25672j = 2750;
                                    bulletin.i(true);
                                }
                                h0 h0Var = g0Var.f43525f;
                                if (h0Var != null) {
                                    h0Var.a();
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var2 = this.f43490b;
                                ic bulletin2 = g0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                h0 h0Var2 = g0Var2.f43525f;
                                if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                    File file2 = h0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.D1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    gcVar2.f25099c = getBulletin();
                }
                setButton(gcVar2);
            }
        }
    }

    public final boolean c(h0 h0Var) {
        boolean z4;
        h0 h0Var2 = this.f43525f;
        f0 f0Var = this.f43524c;
        if (h0Var2 != h0Var) {
            z5 z5Var = f0Var.f43512k;
            f0Var.h = false;
            z5Var.getClass();
            z5Var.d(0.0f, true);
            gj0 gj0Var = f0Var.f43513l;
            if (gj0Var != null) {
                gj0Var.A(true);
                f0Var.f43513l = null;
            }
            z5 z5Var2 = f0Var.f43510i;
            f0Var.f43508f = false;
            z5Var2.getClass();
            z5Var2.d(0.0f, true);
        }
        this.f43525f = h0Var;
        this.d.setText(h0Var.f43539c);
        boolean c3 = h0Var.c();
        TextView textView = this.e;
        if (c3) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            f0Var.f43508f = z4;
            if (z4) {
                f0Var.f43509g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (h0Var.f43542i) {
            ic bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (h0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!f0Var.h) {
                    f0Var.h = true;
                    gj0 gj0Var2 = new gj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                    f0Var.f43513l = gj0Var2;
                    gj0Var2.f25170s0 = f0Var.f43505a;
                    gj0Var2.H(true);
                    f0Var.f43513l.start();
                    f0Var.f43509g = 1.0f;
                }
                ic bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f25672j = 5000;
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
        e0 e0Var = this.f43523b;
        e0Var.getClass();
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        e0Var.e = z4;
        if (z4) {
            e0Var.f43499f = i10;
        }
        e0Var.invalidateSelf();
    }
}
