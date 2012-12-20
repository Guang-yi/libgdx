/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSoftBodyHelpers {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSoftBodyHelpers(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSoftBodyHelpers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSoftBodyHelpers(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void Draw(btSoftBody psb, btIDebugDraw idraw, int drawflags) {
    gdxBulletJNI.btSoftBodyHelpers_Draw__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, drawflags);
  }

  public static void Draw(btSoftBody psb, btIDebugDraw idraw) {
    gdxBulletJNI.btSoftBodyHelpers_Draw__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawInfos(btSoftBody psb, btIDebugDraw idraw, boolean masses, boolean areas, boolean stress) {
    gdxBulletJNI.btSoftBodyHelpers_DrawInfos(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, masses, areas, stress);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw) {
    gdxBulletJNI.btSoftBodyHelpers_DrawNodeTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw) {
    gdxBulletJNI.btSoftBodyHelpers_DrawFaceTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_0(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth, maxdepth);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) {
    gdxBulletJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_1(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw, mindepth);
  }

  public static void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw) {
    gdxBulletJNI.btSoftBodyHelpers_DrawClusterTree__SWIG_2(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static void DrawFrame(btSoftBody psb, btIDebugDraw idraw) {
    gdxBulletJNI.btSoftBodyHelpers_DrawFrame(btSoftBody.getCPtr(psb), psb, btIDebugDraw.getCPtr(idraw), idraw);
  }

  public static btSoftBody CreateRope(btSoftBodyWorldInfo worldInfo, Vector3 from, Vector3 to, int res, int fixeds) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateRope(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, from, to, res, fixeds);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreatePatch(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreatePatch(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags, java.nio.FloatBuffer tex_coords) {
    assert tex_coords.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreatePatchUV__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags, tex_coords);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreatePatchUV__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, corner00, corner10, corner01, corner11, resx, resy, fixeds, gendiags);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static float CalculateUV(int resx, int resy, int ix, int iy, int id) {
    return gdxBulletJNI.btSoftBodyHelpers_CalculateUV(resx, resy, ix, iy, id);
  }

  public static btSoftBody CreateEllipsoid(btSoftBodyWorldInfo worldInfo, Vector3 center, Vector3 radius, int res) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateEllipsoid(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, center, radius, res);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles, boolean randomizeConstraints) {
    assert vertices.isDirect() : "Buffer must be allocated direct.";
    assert triangles.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateFromTriMesh__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, vertices, triangles, ntriangles, randomizeConstraints);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles) {
    assert vertices.isDirect() : "Buffer must be allocated direct.";
    assert triangles.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateFromTriMesh__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, vertices, triangles, ntriangles);
      return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
    }
  }

  public static btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices, boolean randomizeConstraints) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateFromConvexHull__SWIG_0(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, btVector3.getCPtr(vertices), vertices, nvertices, randomizeConstraints);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateFromConvexHull__SWIG_1(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, btVector3.getCPtr(vertices), vertices, nvertices);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public static btSoftBody CreateFromTetGenData(btSoftBodyWorldInfo worldInfo, String ele, String face, String node, boolean bfacelinks, boolean btetralinks, boolean bfacesfromtetras) {
    long cPtr = gdxBulletJNI.btSoftBodyHelpers_CreateFromTetGenData(btSoftBodyWorldInfo.getCPtr(worldInfo), worldInfo, ele, face, node, bfacelinks, btetralinks, bfacesfromtetras);
    return (cPtr == 0) ? null : new btSoftBody(cPtr, false);
  }

  public btSoftBodyHelpers() {
    this(gdxBulletJNI.new_btSoftBodyHelpers(), true);
  }

}
