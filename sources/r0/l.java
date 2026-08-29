package r0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class l {
    public ViewParent f46836a;
    public ViewParent f46837b;
    public final ViewGroup f46838c;
    public boolean d;
    public int[] f46839e;

    public l(ViewGroup viewGroup) {
        this.f46838c = viewGroup;
    }

    public final boolean a(float f9, float f10, boolean z10) {
        ViewParent e10;
        if (this.d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedFling(this.f46838c, f9, f10, z10);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedFling", e11);
            }
        }
        return false;
    }

    public final boolean b(float f9, float f10) {
        ViewParent e10;
        if (this.d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedPreFling(this.f46838c, f9, f10);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreFling", e11);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent e10;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.d || (e10 = e(i12)) == null) {
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
        ViewGroup viewGroup = this.f46838c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f46839e == null) {
                this.f46839e = new int[2];
            }
            iArr3 = this.f46839e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e10 instanceof m) {
            ((m) e10).E(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                e10.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreScroll", e11);
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
        ViewParent e10;
        int i15;
        int i16;
        int[] iArr3;
        if (this.d && (e10 = e(i14)) != null) {
            if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f46838c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f46839e == null) {
                        this.f46839e = new int[2];
                    }
                    int[] iArr4 = this.f46839e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e10 instanceof n) {
                    ((n) e10).i(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (e10 instanceof m) {
                        ((m) e10).c(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            e10.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedScroll", e11);
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
            return this.f46837b;
        }
        return this.f46836a;
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
                View view = this.f46838c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof m;
                    if (z10) {
                        onStartNestedScroll = ((m) parent).o(view2, view, i10, i11);
                    } else {
                        if (i11 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i11 != 0) {
                            if (i11 == 1) {
                                this.f46837b = parent;
                            }
                        } else {
                            this.f46836a = parent;
                        }
                        if (z10) {
                            ((m) parent).s(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
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
        ViewParent e10 = e(i10);
        if (e10 != null) {
            boolean z10 = e10 instanceof m;
            ViewGroup viewGroup = this.f46838c;
            if (z10) {
                ((m) e10).n(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    e10.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onStopNestedScroll", e11);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f46837b = null;
                    return;
                }
                return;
            }
            this.f46836a = null;
        }
    }
}
