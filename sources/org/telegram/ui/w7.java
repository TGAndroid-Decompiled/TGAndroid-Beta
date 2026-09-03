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
public abstract class w7 extends FrameLayout implements org.telegram.ui.Components.oc0 {
    public final ArrayList f39280a;
    public final org.telegram.ui.Components.k81 f39281b;
    public final View f39282c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final ArrayList e;
    public mh.b f39283f;
    public final org.telegram.ui.Components.l81 h;
    public final v7[] f39284n;
    public l7 f39285r;
    public int f39286s;
    public m7 v;

    public w7(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f39280a = new ArrayList();
        this.e = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.f39284n = v7VarArr;
        this.d = p2Var;
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.f39284n;
            if (i10 < v7VarArr2.length) {
                v7 v7Var = v7VarArr2[i10];
                if (v7Var != null) {
                    this.e.add(i10, v7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(getContext(), null);
                this.h = l81Var;
                l81Var.setAllowDisallowInterceptTouch(false);
                addView(l81Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.k81 n10 = l81Var.n(3, true);
                this.f39281b = n10;
                addView(n10, k7.b6.c(48.0f, -1));
                View view = new View(getContext());
                this.f39282c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19882d7, false));
                addView(view, k7.b6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                l81Var.setAdapter(new i7(this, context, p2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, k7.b6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                imageView.setImageDrawable(i2Var);
                int i11 = org.telegram.ui.ActionBar.j6.f20258y8;
                i2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.j6.f20275z8;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f39280a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final w7 f33727b;

                    {
                        this.f33727b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f33727b.v.g1();
                                return;
                            default:
                                this.f33727b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
                k6Var.setTextSize(AndroidUtilities.dp(18.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(k6Var, k7.b6.m(1.0f, 0, -1, 18, 0, 0));
                this.f39280a.add(k6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f39280a.add(w0Var);
                w0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final w7 f33727b;

                    {
                        this.f33727b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f33727b.v.g1();
                                return;
                            default:
                                this.f33727b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(w7 w7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.rl0 rl0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.t1().K2(null, w7Var.d, null);
        if (w7Var.f39285r == null) {
            w7Var.f39285r = new l7(w7Var);
        }
        w7Var.f39285r.f35665a = rl0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.t1().f2(s7Var.f38113r, arrayList.indexOf(q7Var), -1, false, w7Var.f39285r, null);
        }
    }

    public static void b(w7 w7Var, mh.a aVar, o7 o7Var) {
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = w7Var.d;
        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) w7Var.h.getCurrentView();
        if (o7Var.e == 2) {
            if (rl0Var.getAdapter() instanceof p7) {
                p7 p7Var = (p7) rl0Var.getAdapter();
                PhotoViewer.t1().K2(null, p2Var, null);
                if (w7Var.f39285r == null) {
                    w7Var.f39285r = new l7(w7Var);
                }
                w7Var.f39285r.f35665a = rl0Var;
                File file = aVar.f14157a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, p2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z4, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, w7Var.f39285r, null);
                }
            } else {
                return;
            }
        }
        if (o7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f14160f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f14160f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f14160f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f14160f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i10 < l81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.rl0) l81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.rl0 getListView() {
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (l81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.rl0) l81Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f39286s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i11 < l81Var.getViewPages().length) {
                org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) l81Var.getViewPages()[i11];
                if (rl0Var != null) {
                    rl0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(mh.b bVar) {
        this.f39283f = bVar;
        c();
    }

    public void setDelegate(m7 m7Var) {
        this.v = m7Var;
    }
}
