package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.ui.Components.i61;
public final class s2 implements oa.a, zi.x0 {
    public final int f61062a;
    public Object f61063b;
    public Object f61064c;
    public Object d;

    @Override
    public oa.a c(Class cls, na.d dVar) {
        ((HashMap) this.f61063b).put(cls, dVar);
        ((HashMap) this.f61064c).remove(cls);
        return this;
    }

    @Override
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f61063b).add(allocateDirect);
        ((ArrayList) this.f61064c).add(bufferInfo2);
    }

    public String toString() {
        switch (this.f61062a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f61063b);
                sb2.append('{');
                i61 i61Var = (i61) ((i61) this.f61064c).d;
                String str = "";
                while (i61Var != null) {
                    Object obj = i61Var.f35959c;
                    sb2.append(str);
                    String str2 = (String) i61Var.f35958b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    i61Var = (i61) i61Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void w(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    public s2(int i7) {
        this.f61062a = i7;
        switch (i7) {
            case 6:
                this.f61063b = new ArrayList();
                this.f61064c = new ArrayList();
                return;
            default:
                this.f61063b = new HashMap();
                this.f61064c = new HashMap();
                this.d = z7.e.f61646c;
                return;
        }
    }

    public s2(String str) {
        this.f61062a = 0;
        i61 i61Var = new i61(29, false);
        this.f61064c = i61Var;
        this.d = i61Var;
        this.f61063b = str;
    }

    public s2(zi.p0 p0Var, Range range, xa xaVar) {
        this.f61062a = 5;
        this.f61063b = p0Var;
        this.f61064c = range;
        this.d = xaVar;
    }
}
