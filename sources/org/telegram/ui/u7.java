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
public abstract class u7 extends FrameLayout implements org.telegram.ui.Components.lc0 {
    public k7 E;
    public final ArrayList f37948a;
    public final FrameLayout f37949b;
    public final org.telegram.ui.Components.i81 f37950c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList e;
    public zh.b f37951f;
    public final org.telegram.ui.Components.j81 h;
    public final t7[] f37952n;
    public j7 f37953r;
    public int f37954s;
    public int v;
    public int f37955w;
    public boolean f37956x;
    public final g7 f37957y;

    public u7(Context context, org.telegram.ui.ActionBar.o2 o2Var, ki.i iVar) {
        super(context);
        float f7;
        this.f37948a = new ArrayList();
        this.e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.f37952n = t7VarArr;
        this.f37957y = new g7(this, 0);
        this.d = o2Var;
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.f37952n;
            if (i10 >= t7VarArr2.length) {
                break;
            }
            t7 t7Var = t7VarArr2[i10];
            if (t7Var != null) {
                this.e.add(i10, t7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37949b = frameLayout;
        org.telegram.ui.Components.j81 j81Var = new org.telegram.ui.Components.j81(getContext(), null);
        this.h = j81Var;
        j81Var.setAllowDisallowInterceptTouch(false);
        if (iVar != null) {
            j81Var.Q.add(new ki.e(iVar));
        }
        if (iVar != null) {
            f7 = 0.0f;
        } else {
            f7 = 48.0f;
        }
        addView(j81Var, w7.x5.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.i81 n10 = j81Var.n(iVar != null ? -2 : 3, true);
        this.f37950c = n10;
        frameLayout.addView(n10, w7.x5.c(48.0f, -1));
        if (iVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.x5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        j81Var.setAdapter(new f7(this, context, iVar, o2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.x5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
        imageView.setImageDrawable(h2Var);
        int i11 = org.telegram.ui.ActionBar.j6.f19246y8;
        h2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.f19265z8;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f37948a.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final u7 f32061b;

            {
                this.f32061b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32061b.E.i1();
                        return;
                    default:
                        this.f32061b.E.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        n6Var.setTextSize(AndroidUtilities.dp(18.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        linearLayout.addView(n6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
        this.f37948a.add(n6Var);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
        w0Var.setIcon(R.drawable.msg_clear);
        w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        w0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f37948a.add(w0Var);
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final u7 f32061b;

            {
                this.f32061b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32061b.E.i1();
                        return;
                    default:
                        this.f32061b.E.clear();
                        return;
                }
            }
        });
    }

    public static void a(u7 u7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.ml0 ml0Var) {
        ArrayList arrayList = q7Var.e;
        PhotoViewer.t1().K2(null, u7Var.d, null);
        if (u7Var.f37953r == null) {
            u7Var.f37953r = new j7(u7Var);
        }
        u7Var.f37953r.f34784a = ml0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().f2(q7Var.f36817r, arrayList.indexOf(o7Var), -1, false, u7Var.f37953r, null);
        }
    }

    public static void b(u7 u7Var, zh.a aVar, m7 m7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = u7Var.d;
        org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) u7Var.h.getCurrentView();
        if (m7Var.e == 2) {
            if (ml0Var.getAdapter() instanceof n7) {
                n7 n7Var = (n7) ml0Var.getAdapter();
                PhotoViewer.t1().K2(null, o2Var, null);
                if (u7Var.f37953r == null) {
                    u7Var.f37953r = new j7(u7Var);
                }
                u7Var.f37953r.f34784a = ml0Var;
                File file = aVar.f49217a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, u7Var.f37953r, null);
                }
            } else {
                return;
            }
        }
        if (m7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f49220f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f49220f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f49220f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f49220f);
        }
    }

    public final void c(int i10, int i11) {
        this.f37954s = i10;
        this.v = i11;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.j81 j81Var = this.h;
            if (i12 < j81Var.getViewPages().length) {
                org.telegram.ui.Components.ml0 ml0Var = (org.telegram.ui.Components.ml0) j81Var.getViewPages()[i12];
                if (ml0Var != null) {
                    ml0Var.setPadding(ml0Var.getPaddingLeft(), i10, ml0Var.getPaddingRight(), i11);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.j81 j81Var = this.h;
            if (i10 < j81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.ml0) j81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.ml0 getListView() {
        org.telegram.ui.Components.j81 j81Var = this.h;
        if (j81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.ml0) j81Var.getCurrentView();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f37957y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f37957y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(zh.b bVar) {
        this.f37951f = bVar;
        d();
    }

    public void setDelegate(k7 k7Var) {
        this.E = k7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f37955w = i10;
    }
}
