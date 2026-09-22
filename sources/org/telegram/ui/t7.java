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
public abstract class t7 extends FrameLayout implements org.telegram.ui.Components.wc0 {
    public j7 E;
    public final ArrayList f37669a;
    public final FrameLayout f37670b;
    public final org.telegram.ui.Components.y81 f37671c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public zh.b f37672f;
    public final org.telegram.ui.Components.z81 h;
    public final s7[] f37673n;
    public i7 f37674r;
    public int f37675s;
    public int v;
    public int f37676w;
    public boolean f37677x;
    public final f7 f37678y;

    public t7(Context context, org.telegram.ui.ActionBar.n2 n2Var, li.i iVar) {
        super(context);
        float f7;
        this.f37669a = new ArrayList();
        this.e = new ArrayList();
        s7[] s7VarArr = new s7[5];
        this.f37673n = s7VarArr;
        this.f37678y = new f7(this, 0);
        this.d = n2Var;
        s7VarArr[0] = new s7(LocaleController.getString(R.string.FilterChats), 0, new k7(this));
        s7VarArr[1] = new s7(LocaleController.getString(R.string.MediaTab), 1, new p7(this));
        s7VarArr[2] = new s7(LocaleController.getString(R.string.SharedFilesTab2), 2, new m7(this));
        s7VarArr[3] = new s7(LocaleController.getString(R.string.Music), 3, new r7(this));
        int i10 = 0;
        while (true) {
            s7[] s7VarArr2 = this.f37673n;
            if (i10 >= s7VarArr2.length) {
                break;
            }
            s7 s7Var = s7VarArr2[i10];
            if (s7Var != null) {
                this.e.add(i10, s7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37670b = frameLayout;
        org.telegram.ui.Components.z81 z81Var = new org.telegram.ui.Components.z81(getContext(), null);
        this.h = z81Var;
        z81Var.setAllowDisallowInterceptTouch(false);
        if (iVar != null) {
            z81Var.Q.add(new li.e(iVar));
        }
        if (iVar != null) {
            f7 = 0.0f;
        } else {
            f7 = 48.0f;
        }
        addView(z81Var, w7.y5.d(-1, -1.0f, 48, 0.0f, f7, 0.0f, 0.0f));
        org.telegram.ui.Components.y81 n10 = z81Var.n(iVar != null ? -2 : 3, true);
        this.f37671c = n10;
        frameLayout.addView(n10, w7.y5.c(48.0f, -1));
        if (iVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        z81Var.setAdapter(new e7(this, context, iVar, n2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.y5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
        imageView.setImageDrawable(g2Var);
        int i11 = org.telegram.ui.ActionBar.j6.f19494y8;
        g2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.f19513z8;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f37669a.add(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f32020b;

            {
                this.f32020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32020b.E.h1();
                        return;
                    default:
                        this.f32020b.E.clear();
                        return;
                }
            }
        });
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        o6Var.setTextSize(AndroidUtilities.dp(18.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        linearLayout.addView(o6Var, w7.y5.m(1.0f, 0, -1, 18, 0, 0));
        this.f37669a.add(o6Var);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
        v0Var.setIcon(R.drawable.msg_clear);
        v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        v0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.f37669a.add(v0Var);
        v0Var.setOnClickListener(new View.OnClickListener(this) {
            public final t7 f32020b;

            {
                this.f32020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f32020b.E.h1();
                        return;
                    default:
                        this.f32020b.E.clear();
                        return;
                }
            }
        });
    }

    public static void a(t7 t7Var, n7 n7Var, p7 p7Var, org.telegram.ui.Components.yl0 yl0Var) {
        ArrayList arrayList = p7Var.e;
        PhotoViewer.t1().J2(null, t7Var.d, null);
        if (t7Var.f37674r == null) {
            t7Var.f37674r = new i7(t7Var);
        }
        t7Var.f37674r.f34488a = yl0Var;
        if (arrayList.indexOf(n7Var) >= 0) {
            PhotoViewer.t1().f2(p7Var.f36509r, arrayList.indexOf(n7Var), -1, false, t7Var.f37674r, null);
        }
    }

    public static void b(t7 t7Var, zh.a aVar, l7 l7Var) {
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = t7Var.d;
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) t7Var.h.getCurrentView();
        if (l7Var.e == 2) {
            if (yl0Var.getAdapter() instanceof m7) {
                m7 m7Var = (m7) yl0Var.getAdapter();
                PhotoViewer.t1().J2(null, n2Var, null);
                if (t7Var.f37674r == null) {
                    t7Var.f37674r = new i7(t7Var);
                }
                t7Var.f37674r.f34488a = yl0Var;
                File file = aVar.f49512a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    if (aVar.d == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().f2(arrayList, 0, -1, false, t7Var.f37674r, null);
                }
            } else {
                return;
            }
        }
        if (l7Var.e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f49515f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f49515f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f49515f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f49515f);
        }
    }

    public final void c(int i10, int i11) {
        this.f37675s = i10;
        this.v = i11;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.z81 z81Var = this.h;
            if (i12 < z81Var.getViewPages().length) {
                org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) z81Var.getViewPages()[i12];
                if (yl0Var != null) {
                    yl0Var.setPadding(yl0Var.getPaddingLeft(), i10, yl0Var.getPaddingRight(), i11);
                }
                i12++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t7.d():void");
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z81 z81Var = this.h;
            if (i10 < z81Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.yl0) z81Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.yl0 getListView() {
        org.telegram.ui.Components.z81 z81Var = this.h;
        if (z81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.yl0) z81Var.getCurrentView();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f37678y);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f37678y);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setCacheModel(zh.b bVar) {
        this.f37672f = bVar;
        d();
    }

    public void setDelegate(j7 j7Var) {
        this.E = j7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.f37676w = i10;
    }
}
