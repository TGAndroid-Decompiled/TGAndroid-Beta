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
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.fd0 {
    public final ArrayList f42127a;
    public final org.telegram.ui.Components.d91 f42128b;
    public final View f42129c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public bi.c f42130f;
    public final org.telegram.ui.Components.e91 h;
    public final u7[] f42131n;
    public k7 f42132r;
    public int f42133s;
    public l7 v;

    public v7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f42127a = new ArrayList();
        this.e = new ArrayList();
        u7[] u7VarArr = new u7[5];
        this.f42131n = u7VarArr;
        this.d = n2Var;
        u7VarArr[0] = new u7(LocaleController.getString(R.string.FilterChats), 0, new m7(this));
        u7VarArr[1] = new u7(LocaleController.getString(R.string.MediaTab), 1, new r7(this));
        u7VarArr[2] = new u7(LocaleController.getString(R.string.SharedFilesTab2), 2, new o7(this));
        u7VarArr[3] = new u7(LocaleController.getString(R.string.Music), 3, new t7(this));
        int i10 = 0;
        while (true) {
            u7[] u7VarArr2 = this.f42131n;
            if (i10 < u7VarArr2.length) {
                u7 u7Var = u7VarArr2[i10];
                if (u7Var != null) {
                    this.e.add(i10, u7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.e91 e91Var = new org.telegram.ui.Components.e91(getContext(), null);
                this.h = e91Var;
                e91Var.setAllowDisallowInterceptTouch(false);
                addView(e91Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.d91 n10 = e91Var.n(3, true);
                this.f42128b = n10;
                addView(n10, w7.z5.c(48.0f, -1));
                View view = new View(getContext());
                this.f42129c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20995d7, false));
                addView(view, w7.z5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                e91Var.setAdapter(new h7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.z5.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.h6.f21384y8;
                g2Var.a(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.h6.f21401z8;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42127a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final v7 f36283b;

                    {
                        this.f36283b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f36283b.v.W0();
                                return;
                            default:
                                this.f36283b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
                q6Var.setTextSize(AndroidUtilities.dp(18.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                linearLayout.addView(q6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
                this.f42127a.add(q6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f42127a.add(u0Var);
                u0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final v7 f36283b;

                    {
                        this.f36283b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f36283b.v.W0();
                                return;
                            default:
                                this.f36283b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(v7 v7Var, p7 p7Var, r7 r7Var, org.telegram.ui.Components.jm0 jm0Var) {
        ArrayList arrayList = r7Var.e;
        PhotoViewer.u1().M2(null, v7Var.d, null);
        if (v7Var.f42132r == null) {
            v7Var.f42132r = new k7(v7Var);
        }
        v7Var.f42132r.f38437a = jm0Var;
        if (arrayList.indexOf(p7Var) >= 0) {
            PhotoViewer.u1().i2(r7Var.f41076r, arrayList.indexOf(p7Var), -1, false, v7Var.f42132r, null);
        }
    }

    public static void b(v7 v7Var, bi.b bVar, n7 n7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = v7Var.d;
        org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) v7Var.h.getCurrentView();
        if (n7Var.e == 2) {
            if (jm0Var.getAdapter() instanceof o7) {
                o7 o7Var = (o7) jm0Var.getAdapter();
                PhotoViewer.u1().M2(null, n2Var, null);
                if (v7Var.f42132r == null) {
                    v7Var.f42132r = new k7(v7Var);
                }
                v7Var.f42132r.f38437a = jm0Var;
                File file = bVar.f4424a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (bVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.u1().i2(arrayList, 0, -1, false, v7Var.f42132r, null);
                }
            } else {
                return;
            }
        }
        if (n7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(bVar.f4427f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(bVar.f4427f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(bVar.f4427f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(bVar.f4427f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.e91 e91Var = this.h;
            if (i10 < e91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.jm0) e91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.jm0 getListView() {
        org.telegram.ui.Components.e91 e91Var = this.h;
        if (e91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.jm0) e91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f42133s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.e91 e91Var = this.h;
            if (i11 < e91Var.getViewPages().length) {
                org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) e91Var.getViewPages()[i11];
                if (jm0Var != null) {
                    jm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(bi.c cVar) {
        this.f42130f = cVar;
        c();
    }

    public void setDelegate(l7 l7Var) {
        this.v = l7Var;
    }
}
