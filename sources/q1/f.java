package q1;

import a8.nf;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
public final class f extends nf {
    public final TextView f46907a;
    public final d f46908b;
    public boolean f46909c = true;

    public f(TextView textView) {
        this.f46907a = textView;
        this.f46908b = new d(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f46909c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f46908b;
            if (i13 < length2) {
                if (inputFilterArr[i13] == dVar) {
                    return inputFilterArr;
                }
                i13++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }

    @Override
    public final void b(boolean z10) {
        if (z10) {
            d();
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f46909c = z10;
        d();
        TextView textView = this.f46907a;
        textView.setFilters(a(textView.getFilters()));
    }

    public final void d() {
        TextView textView = this.f46907a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f46909c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f46915a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
