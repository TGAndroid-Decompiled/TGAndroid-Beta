package zd;

import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.internal.cast.z4;
import m4.g;
public final class b implements r0 {
    public final int f50427a = 0;
    public Object f50428b;

    public b() {
    }

    @Override
    public void a() {
        g gVar = (g) this.f50428b;
        gVar.A.a();
        z4 z4Var = gVar.C;
        if (z4Var == null) {
            return;
        }
        throw z4Var;
    }

    public String toString() {
        switch (this.f50427a) {
            case 0:
                c cVar = c.f50429e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((f2.b) this.f50428b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(g gVar) {
        this.f50428b = gVar;
    }
}
