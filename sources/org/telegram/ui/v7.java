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
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.xc0 {
    public k7 E;
    public final ArrayList f41618a;
    public final FrameLayout f41619b;
    public final org.telegram.ui.Components.g91 f41620c;
    public final a7 d;
    public final ArrayList f41621e;
    public zh.b f41622f;
    public final org.telegram.ui.Components.h91 h;
    public final t7[] f41623n;
    public j7 f41624r;
    public int f41625s;
    public final org.telegram.ui.Components.bw0 v;
    public int f41626w;
    public boolean f41627x;
    public final g7 f41628y;

    public v7(Context context, a7 a7Var, li.p pVar, org.telegram.ui.Components.bw0 bw0Var) {
        super(context);
        org.telegram.ui.Components.h91 bm0Var;
        float f7;
        this.f41618a = new ArrayList();
        this.f41621e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.f41623n = t7VarArr;
        this.f41628y = new g7(this, 0);
        this.d = a7Var;
        this.v = bw0Var;
        if (bw0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.f41623n;
            if (i10 >= t7VarArr2.length) {
                break;
            }
            t7 t7Var = t7VarArr2[i10];
            if (t7Var != null) {
                this.f41621e.add(i10, t7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41619b = frameLayout;
        if (bw0Var == null) {
            bm0Var = new org.telegram.ui.Components.h91(getContext(), null);
        } else {
            bm0Var = new org.telegram.ui.Components.bm0(context, a7Var.getResourceProvider(), bw0Var);
        }
        this.h = bm0Var;
        bm0Var.setAllowDisallowInterceptTouch(false);
        if (pVar != null) {
            pVar.c(bm0Var);
        }
        if (pVar == null && bw0Var == null) {
            f7 = 48.0f;
        } else {
            f7 = 0.0f;
        }
        addView(bm0Var, w7.z5.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.g91 n10 = bm0Var.n(pVar != null ? -2 : 3, true);
        this.f41620c = n10;
        frameLayout.addView(n10, w7.z5.c(48.0f, -1));
        if (pVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        bm0Var.setAdapter(new f7(this, context, pVar, a7Var, bw0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.z5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
        imageView.setImageDrawable(g2Var);
        int i11 = org.telegram.ui.ActionBar.i6.f21216y8;
        g2Var.a(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.f21235z8;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f41618a.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f35069b;

            {
                this.f35069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35069b.E.i();
                        return;
                    default:
                        this.f35069b.E.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        p6Var.setTextSize(AndroidUtilities.dp(18.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        linearLayout.addView(p6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        this.f41618a.add(p6Var);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false), false, null);
        v0Var.setIcon(R.drawable.msg_clear);
        v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        v0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f41618a.add(v0Var);
        v0Var.setOnClickListener(new View.OnClickListener(this) {
            public final v7 f35069b;

            {
                this.f35069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35069b.E.i();
                        return;
                    default:
                        this.f35069b.E.clear();
                        return;
                }
            }
        });
    }

    public static void a(v7 v7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.zl0 zl0Var) {
        ArrayList arrayList = q7Var.f37016e;
        PhotoViewer.t1().K2(null, v7Var.d, null);
        if (v7Var.f41624r == null) {
            v7Var.f41624r = new j7(v7Var);
        }
        v7Var.f41624r.f37592a = zl0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().g2(q7Var.f39726r, arrayList.indexOf(o7Var), -1, false, v7Var.f41624r, null);
        }
    }

    public static void b(v7 v7Var, zh.a aVar, m7 m7Var) {
        boolean z10;
        a7 a7Var = v7Var.d;
        org.telegram.ui.Components.zl0 listView = v7Var.getListView();
        if (m7Var.f38495e == 2) {
            if (listView.getAdapter() instanceof n7) {
                n7 n7Var = (n7) listView.getAdapter();
                PhotoViewer.t1().K2(null, a7Var, null);
                if (v7Var.f41624r == null) {
                    v7Var.f41624r = new j7(v7Var);
                }
                v7Var.f41624r.f37592a = listView;
                File file = aVar.f53573a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, a7Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, v7Var.f41624r, null);
                }
            } else {
                return;
            }
        }
        if (m7Var.f38495e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f53577f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f53577f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f53577f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f53577f);
        }
    }

    public static org.telegram.ui.Components.zl0 c(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof u7) {
            return ((u7) view).f41132a;
        }
        return (org.telegram.ui.Components.zl0) view;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.h91 h91Var = this.h;
            if (i10 < h91Var.getViewPages().length) {
                org.telegram.ui.Components.zl0 c10 = c(h91Var.getViewPages()[i10]);
                if (c10 != null) {
                    AndroidUtilities.updateVisibleRows(c10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.zl0 getListView() {
        return c(this.h.getCurrentView());
    }

    public org.telegram.ui.Components.h91 getViewPager() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f41628y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f41628y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(zh.b bVar) {
        this.f41622f = bVar;
        d();
    }

    public void setDelegate(k7 k7Var) {
        this.E = k7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f41626w = i10;
    }
}
