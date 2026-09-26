package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public abstract class s7 extends FrameLayout implements org.telegram.ui.Components.wc0 {
    public final ArrayList f37606a;
    public final org.telegram.ui.Components.w81 f37607b;
    public final View f37608c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final ArrayList e;
    public zh.b f37609f;
    public final org.telegram.ui.Components.x81 h;
    public final r7[] f37610n;
    public h7 f37611r;
    public int f37612s;
    public i7 v;

    public s7(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f37606a = new ArrayList();
        this.e = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.f37610n = r7VarArr;
        this.d = m2Var;
        r7VarArr[0] = new r7(LocaleController.getString(R.string.FilterChats), 0, new j7(this));
        r7VarArr[1] = new r7(LocaleController.getString(R.string.MediaTab), 1, new o7(this));
        r7VarArr[2] = new r7(LocaleController.getString(R.string.SharedFilesTab2), 2, new l7(this));
        r7VarArr[3] = new r7(LocaleController.getString(R.string.Music), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.f37610n;
            if (i10 < r7VarArr2.length) {
                r7 r7Var = r7VarArr2[i10];
                if (r7Var != null) {
                    this.e.add(i10, r7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.x81 x81Var = new org.telegram.ui.Components.x81(getContext(), null);
                this.h = x81Var;
                x81Var.setAllowDisallowInterceptTouch(false);
                addView(x81Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.w81 n10 = x81Var.n(3, true);
                this.f37607b = n10;
                addView(n10, w7.y5.c(48.0f, -1));
                View view = new View(getContext());
                this.f37608c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false));
                addView(view, w7.y5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                x81Var.setAdapter(new e7(this, context, m2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.y5.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(true);
                imageView.setImageDrawable(f2Var);
                int i11 = org.telegram.ui.ActionBar.h6.f19444y8;
                f2Var.a(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.h6.f19463z8;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f37606a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final s7 f32003b;

                    {
                        this.f32003b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f32003b.v.i1();
                                return;
                            default:
                                this.f32003b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
                p6Var.setTextSize(AndroidUtilities.dp(18.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                linearLayout.addView(p6Var, w7.y5.m(1.0f, 0, -1, 18, 0, 0));
                this.f37606a.add(p6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f37606a.add(u0Var);
                u0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final s7 f32003b;

                    {
                        this.f32003b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f32003b.v.i1();
                                return;
                            default:
                                this.f32003b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(s7 s7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.xl0 xl0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.t1().J2(null, s7Var.d, null);
        if (s7Var.f37611r == null) {
            s7Var.f37611r = new h7(s7Var);
        }
        s7Var.f37611r.f34132a = xl0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.t1().f2(o7Var.f36063r, arrayList.indexOf(m7Var), -1, false, s7Var.f37611r, null);
        }
    }

    public static void b(s7 s7Var, zh.a aVar, k7 k7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.m2 m2Var = s7Var.d;
        org.telegram.ui.Components.xl0 xl0Var = (org.telegram.ui.Components.xl0) s7Var.h.getCurrentView();
        if (k7Var.e == 2) {
            if (xl0Var.getAdapter() instanceof l7) {
                l7 l7Var = (l7) xl0Var.getAdapter();
                PhotoViewer.t1().J2(null, m2Var, null);
                if (s7Var.f37611r == null) {
                    s7Var.f37611r = new h7(s7Var);
                }
                s7Var.f37611r.f34132a = xl0Var;
                File file = aVar.f49463a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, m2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, s7Var.f37611r, null);
                }
            } else {
                return;
            }
        }
        if (k7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f49466f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f49466f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f49466f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f49466f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.x81 x81Var = this.h;
            if (i10 < x81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.xl0) x81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.xl0 getListView() {
        org.telegram.ui.Components.x81 x81Var = this.h;
        if (x81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.xl0) x81Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f37612s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.x81 x81Var = this.h;
            if (i11 < x81Var.getViewPages().length) {
                org.telegram.ui.Components.xl0 xl0Var = (org.telegram.ui.Components.xl0) x81Var.getViewPages()[i11];
                if (xl0Var != null) {
                    xl0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(zh.b bVar) {
        this.f37609f = bVar;
        c();
    }

    public void setDelegate(i7 i7Var) {
        this.v = i7Var;
    }
}
