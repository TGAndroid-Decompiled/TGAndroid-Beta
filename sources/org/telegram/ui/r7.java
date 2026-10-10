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
public abstract class r7 extends FrameLayout implements org.telegram.ui.Components.md0 {
    public final ArrayList f41332a;
    public final org.telegram.ui.Components.o91 f41333b;
    public final View f41334c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList f41335e;
    public zh.b f41336f;
    public final org.telegram.ui.Components.p91 h;
    public final q7[] f41337n;
    public g7 f41338r;
    public int f41339s;
    public h7 v;

    public r7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f41332a = new ArrayList();
        this.f41335e = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.f41337n = q7VarArr;
        this.d = n2Var;
        q7VarArr[0] = new q7(LocaleController.getString(R.string.FilterChats), 0, new i7(this));
        q7VarArr[1] = new q7(LocaleController.getString(R.string.MediaTab), 1, new n7(this));
        q7VarArr[2] = new q7(LocaleController.getString(R.string.SharedFilesTab2), 2, new k7(this));
        q7VarArr[3] = new q7(LocaleController.getString(R.string.Music), 3, new p7(this));
        int i10 = 0;
        while (true) {
            q7[] q7VarArr2 = this.f41337n;
            if (i10 < q7VarArr2.length) {
                q7 q7Var = q7VarArr2[i10];
                if (q7Var != null) {
                    this.f41335e.add(i10, q7Var);
                }
                i10++;
            } else {
                org.telegram.ui.Components.p91 p91Var = new org.telegram.ui.Components.p91(getContext(), null);
                this.h = p91Var;
                p91Var.setAllowDisallowInterceptTouch(false);
                addView(p91Var, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.o91 n10 = p91Var.n(3, true);
                this.f41333b = n10;
                addView(n10, w7.x5.d(48.0f, -1));
                View view = new View(getContext());
                this.f41334c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20802d7, false));
                addView(view, w7.x5.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                p91Var.setAdapter(new d7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.x5.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.i6.f21187y8;
                g2Var.a(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.i6.f21205z8;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41332a.add(imageView);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f44532b;

                    {
                        this.f44532b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44532b.v.g1();
                                return;
                            default:
                                this.f44532b.v.clear();
                                return;
                        }
                    }
                });
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
                r6Var.setTextSize(AndroidUtilities.dp(18.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                linearLayout.addView(r6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                this.f41332a.add(r6Var);
                org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.i6.x0(null, i12, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false), false, null);
                v0Var.setIcon(R.drawable.msg_clear);
                v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                v0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.f41332a.add(v0Var);
                v0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final r7 f44532b;

                    {
                        this.f44532b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                this.f44532b.v.g1();
                                return;
                            default:
                                this.f44532b.v.clear();
                                return;
                        }
                    }
                });
                return;
            }
        }
    }

    public static void a(r7 r7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.rm0 rm0Var) {
        ArrayList arrayList = n7Var.f37219e;
        PhotoViewer.t1().K2(null, r7Var.d, null);
        if (r7Var.f41338r == null) {
            r7Var.f41338r = new g7(r7Var);
        }
        r7Var.f41338r.f37943a = rm0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.t1().g2(n7Var.f40135r, arrayList.indexOf(l7Var), -1, false, r7Var.f41338r, null);
        }
    }

    public static void b(r7 r7Var, zh.a aVar, j7 j7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = r7Var.d;
        org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) r7Var.h.getCurrentView();
        if (j7Var.f38887e == 2) {
            if (rm0Var.getAdapter() instanceof k7) {
                k7 k7Var = (k7) rm0Var.getAdapter();
                PhotoViewer.t1().K2(null, n2Var, null);
                if (r7Var.f41338r == null) {
                    r7Var.f41338r = new g7(r7Var);
                }
                r7Var.f41338r.f37943a = rm0Var;
                File file = aVar.f54738a;
                String lowerCase = file.getName().toLowerCase();
                if (!file.getName().endsWith("mp4") && !file.getName().endsWith(".jpg") && !lowerCase.endsWith(".jpeg") && !lowerCase.endsWith(".png") && !lowerCase.endsWith(".gif")) {
                    AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String path = file.getPath();
                    boolean z10 = true;
                    if (aVar.d != 1) {
                        z10 = false;
                    }
                    arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                    PhotoViewer.t1().g2(arrayList, 0, -1, false, r7Var.f41338r, null);
                }
            } else {
                return;
            }
        }
        if (j7Var.f38887e == 3) {
            if (MediaController.getInstance().isPlayingMessage(aVar.f54742f)) {
                if (!MediaController.getInstance().isMessagePaused()) {
                    MediaController.getInstance().lambda$startAudioAgain$7(aVar.f54742f);
                    return;
                } else {
                    MediaController.getInstance().playMessage(aVar.f54742f);
                    return;
                }
            }
            MediaController.getInstance().playMessage(aVar.f54742f);
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r7.c():void");
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p91 p91Var = this.h;
            if (i10 < p91Var.getViewPages().length) {
                AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.rm0) p91Var.getViewPages()[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public org.telegram.ui.Components.rm0 getListView() {
        org.telegram.ui.Components.p91 p91Var = this.h;
        if (p91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.rm0) p91Var.getCurrentView();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    public void setBottomPadding(int i10) {
        this.f41339s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.p91 p91Var = this.h;
            if (i11 < p91Var.getViewPages().length) {
                org.telegram.ui.Components.rm0 rm0Var = (org.telegram.ui.Components.rm0) p91Var.getViewPages()[i11];
                if (rm0Var != null) {
                    rm0Var.setPadding(0, 0, 0, i10);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void setCacheModel(zh.b bVar) {
        this.f41336f = bVar;
        c();
    }

    public void setDelegate(h7 h7Var) {
        this.v = h7Var;
    }
}
