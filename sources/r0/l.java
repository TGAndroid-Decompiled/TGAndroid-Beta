package r0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class l {
    public ViewParent f46445a;
    public ViewParent f46446b;
    public final ViewGroup f46447c;
    public boolean d;
    public int[] f46448e;

    public l(ViewGroup viewGroup) {
        this.f46447c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z4) {
        ViewParent e6;
        if (this.d && (e6 = e(0)) != null) {
            try {
                return e6.onNestedFling(this.f46447c, f10, f11, z4);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent e6;
        if (this.d && (e6 = e(0)) != null) {
            try {
                return e6.onNestedPreFling(this.f46447c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent e6;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.d || (e6 = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f46447c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f46448e == null) {
                this.f46448e = new int[2];
            }
            iArr3 = this.f46448e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e6 instanceof m) {
            ((m) e6).E(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                e6.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent e6;
        int i15;
        int i16;
        int[] iArr3;
        if (this.d && (e6 = e(i14)) != null) {
            if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f46447c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f46448e == null) {
                        this.f46448e = new int[2];
                    }
                    int[] iArr4 = this.f46448e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e6 instanceof n) {
                    ((n) e6).j(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (e6 instanceof m) {
                        ((m) e6).c(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            e6.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f46446b;
        }
        return this.f46445a;
    }

    public final boolean f(int i10) {
        if (e(i10) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10, int i11) {
        boolean onStartNestedScroll;
        if (!f(i11)) {
            if (this.d) {
                View view = this.f46447c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof m;
                    if (z4) {
                        onStartNestedScroll = ((m) parent).p(view2, view, i10, i11);
                    } else {
                        if (i11 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                            } catch (AbstractMethodError e6) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i11 != 0) {
                            if (i11 == 1) {
                                this.f46446b = parent;
                            }
                        } else {
                            this.f46445a = parent;
                        }
                        if (z4) {
                            ((m) parent).s(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent e6 = e(i10);
        if (e6 != null) {
            boolean z4 = e6 instanceof m;
            ViewGroup viewGroup = this.f46447c;
            if (z4) {
                ((m) e6).o(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    e6.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f46446b = null;
                    return;
                }
                return;
            }
            this.f46445a = null;
        }
    }
}
