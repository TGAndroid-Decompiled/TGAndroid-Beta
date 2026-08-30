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
public abstract class u7 extends FrameLayout implements org.telegram.ui.Components.nc0 {
    public final ArrayList f38854a;
    public final org.telegram.ui.Components.k81 f38855b;
    public final View f38856c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final ArrayList e;
    public mh.b f38857f;
    public final org.telegram.ui.Components.l81 h;
    public final t7[] f38858n;
    public j7 f38859r;
    public int f38860s;
    public k7 v;

    public u7(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f38854a = new ArrayList();
        this.e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.f38858n = t7VarArr;
        this.d = p2Var;
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.f38858n;
            if (i10 < t7VarArr2.length) {
                t7 t7Var = t7VarArr2[i10];
                if (t7Var != null) {
                    this.e.add(i10, t7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(getContext(), null);
                this.h = l81Var;
                l81Var.setAllowDisallowInterceptTouch(false);
                addView(l81Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.k81 n10 = l81Var.n(3, true);
                this.f38855b = n10;
                addView(n10, k7.b6.c(48.0f, -1));
                View view = new View(getContext());
                this.f38856c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19907d7, false));
                addView(view, k7.b6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                l81Var.setAdapter(new g7(this, context, p2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, k7.b6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                imageView.setImageDrawable(i2Var);
                int i11 = org.telegram.ui.ActionBar.j6.f20283y8;
                i2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.j6.f20300z8;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f38854a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final u7 f33210b;

                    {
                        this.f33210b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f33210b.v.h1();
                                return;
                            default:
                                this.f33210b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
                k6Var.setTextSize(AndroidUtilities.dp(18.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(k6Var, k7.b6.m(1.0f, 0, -1, 18, 0, 0));
                this.f38854a.add(k6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f38854a.add(w0Var);
                w0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final u7 f33210b;

                    {
                        this.f33210b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f33210b.v.h1();
                                return;
                            default:
                                this.f33210b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(u7 u7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.sl0 sl0Var) {
        ArrayList arrayList = q7Var.e;
        PhotoViewer.t1().K2(null, u7Var.d, null);
        if (u7Var.f38859r == null) {
            u7Var.f38859r = new j7(u7Var);
        }
        u7Var.f38859r.f35247a = sl0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().f2(q7Var.f37655r, arrayList.indexOf(o7Var), -1, false, u7Var.f38859r, null);
        }
    }

    public static void b(u7 u7Var, mh.a aVar, m7 m7Var) {
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = u7Var.d;
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) u7Var.h.getCurrentView();
        if (m7Var.e == 2) {
            if (sl0Var.getAdapter() instanceof n7) {
                n7 n7Var = (n7) sl0Var.getAdapter();
                PhotoViewer.t1().K2(null, p2Var, null);
                if (u7Var.f38859r == null) {
                    u7Var.f38859r = new j7(u7Var);
                }
                u7Var.f38859r.f35247a = sl0Var;
                File file = aVar.f14169a;
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
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, u7Var.f38859r, null);
                }
            } else {
                return;
            }
        }
        if (m7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f14172f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f14172f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f14172f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f14172f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i10 < l81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.sl0) l81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.sl0 getListView() {
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (l81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.sl0) l81Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f38860s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i11 < l81Var.getViewPages().length) {
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) l81Var.getViewPages()[i11];
                if (sl0Var != null) {
                    sl0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(mh.b bVar) {
        this.f38857f = bVar;
        c();
    }

    public void setDelegate(k7 k7Var) {
        this.v = k7Var;
    }
}
