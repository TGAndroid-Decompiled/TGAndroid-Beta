package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class zt extends org.telegram.ui.Components.lm0 {
    public final Context f46356c;
    public final DataSettingsActivity d;

    public zt(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f46356c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = e1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f35488f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f35491s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.E && b10 != dataSettingsActivity.f35494y && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.f35489n) {
                        i13 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i13) {
                            i14 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i14) {
                                i15 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i15) {
                                    i16 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.T;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f35490r && i10 != dataSettingsActivity.f35492w && i10 != dataSettingsActivity.N && i10 != dataSettingsActivity.P && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.Q && i10 != dataSettingsActivity.S) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f35493x && i10 != dataSettingsActivity.M && i10 != 0 && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.R) {
                if (i10 != dataSettingsActivity.E && i10 != dataSettingsActivity.f35494y && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.J && i10 != dataSettingsActivity.K) {
                    if (i10 == dataSettingsActivity.H) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f35488f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f35491s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f35489n) {
                                        return 1;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 5;
                        }
                        return 5;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zt.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View f7Var;
        Context context = this.f46356c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                f7Var = new org.telegram.ui.Cells.v8(context);
                            } else {
                                f7Var = new org.telegram.ui.Cells.n5(context);
                            }
                        } else {
                            f7Var = new org.telegram.ui.Cells.i9(context);
                        }
                    } else {
                        f7Var = new org.telegram.ui.Cells.a9(context);
                    }
                } else {
                    f7Var = new org.telegram.ui.Cells.q4(context, 22);
                }
            } else {
                f7Var = new org.telegram.ui.Cells.ga(context);
            }
        } else {
            f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        }
        return ic.a.n(f7Var, f7Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        if (e1Var.f47738f == 3) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) e1Var.f47735a;
            int b10 = e1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.E) {
                a9Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f35494y) {
                a9Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.F) {
                a9Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.G) {
                a9Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.J) {
                a9Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.K) {
                a9Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
